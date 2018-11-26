/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;

/**
 *
 * @author HoaiNam
 */
public class CaLamViec {
    private int id;
    private NhanVien nhanVien;
    private Time checkIn;
    private Time checkOut;
    private boolean isCheckedIn;
    private CaKham caKham;

    public CaLamViec() {
    }

    public CaLamViec(int id, NhanVien nhanVien, Time checkIn, Time checkOut, boolean isCheckedIn, CaKham caKham) {
        this.id = id;
        this.nhanVien = nhanVien;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.isCheckedIn = isCheckedIn;
        this.caKham = caKham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Time getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Time checkIn) {
        this.checkIn = checkIn;
    }

    public Time getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Time checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isIsCheckedIn() {
        return isCheckedIn;
    }

    public void setIsCheckedIn(boolean isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }

    public CaKham getCaKham() {
        return caKham;
    }

    public void setCaKham(CaKham caKham) {
        this.caKham = caKham;
    }

}
