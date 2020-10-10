/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import web.Productos;
import web.ProductosDAO;

/**
 *
 * @author Roger D. Quirino
 */
@WebService(serviceName = "ConsultasWS")
public class ConsultasWS {
    ProductosDAO  pdao = new ProductosDAO();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "lista")
    public List<Productos> lista() {
        List datos = pdao.listar();
        return datos;
    }
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "categoria") String categoria, @WebParam(name = "nombre") String nombre, @WebParam(name = "precio") String precio, @WebParam(name = "mayoreo") String mayoreo, @WebParam(name = "oferta") String oferta, @WebParam(name = "cantidad") String cantidad) {
        String datos = pdao.add(categoria, nombre, precio, mayoreo, oferta, cantidad);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listaid")
    public Productos listaid(@WebParam(name = "id") int id) {
        Productos p = pdao.listaP(id);
        return p;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizar")
    public String actualizar(@WebParam(name = "id") int id, @WebParam(name = "categoria") String categoria, @WebParam(name = "nombre") String nombre, @WebParam(name = "precio") String precio, @WebParam(name = "mayoreo") String mayoreo, @WebParam(name = "oferta") String oferta, @WebParam(name = "cantidad") String cantidad) {
        String datos = pdao.edit(id, categoria, nombre, precio, mayoreo, oferta, cantidad);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Eliminar")
    public Productos Eliminar(@WebParam(name = "id") int id) {
        Productos p = pdao.delete(id);
        return p;
    }
}
