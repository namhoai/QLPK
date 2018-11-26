/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.BangLuong;
import utils.FactoryDao;
import utils.GenericDAO;

/**
 *
 * @author HoaiNam
 */
public class XacNhanController {
    
    private FactoryDao factory = new FactoryDao();
    
    public boolean updateInfo(BangLuong bangLuong) {
        GenericDAO dao = factory.getDao(FactoryDao.DAO_BANGLUONG);
        return dao.update(bangLuong);
    }
}
