package com.zensar.hotel.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.hotel.entity.Hotel;
import com.zensar.hotel.repository.HotelRep;

@Service
public class HotelServiceImpl implements HotelService {

	// service pattern to manage transactionals
	// and handle services for reservation between server and client

	private HotelRep hotelRepo;

	@Autowired
	public HotelServiceImpl(HotelRep hotelRepo) {
		this.hotelRepo = hotelRepo;
	}

	@Override
	@Transactional
	public Hotel getHotelById(int hotelId) {
		
		return hotelRepo.findByhotelId(hotelId);
	}

}
