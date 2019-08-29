package com.arthur.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.arthur.springmvc.entity.Artist;

@Repository
public class ArtistDAOImp implements ArtistDao {
// need to inject
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Artist> getArtists() {
		// TODO Auto-generated method stub
		//get hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		//create a query
		Query<Artist> theQuery=currentSession.createQuery("from Artist order by lastName",Artist.class);
		//execute query get result
		List<Artist> artists=theQuery.getResultList();
		//return result
		
		return artists;
	}

	@Override
	public void saveArtist(Artist c) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(c);
		
	}

	@Override
	public Artist getArtist(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		;
		return currentSession.get(Artist.class,theId);
	}

	@Override
	public void deleteArtist(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		Query theQuery=currentSession.createQuery("delete from Artist where id=:artistId");
		theQuery.setParameter("artistId",theId);
		theQuery.executeUpdate();
	}
		
	

}
