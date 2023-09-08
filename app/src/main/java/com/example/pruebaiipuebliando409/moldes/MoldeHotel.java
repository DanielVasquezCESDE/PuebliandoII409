package com.example.pruebaiipuebliando409.moldes;

import java.io.Serializable;

public class MoldeHotel implements Serializable {
    private String nombre;
    private String precio;
    private String tel;
    private Integer foto;
    private String descrip;

    private Float valoraH;

    public MoldeHotel() { //Constructor vacío

    }
//Esto es un constructor, pilas en el órden

    public MoldeHotel(String nombre, String precio, String tel, Integer foto, String descrip, Float valoraH) {
        this.nombre = nombre;
        this.precio = precio;
        this.tel = tel;
        this.foto = foto;
        this.descrip = descrip;
        this.valoraH = valoraH;
    }


    //El nombre que llega de la base de datos se le asigna a la tarjeta


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Float getValoraH() {
        return valoraH;
    }

    public void setValoraH(Float valoraH) {
        this.valoraH = valoraH;
    }
}
