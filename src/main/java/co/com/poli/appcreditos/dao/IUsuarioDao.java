/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.dao;

import co.com.poli.appcreditos.model.Usuario;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public interface IUsuarioDao {
    
    List<Usuario>obtenerListaUsuarios();
    String crearUsuario(Usuario usuario);
    Usuario obtenerUsuario(String documento);
    
}