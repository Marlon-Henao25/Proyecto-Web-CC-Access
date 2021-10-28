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
@Table(name = "materia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materia.findAll", query = "SELECT m FROM Materia m")
    , @NamedQuery(name = "Materia.findByMaCodigo", query = "SELECT m FROM Materia m WHERE m.maCodigo = :maCodigo")
    , @NamedQuery(name = "Materia.findByMaNombre", query = "SELECT m FROM Materia m WHERE m.maNombre = :maNombre")
    , @NamedQuery(name = "Materia.findByMaidDocente", query = "SELECT m FROM Materia m WHERE m.maidDocente = :maidDocente")})
public class Materia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "maCodigo")
    private String maCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "maNombre")
    private String maNombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_idDocente")
    private int maidDocente;

    public Materia() {
    }

    public Materia(String maCodigo) {
        this.maCodigo = maCodigo;
    }

    public Materia(String maCodigo, String maNombre, int maidDocente) {
        this.maCodigo = maCodigo;
        this.maNombre = maNombre;
        this.maidDocente = maidDocente;
    }

    public String getMaCodigo() {
        return maCodigo;
    }

    public void setMaCodigo(String maCodigo) {
        this.maCodigo = maCodigo;
    }

    public String getMaNombre() {
        return maNombre;
    }

    public void setMaNombre(String maNombre) {
        this.maNombre = maNombre;
    }

    public int getMaidDocente() {
        return maidDocente;
    }

    public void setMaidDocente(int maidDocente) {
        this.maidDocente = maidDocente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCodigo != null ? maCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materia)) {
            return false;
        }
        Materia other = (Materia) object;
        if ((this.maCodigo == null && other.maCodigo != null) || (this.maCodigo != null && !this.maCodigo.equals(other.maCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Materia[ maCodigo=" + maCodigo + " ]";
    }
    
}
