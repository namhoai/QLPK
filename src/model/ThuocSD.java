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
public class ThuocSD {
    private int id;
    private Thuoc thuoc;
    private int Amount;
    private float total;
    private String usege;

    public ThuocSD() {
    }

    public ThuocSD(int id, Thuoc thuoc, int Amount, float total, String usege) {
        this.id = id;
        this.thuoc = thuoc;
        this.Amount = Amount;
        this.total = total;
        this.usege = usege;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Thuoc getThuoc() {
        return thuoc;
    }

    public void setThuoc(Thuoc thuoc) {
        this.thuoc = thuoc;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getUsege() {
        return usege;
    }

    public void setUsege(String usege) {
        this.usege = usege;
    }
    
    
}
