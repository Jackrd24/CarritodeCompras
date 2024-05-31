/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_avance2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Admin
 */
public class table_users extends AbstractTableModel{
    
    private String[] column={"Codigo","Nombre","Contraseña","Nivel","Fecha de creacion"};
    private List<Usuarios> usuario=new ArrayList<>();

    public table_users(List<Usuarios> user) {
        this.usuario= user;
    }
    
    @Override
    public int getRowCount() {
        return this.usuario.size();
    }

    @Override
    public int getColumnCount() {
        return this.column.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Object resp;
        switch (columna) {
            case 0:
                resp=this.usuario.get(fila).getCodigo();
                break;
            case 1:
                resp=this.usuario.get(fila).getUsuario();
                break;
            case 2:
                resp=this.usuario.get(fila).getContra();
                break;
            case 3:
                resp=this.usuario.get(fila).getNivel();
                break;
            default:
                resp=this.usuario.get(fila).getFecha_creacionStr();
        }
        return resp;
    }
    
    @Override
    public String getColumnName(int colum){
        return this.column[colum];
    }
    
    public void actualizarTabla(){
        fireTableDataChanged();
    }
    public Usuarios detalle(int fila){
        return this.usuario.get(fila);
    }
    
    
}
