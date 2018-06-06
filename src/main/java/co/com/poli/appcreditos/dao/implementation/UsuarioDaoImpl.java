/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.dao.implementation;

import co.com.poli.appcreditos.dao.IUsuarioDao;
import co.com.poli.appcreditos.jpacontroller.TblusuariosJpaController;
import co.com.poli.appcreditos.model.Tblusuarios;
import co.com.poli.appcreditos.util.JPAFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SANTIAGO
 */
public class UsuarioDaoImpl implements IUsuarioDao{
    
    

    @Override
    public List<Tblusuarios> obtenerListaUsuarios() {
        List<Tblusuarios>listado = new ArrayList<>();
        TblusuariosJpaController tblusuariosJpaController = new TblusuariosJpaController(JPAFactory.getFACTORY());
        listado = tblusuariosJpaController.findTblusuariosEntities();
        return listado;
    }

    @Override
    public Boolean crearUsuario(Tblusuarios usuario) {
        Boolean sw = false;
        try {
            TblusuariosJpaController tblusuariosJpaController = new TblusuariosJpaController(JPAFactory.getFACTORY());
            tblusuariosJpaController.create(usuario);  
        } catch (Exception ex) {
            sw = true;
            Logger.getLogger(UsuarioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return sw;
    }

    @Override
    public Tblusuarios obtenerUsuario(String documento) {
        TblusuariosJpaController tblusuariosJpaController = new TblusuariosJpaController(JPAFactory.getFACTORY());
        return tblusuariosJpaController.findTblusuarios(documento);
    }
    
    
}
