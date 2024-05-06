package com.george.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepo extends JpaRepository<Ride, Integer>{
  
}
