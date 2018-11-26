/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CaKham;
import utils.DatabaseConnection;
import utils.GenericDAO;
import utils.SQLBuider;

/**
 *
 * @author HoaiNam
 */
public class CaKhamDAOImpl implements GenericDAO<CaKham>{

    @Override
    public ArrayList<CaKham> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CaKham get(int id) {
        Connection connection = DatabaseConnection.getInstance().openConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        CaKham caKham = null;
        if (connection != null) {
            try {
                String sql = SQLBuider.getSqlQueryById(SQLBuider.SQL_MODULE_CAKHAM, "get_one_by_id");
                ps = connection.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int _id = rs.getInt(1);
                    int nhanVienID = rs.getInt(2);
                    int buongID = rs.getInt(3);
                    Date date = rs.getDate(4);
                    String day = rs.getString(5);
                    boolean isActive = rs.getBoolean(6);
                    caKham = new CaKham(_id, null, null, null, date, sql, isActive);
                    return caKham;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return caKham;
    }

    @Override
    public boolean insert(CaKham t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CaKham t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(CaKham t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CaKham> doSearch(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
