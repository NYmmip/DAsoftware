
package vista.GUI_Administrador;

import control.Operaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablaEmpresas extends javax.swing.JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BotonNuevaEmpresaTablaEmpresas = new javax.swing.JButton();
        BotonModificarTablaEmpresas = new javax.swing.JButton();
        BotonEliminarTablaEmpresas = new javax.swing.JButton();
        BotonVolverTablaEmpresa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEmpresas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonNuevaEmpresaTablaEmpresas.setBackground(new java.awt.Color(0, 0, 255));
        BotonNuevaEmpresaTablaEmpresas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonNuevaEmpresaTablaEmpresas.setText("Nueva");
        BotonNuevaEmpresaTablaEmpresas.setToolTipText("");
        BotonNuevaEmpresaTablaEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevaEmpresaTablaEmpresasActionPerformed(evt);
            }
        });

        BotonModificarTablaEmpresas.setBackground(new java.awt.Color(0, 0, 255));
        BotonModificarTablaEmpresas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonModificarTablaEmpresas.setText("Modificar");
        BotonModificarTablaEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarTablaEmpresasActionPerformed(evt);
            }
        });

        BotonEliminarTablaEmpresas.setBackground(new java.awt.Color(0, 0, 255));
        BotonEliminarTablaEmpresas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonEliminarTablaEmpresas.setText("Eliminar");
        BotonEliminarTablaEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarTablaEmpresasActionPerformed(evt);
            }
        });

        BotonVolverTablaEmpresa.setBackground(new java.awt.Color(255, 51, 51));
        BotonVolverTablaEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonVolverTablaEmpresa.setText("Volver");
        BotonVolverTablaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverTablaEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonVolverTablaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarTablaEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificarTablaEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonNuevaEmpresaTablaEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonNuevaEmpresaTablaEmpresas)
                .addGap(18, 18, 18)
                .addComponent(BotonModificarTablaEmpresas)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminarTablaEmpresas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolverTablaEmpresa)
                .addContainerGap())
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        TablaEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaEmpresas);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Empresas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarTablaEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarTablaEmpresasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonModificarTablaEmpresasActionPerformed

    private void BotonEliminarTablaEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarTablaEmpresasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminarTablaEmpresasActionPerformed

    private void BotonNuevaEmpresaTablaEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevaEmpresaTablaEmpresasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonNuevaEmpresaTablaEmpresasActionPerformed

    private void BotonVolverTablaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverTablaEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverTablaEmpresaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminarTablaEmpresas;
    private javax.swing.JButton BotonModificarTablaEmpresas;
    private javax.swing.JButton BotonNuevaEmpresaTablaEmpresas;
    private javax.swing.JButton BotonVolverTablaEmpresa;
    private javax.swing.JTable TablaEmpresas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel modelo1;
    private byte[] key;
    private Operaciones operaciones;

    public TablaEmpresas(byte[] key) {
        try {
            initComponents();
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            this.ponerescuchar();
            this.key = key;
            this.operaciones = Operaciones.crearIFacade();
            String col[] = {"Empresas"};
            DefaultTableModel tableModel = new DefaultTableModel(col, 0);
            this.TablaEmpresas.setModel(tableModel);
            for (String c:this.operaciones.getInfoEmpresas()) {
                tableModel.addRow(new Object[]{c});
            }
            this.TablaEmpresas.setModel(tableModel);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    
    private void ponerescuchar()
    {
        this.BotonNuevaEmpresaTablaEmpresas.addActionListener(this);
        this.BotonModificarTablaEmpresas.addActionListener(this);
        this.BotonEliminarTablaEmpresas.addActionListener(this);
        this.BotonVolverTablaEmpresa.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.BotonNuevaEmpresaTablaEmpresas){
            try {
                new CrearEmpresa(this.key);
            } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                noSuchAlgorithmException.printStackTrace();
            }
            this.dispose();
        }
        
        if(e.getSource()==this.BotonModificarTablaEmpresas){
            String temp = JOptionPane.showInputDialog("User de la empresa a modificar");
            if(this.operaciones.getUsuario(this.key, temp) != null){
                new ModificarEmpresa(this.key, temp);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "No existe una empresa con ese usuario");
            }

        }
        
        if(e.getSource()==this.BotonEliminarTablaEmpresas){
            String temp = JOptionPane.showInputDialog(null, "Ingrese el user que quiere eliminar");
            if(JOptionPane.showConfirmDialog(null,"Esta seguro que desea borrar esta empresa") == 0){
                this.operaciones.removeUser(this.key, temp);
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
                new TablaEmpresas(this.key);
                this.dispose();
            }
        }
        
        if(e.getSource()==this.BotonVolverTablaEmpresa){
            new MenuAdmin(this.key);
            this.dispose();
        }
    }   
}