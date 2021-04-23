
package vista.GUI_Empresa;

import control.Operaciones;
import vista.gui_hadden.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TablaOfertasLaborales extends javax.swing.JFrame implements ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BotonEliminarOfertaOfertasLaborales = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        BotonCrearOfertaOfertasLaborales = new javax.swing.JButton();
        ModificarOfertaOfertasLAborales = new javax.swing.JButton();
        BotonEliminarcuentaOfertasLaborales = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaOfertasLaborales = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        BotonEliminarOfertaOfertasLaborales.setBackground(new java.awt.Color(0, 0, 255));
        BotonEliminarOfertaOfertasLaborales.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonEliminarOfertaOfertasLaborales.setText("Eliminar oferta");
        BotonEliminarOfertaOfertasLaborales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarOfertaOfertasLaboralesActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 51, 51));
        jButton10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton10.setText("Volver");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        BotonCrearOfertaOfertasLaborales.setBackground(new java.awt.Color(0, 0, 255));
        BotonCrearOfertaOfertasLaborales.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonCrearOfertaOfertasLaborales.setText("Crear oferta");
        BotonCrearOfertaOfertasLaborales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearOfertaOfertasLaboralesActionPerformed(evt);
            }
        });

        ModificarOfertaOfertasLAborales.setBackground(new java.awt.Color(0, 0, 255));
        ModificarOfertaOfertasLAborales.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ModificarOfertaOfertasLAborales.setText("Modificar oferta");
        ModificarOfertaOfertasLAborales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarOfertaOfertasLAboralesActionPerformed(evt);
            }
        });

        BotonEliminarcuentaOfertasLaborales.setBackground(new java.awt.Color(0, 0, 255));
        BotonEliminarcuentaOfertasLaborales.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonEliminarcuentaOfertasLaborales.setText("Eliminar cuenta");
        BotonEliminarcuentaOfertasLaborales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarcuentaOfertasLaboralesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarOfertaOfertasLaborales, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModificarOfertaOfertasLAborales, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCrearOfertaOfertasLaborales, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarcuentaOfertasLaborales, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonCrearOfertaOfertasLaborales)
                .addGap(18, 18, 18)
                .addComponent(ModificarOfertaOfertasLAborales)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminarOfertaOfertasLaborales)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminarcuentaOfertasLaborales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addContainerGap())
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        TablaOfertasLaborales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaOfertasLaborales);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ofertas laborales");

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarOfertaOfertasLaboralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarOfertaOfertasLaboralesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminarOfertaOfertasLaboralesActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void BotonCrearOfertaOfertasLaboralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearOfertaOfertasLaboralesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCrearOfertaOfertasLaboralesActionPerformed

    private void ModificarOfertaOfertasLAboralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarOfertaOfertasLAboralesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarOfertaOfertasLAboralesActionPerformed

    private void BotonEliminarcuentaOfertasLaboralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarcuentaOfertasLaboralesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminarcuentaOfertasLaboralesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearOfertaOfertasLaborales;
    private javax.swing.JButton BotonEliminarOfertaOfertasLaborales;
    private javax.swing.JButton BotonEliminarcuentaOfertasLaborales;
    private javax.swing.JButton ModificarOfertaOfertasLAborales;
    private javax.swing.JTable TablaOfertasLaborales;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel modelo1;
    private byte[] key;
    private Operaciones operaciones;

    public TablaOfertasLaborales(byte[] key) throws NoSuchAlgorithmException, IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, InvalidKeyException {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.ponerescuchar();
        this.operaciones = Operaciones.crearIFacade();
        this.key = key;
        String col[] = {"Ofertas"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        this.TablaOfertasLaborales.setModel(tableModel);
        for (String c:this.operaciones.getConvocatoriasEmpresa(this.key)) {
            tableModel.addRow(new Object[]{c});
        }
        this.TablaOfertasLaborales.setModel(tableModel);
    }
    
    private void ponerescuchar()
    {
        this.BotonCrearOfertaOfertasLaborales.addActionListener(this);
        this.ModificarOfertaOfertasLAborales.addActionListener(this);
        this.BotonEliminarOfertaOfertasLaborales.addActionListener(this);
        this.BotonEliminarcuentaOfertasLaborales.addActionListener(this);
        this.jButton10.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.BotonCrearOfertaOfertasLaborales){
            try {
                new CrearOfertaLaboral(this.key);
            } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                noSuchAlgorithmException.printStackTrace();
            }
            this.dispose();
        }
        
        if(e.getSource()==this.ModificarOfertaOfertasLAborales){
            new ModificarOfertaLaboral(this.key);
            this.dispose();
        }
        
        if(e.getSource()==this.BotonEliminarOfertaOfertasLaborales){
            int a = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar la oferta laboral?");
            if(a==0){
                JOptionPane.showMessageDialog(null, "Oferta eliminada");
            }else if(a==1){
                JOptionPane.showMessageDialog(null, "La oferta no ha sido eliminada");
            }
        }
        
        if(e.getSource()==this.BotonEliminarcuentaOfertasLaborales){
            int a = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar la empresa?");
            if(a==0){
                JOptionPane.showMessageDialog(null, "Empresa eliminada");
                try {
                    new Login();
                } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    noSuchAlgorithmException.printStackTrace();
                }
                this.dispose();
            }else if(a==1){
                JOptionPane.showMessageDialog(null, "La empresa no ha sido eliminada");
            }
        }
        
        if(e.getSource()==this.jButton10){
            try {
                new Login();
            } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                noSuchAlgorithmException.printStackTrace();
            }
            this.dispose();
        }
    }   
}