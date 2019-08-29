package com.arthur.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arthur.springmvc.dao.ArtistDao;
import com.arthur.springmvc.entity.Artist;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	private ArtistDao artistDAO;
	@Override
	@Transactional
	public List<Artist> getArtists() {
		// TODO Auto-generated method stub
		return artistDAO.getArtists();
	}
	@Override
	@Transactional
	public void saveArtist(Artist c) {
		// TODO Auto-generated method stub
		artistDAO.saveArtist(c);
		
	}
	@Override
	@Transactional
	public Artist getArtist(int theId) {
		// TODO Auto-generated method stub
		return artistDAO.getArtist(theId);
	}
	@Override
	@Transactional
	public void deleteArtist(int theId) {
		// TODO Auto-generated method stub
		artistDAO.deleteArtist(theId);
		
		
	}

}
