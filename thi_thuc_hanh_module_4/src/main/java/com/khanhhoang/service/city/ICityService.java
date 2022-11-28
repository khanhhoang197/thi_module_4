package com.khanhhoang.service.city;

import com.khanhhoang.model.City;
import com.khanhhoang.model.dto.CityDTO;
import com.khanhhoang.service.IGeneralService;

import java.util.List;
import java.util.Optional;

public interface ICityService extends IGeneralService<City> {
    List<CityDTO> getAllCityDTO();
    Optional<CityDTO> getCityDTOById(Long id);
    void deleteById(Long id);
}
