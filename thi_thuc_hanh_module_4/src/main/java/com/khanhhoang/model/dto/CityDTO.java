package com.khanhhoang.model.dto;

import com.khanhhoang.model.City;
import com.khanhhoang.model.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CityDTO {

    private String id;

    @NotBlank(message = "Tên thành phố không được để trống!")
//    @Pattern(regexp = "^[a-zA-Z ]{8,30}$", message = "Tên thành phố có độ dài từ 8-30 kí tự và chỉ được sử dụng chữ cái hoa và thường có bao gồm khoảng trắng!")
    private String cityName;

    @NotBlank(message = "Diện tích không được để trống!")
    @Pattern(regexp = "^\\d*(\\.\\d+)?$", message = "Diện tích phải là số thực dương!")
    private String area;

    @NotBlank(message = "Dân số không được để trống!")
    @Pattern(regexp = "^[0-9]+$", message = "Dân số phải là số nguyên dương!")
    private String population;

    @NotBlank(message = "GDP không được để trống!")
    @Pattern(regexp = "^[0-9]+$", message = "GDP phải là số nguyên dương!")
    private String gdp;

    @NotBlank(message = "Giới thiệu không được để trống!")
    private String description;

    private CountryDTO country;

    public CityDTO(Long id, String cityName, Double area, Long population, Long gdp, String description, Country country) {
        this.id = id.toString();
        this.cityName = cityName;
        this.area = area.toString();
        this.population = population.toString();
        this.gdp = gdp.toString();
        this.description = description;
        this.country = country.toCountryDTO();
    }

    public City toCity() {
        return new City()
                .setId(Long.parseLong(id))
                .setCityName(cityName)
                .setArea(Double.parseDouble(area))
                .setPopulation(Long.parseLong(population))
                .setGdp(Long.parseLong(gdp))
                .setDescription(description)
                .setCountry(country.toCountry());
    }

}
