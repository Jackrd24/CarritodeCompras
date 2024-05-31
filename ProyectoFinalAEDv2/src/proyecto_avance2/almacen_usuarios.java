/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_avance2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class almacen_usuarios {
    
    private HashMap<Integer, Usuarios> listaUsers = new HashMap<>();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    public almacen_usuarios() {
        try {
        this.listaUsers.put(1, new Usuarios(1,"admin", "tienda1234", "admin", formatoFecha.parse("02/04/2022")));      
        this.listaUsers.put(2, new Usuarios(2,"cajero01", "empleado", "empleado", formatoFecha.parse("12/02/2023")));
        this.listaUsers.put(3, new Usuarios(3,"cajero02", "sofi987", "empleado", formatoFecha.parse("29/03/2023")));
        this.listaUsers.put(4, new Usuarios(4,"cajero03", "abcd123", "empleado", formatoFecha.parse("20/06/2023")));
      } catch (ParseException ex) {
            Logger.getLogger(almacen_usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuarios> getListarUsers() {
        return new ArrayList<>(this.listaUsers.values());
    }

    public void setListarUsers(HashMap<Integer, Usuarios> listaProductos) {
        this.listaUsers = listaProductos;

    }

    public boolean validar(Usuarios usuario) {
        return this.listaUsers.containsKey(usuario.getCodigo());
    }

    public boolean validar(String user) {
        for (Usuarios u : this.listaUsers.values()) {
            if (user.toLowerCase().equals(u.getUsuario().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
    
    public int ultimoCodigo(){
        int codigo=0;
        for (Usuarios u : this.listaUsers.values()) {
            codigo=u.getCodigo();
        }
        return codigo;
    }
    
    public void add_user(Usuarios u){
        this.listaUsers.put(u.getCodigo(), u);
    }
    
    public void actualizar(Usuarios u){
        this.listaUsers.replace(u.getCodigo(), u);
    }
    
    public void delete_user(Usuarios u){
        this.listaUsers.remove(u.getCodigo());
    }
    
}
