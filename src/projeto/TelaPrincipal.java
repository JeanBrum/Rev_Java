/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import static projeto.Funcoes.validar;

/**
 *
 * @author jonasdhein
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Pessoa pessoa1;
    Pessoa pessoa2;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        pessoa1 = new Pessoa();
        pessoa2 = new Pessoa();
        
        pessoa1.setCodigo(1);
        pessoa1.setNome("Juca");
        pessoa1.setEndereco("Lajeado");
        pessoa1.setTelefone("190");
        pessoa1.setValorConta(500);
        pessoa1.setChequeEspecial(200);
        
        pessoa2.setCodigo(2);
        pessoa2.setNome("João");
        pessoa2.setValorConta(1000);
        pessoa2.setChequeEspecial(100);
        
        //String.valueOf() <= Converte qualquer coisa para String
        lblNome1.setText(pessoa1.getNome());
        lblValor1.setText(String.valueOf(pessoa1.getValorConta()));
        lblChequeEspecial1.setText(String.valueOf(pessoa1.getChequeEspecial()));
        
        lblNome2.setText(pessoa2.getNome());
        lblValor2.setText(String.valueOf(pessoa2.getValorConta()));
        lblChequeEspecial2.setText(String.valueOf(pessoa2.getChequeEspecial()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTransfere1 = new javax.swing.JButton();
        lblNome1 = new javax.swing.JLabel();
        lblValor1 = new javax.swing.JLabel();
        lblChequeEspecial1 = new javax.swing.JLabel();
        btnTransfere2 = new javax.swing.JButton();
        lblNome2 = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        lblChequeEspecial2 = new javax.swing.JLabel();
        txtTransferencia2 = new javax.swing.JTextField();
        txtTransferencia1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTransfere1.setText("Transfere");
        btnTransfere1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfere1ActionPerformed(evt);
            }
        });

        lblNome1.setText("Nome");

        lblValor1.setText("jLabel1");

        lblChequeEspecial1.setText("jLabel1");

        btnTransfere2.setText("Transfere");
        btnTransfere2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfere2ActionPerformed(evt);
            }
        });

        lblNome2.setText("Nome 2");

        lblValor2.setText("jLabel1");

        lblChequeEspecial2.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChequeEspecial1)
                            .addComponent(lblValor1)
                            .addComponent(lblNome1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtTransferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransfere1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTransferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblChequeEspecial2)
                        .addComponent(lblValor2)
                        .addComponent(lblNome2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransfere2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblChequeEspecial1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTransfere1)
                            .addComponent(txtTransferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblChequeEspecial2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTransfere2)
                            .addComponent(txtTransferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransfere1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfere1ActionPerformed
        try{
            double transf = Double.parseDouble(txtTransferencia1.getText());
            lblValor1.setText(String.valueOf(pessoa1.getValorConta()));
            lblValor2.setText(String.valueOf(pessoa2.getValorConta()));
            
            if(pessoa1.credito(transf) == true){
                pessoa2.debito(transf);
                txtTransferencia1.setText("0");
            } else {
                validar();
            }
            
            
        
        }catch(Exception ex){
            validar();
            txtTransferencia1.setText("0");
        }
        
    }//GEN-LAST:event_btnTransfere1ActionPerformed

    private void btnTransfere2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfere2ActionPerformed
        try{
            double transf = Double.parseDouble(txtTransferencia2.getText());
            lblValor1.setText(String.valueOf(pessoa1.getValorConta()));
            lblValor2.setText(String.valueOf(pessoa2.getValorConta()));
            
            if(pessoa2.credito(transf) == true){
                pessoa1.debito(transf);
                txtTransferencia2.setText("0");
            } else {
                validar();
            }
            
            
        
        }catch(Exception ex){
            validar();
            txtTransferencia2.setText("0");
        }
    }//GEN-LAST:event_btnTransfere2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransfere1;
    private javax.swing.JButton btnTransfere2;
    private javax.swing.JLabel lblChequeEspecial1;
    private javax.swing.JLabel lblChequeEspecial2;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JTextField txtTransferencia1;
    private javax.swing.JTextField txtTransferencia2;
    // End of variables declaration//GEN-END:variables
}
