package com.challenge.bibliotheque.endpoint.bean;

public class RechercherAlbumRequest {
	
	String nomRecherche;
	String token;

	public String getNomRecherche() {
		return nomRecherche;
	}

	public void setNomRecherche(String nomRecherche) {
		this.nomRecherche = nomRecherche;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
