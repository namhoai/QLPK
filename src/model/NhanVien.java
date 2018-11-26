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
public class NhanVien {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String level;
    private String specialize;
    private String position;
    private float priceUnit;
    private String phone;

    public NhanVien(int id, String name, int age, String sex, String level, String specialize, String position, float priceUnit, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.level = level;
        this.specialize = specialize;
        this.position = position;
        this.priceUnit = priceUnit;
        this.phone = phone;
    }

    public NhanVien() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
}
