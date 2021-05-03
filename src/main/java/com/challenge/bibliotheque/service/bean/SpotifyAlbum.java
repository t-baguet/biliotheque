package com.challenge.bibliotheque.service.bean;

import java.util.List;

public class SpotifyAlbum {
	String href;
	List<SpotifyItem> items;
	int limit;
    String next;
    int offset;
    String previous;
    int total;
    
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public List<SpotifyItem> getItems() {
		return items;
	}
	public void setItems(List<SpotifyItem> items) {
		this.items = items;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
