package com.challenge.bibliotheque.service;

import java.util.List;

import com.challenge.bibliotheque.endpoint.bean.AlbumResponse;

public interface AlbumService {
	
	/**
	 * renvoi une liste de maximum 20 albums depuis l'API spotify en fonction du nom de l'artiste et du nom de l'album
	 * @param recherche la chaine de charactere correspondant au nom a rechercher
	 * @param token le token d'identification spotify
	 * @return la liste des albums retournés
	 */
	List<AlbumResponse> rechercherAlbum(final String recherche, String token);

}
