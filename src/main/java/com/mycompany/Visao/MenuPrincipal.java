/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Visao;

import com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql;
import com.mycompany.Ferramentas.Formularios;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;

/**
 *
 * @author mileny.1948
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        setExtendedState(MAXIMIZED_BOTH);
        
        if (!ConexaoBancoDeDadosMySql.conectar()){
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados. O sistema será finalizado.");
            System.exit(0);
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

        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labelMenu = new javax.swing.JLabel();
        labelPlanejamento = new javax.swing.JLabel();
        labelHabitos = new javax.swing.JLabel();
        labelHobbies = new javax.swing.JLabel();
        labelObrigacoes = new javax.swing.JLabel();
        labelTrabalho = new javax.swing.JLabel();
        labelEstudo = new javax.swing.JLabel();
        labelMetas = new javax.swing.JLabel();
        labelViagens = new javax.swing.JLabel();
        LabelBlocoDeNotas = new javax.swing.JLabel();
        labelCalendario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelFinanceiro = new javax.swing.JLabel();
        labelConta = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenuItem1.setText("jMenuItem1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        labelMenu.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelMenu.setForeground(new java.awt.Color(255, 255, 255));
        labelMenu.setText("MENU:");
        labelMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(labelMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelPlanejamento.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelPlanejamento.setText("PANEJAMENTO DIÁRIO");
        labelPlanejamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelHabitos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelHabitos.setText("HÁBITOS");
        labelHabitos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelHobbies.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelHobbies.setText("HOBBIES");
        labelHobbies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelObrigacoes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelObrigacoes.setText("OBRIGAÇÕES");
        labelObrigacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelTrabalho.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelTrabalho.setText("PLANEJAMENTO DE TRABALHO");
        labelTrabalho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelEstudo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelEstudo.setText("PLANEJAMENTO DE ESTUDO");
        labelEstudo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelMetas.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelMetas.setText("METAS");
        labelMetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelViagens.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelViagens.setText("VIAGENS");
        labelViagens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LabelBlocoDeNotas.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        LabelBlocoDeNotas.setText("ANOTAÇÕES");
        LabelBlocoDeNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelCalendario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelCalendario.setText("CALENDÁRIO");
        labelCalendario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        labelFinanceiro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelFinanceiro.setText("CONTROLE FINANCEIRO");
        labelFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelFinanceiroMouseClicked(evt);
            }
        });

        labelConta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelConta.setText("MEUS DADOS");
        labelConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPlanejamento)
                    .addComponent(labelConta)
                    .addComponent(labelObrigacoes)
                    .addComponent(labelTrabalho)
                    .addComponent(labelEstudo)
                    .addComponent(labelFinanceiro))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetas)
                    .addComponent(labelHobbies)
                    .addComponent(labelHabitos)
                    .addComponent(labelViagens)
                    .addComponent(LabelBlocoDeNotas)
                    .addComponent(labelCalendario))
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetas)
                            .addComponent(labelConta, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPlanejamento)
                            .addComponent(labelHobbies))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTrabalho)
                            .addComponent(labelHabitos))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelViagens)
                                .addGap(18, 18, 18)
                                .addComponent(LabelBlocoDeNotas))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelEstudo)
                                .addGap(21, 21, 21)
                                .addComponent(labelObrigacoes)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFinanceiro)
                            .addComponent(labelCalendario))
                        .addGap(0, 18, Short.MAX_VALUE))))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelFinanceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFinanceiroMouseClicked
           if (Formularios.ListDespesas == null)
            Formularios.ListDespesas = new ListDespesas();

        Formularios.ListDespesas.setVisible(true);
    }//GEN-LAST:event_labelFinanceiroMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBlocoDeNotas;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCalendario;
    private javax.swing.JLabel labelConta;
    private javax.swing.JLabel labelEstudo;
    private javax.swing.JLabel labelFinanceiro;
    private javax.swing.JLabel labelHabitos;
    private javax.swing.JLabel labelHobbies;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelMetas;
    private javax.swing.JLabel labelObrigacoes;
    private javax.swing.JLabel labelPlanejamento;
    private javax.swing.JLabel labelTrabalho;
    private javax.swing.JLabel labelViagens;
    // End of variables declaration//GEN-END:variables
}
