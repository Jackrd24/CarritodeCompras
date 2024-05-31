/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_avance2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Bruno Sandoval
 */
public class AlmacenamientoProductos {
    private HashMap<Integer, Producto> listaProductos=new HashMap <>();

    public AlmacenamientoProductos() {}
  
    public void cargarProductos(){
        this.listaProductos.put(1,new Producto(1,"Manzanas",1.0,65,"10-04-2023","15-03-2023","Fruta","u"));
        this.listaProductos.put(2,new Producto(2,"Peras",1.0,65,"10-04-2023","15-03-2023","Fruta","u"));
        this.listaProductos.put(3,new Producto(3,"Arroz",3.0,65,"10-04-2023","15-03-2023","Arroz","kg"));
        this.listaProductos.put(4,new Producto(4,"Huevo",0.5,65,"10-04-2023","15-03-2023","Huevo","u"));
        this.listaProductos.put(5,new Producto(5,"Leche",6.0,65,"10-04-2023","15-03-2023","Leche Gloria","l"));
        this.listaProductos.put(6,new Producto(6,"Fideo",6.70,65,"10-04-2023","15-03-2023","Bolsa","kg"));
        this.listaProductos.put(7,new Producto(7,"Tomate",2.50,65,"10-04-2023","15-03-2023","Fruta","kg"));
        this.listaProductos.put(8,new Producto(8,"Platano",0.50,65,"10-04-2023","15-03-2023","Fruta","u"));
    }
    
    public void setLimpiar() {
        listaProductos.clear();
    }
    
    //para obtener datos de la bd
    public List<Producto> getListaProductos(){
        return new ArrayList<>(this.listaProductos.values());
    }
    //
    public void setListaProductos(HashMap<Integer, Producto> listaProductos){
        this.listaProductos=listaProductos;
        
    }
    
    public int getProducto(int codigo){
        Producto p = listaProductos.get(codigo);
        int invt = p.getInventario();
        return invt;    
    }
    public Producto getProductoTodo(int codigo){
        Producto p = listaProductos.get(codigo);
        return p;
        
    }
    //Verificar el codigo
    public boolean verificarExistencia(Producto producto){
        return this.listaProductos.containsKey(producto.getCodigo());
    }
    //verificar los nombres
    public boolean verificarExistencia(String nombre){
        for (Producto p : this.listaProductos.values()) {
            if(nombre.toLowerCase().equals(p.getNombre().toLowerCase())){
                return true;
            }
        }
        return false;
    }
    public int ultimoCodigo(){
        int codigo=0;
        for (Producto p : this.listaProductos.values()) {
            codigo=p.getCodigo();
        }
        return codigo;
    }
    
    //metodo para agregar, modificar y eliminar
    
    public void agregar(Producto p){
        this.listaProductos.put(p.getCodigo(), p);
    }
    
    public void actualizar(Producto p){
        this.listaProductos.replace(p.getCodigo(), p);
    }
    
    public void borrar(Producto p){
        this.listaProductos.remove(p.getCodigo());
    }
    
    
}
