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
import utils.GenericDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NhanVien;
import utils.DatabaseConnection;
import utils.SQLBuider;

/**
 *
 * @author HoaiNam
 */
public class NhanVienDAOImpl implements GenericDAO<NhanVien> {

    @Override
    public ArrayList<NhanVien> getList() {
        Connection connection = DatabaseConnection.getInstance().openConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<NhanVien> dsNV = new ArrayList<>();
        if (connection != null) {
            try {
                String sql = SQLBuider.getSqlQueryById(SQLBuider.SQL_MODULE_NHANVIEN, "get_all");
                ps = connection.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    int age = rs.getInt(3);
                    String sex = rs.getString(4);
                    String level = rs.getString(5);
                    String specialize = rs.getString(6);
                    String position = rs.getString(7);
                    float priceUnit = rs.getFloat(8);
                    String phone = rs.getString(9);
                    NhanVien nv = new NhanVien(id, name, age, sex, level, specialize, position, priceUnit, phone);
                    dsNV.add(nv);
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsNV;
    }

    public ArrayList<NhanVien> getListByPhongKham(int phongKhamID) {
        Connection connection = DatabaseConnection.getInstance().openConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<NhanVien> dsNV = new ArrayList<>();
        if (connection != null) {
            try {
                String sql = SQLBuider.getSqlQueryById(SQLBuider.SQL_MODULE_NHANVIEN, "get_all_by_pk_id");
                ps = connection.prepareStatement(sql);
                ps.setInt(1, phongKhamID);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    int age = rs.getInt(3);
                    String sex = rs.getString(4);
                    String level = rs.getString(5);
                    String specialize = rs.getString(6);
                    String position = rs.getString(7);
                    float priceUnit = rs.getFloat(8);
                    String phone = rs.getString(9);
                    NhanVien nv = new NhanVien(id, name, age, sex, level, specialize, position, priceUnit, phone);
                    dsNV.add(nv);
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsNV;
    }
    
    @Override
    public NhanVien get(int id) {
        Connection connection = DatabaseConnection.getInstance().openConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        NhanVien nv = null;
        if (connection != null) {
            try {
                String sql = SQLBuider.getSqlQueryById(SQLBuider.SQL_MODULE_NHANVIEN, "get_one_by_id");
                ps = connection.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int _id = rs.getInt(1);
                    String name = rs.getString(2);
                    int age = rs.getInt(3);
                    String sex = rs.getString(4);
                    String level = rs.getString(5);
                    String specialize = rs.getString(6);
                    String position = rs.getString(7);
                    float priceUnit = rs.getFloat(8);
                    String phone = rs.getString(9);
                    nv = new NhanVien(_id, name, age, sex, level, specialize, position, priceUnit, phone);
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return nv;
    }

    @Override
    public boolean insert(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<NhanVien> doSearch(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
