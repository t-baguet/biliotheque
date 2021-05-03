package com.challenge.bibliotheque.service;

import java.util.List;

import com.challenge.bibliotheque.service.bean.SpotifyAlbum;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SpotifyService {
	
	/**
	 * recherche des albums via l'API spotify
	 * @param recherche la chaine de character a rechercher
	 * @param type le type de donnees recherchee
	 * @param market le marche sur lequel effectuer la recherche
	 * @param limit le nombre maximum de donnees retournees
	 * @param offset
	 * @param token le token d'authentification
	 * @return
	 */
	@GET("search")
	Call<List<SpotifyAlbum>> rechercherAlbum(
			@Query("q") String recherche,
			@Query("type") String type,
			@Query("market") String market,
			@Query("limit") String limit,
			@Query("offset") String offset,
			@Query("OAuth Token") String token
			);

}
