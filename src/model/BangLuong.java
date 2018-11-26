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
public class BangLuong {
    private int id;
    private NhanVien nhanVien;
    private ArrayList<CaLamViec> dsCalamViec; 
    private int week;
    private float paymentAmount;
    private Date paymentDate;
    private String note;
    private boolean paid;

    public BangLuong() {
    }

    public BangLuong(int id, NhanVien nhanVien, ArrayList<CaLamViec> dsCalamViec, float paymentAmount, Date paymentDate, String note, int week, boolean paid) {
        this.id = id;
        this.nhanVien = nhanVien;
        this.dsCalamViec = dsCalamViec;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.note = note;
        this.week = week;
        this.paid = paid;
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

    public ArrayList<CaLamViec> getDsCalamViec() {
        return dsCalamViec;
    }

    public void setDsCalamViec(ArrayList<CaLamViec> dsCalamViec) {
        this.dsCalamViec = dsCalamViec;
    }

    public float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    
    
}
