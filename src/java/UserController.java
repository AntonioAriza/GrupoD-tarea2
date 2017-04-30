/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@RequestScoped
public class UserController implements Serializable{

    private User registrationUser;

    public UserController() {
        this.registrationUser = new User();
    }

    public User getRegistrationUser() {
        return registrationUser;
    }

    public void setRegistrationUser(User registrationUser) {
        this.registrationUser = registrationUser;
    }

    public String register() {
        String user = this.registrationUser.getUserName();
        String passw = this.registrationUser.getPassword();
        String nom = this.registrationUser.getFirstName();
        String email = this.registrationUser.getEmail();
        String err = "";
        String error = "";
        int cont = 0;
        
        if(user.equals("") || passw.equals("") || nom.equals("") || email.equals("")){
            if(user.equals("")){
                err = " usuario";
                cont++;
            } 
            
            if(passw.equals("")){
                if(cont > 0){
                    err = err + ", contraseña";
                } else {
                    err = err + "contraseña";
                }
                cont++;
            } 
            
            if(nom.equals("")){
                if(cont > 0){
                    err = err + ", nombre";
                } else {
                    err = err + "nombre";
                }
                cont++;
            }
            
            if(email.equals("")){
                if(cont > 0){
                    err = err + ", email";
                } else {
                    err = err + "email";
                }
                cont++;
            }
            
            if(cont == 1){
                error = "El campo " + err + " es obligatorio.";
            }else {
                error = "Los campos " + err + " son obligatorios.";
            }
            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, error, error));
            return "registration.jsf?faces-redirect=true";
        }else{
            return "InicioSesion.xhtml";
        }
    }

}