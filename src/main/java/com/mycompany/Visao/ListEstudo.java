/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Visao;

import com.mycompany.Dao.DaoEstudo;
import com.mycompany.Ferramentas.DadosTemporarios;
import com.mycompany.Ferramentas.Formularios;
import com.mycompany.Modelo.ModEstudo;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mileny.1948
 */
public class ListEstudo extends javax.swing.JFrame {

    /**
     * Creates new form ListEstudo
     */
    public ListEstudo() {
        initComponents();
        
          setLocationRelativeTo(null);
       
        listarTodos();
    }

    public void listarTodos(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstudo.getModel();
           
            tableEstudo.setModel(defaultTableModel);

            DaoEstudo daoEstudo = new DaoEstudo();

            ResultSet resultSet = daoEstudo.listarTodos();
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String habito = resultSet.getString(2);
               
                defaultTableModel.addRow(new Object[]{id, habito});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
   
    public void listarPorId(int pId){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstudo.getModel();

            tableEstudo.setModel(defaultTableModel);

            DaoEstudo daoEstudo = new DaoEstudo();

            ResultSet resultSet = daoEstudo.listarPorId(pId);
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String habito = resultSet.getString(2);
               
                defaultTableModel.addRow(new Object[]{id, habito});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
   
    public void listarPorData(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstudo.getModel();
           
             tableEstudo.setModel(defaultTableModel);

            DaoEstudo daoEstudo = new DaoEstudo();
            ResultSet resultSet = daoEstudo.listarPorData(tfFiltro.getText());
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
               String id = resultSet.getString(1);
               String data = resultSet.getString(2);
               String materia = resultSet.getString(3);
               String conteudo = resultSet.getString(4);
               String tempoDeEstudo = resultSet.getString(5);
               
                defaultTableModel.addRow(new Object[]{id, data, materia, conteudo, tempoDeEstudo});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
     public void listarPorMateria(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstudo.getModel();
           
             tableEstudo.setModel(defaultTableModel);

            DaoEstudo daoEstudo = new DaoEstudo();
            ResultSet resultSet = daoEstudo.listarPorMateria(tfFiltro.getText());
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
               String data = resultSet.getString(2);
               String materia = resultSet.getString(3);
               String conteudo = resultSet.getString(4);
               String tempoDeEstudo = resultSet.getString(5);
               
                defaultTableModel.addRow(new Object[]{id, data, materia, conteudo, tempoDeEstudo});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
  public void listarPorConteudo(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstudo.getModel();
           
             tableEstudo.setModel(defaultTableModel);

            DaoEstudo daoEstudo = new DaoEstudo();
            ResultSet resultSet = daoEstudo.listarPorConteudo(tfFiltro.getText());
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
               String data = resultSet.getString(2);
               String materia = resultSet.getString(3);
               String conteudo = resultSet.getString(4);
               String tempoDeEstudo = resultSet.getString(5);
               
                defaultTableModel.addRow(new Object[]{id, data, materia, conteudo, tempoDeEstudo});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  
   public void listarPorTempodeEstudo(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstudo.getModel();
           
             tableEstudo.setModel(defaultTableModel);

            DaoEstudo daoEstudo = new DaoEstudo();
            ResultSet resultSet = daoEstudo.listarPorTempodeEstudo(tfFiltro.getText());
           
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
               String data = resultSet.getString(2);
               String materia = resultSet.getString(3);
               String conteudo = resultSet.getString(4);
               String tempoDeEstudo = resultSet.getString(5);
               
                defaultTableModel.addRow(new Object[]{id, data, materia, conteudo, tempoDeEstudo});
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
        tableEstudo = new javax.swing.JTable();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("LISTA DE PLANEJAMENTO DE ESTUDO");

        tableEstudo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data", "Materia", "Conteudo", "Tempo de estudo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEstudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEstudoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEstudo);

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Data", "Materia", "Conteudo", "Tempo de estudo", " " }));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfFiltro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdicionar)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
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
        if (Formularios.estudo == null)
            Formularios.estudo = new Estudo();

        Formularios.estudo.setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void tableEstudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEstudoMouseClicked
         if (evt.getClickCount() == 2){
              ModEstudo modEstudo = new ModEstudo();

            modEstudo.setId(Integer.parseInt(String.valueOf(tableEstudo.getValueAt(tableEstudo.getSelectedRow(), 0))));
            modEstudo.setData(String.valueOf(tableEstudo.getValueAt(tableEstudo.getSelectedRow(), 1)));
            modEstudo.setMateria(String.valueOf(tableEstudo.getValueAt(tableEstudo.getSelectedRow(), 2)));
            modEstudo.setConteudo(String.valueOf(tableEstudo.getValueAt(tableEstudo.getSelectedRow(), 3)));
            modEstudo.setTempoEstudo(String.valueOf(tableEstudo.getValueAt(tableEstudo.getSelectedRow(), 4)));

              DadosTemporarios.tempObject = (ModEstudo) modEstudo;

            Estudo estudo = new Estudo();
            estudo.setVisible(true);
        }
    }//GEN-LAST:event_tableEstudoMouseClicked

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
                listarPorMateria();
                break;
            case 4:
                listarPorConteudo();
                break;
            case 5:
                listarPorTempodeEstudo();
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
            java.util.logging.Logger.getLogger(ListEstudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListEstudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListEstudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListEstudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListEstudo().setVisible(true);
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
    private javax.swing.JTable tableEstudo;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
