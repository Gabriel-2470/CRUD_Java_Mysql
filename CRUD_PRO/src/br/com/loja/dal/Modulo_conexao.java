package br.com.loja.dal;

import java.sql.*;

public class Modulo_conexao {
    //Método para conexão
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //Driver
        String driver = "com.mysql.jdbc.Driver";
        //Informações
        String url = "jdbc:mysql://localhost:3306/bdlojaetec";
        String user = "root";
        String password = "";

        //Conexão
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        }catch (Exception e){
            return null;
        }

    }

}
