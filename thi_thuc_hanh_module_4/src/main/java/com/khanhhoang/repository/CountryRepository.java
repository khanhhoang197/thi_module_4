package com.khanhhoang.repository;

import com.khanhhoang.model.Country;
import com.khanhhoang.model.dto.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {
    @Query("SELECT NEW com.khanhhoang.model.dto.CountryDTO (" +
            "c.id, " +
            "c.nameCountry )" +
            "FROM Country c ")
    List<CountryDTO> getAllCountryDTO();

}
