/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prausk_alfarizi;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class Koneksi {
    private Connection connect;
    private String jdbcUrl = "jdbc:mysql://localhost:3306/";
}
