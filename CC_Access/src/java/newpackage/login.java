package newpackage;


import java.sql.*;
import javax.faces.bean.ManagedBean;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author mmgarcia
 */
@ManagedBean
public class login {
//Declaracion de atributos
    private String usuario;
    private String password;       
  
    //Encapsulacion
    public String getUsuario() {
        return usuario;
    }

      public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String autenticacion() throws ClassNotFoundException, SQLException{
      String db = "jdbc:mysql://localhost:3306/cc_access";
      String usuario="root";
      String password= "";
      String controlador = "com.mysql.jdbc.Driver";
      Class.forName(controlador);
      Connection con = DriverManager.getConnection(db, usuario, password);
      Statement st=con.createStatement();
      ResultSet rs =st.executeQuery("select * from loggin where Usuario='"+getUsuario()+"' && contraseña='"+getPassword()+"' && TIPO='administrador"+"'");
      if (rs.next()){
          
          return "Exitoso";
      }
      else 
          return "Fallido";
    }
    
    public String autenticacion2() throws ClassNotFoundException, SQLException{
      String db = "jdbc:mysql://localhost:3306/cc_access";
      String usuario="root";
      String password= "";
      String controlador = "com.mysql.jdbc.Driver";
      Class.forName(controlador);
      Connection con = DriverManager.getConnection(db, usuario, password);
      Statement st=con.createStatement();
      ResultSet rs =st.executeQuery("select * from loggin where Usuario='"+getUsuario()+"' && contraseña='"+getPassword()+"' && TIPO='usuario"+"'");
      if (rs.next()){          
          return "Exitoso";
      }
      else 
          return "Fallido";
    }
}