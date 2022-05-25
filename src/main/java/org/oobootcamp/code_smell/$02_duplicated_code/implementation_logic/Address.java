package org.oobootcamp.code_smell.$02_duplicated_code.implementation_logic;

public class Address {
    private String streetAddress;
    private int houseNumber;
    private String city;
    private String province;
    private String zipCode;

    public String getStreetAddress() {
        return streetAddress;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getZipCode() {
        return zipCode;
    }
}
