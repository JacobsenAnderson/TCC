/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import dao.UserDAO;
import token.Token;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import model.User;

/**
 * REST Web Service
 *
 * @author Anderson
 */
@Path("api")
public class api {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of api
     */
    public api() {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "WEBSERVER RODANDO";   
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Token")
    public String creteToken(String content){       
        
        String token = "4234324312342";
        
        
         return token;
    } 
    
    
    
    
    
    /*BLOCO USUARIO*/

    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Usuario/Inserir")
    public String inserirUsuario(String content){
        
        
        Gson g = new Gson();
        User u = (User) g.fromJson(content, User.class);
        UserDAO dao = new UserDAO();
        
        dao.insert(u);
        return "true";           
       
         
    }
    
    
    

    /**
     * Retrieves representation of an instance of ws.api
     * @return an instance of java.lang.String
     */

}
