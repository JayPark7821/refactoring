package org.example._10_data_clumps;

import org.example._06_mutable_data._23_change_reference_to_value.TelephoneNumber;

public class Office {

    private String location;


    private TelephoneNumber telephoneNumber;

    public Office(String location, TelephoneNumber telephoneNumber) {
        this.location = location;
        this.telephoneNumber = telephoneNumber;
    }

    public String officePhoneNumber() {
        return this.telephoneNumber.toString();
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }
}
