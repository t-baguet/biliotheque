package com.challenge.bibliotheque.service.bean;

import java.util.List;

public class SpotifyItem {
	String albumType;
	List<SpotifyArtist> artists;
	List<String> availableMarkets;
	SpotifyExternalUrl externalUrls;
	String href;
	String id;
	List<SpotifyImage> images;
	String name;
	String releaseDate;
	String releaseDatePrecision;
	String totalTracks;
	String type;
	String uri;
	
	public String getAlbumType() {
		return albumType;
	}
	public void setAlbumType(String albumType) {
		this.albumType = albumType;
	}
	public List<SpotifyArtist> getArtists() {
		return artists;
	}
	public void setArtists(List<SpotifyArtist> artists) {
		this.artists = artists;
	}
	public List<String> getAvailableMarkets() {
		return availableMarkets;
	}
	public void setAvailableMarkets(List<String> availableMarkets) {
		this.availableMarkets = availableMarkets;
	}
	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}
	public void setExternalUrls(SpotifyExternalUrl externalUrls) {
		this.externalUrls = externalUrls;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<SpotifyImage> getImages() {
		return images;
	}
	public void setImages(List<SpotifyImage> images) {
		this.images = images;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getReleaseDatePrecision() {
		return releaseDatePrecision;
	}
	public void setReleaseDatePrecision(String releaseDatePrecision) {
		this.releaseDatePrecision = releaseDatePrecision;
	}
	public String getTotalTracks() {
		return totalTracks;
	}
	public void setTotalTracks(String totalTracks) {
		this.totalTracks = totalTracks;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
}
