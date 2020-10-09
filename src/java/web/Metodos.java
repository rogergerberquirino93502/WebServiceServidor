/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.List;

/**
 *
 * @author Roger D. Quirino
 */
public interface Metodos {
    public List listar();
    public Productos listaP(int id);
    public String add(String categoria, String nombre, String precio, String mayoreo, String oferta, String cantidad);
    public String edit(int id, String categoria, String nombre, String precio, String mayoreo, String oferta, String cantidad);
    public Productos delete(int id);
}
