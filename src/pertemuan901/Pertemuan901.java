/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan901;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LAB F
 */
public class Pertemuan901 {
    public static void main (String[] args) throws SQLException {
        DbKoneksi dbk = new DbKoneksi();
        Statement st = dbk.Koneksi().createStatement();
        String sql = "SELECT * FROM mhs;";
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()){
            System.out.println("Nama : "+rs.getString("Nama"));
            System.out.println("NIM : "+rs.getString("NIM"));
            System.out.println("Alamat : "+rs.getString("Alamat"));
        }
        
    }
    
}
