package com.challenge.bibliotheque.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.bibliotheque.endpoint.bean.RechercherAlbumRequest;
import com.challenge.bibliotheque.endpoint.bean.RechercherAlbumResponse;
import com.challenge.bibliotheque.service.AlbumService;

@RestController
@RequestMapping("/api/bibliotheque")
public class AlbumController {
	
	@Autowired
	private AlbumService service;
	
	@PostMapping("/rechercherAlbumParAlbum")
	public RechercherAlbumResponse rechercherAlbumParAlbum (RechercherAlbumRequest rechercherAlbumRequest) {
		RechercherAlbumResponse response = new RechercherAlbumResponse();
		response.setListeAlbums(service.rechercherAlbum(rechercherAlbumRequest.getNomRecherche(), rechercherAlbumRequest.getToken()));
		return response;
	}
}
