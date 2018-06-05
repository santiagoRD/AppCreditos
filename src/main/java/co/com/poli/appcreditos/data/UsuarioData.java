/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.data;

import co.com.poli.appcreditos.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public class UsuarioData {
 
    
     private static List<Usuario>listaUsuarios = null;
     
     
     static {
         listaUsuarios = new ArrayList<Usuario>(){
             {
                 add(new Usuario("12345", "Santiago", "Rios", "3453", 500D, "Dependiente", "Vivienda", "No"));
                 
             }
         };
     }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(List<Usuario> aListaUsuarios) {
        listaUsuarios = aListaUsuarios;
    }
     
     
}
