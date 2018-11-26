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
public class BenhAn {
    private int id;
    private BenhNhan benhNhan;
    private Buong buongKham;
    private ArrayList<Buong> dsBuongXN;
    private ArrayList<PhieuXetNghiem> dsPhieuXN;
    private ArrayList<ThuocSD> donThuoc;
    private String resuft;
    private String note;

    public BenhAn() {
    }

    public BenhAn(int id, BenhNhan benhNhan, Buong buongKham, ArrayList<Buong> dsBuongXN, ArrayList<PhieuXetNghiem> dsPhieuXN, ArrayList<ThuocSD> donThuoc, String resuft, String note) {
        this.id = id;
        this.benhNhan = benhNhan;
        this.buongKham = buongKham;
        this.dsBuongXN = dsBuongXN;
        this.dsPhieuXN = dsPhieuXN;
        this.donThuoc = donThuoc;
        this.resuft = resuft;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public Buong getBuongKham() {
        return buongKham;
    }

    public void setBuongKham(Buong buongKham) {
        this.buongKham = buongKham;
    }

    public ArrayList<Buong> getDsBuongXN() {
        return dsBuongXN;
    }

    public void setDsBuongXN(ArrayList<Buong> dsBuongXN) {
        this.dsBuongXN = dsBuongXN;
    }

    public ArrayList<PhieuXetNghiem> getDsPhieuXN() {
        return dsPhieuXN;
    }

    public void setDsPhieuXN(ArrayList<PhieuXetNghiem> dsPhieuXN) {
        this.dsPhieuXN = dsPhieuXN;
    }

    public ArrayList<ThuocSD> getDonThuoc() {
        return donThuoc;
    }

    public void setDonThuoc(ArrayList<ThuocSD> donThuoc) {
        this.donThuoc = donThuoc;
    }

    public String getResuft() {
        return resuft;
    }

    public void setResuft(String resuft) {
        this.resuft = resuft;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
