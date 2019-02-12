/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver.model.dao.entity;

import java.sql.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Mohamed Jamal
 */
public class UserEntity {

    private String name;
    private String phoneNumber;
    private String country;
    private Date dateOfBirth;
    //private ImageIcon picture;
    private String password;
    private String email;
    private enum gender {MALE, FEMALE};
    private String bio;
    
    public UserEntity(){}
    
    public UserEntity(String name, String phoneNumber, String country, Date dateOfBirth, String password, String email, String bio) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "UserEntity{" + "name=" + name + ", phoneNumber=" + phoneNumber + ", country=" + country + ", dateOfBirth=" + dateOfBirth + ", password=" + password + ", email=" + email + ", bio=" + bio + '}';
    }
    
    
    
    
    
}
