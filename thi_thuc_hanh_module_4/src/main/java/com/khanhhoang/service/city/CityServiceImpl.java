package com.khanhhoang.service.city;

import com.khanhhoang.model.City;
import com.khanhhoang.model.dto.CityDTO;
import com.khanhhoang.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CityServiceImpl implements ICityService{

    @Autowired
    CityRepository cityRepository;

    @Override
    public Optional<City> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }


    @Override
    public List<CityDTO> getAllCityDTO() {
        return cityRepository.getAllCityDTO();
    }

    @Override
    public Optional<CityDTO> getCityDTOById(Long id) {
        return cityRepository.getCityDTOById(id);
    }

    @Override
    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }


}
