/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAOImpl;
import utils.GenericDAO;
import utils.FactoryDao;

/**
 *
 * @author HoaiNam
 */
public class DangNhapController {
    
    private FactoryDao factory = new FactoryDao();

    public int checking(String username, String password) {
        GenericDAO dao = factory.getDao(FactoryDao.DAO_USER);
        return ((UserDAOImpl) dao).checking(username, password);
    }

}
