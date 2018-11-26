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
public class Thuoc {
    private int id;
    private String name;
    private String description;
    private String code;
    private String publisher;
    private float priceUnit;

    public Thuoc() {
    }

    public Thuoc(int id, String name, String description, String code, String publisher, float priceUnit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.code = code;
        this.publisher = publisher;
        this.priceUnit = priceUnit;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit) {
        this.priceUnit = priceUnit;
    }
    
}
