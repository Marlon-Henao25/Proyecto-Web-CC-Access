/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

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
 * @author Henao
 */
@Entity
@Table(name = "reg_docente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegDocente.findAll", query = "SELECT r FROM RegDocente r")
    , @NamedQuery(name = "RegDocente.findByIdDocente", query = "SELECT r FROM RegDocente r WHERE r.idDocente = :idDocente")
    , @NamedQuery(name = "RegDocente.findByNombreDocente", query = "SELECT r FROM RegDocente r WHERE r.nombreDocente = :nombreDocente")
    , @NamedQuery(name = "RegDocente.findByApellidoDocente", query = "SELECT r FROM RegDocente r WHERE r.apellidoDocente = :apellidoDocente")
    , @NamedQuery(name = "RegDocente.findByEdadDocente", query = "SELECT r FROM RegDocente r WHERE r.edadDocente = :edadDocente")
    , @NamedQuery(name = "RegDocente.findByCorreoDocente", query = "SELECT r FROM RegDocente r WHERE r.correoDocente = :correoDocente")
    , @NamedQuery(name = "RegDocente.findByNumIdDocente", query = "SELECT r FROM RegDocente r WHERE r.numIdDocente = :numIdDocente")
    , @NamedQuery(name = "RegDocente.findByCelularDocente", query = "SELECT r FROM RegDocente r WHERE r.celularDocente = :celularDocente")
    , @NamedQuery(name = "RegDocente.findByGeneroDocente", query = "SELECT r FROM RegDocente r WHERE r.generoDocente = :generoDocente")})
public class RegDocente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDocente")
    private Integer idDocente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NombreDocente")
    private String nombreDocente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ApellidoDocente")
    private String apellidoDocente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EdadDocente")
    private int edadDocente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CorreoDocente")
    private String correoDocente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumIdDocente")
    private int numIdDocente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CelularDocente")
    private int celularDocente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "GeneroDocente")
    private String generoDocente;

    public RegDocente() {
    }

    public RegDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public RegDocente(Integer idDocente, String nombreDocente, String apellidoDocente, int edadDocente, String correoDocente, int numIdDocente, int celularDocente, String generoDocente) {
        this.idDocente = idDocente;
        this.nombreDocente = nombreDocente;
        this.apellidoDocente = apellidoDocente;
        this.edadDocente = edadDocente;
        this.correoDocente = correoDocente;
        this.numIdDocente = numIdDocente;
        this.celularDocente = celularDocente;
        this.generoDocente = generoDocente;
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }

    public int getEdadDocente() {
        return edadDocente;
    }

    public void setEdadDocente(int edadDocente) {
        this.edadDocente = edadDocente;
    }

    public String getCorreoDocente() {
        return correoDocente;
    }

    public void setCorreoDocente(String correoDocente) {
        this.correoDocente = correoDocente;
    }

    public int getNumIdDocente() {
        return numIdDocente;
    }

    public void setNumIdDocente(int numIdDocente) {
        this.numIdDocente = numIdDocente;
    }

    public int getCelularDocente() {
        return celularDocente;
    }

    public void setCelularDocente(int celularDocente) {
        this.celularDocente = celularDocente;
    }

    public String getGeneroDocente() {
        return generoDocente;
    }

    public void setGeneroDocente(String generoDocente) {
        this.generoDocente = generoDocente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocente != null ? idDocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegDocente)) {
            return false;
        }
        RegDocente other = (RegDocente) object;
        if ((this.idDocente == null && other.idDocente != null) || (this.idDocente != null && !this.idDocente.equals(other.idDocente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.RegDocente[ idDocente=" + idDocente + " ]";
    }
    
}
