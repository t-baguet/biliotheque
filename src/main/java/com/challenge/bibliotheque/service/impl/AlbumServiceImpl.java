package com.challenge.bibliotheque.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.challenge.bibliotheque.endpoint.bean.AlbumResponse;
import com.challenge.bibliotheque.service.AlbumService;
import com.challenge.bibliotheque.service.SpotifyService;
import com.challenge.bibliotheque.service.bean.SpotifyAlbum;
import com.challenge.bibliotheque.service.bean.SpotifyImage;
import com.challenge.bibliotheque.service.bean.SpotifyItem;
import com.challenge.bibliotheque.utils.Constantes;

import retrofit2.Call;
import retrofit2.Retrofit;

@Service
public class AlbumServiceImpl implements AlbumService {
	
	private final static Logger logAlbum = LogManager.getLogger("log-album");
	
	@Autowired
	private Environment env;

	@Override
	public List<AlbumResponse> rechercherAlbum(String recherche, String token) {

		List<AlbumResponse> reponse = new ArrayList<AlbumResponse>();
		
		Retrofit retrofit = new Retrofit.Builder().baseUrl(env.getProperty("spotify.url")).build();
		SpotifyService service = retrofit.create(SpotifyService.class);
		Call<List<SpotifyAlbum>> albumsCall = service.rechercherAlbum(recherche, Constantes.TYPE_ALBUM, Constantes.MARKET_FR, Constantes.LIMIT_20, Constantes.OFFSET_5, token);
		try {
			List<SpotifyAlbum> albums = albumsCall.execute().body();
			
			for( SpotifyAlbum album : albums) {
				
				Optional<SpotifyItem> item = album.getItems().stream().findFirst();
				Optional<SpotifyImage> image = item.get().getImages().stream().findFirst();
				
				AlbumResponse albumResponse = new AlbumResponse();
				albumResponse.setDateSortie(item.get().getReleaseDate());
				//TODO trouver la duree
				albumResponse.setDuree("");
				albumResponse.setTitre(item.get().getName());
				albumResponse.setVignette(image.get().getUrl());
				reponse.add(albumResponse);
	        }
			
		} catch (IOException e) {
			logAlbum.error("Erreur lors de l'appel a l'API spotify : "+e.getMessage());
		}
		
		return reponse;
	}

}
