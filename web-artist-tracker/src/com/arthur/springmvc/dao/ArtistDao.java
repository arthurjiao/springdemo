package com.arthur.springmvc.dao;

import java.util.List;

import com.arthur.springmvc.entity.Artist;

public interface ArtistDao {
	public List<Artist> getArtists();
	public void saveArtist(Artist c);
	public Artist getArtist(int theId);
	public void deleteArtist(int theId);
}
