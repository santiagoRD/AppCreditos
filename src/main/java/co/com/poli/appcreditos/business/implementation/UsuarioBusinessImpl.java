/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business.implementation;

import co.com.poli.appcreditos.business.IUsuarioBusiness;
import co.com.poli.appcreditos.dao.implementation.UsuarioDaoImpl;
import co.com.poli.appcreditos.model.Tblusuarios;
import co.com.poli.appcreditos.util.JPAFactory;
import co.com.poli.appcreditos.jpacontroller.TblusuariosJpaController;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public class UsuarioBusinessImpl implements IUsuarioBusiness{
    
    private  UsuarioDaoImpl usuarioDaoImpl = new UsuarioDaoImpl();

    @Override
    public List<Tblusuarios> obtenerListaUsuarios() {
        return usuarioDaoImpl.obtenerListaUsuarios();
    }

    @Override
    public Boolean crearUsuario(Tblusuarios usuario) {
        return usuarioDaoImpl.crearUsuario(usuario);
    }

    @Override
    public Tblusuarios obtenerUsuario(String documento) {
        return usuarioDaoImpl.obtenerUsuario(documento);
    }

    @Override
    public String creditoMasSolicitado() {
        String mensaje ="";
        int sumaCreditoEstudio=0;
        int sumaCreditoViviena=0;
        int sumaCreditoLibreInversion=0;
        List<Tblusuarios>listaUsuarios = usuarioDaoImpl.obtenerListaUsuarios();
        for (Tblusuarios userList : listaUsuarios) {
            if(userList.getTipocredito().equals("Vivienda")){
                sumaCreditoViviena++;
            }else if (userList.getTipocredito().equals("Estudio")){
                sumaCreditoEstudio++;
            }else{
                sumaCreditoLibreInversion++;
            }
        }
        if((sumaCreditoEstudio > sumaCreditoViviena ) && (sumaCreditoEstudio > sumaCreditoLibreInversion)){
            mensaje= "El credito mas solicitado es Estudio";
        }else if((sumaCreditoViviena > sumaCreditoEstudio) && (sumaCreditoViviena > sumaCreditoLibreInversion)){
            mensaje = "El credito mas solicitado es Vivienda";
        }else if((sumaCreditoLibreInversion > sumaCreditoEstudio) && (sumaCreditoLibreInversion > sumaCreditoViviena)){
            mensaje = "El credito mas solicitado es Libre inversion";
        }else if(sumaCreditoEstudio == sumaCreditoViviena){
            if(sumaCreditoEstudio == sumaCreditoLibreInversion){
                mensaje = "los creditos mas solicitados son Estudio, Vivienda y Libre inversion";
            }else{
                mensaje = "los creditos mas solicitados son Estudio y Vivienda";
            }
        }else if(sumaCreditoEstudio == sumaCreditoLibreInversion){
            if(sumaCreditoEstudio == sumaCreditoLibreInversion){
                mensaje = "los creditos mas solicitados son Estudio, Vivienda y Libre inversion";
            }else{
               mensaje = "los creditos mas solicitados son Estudio y Libre inversion"; 
            }
        }else{
            mensaje = "los creditos mas solicitados son Vivienda y Libre inversion";
        }
        
        return mensaje;
    }

    @Override
    public String creditoMayorNumeroPrestamos() {
        double sumaPrestamoEstudio = 0;
        double sumaPrestamoVivienda = 0;
        double sumaPrestamoLibreInversion = 0;
        String mensaje = "";
        List<Tblusuarios>listaUsuarios = usuarioDaoImpl.obtenerListaUsuarios();
        for (Tblusuarios userList : listaUsuarios) {
            if(userList.getTipocredito().equals("Estudio")){
                sumaPrestamoEstudio = sumaPrestamoEstudio + Double.valueOf(userList.getMonto());
            }else if(userList.getTipocredito().equals("Vivienda")){
                sumaPrestamoVivienda = sumaPrestamoVivienda + Double.valueOf(userList.getMonto());
            }else{
                sumaPrestamoLibreInversion = sumaPrestamoLibreInversion + Double.valueOf(userList.getMonto());
            }
        }
        if(( sumaPrestamoEstudio > sumaPrestamoVivienda) && (sumaPrestamoEstudio > sumaPrestamoLibreInversion)){
            mensaje= "El credito que tiene el valor acumulado de prestamos es Estudio con "+ sumaPrestamoEstudio+ " Dolares";
        }else if((sumaPrestamoVivienda > sumaPrestamoEstudio) && (sumaPrestamoVivienda > sumaPrestamoLibreInversion)){
            mensaje= "El credito que tiene el valor acumulado de prestamos es Vivienda con "+ sumaPrestamoVivienda+ " Dolares";
        }else if((sumaPrestamoLibreInversion > sumaPrestamoEstudio) && (sumaPrestamoLibreInversion > sumaPrestamoVivienda)){
            mensaje= "El credito que tiene el valor acumulado de prestamos es Libre inversion con "+ sumaPrestamoLibreInversion+ " Dolares";
        }else if(sumaPrestamoEstudio == sumaPrestamoVivienda){
            if(sumaPrestamoEstudio == sumaPrestamoLibreInversion){
                mensaje= "El credito que tiene el valor acumulado de prestamos son Estudio con "+ sumaPrestamoEstudio+ " Dolares";
            }else{
                mensaje = "los creditos mas solicitados son Estudio y Vivienda";
            }
        }else if(sumaPrestamoEstudio == sumaPrestamoLibreInversion){
            if(sumaPrestamoEstudio == sumaPrestamoLibreInversion){
                mensaje = "los creditos mas solicitados son Estudio, Vivienda y Libre inversion";
            }else{
               mensaje = "los creditos mas solicitados son Estudio y Libre inversion"; 
            }
        }else{
            mensaje = "los creditos mas solicitados son Vivienda y Libre inversion";
        }
        
        return mensaje;
    }

    @Override
    public String mayoresPrestadores() {
        int sumaIndependientes = 0;
        int sumaDependientes = 0;
        String mensaje = "";
        List<Tblusuarios>listaUsuarios = usuarioDaoImpl.obtenerListaUsuarios();
        for (Tblusuarios userList : listaUsuarios) {
            if(userList.getTipotrabajador().equals("Independiente")){
                sumaIndependientes++;
            }else if(userList.getTipotrabajador().equals("Dependiente")){
                sumaDependientes++;
            }
        }
        if(sumaIndependientes > sumaDependientes){
            mensaje = "Los trabajadores que mas realizan prestamos son los Independientes";
        }else if(sumaDependientes > sumaIndependientes){
            mensaje = "Los trabajadores que mas realizan prestamos son los Dependientes";
        }else{
            mensaje = "Los trabajadores Dependientes e Independientes realizan el mismo numero de prestamos";
        }
        return mensaje;
    }

    @Override
    public Boolean logicaNegocio(Tblusuarios usuario) {
        Boolean sw = false;
        List<Tblusuarios>userList = usuarioDaoImpl.obtenerListaUsuarios();
        for (Tblusuarios tblusuarios : userList) {
            if(tblusuarios.getDocumento().equals(usuario.getDocumento())){
                if(tblusuarios.getTipocredito().equals(usuario.getTipocredito())){
                    sw  = true;
                }
            }
        }
        return sw;
    }
    
}
