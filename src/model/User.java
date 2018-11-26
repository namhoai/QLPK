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
public class User {
    private int id;
    private String username;
    private String password;
    private int type; // type = 1 : Quản trị hệ thống | type = 2 : Quản lý | type = 3 : Bác Sỹ | type = 4 : Nhân viên lễ tân.
    private PhongKham phongKham;

    public User() {
    }

    public User(int id, String username, String password, int type, PhongKham phongKham) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.type = type;
        this.phongKham = phongKham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public PhongKham getPhongKham() {
        return phongKham;
    }

    public void setPhongKham(PhongKham phongKham) {
        this.phongKham = phongKham;
    }

}
