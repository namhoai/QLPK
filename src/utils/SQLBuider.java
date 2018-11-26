/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HoaiNam
 */

public class SQLBuider {

    // -------------------------MODULES--------------------------
    public static final String SQL_MODULE_NHANVIEN = "nhanvien";
    public static final String SQL_MODULE_BANGLUONG = "bangluong";
    public static final String SQL_MODULE_CALAMVIEC = "calamviec";
    public static final String SQL_MODULE_CAKHAM = "cakham";
    public static final String SQL_MODULE_USER = "user";

    public static String getSqlQueryById(String module, String queryId) {
        try {
            StringBuilder sql = new StringBuilder("");
            BufferedInputStream bis = new BufferedInputStream(SQLBuider.class.getResourceAsStream("/sql/" + module + "/" + queryId + ".sql"));
            int i = 0;
            while ((i = bis.read()) != -1) {
                sql.append((char) i);
            }
            return sql.toString();
        } catch (IOException ex) {
            Logger.getLogger(SQLBuider.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
