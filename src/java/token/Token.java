/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package token;

import java.sql.Timestamp;

/**
 *
 * @author Anderson
 */
public class Token {
    
    
    public int token;
    private String login;
    private String password;
    public Timestamp HrToken;
    
    
    public Token(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public Timestamp getHrToken() {
        return HrToken;
    }

    public void setHrToken(Timestamp HrToken) {
        this.HrToken = HrToken;
    }
         
    
}
