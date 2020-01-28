package com.example.ECProject;


import java.sql.Date;
import java.util.Objects;

public class Property {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private String street;
    private int plz;
    private int houseNumber;
    private String city;
    private String land;
    private String country;
    private int hashValue;

    public Property(String firstName, String lastName, Date birthDate, String email, String street, int plz, int houseNumber, String city, String land, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.street = street;
        this.plz = plz;
        this.houseNumber = houseNumber;
        this.city = city;
        this.land = land;
        this.country = country;
        this.hashValue= this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return plz == property.plz &&
                houseNumber == property.houseNumber &&
                Objects.equals(street, property.street) &&
                Objects.equals(city, property.city) &&
                Objects.equals(land, property.land) &&
                Objects.equals(country, property.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, plz, houseNumber, city, land, country);
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getbirthDate() { return birthDate; }

    public void setbirthDate(Date birthDate) {this.birthDate = birthDate;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public int gethouseNumber() {
        return houseNumber;
    }

    public void sethouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int gethashValue() {
        return hashValue;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", street='" + street + '\'' +
                ", plz=" + plz +
                ", houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                ", land='" + land + '\'' +
                ", country='" + country + '\'' +
                ", hashValue=" + hashValue +
                '}';
    }
}
