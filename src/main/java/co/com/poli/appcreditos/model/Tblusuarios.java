/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SANTIAGO
 */
@Entity
@Table(name = "tblusuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblusuarios.findAll", query = "SELECT t FROM Tblusuarios t")
    , @NamedQuery(name = "Tblusuarios.findByDocumento", query = "SELECT t FROM Tblusuarios t WHERE t.documento = :documento")
    , @NamedQuery(name = "Tblusuarios.findByNombre", query = "SELECT t FROM Tblusuarios t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tblusuarios.findByApellidos", query = "SELECT t FROM Tblusuarios t WHERE t.apellidos = :apellidos")
    , @NamedQuery(name = "Tblusuarios.findByNumcredito", query = "SELECT t FROM Tblusuarios t WHERE t.numcredito = :numcredito")
    , @NamedQuery(name = "Tblusuarios.findByMonto", query = "SELECT t FROM Tblusuarios t WHERE t.monto = :monto")
    , @NamedQuery(name = "Tblusuarios.findByTipotrabajador", query = "SELECT t FROM Tblusuarios t WHERE t.tipotrabajador = :tipotrabajador")
    , @NamedQuery(name = "Tblusuarios.findByTipocredito", query = "SELECT t FROM Tblusuarios t WHERE t.tipocredito = :tipocredito")
    , @NamedQuery(name = "Tblusuarios.findByTrabajacompa\u00f1ia", query = "SELECT t FROM Tblusuarios t WHERE t.trabajacompa\u00f1ia = :trabajacompa\u00f1ia")})
public class Tblusuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "documento")
    private String documento;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 2147483647)
    @Column(name = "numcredito")
    private String numcredito;
    @Size(max = 2147483647)
    @Column(name = "monto")
    private String monto;
    @Size(max = 2147483647)
    @Column(name = "tipotrabajador")
    private String tipotrabajador;
    @Size(max = 2147483647)
    @Column(name = "tipocredito")
    private String tipocredito;
    @Size(max = 2147483647)
    @Column(name = "trabajacompa\u00f1ia")
    private String trabajacompañia;

    public Tblusuarios() {
    }

    public Tblusuarios(String documento) {
        this.documento = documento;
    }

    public Tblusuarios(String documento, String nombre, String apellidos, String numcredito, String monto, String tipotrabajador, String tipocredito, String trabajacompañia) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numcredito = numcredito;
        this.monto = monto;
        this.tipotrabajador = tipotrabajador;
        this.tipocredito = tipocredito;
        this.trabajacompañia = trabajacompañia;
    }
    
    

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumcredito() {
        return numcredito;
    }

    public void setNumcredito(String numcredito) {
        this.numcredito = numcredito;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getTipotrabajador() {
        return tipotrabajador;
    }

    public void setTipotrabajador(String tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    public String getTipocredito() {
        return tipocredito;
    }

    public void setTipocredito(String tipocredito) {
        this.tipocredito = tipocredito;
    }

    public String getTrabajacompañia() {
        return trabajacompañia;
    }

    public void setTrabajacompañia(String trabajacompañia) {
        this.trabajacompañia = trabajacompañia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documento != null ? documento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblusuarios)) {
            return false;
        }
        Tblusuarios other = (Tblusuarios) object;
        if ((this.documento == null && other.documento != null) || (this.documento != null && !this.documento.equals(other.documento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.poli.appcreditos.model.Tblusuarios[ documento=" + documento + " ]";
    }
    
}
