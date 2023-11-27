/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Visao;

import com.mycompany.Dao.DaoDespesas;
import com.mycompany.Ferramentas.Constantes;
import com.mycompany.Ferramentas.DadosTemporarios;
import com.mycompany.Ferramentas.Formularios;
import com.mycompany.Modelo.ModDespesas;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author mileny.1948
 */
public class Despesas extends javax.swing.JFrame {

    private Object id;

    /**
     * Creates new form Despesas
     */
    public Despesas() {
        initComponents();
        
         if(!existeDadosTemporarios()){
             DaoDespesas daoDespesas = new DaoDespesas();

            int id = daoDespesas.buscarProximoId(); 
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
        if(DadosTemporarios.tempObject instanceof ModDespesas){
            int id = ((ModDespesas) DadosTemporarios.tempObject).getId();
            String data = ((ModDespesas) DadosTemporarios.tempObject).getData();
            String descricao = ((ModDespesas) DadosTemporarios.tempObject).getDescricao();
            String categoria = ((ModDespesas) DadosTemporarios.tempObject).getCategoria();
            int quantidade = ((ModDespesas) DadosTemporarios.tempObject).getQuantidade();
            double valor = ((ModDespesas) DadosTemporarios.tempObject).getValor(); 
            double total = ((ModDespesas) DadosTemporarios.tempObject).getTotal(); 
            
            tfId.setText(String.valueOf(id));
            tfData.setText(String.valueOf(String.valueOf(data)));
            taDescricao.setText(String.valueOf(descricao));
            tfCategoria.setText(categoria);
            tfQuantidade.setText(String.valueOf(quantidade));
            tfValor.setText(String.valueOf(valor));
            lblTotal.setText(String.valueOf(total));
            
            DadosTemporarios.tempObject = null;
            
            return true;
        }else
            return false;
        }

    private void inserir(){
        DaoDespesas daoDespesas = new DaoDespesas();
        
        if (daoDespesas.inserir(Integer.parseInt(tfId.getText()), tfData.getText(), taDescricao.getText(), tfCategoria.getText(), Double.parseDouble(tfValor.getText()), Double.parseDouble(lblTotal.getText()), Integer.parseInt(tfQuantidade.getText()))){
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
            tfId.setText(String.valueOf(""));
            tfData.setText(String.valueOf(String.valueOf("")));
            taDescricao.setText(String.valueOf(""));
            tfCategoria.setText("");
            tfQuantidade.setText(String.valueOf(""));
            tfValor.setText((""));
            lblTotal.setText((""));
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível salvar!");
        }
        ((ListDespesas) Formularios.ListDespesas).listarTodos();
       }
    
    private void total(){
        lblTotal.setText("0.00");
        
        try{
            if(tfValor.getText().equals(""))
               tfQuantidade.setText("");
            
            Double valor = Double.parseDouble(tfValor.getText());
            Double quantidade = Double.parseDouble(tfQuantidade.getText());
            Double totalDespesas = valor * quantidade;
            
            DecimalFormat df = new DecimalFormat("#.##");
            
            String calculaDespesa = df.format(totalDespesas);
            
            lblTotal.setText(calculaDespesa);
        }catch(NumberFormatException e){
            System.err.println("Erro ao converter valores:" + e.getMessage());
        }
    }
       
    private void alterar(){
       DaoDespesas daoDespesas = new DaoDespesas();
        
        if (daoDespesas.alterar(Integer.parseInt(tfId.getText()), tfData.getText(), taDescricao.getText(), tfCategoria.getText(), Double.parseDouble(tfValor.getText()), Double.parseDouble(lblTotal.getText()), Integer.parseInt(tfQuantidade.getText()))){
            JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso!");
            
//             tfId.setText(String.valueOf(id));
//            tfData.setText(String.valueOf(String.valueOf(data)));
//            taDescricao.setText(String.valueOf(descricao));
//            tfCategoria.setText(categoria);
//            tfQuantidade.setText(String.valueOf(quantidade));
//            tfValor.setText(String.valueOf(valor));
//            lblTotal.setText(String.valueOf(total));
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível alterar!");
        }
        
        ((ListDespesas) Formularios.ListDespesas).listarTodos();
        
        dispose();
    }       

    private void excluir(){
        DaoDespesas daoDespesas = new DaoDespesas();
        
        if (daoDespesas.excluir(Integer.parseInt(tfId.getText()))){
            JOptionPane.showMessageDialog(null, "Despesa " + taDescricao.getText() + " excluída com sucesso!");
            
            tfId.setText(String.valueOf(""));
            tfData.setText(String.valueOf(String.valueOf("")));
            taDescricao.setText(String.valueOf(""));
            tfCategoria.setText("");
            tfQuantidade.setText(String.valueOf(""));
            tfValor.setText(String.valueOf(""));
            lblTotal.setText(String.valueOf(""));
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível excluir!");
        }
        
        ((ListDespesas) Formularios.ListDespesas).listarTodos();
        
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        tfCategoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        btnAcao = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        tfQuantidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Data");

        jLabel3.setText("Descrição");

        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        jScrollPane1.setViewportView(taDescricao);

        jLabel4.setText("Categoria");

        jLabel5.setText("Valor");

        jLabel6.setText("Total");

        tfValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfValorFocusLost(evt);
            }
        });

        btnAcao.setText("SALVAR");
        btnAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcaoActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel7.setText("Quantidade:");

        tfId.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setText("CADASTRO DE DESPESAS");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAcao)
                                .addGap(103, 103, 103))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(tfCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAcao)
                            .addComponent(btnExcluir)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcaoActionPerformed
        DaoDespesas daoDespesas =  new DaoDespesas();
        
        if (btnAcao.getText() == Constantes.BTN_SALVAR_TEXT){
            inserir();
                    
            tfId.setText(String.valueOf(daoDespesas.buscarProximoId()));
        }else if(btnAcao.getText() == Constantes.BTN_ALTERAR_TEXT){
            alterar();
            ((ListDespesas) Formularios.ListDespesas).listarTodos();
        }        
    }//GEN-LAST:event_btnAcaoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int escolha =
              JOptionPane.showConfirmDialog(null,
                      "Deseja realmente excluir?" + taDescricao.getText() + "?");
      
      if(escolha == JOptionPane.YES_OPTION)
          excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tfValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfValorFocusLost
        total();
    }//GEN-LAST:event_tfValorFocusLost

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
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Despesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcao;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTextField tfCategoria;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables

//    private void inserir() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    private void alterar() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    private void excluir() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
