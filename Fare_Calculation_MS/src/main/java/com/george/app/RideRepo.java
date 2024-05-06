package com.george.app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.george.app.model.Ride;

public interface RideRepo extends JpaRepository<Ride, Integer>{

}
