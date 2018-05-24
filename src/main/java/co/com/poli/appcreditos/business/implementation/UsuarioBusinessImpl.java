/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business.implementation;

import co.com.poli.appcreditos.business.IUsuarioBusiness;
import co.com.poli.appcreditos.dao.implementation.UsuarioDaoImpl;
import co.com.poli.appcreditos.data.UsuarioData;
import co.com.poli.appcreditos.model.Usuario;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public class UsuarioBusinessImpl implements IUsuarioBusiness{
    
    private UsuarioDaoImpl usuarioDaoImpl = new UsuarioDaoImpl();

    @Override
    public List<Usuario> obtenerListaUsuarios() {
        return usuarioDaoImpl.obtenerListaUsuarios();
    }

    @Override
    public String crearUsuario(Usuario usuario) {
        
        String respuesta = "Usuario ya existe";
        Usuario user = obtenerUsuario(usuario.getDocumento());
        List<Usuario>listaUsuarios = UsuarioData.getListaUsuarios();
        for (Usuario userList : listaUsuarios) {
            if(userList.getDocumento().equals(user.getDocumento())&& 
               userList.getNumCredito().equals(user.getTipoCredito())){
                    return respuesta;
            }
        }
        respuesta = usuarioDaoImpl.crearUsuario(user);
        return respuesta;
    }

    @Override
    public Usuario obtenerUsuario(String documento) {
        return usuarioDaoImpl.obtenerUsuario(documento);
    }
    
}
