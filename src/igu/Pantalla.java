package igu;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import logica.Cliente;
import logica.Controladora;

public class Pantalla extends javax.swing.JFrame {

    private Controladora control;
    private List<String> listaNumCliente = new ArrayList<String>();

    public Pantalla(Controladora control) {
        initComponents();
        setIconImage(getIconImage());
        
        this.control = control;
        
        // LLena el ArrayList con los numeros de cliente almacenados anteriormente.
        for (Cliente cliente : control.obtenerClientes()) {
            listaNumCliente.add(cliente.getNumCliente());
        }
        
        
    }
    
    
    // Se establece un icono para el JFrame.
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/dog_16.png"));       
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClienteNum = new javax.swing.JTextField();
        txtNombreMascota = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboAlergia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboAtencion = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JTextField();
        txtNombreDuenio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("  Peluquería Canina");
        setMaximumSize(new java.awt.Dimension(900, 770));
        setMinimumSize(new java.awt.Dimension(900, 770));
        setPreferredSize(new java.awt.Dimension(900, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner.png"))); // NOI18N
        jLabel1.setText("Peluquería Canina");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));

        jPanel2.setBackground(new java.awt.Color(232, 235, 237));

        jLabel3.setBackground(new java.awt.Color(62, 62, 62));
        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 62, 62));
        jLabel3.setText("Cliente N°");

        jLabel4.setBackground(new java.awt.Color(62, 62, 62));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 62, 62));
        jLabel4.setText("Nombre Mascota");

        txtClienteNum.setBackground(new java.awt.Color(224, 224, 224));
        txtClienteNum.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        txtClienteNum.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));

        txtNombreMascota.setBackground(new java.awt.Color(224, 224, 224));
        txtNombreMascota.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        txtNombreMascota.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));

        jLabel5.setBackground(new java.awt.Color(62, 62, 62));
        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(62, 62, 62));
        jLabel5.setText("Alergico:");

        jLabel6.setBackground(new java.awt.Color(62, 62, 62));
        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(62, 62, 62));
        jLabel6.setText("Color");

        txtColor.setBackground(new java.awt.Color(224, 224, 224));
        txtColor.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        txtColor.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));

        txtRaza.setBackground(new java.awt.Color(224, 224, 224));
        txtRaza.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        txtRaza.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));

        jLabel7.setBackground(new java.awt.Color(62, 62, 62));
        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(62, 62, 62));
        jLabel7.setText("Raza");

        comboAlergia.setBackground(new java.awt.Color(224, 224, 224));
        comboAlergia.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        comboAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        comboAlergia.setBorder(null);
        comboAlergia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboAlergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlergiaActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(62, 62, 62));
        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(62, 62, 62));
        jLabel8.setText("Atencion Especial");

        comboAtencion.setBackground(new java.awt.Color(224, 224, 224));
        comboAtencion.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        comboAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        comboAtencion.setBorder(null);
        comboAtencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAtencionActionPerformed(evt);
            }
        });

        txtTelefono.setBackground(new java.awt.Color(224, 224, 224));
        txtTelefono.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));

        txtNombreDuenio.setBackground(new java.awt.Color(224, 224, 224));
        txtNombreDuenio.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        txtNombreDuenio.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));

        jLabel9.setBackground(new java.awt.Color(62, 62, 62));
        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(62, 62, 62));
        jLabel9.setText("Nombre del dueño");

        jLabel10.setBackground(new java.awt.Color(62, 62, 62));
        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(62, 62, 62));
        jLabel10.setText("Teléfono");

        jLabel11.setBackground(new java.awt.Color(62, 62, 62));
        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(62, 62, 62));
        jLabel11.setText("Observaciones");

        btnGuardar.setBackground(new java.awt.Color(232, 235, 237));
        btnGuardar.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(232, 235, 237));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardarBtnState0.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardarBtnState2.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(232, 235, 237));
        btnLimpiar.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(58, 103, 230));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarsatate0.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarBtn.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtObservaciones.setBackground(new java.awt.Color(224, 224, 224));
        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));
        jScrollPane1.setViewportView(txtObservaciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtClienteNum, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(comboAlergia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(comboAtencion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtColor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteNum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 560, 590));

        jPanel3.setBackground(new java.awt.Color(232, 235, 237));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 340, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAlergiaActionPerformed

    private void comboAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAtencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAtencionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        this.cleanFields();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        /**
         * 
         *  Valida que no exista otro numero de cliente igual. Para ello se estableció 
         *    un ArrayList donde se guardan los Numeros de Clientes. En caso de no existir,
         *    se añade el numero de cliente en el ArratList y se llama al metodo de la
         *    controladora de la logica para instanciar el objeto de la clase Cliente. 
         * 
         * */
        
        String numCliente = txtClienteNum.getText();
        
        if (!listaNumCliente.contains(numCliente)) {
            
            listaNumCliente.add(numCliente);
            
            String numClienteIgu = numCliente.trim();
            String nombreMascota= txtNombreMascota.getText().trim();
            String razaMascota  = txtRaza.getText().trim();
            String colorMascota = txtColor.getText().trim();
            
            // Solo guarda "true" si es seleccionado "SI" en el comboBox
            Boolean esAlergico = comboAlergia.getSelectedItem().toString() == "SI" ? true : false; 
            Boolean atencionEscpecial = comboAtencion.getSelectedItem().toString() ==  "SI" ? true : false;
            
            String nombreDuenio = txtNombreDuenio.getText().trim();
            String telefonoDuenio = txtTelefono.getText().trim();
            
            //En el caso de no haber observaciones guarda "sin observaciones"
            String observaciones = txtObservaciones.getText().trim().equals("") ? "Sin observaciones" : txtObservaciones.getText().trim();
            
            // Valida si los campos no estan vacios.
            if (numClienteIgu.equals("") || nombreMascota.equals("")|| razaMascota.equals("")|| colorMascota.equals("")|| nombreDuenio.equals("")|| telefonoDuenio.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Uno o mas campos estan vacios.", "No se agregó el cliente", JOptionPane.ERROR_MESSAGE);
            }else{
                control.crearCliente(numClienteIgu, nombreMascota, razaMascota, colorMascota, esAlergico, atencionEscpecial, nombreDuenio, telefonoDuenio, observaciones);
                JOptionPane.showMessageDialog(rootPane, "Cliente agregado correctamete", "Cliente Agregado", JOptionPane.INFORMATION_MESSAGE);
                cleanFields();
            }             
        } else {
            
            JOptionPane.showMessageDialog(rootPane, "El numero de cliente ya esta en uso", "No se agregó el cliente", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cleanFields() {
        txtClienteNum.setText("");
        txtNombreMascota.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        txtNombreDuenio.setText("");
        txtTelefono.setText("");
        txtObservaciones.setText("");
        comboAtencion.setSelectedIndex(0);
        comboAlergia.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboAlergia;
    private javax.swing.JComboBox<String> comboAtencion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtClienteNum;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
