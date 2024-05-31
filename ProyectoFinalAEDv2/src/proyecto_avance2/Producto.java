
package proyecto_avance2;


public class Producto {
     int codigo;
     String nombre;
     double precio;
     int inventario;
     String fVencimiento;
     String fLlegada;
     String descripcion;
     String unidad;

    public Producto(int codigo, String nombre, double precio, int inventario, String fVencimiento, String fLlegada, String descripcion, String unidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
        this.fVencimiento = fVencimiento;
        this.fLlegada = fLlegada;
        this.descripcion = descripcion;
        this.unidad = unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getfVencimiento() {
        return fVencimiento;
    }

    public void setfVencimiento(String fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    public String getfLlegada() {
        return fLlegada;
    }

    public void setfLlegada(String fLlegada) {
        this.fLlegada = fLlegada;
    }

    
    
}
