/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business.implementation;

import co.com.poli.appcreditos.business.IUsuarioBusiness;
import co.com.poli.appcreditos.dao.implementation.UsuarioDaoImpl;
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
        return usuarioDaoImpl.crearUsuario(usuario);
    }

    @Override
    public Usuario obtenerUsuario(String documento) {
        return usuarioDaoImpl.obtenerUsuario(documento);
    }

    @Override
    public String creditoMasSolicitado() {
        String mensaje ="";
        int sumaCreditoEstudio=0;
        int sumaCreditoViviena=0;
        int sumaCreditoLibreInversion=0;
        List<Usuario>listaUsuarios = usuarioDaoImpl.obtenerListaUsuarios();
        for (Usuario userList : listaUsuarios) {
            if(userList.getTipoCredito().equals("Vivienda")){
                sumaCreditoViviena++;
            }else if (userList.getTipoCredito().equals("Estudio")){
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
        List<Usuario>listaUsuarios = usuarioDaoImpl.obtenerListaUsuarios();
        for (Usuario userList : listaUsuarios) {
            if(userList.getTipoCredito().equals("Estudio")){
                sumaPrestamoEstudio = sumaPrestamoEstudio + userList.getMonto();
            }else if(userList.getTipoCredito().equals("Vivienda")){
                sumaPrestamoVivienda = sumaPrestamoVivienda + userList.getMonto();
            }else{
                sumaPrestamoLibreInversion = sumaPrestamoLibreInversion + userList.getMonto();
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
        List<Usuario>listaUsuarios = usuarioDaoImpl.obtenerListaUsuarios();
        for (Usuario userList : listaUsuarios) {
            if(userList.getTipoTrabajador().equals("Independiente")){
                sumaIndependientes++;
            }else if(userList.getTipoTrabajador().equals("Dependiente")){
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
    public String logicaNegocio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
