package com.challenge.bibliotheque.endpoint.bean;

import java.util.List;

public class RechercherAlbumResponse {
	
	List<AlbumResponse> listeAlbums;
	
	public List<AlbumResponse> getListeAlbums() {
		return listeAlbums;
	}
	public void setListeAlbums(List<AlbumResponse> listeAlbums) {
		this.listeAlbums = listeAlbums;
	}
}
