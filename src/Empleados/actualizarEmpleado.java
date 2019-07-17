
package Empleados;

import Clases.Empleados;
import java.awt.Button;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class actualizarEmpleado extends javax.swing.JDialog {
 Empleados emp = new Empleados();
 
    public actualizarEmpleado(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    emp.cargarCategoria(2);
   //emp.direccion("asd");  // hacer metodo de cargar direccion
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtCuil = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        radClientes = new javax.swing.JRadioButton();
        radCompras = new javax.swing.JRadioButton();
        radEmpleados = new javax.swing.JRadioButton();
        radProductos = new javax.swing.JRadioButton();
        radProveedores = new javax.swing.JRadioButton();
        radSalarios = new javax.swing.JRadioButton();
        radVentas = new javax.swing.JRadioButton();
        radServicios = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ACTUALIZAR EMPLEADO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(739, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Personales"));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(-1,true));
        jLabel2.setText("Dni:");

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(-1,true));
        jLabel3.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(-1,true));
        jLabel4.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(-1,true));
        jLabel12.setText("Telefono:");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(-1,true));
        jLabel23.setText("Puesto de Empleo:");

        comboCategoria.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Gerente", "Contador", "Repositor", "Vendedor", "Cajero", "Administrador" }));
        comboCategoria.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(-1,true));
        jLabel13.setText("E-Mail:");

        txtMail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCuil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCuil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuilKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(-1,true));
        jLabel6.setText("CUIL:");

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(-1,true));
        jLabel18.setText("Calle:");

        txtCalle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)))
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDni)
                        .addComponent(txtNombre)
                        .addComponent(txtApellido)
                        .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMail))
                .addGap(205, 205, 205))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Permisos"));

        radClientes.setText("Clientes");
        radClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radClientesActionPerformed(evt);
            }
        });

        radCompras.setText("Compras");

        radEmpleados.setText("Empleados");

        radProductos.setText("Productos");

        radProveedores.setText("Proveedores");

        radSalarios.setText("Salarios");

        radVentas.setText("Ventas");
        radVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radVentasActionPerformed(evt);
            }
        });

        radServicios.setText("Servicios");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(radClientes)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(radCompras)
                    .addGap(16, 16, 16)
                    .addComponent(radEmpleados)
                    .addGap(18, 18, 18)
                    .addComponent(radProductos)
                    .addGap(18, 18, 18)
                    .addComponent(radProveedores)
                    .addGap(18, 18, 18)
                    .addComponent(radSalarios)
                    .addGap(18, 18, 18)
                    .addComponent(radVentas)
                    .addGap(18, 18, 18)
                    .addComponent(radServicios)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radCompras)
                        .addComponent(radEmpleados)
                        .addComponent(radProductos)
                        .addComponent(radProveedores)
                        .addComponent(radSalarios)
                        .addComponent(radVentas)
                        .addComponent(radServicios)
                        .addComponent(radClientes))
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnAgregar.setText("GUARDAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sali.png"))); // NOI18N
        btnSalir.setText("ATRAS");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setPreferredSize(new java.awt.Dimension(127, 33));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 651, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 952, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(952, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     int fila = listadoEmpleados.listadoEmpleados.getSelectedRow();

     txtDni.setText(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,0).toString()));
     txtDni.setEditable(false);
     txtApellido.requestFocus();
     txtNombre.setText(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,1).toString()));
     txtApellido.setText(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,2).toString()));
     txtTelefono.setText(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,3).toString()));
     txtMail.setText(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,4).toString()));
     txtCalle.setText(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,5).toString()));
     comboCategoria.setToolTipText(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,6).toString()));
     
    }//GEN-LAST:event_formWindowOpened

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
        
}//GEN-LAST:event_txtCalleKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
       int k=(int)evt.getKeyChar();
        if (k >= 32 && k <= 47 || k>=58 && k<=255){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
        if (txtTelefono.getText().length()== 11){
            evt.consume();
        }
}//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
       int k=(int)evt.getKeyChar();
        if (k >= 32 && k <= 47 || k>=58 && k<=255){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
        if (txtTelefono.getText().length()== 11){
            evt.consume();
        }
}//GEN-LAST:event_txtDniKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(!txtDni.getText().equals("") && !txtNombre.getText().equals("") && !txtApellido.getText().equals("") &&
           !txtTelefono.getText().equals("") &&  !txtCalle.getText().equals("")){

            emp.setDni(Integer.parseInt(txtDni.getText().toLowerCase()));
            emp.setApellido(txtApellido.getText().toLowerCase());
            emp.setNombre(txtNombre.getText().toLowerCase());
            emp.setTelefono(Long.parseLong(txtTelefono.getText().toLowerCase()));
            emp.setEmail(txtMail.getText().toLowerCase());
            emp.setDireccion(txtCalle.getText().toLowerCase());
            emp.setCategoria(comboCategoria.getSelectedIndex()+1);
       
            if(comboCategoria.getSelectedIndex()+1==1){
       
            if(radClientes.isSelected()==true){
               emp.ur.setMenuCliente(1);
            }
            if(radCompras.isSelected()==true){
               emp.ur.setMenuCompra(1);
            }
            if(radEmpleados.isSelected()==true){
               emp.ur.setMenuEmpleados(1);
            }
            if(radProductos.isSelected()==true){
               emp.ur.setMenuProducto(1);
            }
            if(radProveedores.isSelected()==true){
               emp.ur.setMenuProveedor(1);
            }
       if(radSalarios.isSelected()==true){
               emp.ur.setMenuSalario(1);
       }
       if(radVentas.isSelected()==true){
               emp.ur.setMenuVenta(1);
       }
       if(radServicios.isSelected()==true){
               emp.ur.setMenuServicios(1);
       }
       
       
   }
   if(comboCategoria.getSelectedIndex()+1==2){
       
       if(radClientes.isSelected()==true){
               emp.ur.setMenuCliente(1);
       }
       if(radCompras.isSelected()==true){
               emp.ur.setMenuCompra(1);
       }
       if(radEmpleados.isSelected()==true){
               emp.ur.setMenuEmpleados(1);
       }
       if(radProductos.isSelected()==true){
               emp.ur.setMenuProducto(1);
       }
       if(radProveedores.isSelected()==true){
               emp.ur.setMenuProveedor(1);
       }
       if(radSalarios.isSelected()==true){
               emp.ur.setMenuSalario(1);
       }
       if(radVentas.isSelected()==true){
               emp.ur.setMenuVenta(1);
       }
       if(radServicios.isSelected()==true){
               emp.ur.setMenuServicios(1);
       }
      
   }
   if(comboCategoria.getSelectedIndex()+1==3){
    if(radClientes.isSelected()==true){
               emp.ur.setMenuCliente(1);
       }
       if(radCompras.isSelected()==true){
               emp.ur.setMenuCompra(1);
       }
       if(radEmpleados.isSelected()==true){
               emp.ur.setMenuEmpleados(1);
       }
       if(radProductos.isSelected()==true){
               emp.ur.setMenuProducto(1);
       }
       if(radProveedores.isSelected()==true){
               emp.ur.setMenuProveedor(1);
       }
       if(radSalarios.isSelected()==true){
               emp.ur.setMenuSalario(1);
       }
       if(radVentas.isSelected()==true){
               emp.ur.setMenuVenta(1);
       }
       if(radServicios.isSelected()==true){
               emp.ur.setMenuServicios(1);
       }
       
       
       
   }
            emp.actualizarEmpleado();
            dispose();
        }
        else{
         JOptionPane.showMessageDialog(null,"Datos Faltantes","Error",JOptionPane.ERROR_MESSAGE);
        }
}//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
}//GEN-LAST:event_btnSalirActionPerformed

    private void txtCuilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuilKeyTyped
       int k=(int)evt.getKeyChar();
        if (k >= 32 && k <= 47 || k>=58 && k<=255){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
        if (txtTelefono.getText().length()== 11){
            evt.consume();
        }
    }//GEN-LAST:event_txtCuilKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        int k=(int)evt.getKeyChar();
        if (k >= 0 && k <= 64 || k>=91 && k<=96 || k>=123 && k<=255){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        int k=(int)evt.getKeyChar();
        if (k >= 0 && k <= 64 || k>=91 && k<=96 || k>=123 && k<=255){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void radClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radClientesActionPerformed

    private void radVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radVentasActionPerformed

 private void Numeros(int k, KeyEvent evt) {

 }
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                actualizarEmpleado dialog = new actualizarEmpleado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    public static final javax.swing.JComboBox comboCategoria = new javax.swing.JComboBox();
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton radClientes;
    private javax.swing.JRadioButton radCompras;
    private javax.swing.JRadioButton radEmpleados;
    private javax.swing.JRadioButton radProductos;
    private javax.swing.JRadioButton radProveedores;
    private javax.swing.JRadioButton radSalarios;
    private javax.swing.JRadioButton radServicios;
    private javax.swing.JRadioButton radVentas;
    private javax.swing.JTextField txtApellido;
    private static javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCuil;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

//    private int compararCombos(int fila,int numero) {
//     int index = 0;
//     if(numero ==1){
//     for(int i=0;i < comboEstado.getItemCount();i++){
//      if(comboEstado.getItemAt(i).toString().equals(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,4).toString()))){
//      index=i;
//      i=comboEstado.getItemCount();
//      }
//      }
//     }
//     if(numero ==2){
//     for(int i=0;i < comboCategoria.getItemCount();i++){
//      if(comboCategoria.getItemAt(i).toString().equals(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,9).toString()))){
//      index=i;
//      i=comboCategoria.getItemCount();
//      }
//      }
//      }
//     if(numero ==3){
//     for(int i=0;i < comboLocalidad.getItemCount();i++){
//      if(comboLocalidad.getItemAt(i).toString().equals(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,14).toString()))){
//      index=i;
//      i=comboLocalidad.getItemCount();
//      }
//      }
//      }
//     if(numero ==4){
//     for(int i=0;i < comboDepartamento.getItemCount();i++){
//      if(comboDepartamento.getItemAt(i).toString().equals(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,13).toString()))){
//      index=i;
//      i=comboDepartamento.getItemCount();
//      }
//      }
//      }
//     if(numero ==5){
//     for(int i=0;i < comboPiso.getItemCount();i++){
//      if(comboPiso.getItemAt(i).toString().equals(String.valueOf(listadoEmpleados.listadoEmpleados.getValueAt(fila,12).toString()))){
//      index=i;
//      i=comboPiso.getItemCount();
//      }
//      }
//      }
//     return index;
//    }



}
