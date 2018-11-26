/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author HoaiNam
 */

public interface GenericDAO<T> {

    ArrayList<T> getList();

    T get(int id);

    boolean insert(T t);

    boolean update(T t);

    boolean delete(T t);

    ArrayList<T> doSearch(Object object);

}
