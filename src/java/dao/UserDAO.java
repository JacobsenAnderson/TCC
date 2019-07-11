/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author Anderson
 */
public class UserDAO {
    
    public UserDAO (){
        
    }
    
    /*LISTAR USUARIO */

    
    /*BUSCAR USUARIO*/

    /*Inserir USUARIO */
    public boolean insert(User user){
        String sql = "INSERT INTO yoursalon_01.tb_users(login,nome,email,senha,telefone,perfil) VALUES(?,?,?,?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst = ConnectionDB.getPreparedStatement(sql);
        try {
            pst.setString(1, user.getLogin());
            pst.setString(2, user.getName());
            pst.setString(3, user.getNumber());
            pst.setString(4, user.getPassword());
            pst.setString(5, user.getMail());
            pst.setString(6, user.getPerfil());
            
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");         
            
            pst.setTimestamp(5, new Timestamp(df.parse(user.getBdate()).getTime()));           
 
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
 
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
        
    }

  
    /*Excluir USUARIO */

    /*Atualizar USUARIO */
 

    
    
    
}
