/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patronas.open.commerce.dataobject;

/**
 *
 * @author Abhinav Kumar
 */
public interface Country {

    /**
     *
     * @return countryName as string.
     */
    String getCountryName();

    /**
     *
     * @param countryName as string
     */
    void setCountryName(String countryName);

    /**
     *
     * @return countryCode
     */
    String getCountryCode();

    /**
     *
     * @param countryCode as string
     */
    void setCountryCode(String countryCode);

   

}
