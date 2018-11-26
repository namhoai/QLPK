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
public class DangKyKham {
    private int id;
    private BenhAn benhAn;
    private Buong buongKham;
    private boolean isActive;

    public DangKyKham() {
    }

    public DangKyKham(int id, BenhAn benhAn, Buong buongKham, boolean isActive) {
        this.id = id;
        this.benhAn = benhAn;
        this.buongKham = buongKham;
        this.isActive = isActive;
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

    public Buong getBuongKham() {
        return buongKham;
    }

    public void setBuongKham(Buong buongKham) {
        this.buongKham = buongKham;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
}
