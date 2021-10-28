/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Henao
 */
@Entity
@Table(name = "pqrs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pqrs.findAll", query = "SELECT p FROM Pqrs p")
    , @NamedQuery(name = "Pqrs.findByIdPqrs", query = "SELECT p FROM Pqrs p WHERE p.idPqrs = :idPqrs")
    , @NamedQuery(name = "Pqrs.findByFechaPqrs", query = "SELECT p FROM Pqrs p WHERE p.fechaPqrs = :fechaPqrs")
    , @NamedQuery(name = "Pqrs.findByHoraPqrs", query = "SELECT p FROM Pqrs p WHERE p.horaPqrs = :horaPqrs")
    , @NamedQuery(name = "Pqrs.findByTipoPqrs", query = "SELECT p FROM Pqrs p WHERE p.tipoPqrs = :tipoPqrs")
    , @NamedQuery(name = "Pqrs.findByPqrsPersona", query = "SELECT p FROM Pqrs p WHERE p.pqrsPersona = :pqrsPersona")
    , @NamedQuery(name = "Pqrs.findByDescripci\u00f3nPqrs", query = "SELECT p FROM Pqrs p WHERE p.descripci\u00f3nPqrs = :descripci\u00f3nPqrs")})
public class Pqrs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPqrs")
    private Integer idPqrs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaPqrs")
    @Temporal(TemporalType.DATE)
    private Date fechaPqrs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horaPqrs")
    @Temporal(TemporalType.TIME)
    private Date horaPqrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TipoPqrs")
    private String tipoPqrs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PqrsPersona")
    private int pqrsPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "Descripci\u00f3nPqrs")
    private String descripciónPqrs;

    public Pqrs() {
    }

    public Pqrs(Integer idPqrs) {
        this.idPqrs = idPqrs;
    }

    public Pqrs(Integer idPqrs, Date fechaPqrs, Date horaPqrs, String tipoPqrs, int pqrsPersona, String descripciónPqrs) {
        this.idPqrs = idPqrs;
        this.fechaPqrs = fechaPqrs;
        this.horaPqrs = horaPqrs;
        this.tipoPqrs = tipoPqrs;
        this.pqrsPersona = pqrsPersona;
        this.descripciónPqrs = descripciónPqrs;
    }

    public Integer getIdPqrs() {
        return idPqrs;
    }

    public void setIdPqrs(Integer idPqrs) {
        this.idPqrs = idPqrs;
    }

    public Date getFechaPqrs() {
        return fechaPqrs;
    }

    public void setFechaPqrs(Date fechaPqrs) {
        this.fechaPqrs = fechaPqrs;
    }

    public Date getHoraPqrs() {
        return horaPqrs;
    }

    public void setHoraPqrs(Date horaPqrs) {
        this.horaPqrs = horaPqrs;
    }

    public String getTipoPqrs() {
        return tipoPqrs;
    }

    public void setTipoPqrs(String tipoPqrs) {
        this.tipoPqrs = tipoPqrs;
    }

    public int getPqrsPersona() {
        return pqrsPersona;
    }

    public void setPqrsPersona(int pqrsPersona) {
        this.pqrsPersona = pqrsPersona;
    }

    public String getDescripciónPqrs() {
        return descripciónPqrs;
    }

    public void setDescripciónPqrs(String descripciónPqrs) {
        this.descripciónPqrs = descripciónPqrs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPqrs != null ? idPqrs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pqrs)) {
            return false;
        }
        Pqrs other = (Pqrs) object;
        if ((this.idPqrs == null && other.idPqrs != null) || (this.idPqrs != null && !this.idPqrs.equals(other.idPqrs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Pqrs[ idPqrs=" + idPqrs + " ]";
    }
    
}
