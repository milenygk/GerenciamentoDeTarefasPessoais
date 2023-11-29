/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Visao;

import com.mycompany.Dao.DaoDespesas;
import com.mycompany.Dao.DaoMetas;
import com.mycompany.Ferramentas.Constantes;
import com.mycompany.Ferramentas.DadosTemporarios;
import com.mycompany.Ferramentas.Formularios;
import com.mycompany.Modelo.ModMetas;
import javax.swing.JOptionPane;

/**
 *
 * @author mileny.1948
 */
public class Metas extends javax.swing.JFrame {

    /**
     * Creates new form Metas
     */
    public Metas() {
        initComponents();
        
        if(!existeDadosTemporarios()){
             DaoMetas daoMetas = new DaoMetas();

            int id = daoMetas.buscarProximoId(); 
            if (id > 0)
                tfId.setText(String.valueOf(id));
            
            btnAcao.setText(Constantes.BTN_SALVAR_TEXT);
            btnExcluir.setVisible(false);
        }else{
            btnAcao.setText(Constantes.BTN_ALTERAR_TEXT);
            btnExcluir.setVisible(true);
        }
         tfId.setVisible(false);
    }
    
     private Boolean existeDadosTemporarios(){        
        if(DadosTemporarios.tempObject instanceof ModMetas){
            int ano = ((ModMetas) DadosTemporarios.tempObject).getAno();
            String categoria = ((ModMetas) DadosTemporarios.tempObject).getCategoria();
            String meta = ((ModMetas) DadosTemporarios.tempObject).getMeta();
            
            tfAno.setText(String.valueOf(ano));
            tfCategoria.setText(categoria);
            taMeta.setText(meta);
        
            DadosTemporarios.tempObject = null;
            
            return true;
        }else
            return false;
    }

       private void inserir(){
           DaoMetas daoMetas = new DaoMetas();
        
          if(daoMetas.inserir(Integer.parseInt(tfId.getText()), taMeta.getText(), Integer.parseInt(tfAno.getText()), tfCategoria.getText())){
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
//            tfId.setText(String.valueOf(""));
            tfAno.setText(String.valueOf(""));
            tfCategoria.setText("");
            taMeta.setText("");
            
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível salvar!");
        }
        ((ListMetas) Formularios.ListMetas).listarTodos();
       }
       
    private void alterar(){
       DaoMetas daoMetas = new DaoMetas();
        
          if(daoMetas.alterar(Integer.parseInt(tfId.getText()), taMeta.getText(), Integer.parseInt(tfAno.getText()), tfCategoria.getText())){
            JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso!");
            
            tfAno.setText(String.valueOf(""));
            tfCategoria.setText("");
            taMeta.setText("");
            
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível alterar!");
        }
        
        ((ListMetas) Formularios.ListMetas).listarTodos();
        
        dispose();
    }       

    private void excluir(){
        DaoMetas daoMetas = new DaoMetas();
        
        if (daoMetas.excluir(Integer.parseInt(tfId.getText()))){
        JOptionPane.showMessageDialog(null, "Meta " + taMeta.getText() + " excluída com sucesso!");
            
            tfAno.setText(String.valueOf(""));
            tfCategoria.setText("");
            taMeta.setText("");
            
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível excluir!");
        }
        
        ((ListMetas) Formularios.ListMetas).listarTodos();
        
        dispose();
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
        tfCategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAcao = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMeta = new javax.swing.JTextArea();
        tfId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CATEGORIA:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("META:");

        btnAcao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAcao.setText("SALVAR");
        btnAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcaoActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ANO:");

        taMeta.setColumns(20);
        taMeta.setRows(5);
        jScrollPane1.setViewportView(taMeta);

        tfId.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(110, 110, 110))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addGap(6, 6, 6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAcao)
                                .addGap(18, 18, 18)
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcao)
                    .addComponent(btnExcluir)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcaoActionPerformed
       DaoMetas daoMetas =  new DaoMetas();
        
        if (btnAcao.getText() == Constantes.BTN_SALVAR_TEXT){
            inserir();
                    
            tfId.setText(String.valueOf(daoMetas.buscarProximoId()));
        }else if(btnAcao.getText() == Constantes.BTN_ALTERAR_TEXT){
            alterar();
            ((ListMetas) Formularios.ListMetas).listarTodos();
        }        
    }//GEN-LAST:event_btnAcaoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int escolha =
              JOptionPane.showConfirmDialog(null,
                      "Deseja realmente excluir?" + taMeta.getText() + "?");
      
      if(escolha == JOptionPane.YES_OPTION)
          excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Metas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Metas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Metas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Metas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Metas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcao;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taMeta;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfCategoria;
    private javax.swing.JTextField tfId;
    // End of variables declaration//GEN-END:variables
}
