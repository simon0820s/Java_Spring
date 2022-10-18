package com.simon.platziMarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private Integer celular;
    @Column(name="correo_electronico")
    private String correoElectrocnico;

    @OneToMany(mappedBy="cliente")
    private List<Compra> compras;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getCelular() {
        return celular;
    }
    private String direccion;

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectrocnico() {
        return correoElectrocnico;
    }

    public void setCorreoElectrocnico(String correoElectrocnico) {
        this.correoElectrocnico = correoElectrocnico;
    }
}
