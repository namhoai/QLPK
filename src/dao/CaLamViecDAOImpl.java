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
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CaKham;
import model.CaLamViec;
import utils.DatabaseConnection;
import utils.GenericDAO;
import utils.SQLBuider;

/**
 *
 * @author HoaiNam
 */
public class CaLamViecDAOImpl implements GenericDAO<CaLamViec>{

    public ArrayList<CaLamViec> getListByIdBL(int bangLuongId) {
        Connection connection = DatabaseConnection.getInstance().openConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<CaLamViec> dsCLV = new ArrayList<>();
        if (connection != null) {
            try {
                String sql = SQLBuider.getSqlQueryById(SQLBuider.SQL_MODULE_CALAMVIEC, "get_all_by_bl_id");
                ps = connection.prepareStatement(sql);
                ps.setInt(1, bangLuongId);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    Time checkIn = rs.getTime(5);
                    Time checkOut = rs.getTime(6);
                    boolean isCheckedIn = rs.getBoolean(7);

                    // CaKham.
                    int idCaKham = rs.getInt(8);
                    rs.getTime(6);
                    Date day = rs.getDate(9);
                    String shift = rs.getString(10);
                    boolean isActive = rs.getBoolean(11);
                    CaKham caKham = new CaKham(id, null, null, null, day, shift, isActive);

                    CaLamViec caLamViec = new CaLamViec(id, null, checkIn, checkOut, isCheckedIn, caKham);
                    dsCLV.add(caLamViec);
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsCLV;
    }

    @Override
    public ArrayList<CaLamViec> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CaLamViec get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(CaLamViec t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CaLamViec t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(CaLamViec t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CaLamViec> doSearch(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
