package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    /**
     * This is a method that compares two cities based on their names.
     * @param o
     * This is the other city to compare to
     * @return
     * Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName()); // this.city refers to the city name
    }


    /**
     *
     * @param o   the reference object with which to compare.
     * @return
     * Returns true if the two objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }


    /**
     * This is a method that returns a hash code value for the object.
     * @return
     * Returns a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
