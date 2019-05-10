package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conexao {    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3307/escola";
    private static final String USER = "root";
    private static final String PASS = "usbw";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
      }
    public static void fecharConexao(Connection con){
            
        if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
      }
    
     public static void fecharConexao(Connection con,PreparedStatement ps){
            fecharConexao(con);
            if(ps !=null){
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
      }
     
      public static void fecharConexao(Connection con,PreparedStatement ps,ResultSet rs){
            
        if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
      }
 }
    

