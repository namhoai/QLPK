/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.NhanVienDAOImpl;
import utils.FactoryDao;
import utils.GenericDAO;
import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author HoaiNam
 */
public class DanhSachNVController {
    
    private FactoryDao factory = new FactoryDao();
    
    public ArrayList<NhanVien> getListNVByPhongKham(int phongKhamID) {
        GenericDAO dao = factory.getDao(FactoryDao.DAO_NHANVIEN);
        return ((NhanVienDAOImpl) dao).getListByPhongKham(phongKhamID);
    }
    
    public ArrayList<NhanVien> getListNV() {
        GenericDAO dao = factory.getDao(FactoryDao.DAO_NHANVIEN);
        return dao.getList();
    }

    public NhanVien getNV(int id) {
        GenericDAO dao = factory.getDao(FactoryDao.DAO_NHANVIEN);
        return (NhanVien) dao.get(id);
    }
}
