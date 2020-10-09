/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;
/**
 *
 * @author Roger D. Quirino
 */
public class Productos {

    int id;
    String categoria;
    String nombre;
    String precio;
    String mayoreo;
    String oferta;
    String cantidad;

    public Productos() {
    }

    public Productos(int id, String categoria, String nombre, String precio, String mayoreo, String oferta, String cantidad) {
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.mayoreo = mayoreo;
        this.oferta = oferta;
        this.cantidad = cantidad;
    } 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

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

    public String getMayoreo() {
        return mayoreo;
    }

    public void setMayoreo(String mayoreo) {
        this.mayoreo = mayoreo;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }  
    
}
