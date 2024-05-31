/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_avance2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Usuarios {
     private int codigo;
     private String usuario;
     private String contra;
     private String nivel;
     private String fecha_creacionStr;
    

    public Usuarios(int codigo, String usuario, String contra, String nivel, Date fecha_creacion) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.contra = contra;
        this.nivel = nivel;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        this.fecha_creacionStr = formatoFecha.format(fecha_creacion);
    }

    public String getFecha_creacionStr() {
        return fecha_creacionStr;
    }

    public void setFecha_creacionStr(String fecha_creacionStr) {
        this.fecha_creacionStr = fecha_creacionStr;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
