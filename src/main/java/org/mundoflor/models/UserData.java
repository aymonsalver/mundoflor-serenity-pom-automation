package org.mundoflor.models;

public class UserData {

    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String remitente;

    public UserData(String firstName, String lastName, String address, String phone, String email, String remitente) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.remitente = remitente;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getRemitente() {
        return remitente;
    }
}
