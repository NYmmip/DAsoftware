package vista.GUI_usuario_Ofertas;

import control.Operaciones;
import vista.gui_hadden.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class MenuUsuario extends javax.swing.JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BotonMisOfertasMenuUsuario = new javax.swing.JButton();
        BotonSalirMenuUsuario = new javax.swing.JButton();
        BotonEmpresasMenuUsuario = new javax.swing.JButton();
        BotonEliminarCuentaMenuUsuario = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonMisOfertasMenuUsuario.setBackground(new java.awt.Color(0, 0, 255));
        BotonMisOfertasMenuUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonMisOfertasMenuUsuario.setText("Mis ofertas");
        BotonMisOfertasMenuUsuario.setToolTipText("");
        BotonMisOfertasMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMisOfertasMenuUsuarioActionPerformed(evt);
            }
        });

        BotonSalirMenuUsuario.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalirMenuUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonSalirMenuUsuario.setText("Salir");
        BotonSalirMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirMenuUsuarioActionPerformed(evt);
            }
        });

        BotonEmpresasMenuUsuario.setBackground(new java.awt.Color(0, 0, 255));
        BotonEmpresasMenuUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonEmpresasMenuUsuario.setText("Empresas");
        BotonEmpresasMenuUsuario.setToolTipText("");
        BotonEmpresasMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmpresasMenuUsuarioActionPerformed(evt);
            }
        });

        BotonEliminarCuentaMenuUsuario.setBackground(new java.awt.Color(0, 0, 255));
        BotonEliminarCuentaMenuUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonEliminarCuentaMenuUsuario.setText("Eliminar cuenta");
        BotonEliminarCuentaMenuUsuario.setToolTipText("");
        BotonEliminarCuentaMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarCuentaMenuUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonEliminarCuentaMenuUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonMisOfertasMenuUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEmpresasMenuUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(BotonSalirMenuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BotonEmpresasMenuUsuario)
                .addGap(18, 18, 18)
                .addComponent(BotonMisOfertasMenuUsuario)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminarCuentaMenuUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(BotonSalirMenuUsuario)
                .addGap(22, 22, 22))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menu");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMisOfertasMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMisOfertasMenuUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMisOfertasMenuUsuarioActionPerformed

    private void BotonSalirMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirMenuUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirMenuUsuarioActionPerformed

    private void BotonEmpresasMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmpresasMenuUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEmpresasMenuUsuarioActionPerformed

    private void BotonEliminarCuentaMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarCuentaMenuUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminarCuentaMenuUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminarCuentaMenuUsuario;
    private javax.swing.JButton BotonEmpresasMenuUsuario;
    private javax.swing.JButton BotonMisOfertasMenuUsuario;
    private javax.swing.JButton BotonSalirMenuUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables


    private int actividad;
    private int alojamiento;
    private byte[] key;
    private Operaciones operaciones;
    
    public MenuUsuario(byte[] key){
        try {
            initComponents();
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            this.ponerescuchar();
            this.actividad=actividad;
            this.alojamiento=alojamiento;
            this.key = key;
            this.operaciones = Operaciones.crearIFacade();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    
    private void ponerescuchar(){
        this.BotonEmpresasMenuUsuario.addActionListener(this);
        this.BotonMisOfertasMenuUsuario.addActionListener(this);
        this.BotonEliminarCuentaMenuUsuario.addActionListener(this);
        this.BotonSalirMenuUsuario.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.BotonMisOfertasMenuUsuario){
            new TablaMisOfertas(this.key);
            this.dispose();
        }
        
        if(e.getSource()==this.BotonEmpresasMenuUsuario){
            new TablaEmpresasUser(this.key);
            this.dispose();
        }
        
        if(e.getSource()==this.BotonEliminarCuentaMenuUsuario){
            int a = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar el usuario?");
            if(a==0){
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
                try {
                    this.operaciones.removeUser(this.key);
                    new Login();
                } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    noSuchAlgorithmException.printStackTrace();
                }
                this.dispose();
            }else if(a==1){
                JOptionPane.showMessageDialog(null, "El usuario no ha sido eliminada");
            }
        }
        
        if(e.getSource()==this.BotonSalirMenuUsuario){
            try {
                new Login();
            } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                noSuchAlgorithmException.printStackTrace();
            }
            this.dispose();
        }
    }
}