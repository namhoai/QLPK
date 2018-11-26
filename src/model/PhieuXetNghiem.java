/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HoaiNam
 */
public class PhieuXetNghiem {
    private int id;
    private Buong buong;
    private BenhNhan benhNhan;
    private String name;
    private String results;
    private float cost;

    public PhieuXetNghiem() {
    }

    public PhieuXetNghiem(int id, Buong buong, BenhNhan benhNhan, String name, String results, float cost) {
        this.id = id;
        this.buong = buong;
        this.benhNhan = benhNhan;
        this.name = name;
        this.results = results;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Buong getBuong() {
        return buong;
    }

    public void setBuong(Buong buong) {
        this.buong = buong;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

}
