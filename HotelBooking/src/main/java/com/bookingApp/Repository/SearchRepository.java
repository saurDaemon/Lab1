package com.bookingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookingApp.Entity.SearchEntity;

@Repository("searchRepository")
public interface SearchRepository extends JpaRepository<SearchEntity, Integer>{
	

}
