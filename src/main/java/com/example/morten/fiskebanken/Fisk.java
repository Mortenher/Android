package com.example.morten.fiskebanken;

/**
 * Created by Morten on 23.02.2016.
 */
public class Fisk {

    int id;
    String type;
    double vekt;
    double lengde;

    /*public Fisk(int id, String type, double vekt, double lengde) {
        this.id = id;
        this.type = type;
        this.vekt = vekt;
        this.lengde = lengde;
    }*/

    public int getId() {return id; }

    public String getType() {
        return type;
    }

    public double getVekt() {
        return vekt;
    }

    public double getLengde() {
        return lengde;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {this.id = id;}
    public void setVekt(double vekt) {
        this.vekt = vekt;
    }

    public void setLengde(double lengde) {
        this.lengde = lengde;
    }
}
