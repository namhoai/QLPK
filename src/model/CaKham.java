/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HoaiNam
 */
public class CaKham {
    private int id;
    private NhanVien bacSi;
    private ArrayList<NhanVien> dsYTa;
    private Buong buong;
    private Date day;
    private String shift;
    private boolean isActive;

    public CaKham() {
    }

    public CaKham(int id, NhanVien bacSi, ArrayList<NhanVien> dsYTa, Buong buong, Date day, String shift, boolean isActive) {
        this.id = id;
        this.bacSi = bacSi;
        this.dsYTa = dsYTa;
        this.buong = buong;
        this.day = day;
        this.shift = shift;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NhanVien getBacSi() {
        return bacSi;
    }

    public void setBacSi(NhanVien bacSi) {
        this.bacSi = bacSi;
    }

    public ArrayList<NhanVien> getDsYTa() {
        return dsYTa;
    }

    public void setDsYTa(ArrayList<NhanVien> dsYTa) {
        this.dsYTa = dsYTa;
    }

    public Buong getBuong() {
        return buong;
    }

    public void setBuong(Buong buong) {
        this.buong = buong;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    
}
