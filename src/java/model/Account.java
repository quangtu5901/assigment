/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Dell
 */
public class Account {
    private String email;
    private String phone;
    private String firstname;
    private String lastname;
    private boolean gender;
    private Date dob;
    private String password;
    private String Changerate;
    private String Volume;
    private int time;
    private boolean sendemail;

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public boolean isSendemail() {
        return sendemail;
    }

    /**
     *
     * @param sendemail
     */
    public void setSendemail(boolean sendemail) {
        this.sendemail = sendemail;
    }

    /**
     *
     * @return
     */
    public String getChangerate() {
        return Changerate;
    }

    /**
     *
     * @param Changerate
     */
    public void setChangerate(String Changerate) {
        this.Changerate = Changerate;
    }

    /**
     *
     * @return
     */
    public String getVolume() {
        return Volume;
    }

    /**
     *
     * @param Volume
     */
    public void setVolume(String Volume) {
        this.Volume = Volume;
    }

    /**
     *
     * @return
     */
    public int getTime() {
        return time;
    }

    /**
     *
     * @param time
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     *
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     *
     * @return
     */
    public String getLastname() {
        return lastname;
    }

    /**
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
   
    /**
     *
     * @return
     */
    public boolean isGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public Date getDob() {
        return dob;
    }

    /**
     *
     * @param dob
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
