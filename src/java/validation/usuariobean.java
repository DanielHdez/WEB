/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author danca
 */

@Named(value = "usuario")
@SessionScoped
//@ApplicationScoped
//@RequestScoped

public class usuariobean implements Serializable {

   private String usuario;
   private String password;
 

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRespuesta(){
        if(usuario!=null && password!=null){
            return "<p>Usuario:" +usuario+ " <br/> Contraseña="+password+" </p>";
        }
        return "";
         }
}
