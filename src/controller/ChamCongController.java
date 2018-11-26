/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BangLuongDAOImpl;
import dao.CaLamViecDAOImpl;
import java.util.ArrayList;
import model.BangLuong;
import model.CaLamViec;
import model.NhanVien;
import utils.FactoryDao;
import utils.GenericDAO;

/**
 *
 * @author HoaiNam
 */
public class ChamCongController {

    private FactoryDao factory = new FactoryDao();
    
    public BangLuong getByWeekAndIdNV(int nhanVienID, int week) {
        GenericDAO daoBL = factory.getDao(FactoryDao.DAO_BANGLUONG);
        BangLuong bangLuong = ((BangLuongDAOImpl) daoBL).getByWeekAndIdNV(week, nhanVienID);

        if (bangLuong == null) return null;
        
        GenericDAO daoNV = factory.getDao(FactoryDao.DAO_NHANVIEN);
        NhanVien nhanVien = (NhanVien) daoNV.get(nhanVienID);
        bangLuong.setNhanVien(nhanVien);
        
        GenericDAO daoCLV = factory.getDao(FactoryDao.DAO_CALAMVIEC);
        ArrayList<CaLamViec> calamviec = ((CaLamViecDAOImpl) daoCLV).getListByIdBL(bangLuong.getId());
 
        bangLuong.setDsCalamViec(calamviec);

        return bangLuong;
    }
    
}
