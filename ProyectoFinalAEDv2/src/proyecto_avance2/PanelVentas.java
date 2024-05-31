
package proyecto_avance2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PanelVentas extends javax.swing.JFrame {
    public int codigo;
    public String nombre;
    public double precio;
    public int inventario;
    public String fVencimiento;
    public String fLlegada;
    public String unidad;
    public String descripcion;
    Producto Productos[];
    AlmacenamientoProductos bdProductos = new AlmacenamientoProductos();
    AlmacenamientoProductos bdProductosStock = new AlmacenamientoProductos();
    DefaultTableModel model=new DefaultTableModel();


    public PanelVentas() {
        initComponents();
        bdProductosStock.cargarProductos();
        this.tblTablaVenta.setModel(new TableModelCompra(bdProductos.getListaProductos()));
        this.tblTablaVenta1.setModel(new TableModelProducto(bdProductosStock.getListaProductos()));
    }
    
    public void sumarcolumna(){
        double precio=0;
        double cantidad=0;
        double precioParcial=0;
        double total=0;
            for(int i=0;i<tblTablaVenta.getRowCount();i++){
                precio= Double.parseDouble(tblTablaVenta.getValueAt(i,2).toString());
                cantidad= Double.parseDouble(tblTablaVenta.getValueAt(i,3).toString());
                precioParcial = precio * cantidad;
                total += precioParcial;
            }
            jlabelSubtotalNVenta.setText("S/"+total);
    }
    
    
    public void IGV(){
        double igv=0.18;
        double igvredondeado= Math.round(igv * 100) / 100.0;

        double precio=0;
        double cantidad=0;
        double precioParcial=0;
        double total=0;
            for(int i=0;i<tblTablaVenta.getRowCount();i++){
                precio= Double.parseDouble(tblTablaVenta.getValueAt(i,2).toString());
                cantidad= Double.parseDouble(tblTablaVenta.getValueAt(i,3).toString());
                precioParcial = precio * cantidad;
                total += precioParcial;
            }
            jlabelIGVNVenta.setText("S/"+total*igvredondeado);
    }
    
    public void total(){
        double igv=0.18;
        double precio=0;
        double cantidad=0;
        double precioParcial=0;
        double total=0;
            for(int i=0;i<tblTablaVenta.getRowCount();i++){
                precio= Double.parseDouble(tblTablaVenta.getValueAt(i,2).toString());
                cantidad= Double.parseDouble(tblTablaVenta.getValueAt(i,3).toString());
                precioParcial = precio * cantidad;
                total += precioParcial;
            }
            jlabelTotalNVenta.setText("S/"+((total*igv)+total));
    }
    
    public static String fechaActual(){
        Date fecha= new Date();
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanelVenta = new javax.swing.JPanel();
        jButtonAtrasVenta = new javax.swing.JButton();
        txtCodigoVenta = new javax.swing.JTextField();
        txtInventarioVenta = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaVenta = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTablaVenta1 = new javax.swing.JTable();
        btnAgregarVenta = new javax.swing.JButton();
        jlabelTotalNVenta = new javax.swing.JLabel();
        jLabelTotalVenta = new javax.swing.JLabel();
        jLabelIGVVenta = new javax.swing.JLabel();
        jlabelIGVNVenta = new javax.swing.JLabel();
        jlabelSubtotalNVenta = new javax.swing.JLabel();
        jLabelSubTotalVenta = new javax.swing.JLabel();
        btnBorrarVenta = new javax.swing.JButton();
        txtNombreVenta = new javax.swing.JTextField();
        btnActualizarVenta = new javax.swing.JButton();
        btnCancelarVenta = new javax.swing.JButton();
        btnConfirmarVenta = new javax.swing.JButton();
        btnGenerarBoletaVenta = new javax.swing.JButton();
        txtDNIVenta = new javax.swing.JTextField();
        txtClienteVenta = new javax.swing.JTextField();
        jLabelSubTituloVenta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBoletaProductoVenta = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelVenta.setBackground(new java.awt.Color(215, 215, 224));
        jPanelVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAtrasVenta.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAtrasVenta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonAtrasVenta.setBorder(null);
        jButtonAtrasVenta.setBorderPainted(false);
        jButtonAtrasVenta.setContentAreaFilled(false);
        jButtonAtrasVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasVentaActionPerformed(evt);
            }
        });
        jPanelVenta.add(jButtonAtrasVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 170, 50));

        txtCodigoVenta.setEditable(false);
        txtCodigoVenta.setBackground(new java.awt.Color(231, 231, 231));
        jPanelVenta.add(txtCodigoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, 40));

        txtInventarioVenta.setBackground(new java.awt.Color(231, 231, 231));
        jPanelVenta.add(txtInventarioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 110, 40));

        txtPrecioVenta.setEditable(false);
        txtPrecioVenta.setBackground(new java.awt.Color(231, 231, 231));
        jPanelVenta.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 110, 40));

        tblTablaVenta.setBackground(new java.awt.Color(231, 231, 231));
        tblTablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTablaVenta);

        jPanelVenta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 410, 130));

        tblTablaVenta1.setBackground(new java.awt.Color(231, 231, 231));
        tblTablaVenta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaVenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaVenta1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblTablaVenta1);

        jPanelVenta.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 410, 120));

        btnAgregarVenta.setBorder(null);
        btnAgregarVenta.setBorderPainted(false);
        btnAgregarVenta.setContentAreaFilled(false);
        btnAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVentaActionPerformed(evt);
            }
        });
        jPanelVenta.add(btnAgregarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 150, 80));

        jlabelTotalNVenta.setBackground(new java.awt.Color(0, 0, 0));
        jlabelTotalNVenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlabelTotalNVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelTotalNVenta.setText("S/  0.00");
        jPanelVenta.add(jlabelTotalNVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 110, 40));

        jLabelTotalVenta.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTotalVenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTotalVenta.setText("TOTAL:");
        jPanelVenta.add(jLabelTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 90, 40));

        jLabelIGVVenta.setBackground(new java.awt.Color(0, 0, 0));
        jLabelIGVVenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelIGVVenta.setText("IGV:");
        jPanelVenta.add(jLabelIGVVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 60, 40));

        jlabelIGVNVenta.setBackground(new java.awt.Color(0, 0, 0));
        jlabelIGVNVenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlabelIGVNVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelIGVNVenta.setText("S/  0.00");
        jPanelVenta.add(jlabelIGVNVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 110, 40));

        jlabelSubtotalNVenta.setBackground(new java.awt.Color(0, 0, 0));
        jlabelSubtotalNVenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlabelSubtotalNVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelSubtotalNVenta.setText("S/  0.00");
        jPanelVenta.add(jlabelSubtotalNVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 110, 40));

        jLabelSubTotalVenta.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSubTotalVenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSubTotalVenta.setText("SUBTOTAL:");
        jPanelVenta.add(jLabelSubTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 130, 40));

        btnBorrarVenta.setBackground(new java.awt.Color(204, 204, 204));
        btnBorrarVenta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBorrarVenta.setBorder(null);
        btnBorrarVenta.setBorderPainted(false);
        btnBorrarVenta.setContentAreaFilled(false);
        btnBorrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarVentaActionPerformed(evt);
            }
        });
        jPanelVenta.add(btnBorrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 170, 70));

        txtNombreVenta.setEditable(false);
        txtNombreVenta.setBackground(new java.awt.Color(231, 231, 231));
        txtNombreVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreVentaActionPerformed(evt);
            }
        });
        jPanelVenta.add(txtNombreVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 40));

        btnActualizarVenta.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizarVenta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnActualizarVenta.setBorder(null);
        btnActualizarVenta.setBorderPainted(false);
        btnActualizarVenta.setContentAreaFilled(false);
        btnActualizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarVentaActionPerformed(evt);
            }
        });
        jPanelVenta.add(btnActualizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 170, 70));

        btnCancelarVenta.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelarVenta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCancelarVenta.setBorder(null);
        btnCancelarVenta.setBorderPainted(false);
        btnCancelarVenta.setContentAreaFilled(false);
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });
        jPanelVenta.add(btnCancelarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 180, 70));

        btnConfirmarVenta.setBackground(new java.awt.Color(204, 204, 204));
        btnConfirmarVenta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfirmarVenta.setBorder(null);
        btnConfirmarVenta.setBorderPainted(false);
        btnConfirmarVenta.setContentAreaFilled(false);
        btnConfirmarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarVentaActionPerformed(evt);
            }
        });
        jPanelVenta.add(btnConfirmarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 180, 70));

        btnGenerarBoletaVenta.setBackground(new java.awt.Color(204, 204, 204));
        btnGenerarBoletaVenta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGenerarBoletaVenta.setBorder(null);
        btnGenerarBoletaVenta.setBorderPainted(false);
        btnGenerarBoletaVenta.setContentAreaFilled(false);
        btnGenerarBoletaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarBoletaVentaActionPerformed(evt);
            }
        });
        jPanelVenta.add(btnGenerarBoletaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 140, 70));

        txtDNIVenta.setBackground(new java.awt.Color(231, 231, 231));
        jPanelVenta.add(txtDNIVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 200, 40));

        txtClienteVenta.setBackground(new java.awt.Color(231, 231, 231));
        jPanelVenta.add(txtClienteVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 200, 40));

        jLabelSubTituloVenta.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSubTituloVenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSubTituloVenta.setText("BOLETA");
        jPanelVenta.add(jLabelSubTituloVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 80, 40));

        jLabel1.setText("Stock");
        jPanelVenta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel2.setText("Carrito de compras");
        jPanelVenta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(231, 231, 231));

        txtBoletaProductoVenta.setEditable(false);
        txtBoletaProductoVenta.setBackground(new java.awt.Color(231, 231, 231));
        txtBoletaProductoVenta.setColumns(20);
        txtBoletaProductoVenta.setRows(5);
        jScrollPane2.setViewportView(txtBoletaProductoVenta);

        jPanelVenta.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 290, 250));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ventas.png"))); // NOI18N
        jPanelVenta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 550));

        getContentPane().add(jPanelVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasVentaActionPerformed
    login log= new login();
    log.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_jButtonAtrasVentaActionPerformed

    private void btnAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVentaActionPerformed
     if (validarDatos()) {
            if (!bdProductos.verificarExistencia(nombre)) {
                if(inventario <= bdProductosStock.getProducto(codigo)){
                    bdProductos.agregar(new Producto(codigo, nombre, precio, inventario,fVencimiento,fLlegada, descripcion, unidad));
                    this.tblTablaVenta.setModel(new TableModelCompra(bdProductos.getListaProductos()));
                    limpiarDatos();
                    JOptionPane.showMessageDialog(this, "Producto agegado exitosamente", "Confirmacion", 1);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay suficiente stock del producto", "Advertencia", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El producto ya existe", "Advertencia", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Alguno de los valores digitados esta vacio o es erroneo", "Advertencia", 2);
        }
     sumarcolumna();
     IGV();
     total();
//     nfilas();
    }//GEN-LAST:event_btnAgregarVentaActionPerformed

    private void txtNombreVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreVentaActionPerformed

    private void tblTablaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaVentaMouseClicked
        Producto producto = ((TableModelCompra) this.tblTablaVenta.getModel()).detalle(this.tblTablaVenta.getSelectedRow());
        this.txtCodigoVenta.setText(String.valueOf(producto.getCodigo()));
        this.txtNombreVenta.setText(producto.getNombre());
        this.txtPrecioVenta.setText(String.valueOf(producto.getPrecio()));
        this.txtInventarioVenta.setText(String.valueOf(producto.getInventario()));
        fLlegada = String.valueOf(producto.getfLlegada());
        fVencimiento = String.valueOf(producto.getfVencimiento());
        descripcion = String.valueOf(producto.getDescripcion());
        unidad = String.valueOf(producto.getUnidad());
    }//GEN-LAST:event_tblTablaVentaMouseClicked

    private void btnActualizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarVentaActionPerformed
        if (validarDatos()) {
            if(inventario <= bdProductosStock.getProducto(codigo)){
                    bdProductos.actualizar(new Producto(codigo, nombre, precio, inventario,fVencimiento,fLlegada, descripcion, unidad));
            this.tblTablaVenta.setModel(new TableModelCompra(bdProductos.getListaProductos()));
            limpiarDatos();
            JOptionPane.showMessageDialog(this, "Producto actualizado exitosamente", "Confirmacion", 1);
            IGV();
            sumarcolumna();
            total();
            
                } else {
                    JOptionPane.showMessageDialog(this, "No hay suficiente stock del producto", "Advertencia", 2);
                }
            
            
        } else {
            JOptionPane.showMessageDialog(this, "Alguno de los valores digitados esta vacio o es erroneo", "Advertencia", 2);
        }
    }//GEN-LAST:event_btnActualizarVentaActionPerformed

    private void btnBorrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarVentaActionPerformed
           if (validarDatos()) {
            bdProductos.borrar(new Producto(codigo, nombre, precio, inventario,fVencimiento,fLlegada, descripcion, unidad));
            this.tblTablaVenta.setModel(new TableModelCompra(bdProductos.getListaProductos()));
            limpiarDatos();
            JOptionPane.showMessageDialog(this, "Producto eliminado exitosamente", "Confirmacion", 1);
        } else {
            JOptionPane.showMessageDialog(this, "Alguno de los valores digitados esta vacio o es erroneo", "Advertencia", 2);
        }
        sumarcolumna();
        IGV();
        total();
//        nfilas1();
    }//GEN-LAST:event_btnBorrarVentaActionPerformed

    private void btnGenerarBoletaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarBoletaVentaActionPerformed
        String cliente = txtClienteVenta.getText();
        String dni= txtDNIVenta.getText();
        
        
        double precio=0;
        double cantidad=0;
        double precioParcial=0;
        double total=0;
        double igv=0.18;
            for(int i=0;i<tblTablaVenta.getRowCount();i++){
                precio= Double.parseDouble(tblTablaVenta.getValueAt(i,2).toString());
                cantidad= Double.parseDouble(tblTablaVenta.getValueAt(i,3).toString());
                precioParcial = precio * cantidad;
                total += precioParcial;
            }
            
            
          
            
        String resultado="\n------------------------ "
                
                + "\nCliente:       "+cliente
                + "\nDNI:       "+dni
                + "\nSubtotal:      S/"+total
                + "\nIGV:        S/"+total*igv
                + "\nTotal:         S/"+((total*igv)+total)
                ;
        
        txtBoletaProductoVenta.setText("Fecha:"+fechaActual()+resultado);
        
        
    }//GEN-LAST:event_btnGenerarBoletaVentaActionPerformed

    private void btnConfirmarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarVentaActionPerformed
       Boleta b= new Boleta();
       b.setVisible(true);        
       b.txtBoleta.setText(txtBoletaProductoVenta.getText());
       b.Ventas.setModel(tblTablaVenta.getModel());
       int codigo=0;
        int cantidad=0;
       for(int i=0;i<tblTablaVenta.getRowCount();i++){
           codigo= Integer.parseInt(tblTablaVenta.getValueAt(i,0).toString());
           cantidad= Integer.parseInt(tblTablaVenta.getValueAt(i,3).toString());
           Producto pTmp = bdProductosStock.getProductoTodo(codigo);
           pTmp.setInventario(pTmp.getInventario() - cantidad);
           bdProductosStock.actualizar(pTmp);
           this.tblTablaVenta1.setModel(new TableModelProducto(bdProductosStock.getListaProductos()));
       }
       bdProductos.setLimpiar();
       this.tblTablaVenta.setModel(new TableModelProducto(bdProductos.getListaProductos()));
       txtBoletaProductoVenta.setText("");
       txtClienteVenta.setText("");
       txtDNIVenta.setText("");
    }//GEN-LAST:event_btnConfirmarVentaActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
            JOptionPane.showMessageDialog(this, "Venta Cancelada");
            txtBoletaProductoVenta.setText("");
            this.tblTablaVenta.setModel(new TableModelCompra(bdProductos.getListaProductos()));
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void tblTablaVenta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaVenta1MouseClicked
        // TODO add your handling code here:
        Producto producto = ((TableModelProducto) this.tblTablaVenta1.getModel()).detalle(this.tblTablaVenta1.getSelectedRow());
        this.txtCodigoVenta.setText(String.valueOf(producto.getCodigo()));
        this.txtNombreVenta.setText(producto.getNombre());
        this.txtPrecioVenta.setText(String.valueOf(producto.getPrecio()));
        this.txtInventarioVenta.setText(String.valueOf(producto.getInventario()));
        fLlegada = String.valueOf(producto.getfLlegada());
        fVencimiento = String.valueOf(producto.getfVencimiento());
        descripcion = String.valueOf(producto.getDescripcion());
        unidad = String.valueOf(producto.getUnidad());
    }//GEN-LAST:event_tblTablaVenta1MouseClicked
 
    public boolean validarDatos() {
        try {
            codigo = Integer.parseInt("".equals(txtCodigoVenta.getText()) ? "0" : txtCodigoVenta.getText());
            nombre = txtNombreVenta.getText();
            precio = Double.parseDouble(txtPrecioVenta.getText());
            inventario = Integer.parseInt(txtInventarioVenta.getText());
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public void limpiarDatos() {
        this.txtCodigoVenta.setText("");
        this.txtNombreVenta.setText("");
        this.txtPrecioVenta.setText("");
        this.txtInventarioVenta.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarVenta;
    public javax.swing.JButton btnAgregarVenta;
    public javax.swing.JButton btnBorrarVenta;
    public javax.swing.JButton btnCancelarVenta;
    public javax.swing.JButton btnConfirmarVenta;
    public javax.swing.JButton btnGenerarBoletaVenta;
    public javax.swing.JButton jButtonAtrasVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabelIGVVenta;
    public javax.swing.JLabel jLabelSubTituloVenta;
    public javax.swing.JLabel jLabelSubTotalVenta;
    public javax.swing.JLabel jLabelTotalVenta;
    public javax.swing.JPanel jPanelVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel jlabelIGVNVenta;
    public javax.swing.JLabel jlabelSubtotalNVenta;
    public javax.swing.JLabel jlabelTotalNVenta;
    public javax.swing.JTable tblTablaVenta;
    public javax.swing.JTable tblTablaVenta1;
    public javax.swing.JTextArea txtBoletaProductoVenta;
    public javax.swing.JTextField txtClienteVenta;
    public javax.swing.JTextField txtCodigoVenta;
    public javax.swing.JTextField txtDNIVenta;
    public javax.swing.JTextField txtInventarioVenta;
    public javax.swing.JTextField txtNombreVenta;
    public javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
