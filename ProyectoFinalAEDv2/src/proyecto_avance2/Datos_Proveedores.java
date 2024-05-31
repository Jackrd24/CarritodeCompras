/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_avance2;


/**
 *
 * @author Frank.P.Oscco
 */
public class Datos_Proveedores {
    String NombreProv ;
    String NomEmpresa;
    String Ruc;
    String Producto;
    String Celular;
    
    
    public Datos_Proveedores(String NombreProv, String NomEmpresa, String Ruc, String Producto, String Celular) {
        this.NombreProv = NombreProv;
        this.NomEmpresa = NomEmpresa;
        this.Ruc = Ruc;
        this.Producto = Producto;
        this.Celular = Celular;
    }

    public String getNombreProv() {
        return NombreProv;
    }

    public void setNombreProv(String NombreProv) {
        this.NombreProv = NombreProv;
    }

    public String getNomEmpresa() {
        return NomEmpresa;
    }

    public void setNomEmpresa(String NomEmpresa) {
        this.NomEmpresa = NomEmpresa;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
    
}
