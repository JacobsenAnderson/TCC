/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.Timestamp;

/**
 *
 * @author Anderson
 */
public class User {
    
    private Integer user_id;
    private String login;
    private String name;
    private String number;
    private String password;
    private String mail;
    private String perfil;
    private Timestamp bdate;
    
    public User() {
			
    }

    public User(Integer user_id, String login, String name, String number, String password, String mail, String perfil, Timestamp bdate) {
        this.user_id = user_id;
        this.login = login;
        this.name = name;
        this.number = number;
        this.password = password;
        this.mail = mail;
        this.perfil = perfil;
        this.bdate = bdate;
    }
    
    

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Timestamp getBdate() {
        return bdate;
    }

    public void setBdate(Timestamp bdate) {
        this.bdate = bdate;
    }
    
    
    
    
    
    
}
