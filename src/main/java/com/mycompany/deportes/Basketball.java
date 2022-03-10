/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deportes;

/**
 *
 * @author PC
 */
public class Basketball {
    private int id;
    private String city;
    private String nameTeam;
    private int victories;
    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }
    //cosntructor

    public Basketball(int id, String city, String nameTeam, int victories) {
        this.id = id;
        this.city = city;
        this.nameTeam = nameTeam;
        this.victories = victories;
    }
    public Basketball() {
        this.id = 0;
        this.city = " ";
        this.nameTeam = " ";
        this.victories = 0;
    }
    
    
}
