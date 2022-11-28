package com.khanhhoang.service.country;

import com.khanhhoang.model.Country;
import com.khanhhoang.model.dto.CountryDTO;
import com.khanhhoang.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CountryServiceImpl implements ICountryService{

    @Autowired
    CountryRepository countryRepository;


    @Override
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }


    @Override
    public Country save(Country country) {
        return null;
    }


    @Override
    public List<CountryDTO> getAllCountryDTO() {
        return countryRepository.getAllCountryDTO();
    }

}

