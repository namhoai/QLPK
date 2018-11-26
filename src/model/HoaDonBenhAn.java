/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author HoaiNam
 */
public class HoaDonBenhAn {
    private int id;
    private BenhAn benhAn;
    private Date paymentDate;
    private float paymentAmount;
    private String paymentType;
    private String note;
    private PhongKham phongKham;

    public HoaDonBenhAn() {
    }

    public HoaDonBenhAn(int id, BenhAn benhAn, Date paymentDate, float paymentAmount, String paymentType, String note, PhongKham phongKham) {
        this.id = id;
        this.benhAn = benhAn;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.paymentType = paymentType;
        this.note = note;
        this.phongKham = phongKham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BenhAn getBenhAn() {
        return benhAn;
    }

    public void setBenhAn(BenhAn benhAn) {
        this.benhAn = benhAn;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public PhongKham getPhongKham() {
        return phongKham;
    }

    public void setPhongKham(PhongKham phongKham) {
        this.phongKham = phongKham;
    }

}
