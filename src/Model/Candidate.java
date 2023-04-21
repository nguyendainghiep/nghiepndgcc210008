/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;


/**
 *
 * @author Admin
 */
public class Candidate implements Serializable {

    
    private String ID;
    private String name;
    private Double average;
    private Boolean gender;
    private String major;
    private String bday;
    private String img;
    
    public Candidate(String ID, String name, Double average, Boolean gender, String major, String bday, String img) {
        this.ID = ID;
        this.name = name;
        this.average = average;
        this.gender = gender;
        this.major = major;
        this.bday = bday;
        this.img = "";
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
