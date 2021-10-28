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
@Table(name = "cursos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cursos.findAll", query = "SELECT c FROM Cursos c")
    , @NamedQuery(name = "Cursos.findByC\u00f3digoCurso", query = "SELECT c FROM Cursos c WHERE c.c\u00f3digoCurso = :c\u00f3digoCurso")
    , @NamedQuery(name = "Cursos.findByNombreCursos", query = "SELECT c FROM Cursos c WHERE c.nombreCursos = :nombreCursos")
    , @NamedQuery(name = "Cursos.findByJornada", query = "SELECT c FROM Cursos c WHERE c.jornada = :jornada")
    , @NamedQuery(name = "Cursos.findByIdDirectorCurso", query = "SELECT c FROM Cursos c WHERE c.idDirectorCurso = :idDirectorCurso")})
public class Cursos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "c\u00f3digoCurso")
    private String códigoCurso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "NombreCursos")
    private String nombreCursos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Jornada")
    private String jornada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDirectorCurso")
    private int idDirectorCurso;

    public Cursos() {
    }

    public Cursos(String códigoCurso) {
        this.códigoCurso = códigoCurso;
    }

    public Cursos(String códigoCurso, String nombreCursos, String jornada, int idDirectorCurso) {
        this.códigoCurso = códigoCurso;
        this.nombreCursos = nombreCursos;
        this.jornada = jornada;
        this.idDirectorCurso = idDirectorCurso;
    }

    public String getCódigoCurso() {
        return códigoCurso;
    }

    public void setCódigoCurso(String códigoCurso) {
        this.códigoCurso = códigoCurso;
    }

    public String getNombreCursos() {
        return nombreCursos;
    }

    public void setNombreCursos(String nombreCursos) {
        this.nombreCursos = nombreCursos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getIdDirectorCurso() {
        return idDirectorCurso;
    }

    public void setIdDirectorCurso(int idDirectorCurso) {
        this.idDirectorCurso = idDirectorCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (códigoCurso != null ? códigoCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursos)) {
            return false;
        }
        Cursos other = (Cursos) object;
        if ((this.códigoCurso == null && other.códigoCurso != null) || (this.códigoCurso != null && !this.códigoCurso.equals(other.códigoCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Cursos[ c\u00f3digoCurso=" + códigoCurso + " ]";
    }
    
}
