package com.company;
public class Name {
    private String firstName;
    private String lastname;
    private String email;
    private String other_o;


    public String getothero() {
        return other_o;
    }

    public void setothero(String othero) {
        othero = other_o;
    }

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }
    public  void addOther_o(String other_o2){
        this.other_o=other_o2;
    }

    }

