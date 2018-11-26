package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import utils.GenericDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PhongKham;
import model.User;
import utils.DatabaseConnection;
import utils.SQLBuider;

/**
 *
 * @author HoaiNam
 */
public class UserDAOImpl implements GenericDAO<User> {

    public int checking(String username, String password) {
        Connection connection = DatabaseConnection.getInstance().openConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (connection != null) {
            try {
                String sql = SQLBuider.getSqlQueryById(SQLBuider.SQL_MODULE_USER, "checking");
                ps = connection.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int idPK = rs.getInt(1);
                    int type = rs.getInt(2);
                    if (type == 1) {
                        return idPK;
                    }
                    return -1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1;
    }

    @Override
    public ArrayList<User> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User get(int id) {
        Connection connection = DatabaseConnection.getInstance().openConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        if (connection != null) {
            try {
                String sql = SQLBuider.getSqlQueryById(SQLBuider.SQL_MODULE_USER, "get_one_by_id");
                ps = connection.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int type = rs.getInt(1);
                    String username = rs.getString(2);
                    int idPK = rs.getInt(3);
                    String name = rs.getString(4);
                    String local = rs.getString(5);
                    String description = rs.getString(6);
                    PhongKham pk = new PhongKham(id, name, local, description, null, null);
                    user = new User(id, username, "", type, pk);
                    return user;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user;
    }

    @Override
    public boolean insert(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> doSearch(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
