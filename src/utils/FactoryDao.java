/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import dao.BangLuongDAOImpl;
import dao.CaKhamDAOImpl;
import dao.CaLamViecDAOImpl;
import dao.NhanVienDAOImpl;
import dao.UserDAOImpl;

/**
 *
 * @author HoaiNam
 */
public class FactoryDao {

    public static final String DAO_NHANVIEN = "nhanvien";
    public static final String DAO_BANGLUONG = "bangluong";
    public static final String DAO_CALAMVIEC = "calamviec";
    public static final String DAO_CAKHAM = "cakham";
    public static final String DAO_USER = "user";
    
    public FactoryDao() {
    }
    
    public GenericDAO getDao(String model){
        if(model == null){
            return null;
        }
        if(model.equalsIgnoreCase(FactoryDao.DAO_BANGLUONG)) {
            return new BangLuongDAOImpl();
        }
        if(model.equalsIgnoreCase(FactoryDao.DAO_NHANVIEN)) {
            return new NhanVienDAOImpl();
        }
        if(model.equalsIgnoreCase(FactoryDao.DAO_USER)) {
            return new UserDAOImpl();
        }
        if(model.equalsIgnoreCase(FactoryDao.DAO_CALAMVIEC)) {
            return new CaLamViecDAOImpl();
        }
        if(model.equalsIgnoreCase(FactoryDao.DAO_CAKHAM)) {
            return new CaKhamDAOImpl();
        }
        return null;
    }
}
