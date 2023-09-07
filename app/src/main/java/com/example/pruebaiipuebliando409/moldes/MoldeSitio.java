package com.example.pruebaiipuebliando409.moldes;

import java.io.Serializable;

public class MoldeSitio implements Serializable {
    //Palabra reservada private
    //Atributos: elementos que en el molde gráfico cambian
    private String nombreS;
    private Integer fotoS;
    private String encargadoS;
    private String contacto;
    private String precioS;
    private String descripS;

    public MoldeSitio() {
    }

    public MoldeSitio(String nombreS, Integer fotoS, String encargadoS, String contacto, String precioS, String descripS) {
        this.nombreS = nombreS;
        this.fotoS = fotoS;
        this.encargadoS = encargadoS;
        this.contacto = contacto;
        this.precioS = precioS;
        this.descripS = descripS;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public Integer getFotoS() {
        return fotoS;
    }

    public void setFotoS(Integer fotoS) {
        this.fotoS = fotoS;
    }

    public String getEncargadoS() {
        return encargadoS;
    }

    public void setEncargadoS(String encargadoS) {
        this.encargadoS = encargadoS;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPrecioS() {
        return precioS;
    }

    public void setPrecioS(String precioS) {
        this.precioS = precioS;
    }

    public String getDescripS() {
        return descripS;
    }

    public void setDescripS(String descripS) {
        this.descripS = descripS;
    }
}
