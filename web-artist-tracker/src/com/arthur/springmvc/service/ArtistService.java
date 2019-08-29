package com.arthur.springmvc.service;

import java.util.List;

import com.arthur.springmvc.entity.Artist;

public interface ArtistService {
	public List<Artist> getArtists();
	public void saveArtist(Artist c);
	public Artist getArtist(int theId);
	public void deleteArtist(int theId);

}
