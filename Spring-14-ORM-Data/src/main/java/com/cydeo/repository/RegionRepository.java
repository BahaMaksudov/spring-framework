package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    //requirement - Display all regions in Canada
    List<Region> findByCountry(String country);   //select * from region where country

    List<Region> findDistinctByCountry(String country);

    List<Region> findByCountryContaining(String country);

    //Display all regions with country name include 'United'
    List<Region> findByCountryContainingOrderByCountry(String country);

    //Display top 2 regions in Canada
    List<Region> findTop2ByCountry(String country);




}
