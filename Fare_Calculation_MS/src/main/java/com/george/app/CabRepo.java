package com.george.app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.george.app.model.Cab;

public interface CabRepo extends JpaRepository<Cab, Integer>{

}
