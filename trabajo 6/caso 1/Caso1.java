/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1;

/**
 *
 * @author Fernando
 */
public class Caso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1)
        Producto p1= new Producto("123","cafe",1200,5,CategoriaProducto.ALIMENTOS);
        Producto p2= new Producto("321","televisor",300000,3,CategoriaProducto.ELECTRONICA);
        Producto p3= new Producto("543","remera",2300,7,CategoriaProducto.ROPA);
        Producto p4= new Producto("789","heladera",700000,2,CategoriaProducto.HOGAR);
        Producto p5= new Producto("987","sillon",500000,1,CategoriaProducto.HOGAR);
        
        Inventario inventario= new Inventario();
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        //2)
        
        System.out.println(inventario.listarProductos());
        
        //3)
        
        System.out.println(inventario.buscarProductoPorId("321"));
        
        //4)
        
        inventario.filtrarPorCategoria(CategoriaProducto.HOGAR);
        
        //5)
        
        inventario.eliminarProducto("987");
        System.out.println(inventario.listarProductos());
        
        //6)
        
        p1.setStock(7);
        System.out.println(p1);
        
        //7)
        
         inventario.TotalStock();
         
        //8)
        
        System.out.println(inventario.obtenerProductoConMayorStock());
        
        //9)
        
        inventario.filtrarProductosPorPrecio(1000,3000);
        
        //10)
        
        System.out.println(inventario.mostrarCategoriasDisponibles());
    }
    
}
