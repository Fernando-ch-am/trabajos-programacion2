/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class Inventario {
    ArrayList<Producto> productos;
    public void agregarProducto(Producto p){
    this.productos.add(p);
    }
    
public ArrayList<Producto> listarProductos(){
        return productos;
    }

public Inventario() {
        productos = new ArrayList<>();
    }

public Producto buscarProductoPorId(String id) {
 Producto productoEncontrado=null;
for (Producto p: productos){
if (p.getId().equalsIgnoreCase(id))
productoEncontrado=p;
}
return productoEncontrado;

}

            
public Producto eliminarProducto(String id) { 
    Producto productoEliminar = null; 
    
    for (Producto e : productos) { 
        if (e.getId().equalsIgnoreCase(id)) { 
            productoEliminar = e; 
            break; 
        } 
    } 
    
    if (productoEliminar != null) {
        productos.remove(productoEliminar);
    }
    
    return productoEliminar; 
}

public void filtrarPorCategoria(CategoriaProducto categoria){
for (Producto p : productos)
    if (p.getcategoriaproducto()== categoria){
        System.out.println(p);}
    }
        
public void obtenerTotalStock(){
    System.out.println(productos);
}
        
public int obtenerProductoConMayorStock(){
int mayorStock=0;
for (Producto p : productos){
    if (p.getStock() > mayorStock){
        mayorStock=p.getStock();
    }
    }
  return mayorStock;
}
        
public void filtrarProductosPorPrecio(double min, double max) {
    int productosEncontrados = 0;

    for (Producto p : productos) {
        double precio = p.getPrecio(); 
        if (precio >= min && precio <= max) { 
            System.out.println(p);
            productosEncontrados++;
        }

    if (productosEncontrados == 0) {
        System.out.println("No se encontraron productos en ese rango de precios.");
    }
}}
    
public List<String> mostrarCategoriasDisponibles() {
    List<String> categorias = new ArrayList<>();
    for (CategoriaProducto c : CategoriaProducto.values()) {
        categorias.add(c.name() + " - " + c.getDescripcion());
    }
    return categorias;
}

public void TotalStock(){
int totalStock=0;
for(Producto p : productos){
    totalStock+=p.getStock();}
    System.out.println("Total de Stock: " + totalStock);
    }
}