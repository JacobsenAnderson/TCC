/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package token;

import dao.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anderson
 */
public class CreateToken {
    
    public int token;
    public int token_id;
    private String login;
    private String password;
    public Timestamp HrToken;
    
    public CreateToken (){
        
    }
    
    //Criar token
    
    public Token Create(Token token){
        
        
        
        String sql = "INSERT INTO tb_tokens(token,login,password,HrToken) VALUES(?,?,?,?)";
        
        Token retorno = null;        
        
        PreparedStatement pst = ConnectionDB.getPreparedStatement(sql);
        try {
           
            pst.setInt(1, token.getToken());
            pst.setString(2, token.getLogin());
            pst.setString(3, token.getPassword());
            HrToken = new Timestamp(System.currentTimeMillis());
            pst.setTimestamp(4, HrToken);           
            
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                retorno = new Token();
                retorno.setToken(res.getInt("token"));
                                                
            }   
            
        } catch (SQLException ex) {
            Logger.getLogger(CreateToken.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
        return retorno;   
    
    }           
      
    
    
}
