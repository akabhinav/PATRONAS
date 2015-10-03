/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patronas.open.commerce.countryservice;

import com.patronas.open.commerce.dataobject.Country;
import java.util.List;

/**
 *
 * @author Abhinav Kumar
 */
public interface CountryService {

    /**
     * @param countryCode as string
     * @return Country as SymCountry
     */
    Country findByCountryCode(String countryCode);

    /**
     * @return Country
     */
    List<Country> findAllCountries();

    /**
     *
     * @param countryCode as string
     * @return Country as list
     */
    List<Country> findCountriesByOrganization(String countryCode);
}
