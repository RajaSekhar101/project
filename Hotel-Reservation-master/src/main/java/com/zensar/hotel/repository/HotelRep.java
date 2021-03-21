package com.zensar.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.hotel.entity.Hotel;

@Repository
public interface HotelRep extends JpaRepository<Hotel, Integer> {

	Hotel findByhotelId(int hotelId);

	
}
