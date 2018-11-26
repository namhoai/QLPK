package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import utils.GenericDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BangLuong;
import utils.DatabaseConnection;
import utils.SQLBuider;

/**
 *
 * @author HoaiNam
 */
public class BangLuongDAOImpl implements GenericDAO<BangLuong> {

    private static final DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    
    @Override
    public ArrayList<BangLuong> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BangLuong get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(BangLuong t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(BangLuong t) {
        Connection connection = DatabaseConnection.getInstance().openConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        if (connection != null) {
            try {
                String sql = SQLBuider.getSqlQueryById(SQLBuider.SQL_MODULE_BANGLUONG, "update");
                ps = connection.prepareStatement(sql);
                ps.setInt(1, t.getNhanVien().getId());
                ps.setFloat(2, t.getPaymentAmount());
                ps.setDate(3, java.sql.Date.valueOf(format.format(t.getPaymentDate())));
                ps.setString(4, t.getNote());
                ps.setInt(5, t.getWeek());
                ps.setBoolean(6, t.isPaid());
                ps.setInt(7, t.getId());
                return ps.executeUpdate() > 0;
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    @Override
    public boolean delete(BangLuong t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BangLuong> doSearch(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BangLuong getByWeekAndIdNV(int week, int NhanVienID) {
        Connection connection = DatabaseConnection.getInstance().openConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        BangLuong bangLuong = null;
        if (connection != null) {
            try {
                String sql = SQLBuider.getSqlQueryById(SQLBuider.SQL_MODULE_BANGLUONG, "get_one_by_week_nv");
                ps = connection.prepareStatement(sql);
                ps.setInt(1, NhanVienID);
                ps.setInt(2, week);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    int nhanVienID = rs.getInt(2);
                    float paymentAmount = rs.getFloat(3);
                    Date paymentDate = rs.getDate(4);
                    String note = rs.getString(5);
                    int _week = rs.getInt(6);
                    boolean paid = rs.getBoolean(7);
                    bangLuong = new BangLuong(id, null, null, paymentAmount, paymentDate, note, _week, paid);
                    return bangLuong;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return bangLuong;
    }
}
