package project.entities;

import java.util.Date;

public class Register {
    private String name;
    private String email;
    private String password;
    private char gender;
    private Date birth;

    public Register() {}

    public Register(String name, String email, String password, char gender, Date birth) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return name
                + ", "
                + email
                + ", "
                + password
                + ", "
                + gender
                + ", "
                + ", "
                + birth;
    }
}
