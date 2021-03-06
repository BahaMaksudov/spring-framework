package com.cydeo.repository;

import com.cydeo.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to get cinema with a specific name
    //for derived queries we dont need to put @Param
    Optional<Cinema> findByName(String name); //Optional will handle Null exception if query returns Null

    //Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name
    List<Cinema> findFirst3BySponsoredNameContainingOrderBySponsoredName(String sponsoredName);

    //Write a derived query to list all cinemas in a specific country
    List<Cinema> listAllByLocationCountry(String country);

    //Write a derived query to list all cinemas with a specific name or sponsored name
    List<Cinema> findAllByNameOrSponsoredName(String name, String sponsoredName);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to read the cinema name with a specific id
    @Query("SELECT c.name FROM Cinema c WHERE c.Id = ?1")
    String fetchById(@Param("id") Long id);

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all cinemas by location country


    //Write a native query to read all cinemas by name or sponsored name contains a specific pattern

    //Write a native query to sort all cinemas by name

    //Write a native query to distinct all cinemas by sponsored name

}
