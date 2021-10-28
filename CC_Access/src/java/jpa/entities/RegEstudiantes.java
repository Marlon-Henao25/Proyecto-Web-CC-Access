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
@Table(name = "reg_estudiantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegEstudiantes.findAll", query = "SELECT r FROM RegEstudiantes r")
    , @NamedQuery(name = "RegEstudiantes.findByNombres", query = "SELECT r FROM RegEstudiantes r WHERE r.nombres = :nombres")
    , @NamedQuery(name = "RegEstudiantes.findByApellido", query = "SELECT r FROM RegEstudiantes r WHERE r.apellido = :apellido")
    , @NamedQuery(name = "RegEstudiantes.findByEdad", query = "SELECT r FROM RegEstudiantes r WHERE r.edad = :edad")
    , @NamedQuery(name = "RegEstudiantes.findByCurso", query = "SELECT r FROM RegEstudiantes r WHERE r.curso = :curso")
    , @NamedQuery(name = "RegEstudiantes.findByNumIdentidad", query = "SELECT r FROM RegEstudiantes r WHERE r.numIdentidad = :numIdentidad")
    , @NamedQuery(name = "RegEstudiantes.findByNomAcudiente", query = "SELECT r FROM RegEstudiantes r WHERE r.nomAcudiente = :nomAcudiente")
    , @NamedQuery(name = "RegEstudiantes.findByCelAcudiente", query = "SELECT r FROM RegEstudiantes r WHERE r.celAcudiente = :celAcudiente")
    , @NamedQuery(name = "RegEstudiantes.findByGenero", query = "SELECT r FROM RegEstudiantes r WHERE r.genero = :genero")
    , @NamedQuery(name = "RegEstudiantes.findByIdEstudiante", query = "SELECT r FROM RegEstudiantes r WHERE r.idEstudiante = :idEstudiante")
    , @NamedQuery(name = "RegEstudiantes.findByCorreoEstudiante", query = "SELECT r FROM RegEstudiantes r WHERE r.correoEstudiante = :correoEstudiante")})
public class RegEstudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad")
    private int edad;
    @Size(max = 10)
    @Column(name = "Curso")
    private String curso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numIdentidad")
    private int numIdentidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "nomAcudiente")
    private String nomAcudiente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cel_Acudiente")
    private int celAcudiente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "genero")
    private String genero;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEstudiante")
    private Integer idEstudiante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CorreoEstudiante")
    private String correoEstudiante;

    public RegEstudiantes() {
    }

    public RegEstudiantes(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public RegEstudiantes(Integer idEstudiante, String nombres, String apellido, int edad, int numIdentidad, String nomAcudiente, int celAcudiente, String genero, String correoEstudiante) {
        this.idEstudiante = idEstudiante;
        this.nombres = nombres;
        this.apellido = apellido;
        this.edad = edad;
        this.numIdentidad = numIdentidad;
        this.nomAcudiente = nomAcudiente;
        this.celAcudiente = celAcudiente;
        this.genero = genero;
        this.correoEstudiante = correoEstudiante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumIdentidad() {
        return numIdentidad;
    }

    public void setNumIdentidad(int numIdentidad) {
        this.numIdentidad = numIdentidad;
    }

    public String getNomAcudiente() {
        return nomAcudiente;
    }

    public void setNomAcudiente(String nomAcudiente) {
        this.nomAcudiente = nomAcudiente;
    }

    public int getCelAcudiente() {
        return celAcudiente;
    }

    public void setCelAcudiente(int celAcudiente) {
        this.celAcudiente = celAcudiente;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstudiante != null ? idEstudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegEstudiantes)) {
            return false;
        }
        RegEstudiantes other = (RegEstudiantes) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.RegEstudiantes[ idEstudiante=" + idEstudiante + " ]";
    }
    
}
