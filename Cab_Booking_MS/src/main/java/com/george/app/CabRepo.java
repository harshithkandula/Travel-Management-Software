package com.george.app;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.george.app.Cab;

@Repository
public interface CabRepo extends JpaRepository<Cab, Integer>{

	//@Query(value="select * from cab c where c.start_location=?1 and c.end_location=?2 and c.booking_status=?3", nativeQuery = true)
	//@Query("select c from cab c WHERE c.start_location=:s and c.end_location=:e")
	//List<Cab> findByStartLocationAndEndLocation(@Param("s") String start_location, @Param("e")String end_location);
	
	//List<Cab> findDistinctByStartlocationAndEndlocation(String start_location, String end_location);
	
//	@Query(value="select start_location from cab", nativeQuery = true)
//	List<String> listAllSourceLocations();
	
//	@Query(value="select end_location from cab", nativeQuery = true)
//	List<String> listAllDestinationLocations();
	
	List<Cab> findAllByServiceLocation(String serviceLocation);
}
