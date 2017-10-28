/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasel.Model.utils;

import java.sql.ResultSet;
import java.util.ArrayList;
import sun.net.www.content.text.Generic;

/**
 *
 * @author victor
 */
public interface CRUDInterface<T> {
    boolean create(T obj);
    ArrayList<T> read();
    T edit(int id);
    boolean update(T obj);
    boolean delete(int id);
}
