/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HoaiNam
 */
public class PhongKham {
    private int id;
    private String name;
    private String local;
    private String description;
    private ArrayList<Buong> dsBuong;
    private ArrayList<NhanVien> dsNhanVien;

    public PhongKham() {
    }

    public PhongKham(int id, String name, String local, String description, ArrayList<Buong> dsBuong, ArrayList<NhanVien> dsNhanVien) {
        this.id = id;
        this.name = name;
        this.local = local;
        this.description = description;
        this.dsBuong = dsBuong;
        this.dsNhanVien = dsNhanVien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Buong> getDsBuong() {
        return dsBuong;
    }

    public void setDsBuong(ArrayList<Buong> dsBuong) {
        this.dsBuong = dsBuong;
    }

    public ArrayList<NhanVien> getDsNhanVien() {
        return dsNhanVien;
    }

    public void setDsNhanVien(ArrayList<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }

}
