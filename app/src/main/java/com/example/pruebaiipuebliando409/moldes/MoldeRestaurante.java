package com.example.pruebaiipuebliando409.moldes;

public class MoldeRestaurante {
    private String nombreR;
    private Integer fotoR;
    private String precioR;
    private String contactoR;
    private String plato;

    public MoldeRestaurante() {
    }

    public MoldeRestaurante(String nombreR, Integer fotoR, String precioR, String contactoR, String plato) {
        this.nombreR = nombreR;
        this.fotoR = fotoR;
        this.precioR = precioR;
        this.contactoR = contactoR;
        this.plato = plato;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public Integer getFotoR() {
        return fotoR;
    }

    public void setFotoR(Integer fotoR) {
        this.fotoR = fotoR;
    }

    public String getPrecioR() {
        return precioR;
    }

    public void setPrecioR(String precioR) {
        this.precioR = precioR;
    }

    public String getContactoR() {
        return contactoR;
    }

    public void setContactoR(String contactoR) {
        this.contactoR = contactoR;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }
}