/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Visao;

import com.mycompany.Dao.DaoPessoa;
import com.mycompany.Ferramentas.DadosTemporarios;
import com.mycompany.Ferramentas.Formularios;
import com.mycompany.Modelo.ModPessoa;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mileny.1948
 */
public class ListMeusDados extends javax.swing.JFrame {

    /**
     * Creates new form ListMeusDados
     */
    public ListMeusDados() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();;
    }
    
    void listarTodos(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, endereco, cidade, estado, email, telefone});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
     
    private void listarPorNome(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarPorNome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, telefone, email, endereco, cidade, estado});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    private void listarPorSobrenome(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarPorSobrenome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, telefone, email, endereco, cidade, estado});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    private void listarPorCpf(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarPorCpf(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, telefone, email, endereco, cidade, estado});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
     
    private void listarPorDataDeNascimento(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarPorDataDeNascimento(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, telefone, email, endereco, cidade, estado});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
      
    private void listarPorGenero(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarPorGenero(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, telefone, email, endereco, cidade, estado});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    private void listarPorEndereco(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarPorEndereco(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, telefone, email, endereco, cidade, estado});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
        
    private void listarPorCidade(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarPorCidade(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, telefone, email, endereco, cidade, estado});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
             
   private void listarPorEstado(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarPorEstado(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, telefone, email, endereco, cidade, estado});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
   
   private void listarPorEmail(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarPorEmail(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, telefone, email, endereco, cidade, estado});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
   
     private void listarPorTelefone(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            ResultSet resultSet = daoPessoa.listarPorTelefone(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String dataDeNascimento = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String endereco = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String estado = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, cpf, dataDeNascimento, genero, telefone, email, endereco, cidade, estado});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
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
        tablePessoa = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("MEUS DADOS");

        tablePessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "CPF", "Data de nascimento", "Genero", "Endereço", "Cidade", "Estado", "E-Mail", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePessoa);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("BUSCAR DADOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionar.setText("ADICIONAR DADOS");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nome", "Sobrenome", "Cpf", "Data de Nascimento", "Genero", "Endereco", "Cidade", "Estado", "E-Mail", "Telefone" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfFiltro)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
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
        if (Formularios.MeusDados == null);
            Formularios.MeusDados = new MeusDados();

        Formularios.MeusDados.setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void tablePessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePessoaMouseClicked
        try{
            if (evt.getClickCount() == 2){
 
                ModPessoa modPessoa = new ModPessoa();
 
                modPessoa.setId(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 0))));
                modPessoa.setNome(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 1)));
                modPessoa.setSobrenome(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 2)));
                modPessoa.setCpf(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 3)));
                modPessoa.setDataDeNascimento(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 4)));
                modPessoa.setGenero(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 5)));
                modPessoa.setEndereco(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 6)));
                modPessoa.setCidade(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 7)));
                modPessoa.setEstado(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 8)));
                modPessoa.setEmail(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 9)));
                modPessoa.setTelefone(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 10)));

                DadosTemporarios.tempObject = (ModPessoa) modPessoa;
                
                MeusDados meusDados = new MeusDados();
                meusDados.setVisible(true);
            }
        }catch(Exception e ){
              System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tablePessoaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorNome();
                break;
            case 2:
                listarPorSobrenome();
                break;
            case 3:
                listarPorCpf();
                break;
            case 4:
                listarPorDataDeNascimento();
                break;
            case 5:
                listarPorGenero();
                break;
            case 6:
                listarPorEndereco();
                break;
            case 7:
                listarPorCidade();
                break;
            case 8:
                listarPorEstado();
                break;
            case 9:
                listarPorEmail();
                break;
            case 10:
                listarPorTelefone();
                break; // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
}
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
            java.util.logging.Logger.getLogger(ListMeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListMeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListMeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListMeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListMeusDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tablePessoa;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
