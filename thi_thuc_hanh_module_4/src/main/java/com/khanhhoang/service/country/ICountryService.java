package com.khanhhoang.service.country;


import com.khanhhoang.model.Country;
import com.khanhhoang.model.dto.CountryDTO;
import com.khanhhoang.service.IGeneralService;


import java.util.List;

public interface ICountryService extends IGeneralService<Country> {
    List<CountryDTO> getAllCountryDTO();

}
