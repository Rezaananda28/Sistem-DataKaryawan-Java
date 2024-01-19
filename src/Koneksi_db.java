/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author 
 */
public class Koneksi_db {
    public static com.mysql.jdbc.Connection conn;
    
    public static void openConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/data_karyawan";
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, "root", "");
        }catch (ClassNotFoundException e){
        }catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Koneksi");
        }
    }
    public static com.mysql.jdbc.Connection getcoConnection(){
        return conn;
    }
}
