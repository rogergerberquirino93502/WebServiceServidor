
package web;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO implements Metodos{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conn = new Conexion();
    int res;
    String error;
    Productos p = new Productos();
    
    @Override
    public List listar() {
    List<Productos> productoslista = new ArrayList();
    String sql = "select * from productos";
    try{
        con = conn.getConection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        Productos p= new Productos();
        p.setId(rs.getInt("idproductos"));
        p.setCategoria(rs.getString("categoria"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getString("precio"));
        p.setMayoreo(rs.getString("mayoreo"));
        p.setOferta(rs.getString("oferta"));
        p.setCantidad(rs.getString("cantidad"));
        productoslista.add(p);
        }
    }catch (Exception e){
    }
    return productoslista;
    }

    @Override
    public Productos listaP(int id) {
    String sql = "select * from productos where id="+id;
    
    try{
        con = conn.getConection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        p.setId(rs.getInt("idproductos"));
        p.setCategoria(rs.getString("categoria"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getString("precio"));
        p.setMayoreo(rs.getString("mayoreo"));
        p.setOferta(rs.getString("oferta"));
        p.setCantidad(rs.getString("cantidad"));
        }
    }catch (Exception e){
    }
    return p;
    }

    @Override
    public String add(String categoria, String nombre, String precio, String mayoreo, String oferta, String cantidad) {
        String sql = "insert into  productos(categoria, nombre, precio, mayoreo, oferta, cantidad) values(?,?,?,?,?,?)";
        try{
            con = conn.getConection();
            ps = con.prepareStatement(sql);
            ps.setString(1, categoria);
            ps.setString(2, nombre);
            ps.setString(3, precio);
            ps.setString(4, mayoreo);
            ps.setString(5, oferta);
            ps.setString(6, cantidad);
            res = ps.executeUpdate();
            if(res==1){
                error = "Agregado";
            }else{
                error = "Error";
            }
        }catch (Exception e){
        
        }
        return error;
    }

    @Override
    public String edit(int id, String categoria, String nombre, String precio, String mayoreo, String oferta, String cantidad) {
        String sql = "update productos set categoria=?, nombre=?, precio=?, mayoreo=?, oferta=?, cantidad=? where id="+id;
                try{
                con = conn.getConection();
                ps = con.prepareStatement(sql);
                ps.setString(1, categoria);
                ps.setString(2, nombre);
                ps.setString(3, precio);
                ps.setString(4, mayoreo);
                ps.setString(5, oferta);
                ps.setString(6, cantidad);
                ps.executeUpdate();
                if(res==1){
                    error = "Actualizado";
                }else{
                    error = "Error";
                }
                }catch (Exception e){
                
                }
                return error;
    }

    @Override
    public Productos delete(int id) {
        String sql = "delete from productos where id="+id;
         try{
                con = conn.getConection();
                ps = con.prepareStatement(sql);
                ps.executeUpdate();
                }catch (Exception e){
                
                }
    return p;
    }
    
}
