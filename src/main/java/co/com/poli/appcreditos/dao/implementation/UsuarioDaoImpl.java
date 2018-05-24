/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.dao.implementation;

import co.com.poli.appcreditos.dao.IUsuarioDao;
import co.com.poli.appcreditos.data.UsuarioData;
import co.com.poli.appcreditos.model.Usuario;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public class UsuarioDaoImpl implements IUsuarioDao{

    @Override
    public List<Usuario> obtenerListaUsuarios() {
        return UsuarioData.getListaUsuarios();
    }

    @Override
    public String crearUsuario(Usuario usuario) {
        List<Usuario>listaUsuarios = UsuarioData.getListaUsuarios();
        listaUsuarios.add(usuario);
        UsuarioData.setListaUsuarios(listaUsuarios);
        return "Usuario creado";
    }

    @Override
    public Usuario obtenerUsuario(String documento) {
        Usuario user = null;
        List<Usuario>listaUsuarios = UsuarioData.getListaUsuarios();
        for (Usuario userList : listaUsuarios) {
            if(userList.getDocumento().equals(documento)){
                user = userList;
            }
        }
        return user;
    }
    
}
