/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Visao;

import com.mycompany.Dao.DaoHabitos;
import com.mycompany.Dao.DaoTrabalho;
import com.mycompany.Ferramentas.DadosTemporarios;
import com.mycompany.Ferramentas.Formularios;
import com.mycompany.Modelo.ModHabitos;
import com.mycompany.Modelo.ModTrabalho;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mileny.1948
 */
public class ListTrabalho extends javax.swing.JFrame {

    /**
     * Creates new form ListTrabalho
     */
    public ListTrabalho() {
        initComponents();
        
         setLocationRelativeTo(null);
       
        listarTodos();
    }

    public void listarTodos(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableTrabalho.getModel();
           
            tableTrabalho.setModel(defaultTableModel);

            DaoTrabalho daoTrabalho = new DaoTrabalho();

            ResultSet resultSet = daoTrabalho.listarTodos();

            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String data = resultSet.getString(2);
                String importante = resultSet.getString(3);
                String urgente = resultSet.getString(4);
                String importanteUrgente = resultSet.getString(5);
                String naoImportanteNemUgente = resultSet.getString(6);
               
                defaultTableModel.addRow(new Object[]{id, data, importante, urgente,importanteUrgente, naoImportanteNemUgente});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
   
    public void listarPorId(int pId){
        try{
           DefaultTableModel defaultTableModel = (DefaultTableModel) tableTrabalho.getModel();
           
            tableTrabalho.setModel(defaultTableModel);

          DaoTrabalho daoTrabalho = new DaoTrabalho();

            ResultSet resultSet = daoTrabalho.listarPorId(pId);
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
               String data = resultSet.getString(2);
                String importante = resultSet.getString(3);
                String urgente = resultSet.getString(4);
                String importanteUrgente = resultSet.getString(5);
                String naoImportanteNemUgente = resultSet.getString(6);
               
                defaultTableModel.addRow(new Object[]{id, data, importante, urgente,importanteUrgente, naoImportanteNemUgente});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
   
    public void listarPorData(){
        try{
             DefaultTableModel defaultTableModel = (DefaultTableModel) tableTrabalho.getModel();
           
            tableTrabalho.setModel(defaultTableModel);

          DaoTrabalho daoTrabalho = new DaoTrabalho();

            ResultSet resultSet = daoTrabalho.listarPorData(tfFiltro.getText());
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
               String id = resultSet.getString(1);
               String data = resultSet.getString(2);
                String importante = resultSet.getString(3);
                String urgente = resultSet.getString(4);
                String importanteUrgente = resultSet.getString(5);
                String naoImportanteNemUgente = resultSet.getString(6);
               
                defaultTableModel.addRow(new Object[]{id, data, importante, urgente,importanteUrgente, naoImportanteNemUgente});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  
  public void listarPorImportante(){
        try{
             DefaultTableModel defaultTableModel = (DefaultTableModel) tableTrabalho.getModel();
           
            tableTrabalho.setModel(defaultTableModel);

          DaoTrabalho daoTrabalho = new DaoTrabalho();

            ResultSet resultSet = daoTrabalho.listarPorImportante(tfFiltro.getText());
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
               String id = resultSet.getString(1);
               String data = resultSet.getString(2);
                String importante = resultSet.getString(3);
                String urgente = resultSet.getString(4);
                String importanteUrgente = resultSet.getString(5);
                String naoImportanteNemUgente = resultSet.getString(6);
               
                defaultTableModel.addRow(new Object[]{id, data, importante, urgente,importanteUrgente, naoImportanteNemUgente});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  
    public void listarPorUgente(){
        try{
             DefaultTableModel defaultTableModel = (DefaultTableModel) tableTrabalho.getModel();
           
            tableTrabalho.setModel(defaultTableModel);

          DaoTrabalho daoTrabalho = new DaoTrabalho();

            ResultSet resultSet = daoTrabalho.listarPorUgente(tfFiltro.getText());
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
               String id = resultSet.getString(1);
               String data = resultSet.getString(2);
                String importante = resultSet.getString(3);
                String urgente = resultSet.getString(4);
                String importanteUrgente = resultSet.getString(5);
                String naoImportanteNemUgente = resultSet.getString(6);
               
                defaultTableModel.addRow(new Object[]{id, data, importante, urgente,importanteUrgente, naoImportanteNemUgente});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
      public void listarPorImportanteUrgente(){
        try{
             DefaultTableModel defaultTableModel = (DefaultTableModel) tableTrabalho.getModel();
           
            tableTrabalho.setModel(defaultTableModel);

          DaoTrabalho daoTrabalho = new DaoTrabalho();

            ResultSet resultSet = daoTrabalho.listarPorImportanteUrgente(tfFiltro.getText());
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
               String id = resultSet.getString(1);
               String data = resultSet.getString(2);
                String importante = resultSet.getString(3);
                String urgente = resultSet.getString(4);
                String importanteUrgente = resultSet.getString(5);
                String naoImportanteNemUgente = resultSet.getString(6);
               
                defaultTableModel.addRow(new Object[]{id, data, importante, urgente,importanteUrgente, naoImportanteNemUgente});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
      
        public void listarPorNaoImportanteNemUrgente(){
        try{
             DefaultTableModel defaultTableModel = (DefaultTableModel) tableTrabalho.getModel();
           
            tableTrabalho.setModel(defaultTableModel);

          DaoTrabalho daoTrabalho = new DaoTrabalho();

            ResultSet resultSet = daoTrabalho.listarPorNaoImportanteNemUrgente(tfFiltro.getText());
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
               String id = resultSet.getString(1);
               String data = resultSet.getString(2);
                String importante = resultSet.getString(3);
                String urgente = resultSet.getString(4);
                String importanteUrgente = resultSet.getString(5);
                String naoImportanteNemUgente = resultSet.getString(6);
               
                defaultTableModel.addRow(new Object[]{id, data, importante, urgente,importanteUrgente, naoImportanteNemUgente});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTrabalho = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("LISTA DE PLANEJAMENTOS DE TRABALHO");

        tableTrabalho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data", "Importante", "Importante e urgente", "Urgente", "Não importante nem urgente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTrabalho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTrabalhoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTrabalho);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionar.setText("PLANEJAMENTO DO DIA");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Data", "Importante", "Importante e urgente", "Ugente", "Não Importante nem Urgente" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbTipoFiltro, 0, 149, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAdicionar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
              if (Formularios.trabalho == null)
            Formularios.trabalho = new Trabalho();

        Formularios.trabalho.setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void tableTrabalhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTrabalhoMouseClicked
        if (evt.getClickCount() == 2){
              ModTrabalho modTrabalho = new ModTrabalho();

            modTrabalho.setId(Integer.parseInt(String.valueOf(tableTrabalho.getValueAt(tableTrabalho.getSelectedRow(), 0))));
            modTrabalho.setData(String.valueOf(tableTrabalho.getValueAt(tableTrabalho.getSelectedRow(), 1)));
            modTrabalho.setImportante(String.valueOf(tableTrabalho.getValueAt(tableTrabalho.getSelectedRow(), 2)));
            modTrabalho.setImportanteUrgente(String.valueOf(tableTrabalho.getValueAt(tableTrabalho.getSelectedRow(), 3)));
            modTrabalho.setUrgente(String.valueOf(tableTrabalho.getValueAt(tableTrabalho.getSelectedRow(), 4)));
            modTrabalho.setNaoImportanteNemUrgente(String.valueOf(tableTrabalho.getValueAt(tableTrabalho.getSelectedRow(), 5)));

              DadosTemporarios.tempObject = (ModTrabalho) modTrabalho;

            Trabalho trabalho = new Trabalho();
            trabalho.setVisible(true);
        }
    }//GEN-LAST:event_tableTrabalhoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId(Integer.parseInt(tfFiltro.getText()));
                break;
            case 2:
                listarPorData();
                break;
            case 3:
                listarPorImportante();
                break;
            case 4:
                listarPorUgente();
                break;
            case 5:
                listarPorImportanteUrgente();
                break;
            case 6:
                listarPorNaoImportanteNemUrgente();
                break;    
                
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListTrabalho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableTrabalho;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
