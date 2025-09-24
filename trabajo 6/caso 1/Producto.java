/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author Fernando
 */
public class Producto {
    private String id;
    private String nombre;
    private int precio;
    private int stock;
    
    
    CategoriaProducto categoriaproducto;
    
    public CategoriaProducto getcategoriaproducto(){
    return categoriaproducto;}
    
    public Producto(String id, String nombre, int precio, int stock, CategoriaProducto categoriaproducto){
    this.id=id;
    this.nombre=nombre;
    this.precio=precio;
    this.stock=stock;
    this.categoriaproducto=categoriaproducto;}

    public String getId() {
        return id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getPrecio(){
    return precio;
    }

    public int getStock() {
        return stock;
    }
    
    public int setStock(int stock){
        return this.stock=stock;
    }
    
    
    
   @Override
    public String toString(){
        return "Prodcuto(nombre: "+nombre+", id: "+id+", precio: "+precio+", stock: "+stock+", categoria: "+categoriaproducto+")";
    }
}
