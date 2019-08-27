/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlinjection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author todescoS
 */
public class Login extends javax.swing.JFrame {

    static Connection conexao;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        eEmail = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eSenha = new javax.swing.JPasswordField();
        btnLimpar = new javax.swing.JButton();
        rbQuestao1 = new javax.swing.JRadioButton();
        rbQuestao2 = new javax.swing.JRadioButton();
        rbQuestao3 = new javax.swing.JRadioButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Senha:");

        jLabel2.setText("E-mail:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("SqlInjection");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbQuestao1);
        rbQuestao1.setSelected(true);
        rbQuestao1.setText("Questão 1");

        buttonGroup1.add(rbQuestao2);
        rbQuestao2.setText("Questão 2");

        buttonGroup1.add(rbQuestao3);
        rbQuestao3.setText("Questão 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(rbQuestao1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addComponent(eEmail)
                            .addComponent(eSenha))
                        .addGap(0, 102, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbQuestao2)
                .addGap(37, 37, 37)
                .addComponent(rbQuestao3)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbQuestao3)
                    .addComponent(rbQuestao2)
                    .addComponent(rbQuestao1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        if (rbQuestao1.isSelected()) {
            this.Questao1();
        } else if (rbQuestao2.isSelected()) {
            this.Questao2();
        } else if (rbQuestao3.isSelected()) {
            this.Questao3();
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void Questao1() {
        try {

            System.out.println("Questão 1");

            String email = eEmail.getText();
            String senha = String.valueOf(eSenha.getPassword());

            String sql = "SELECT * FROM USUARIOS "
                    + "WHERE email = '" + email
                    + "' AND senha = '" + senha + "'";
            System.out.println(sql);

            Statement statement = this.conexao.createStatement();
            ResultSet retorno = statement.executeQuery(sql);

            while (retorno.next()) {
                System.out.println("-----");
                System.out.println("E-mail: " + retorno.getString("email"));
                System.out.println("Nascimento: " + retorno.getString("dt_nasc"));
                System.out.println("Cartão: " + retorno.getString("cartao_credito"));
                System.out.println("-----");
            }

            System.out.println("");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void Questao2() {
        try {

            System.out.println("Questão 2");

            String email = eEmail.getText();
            String senha = String.valueOf(eSenha.getPassword());

            email = email.replace("'", "");
            email = email.replace(";", "");
            email = email.replace("#", "");
            email = email.replace("-", "");
            email = email.replace(" ", "");

            senha = senha.replace("'", "");
            senha = senha.replace(";", "");
            senha = senha.replace("#", "");
            senha = senha.replace("-", "");
            email = email.replace(" ", "");

            String sql = "SELECT * FROM USUARIOS "
                    + "WHERE email = '" + email
                    + "' AND senha = '" + senha + "'";
            System.out.println(sql);

            Statement statement = this.conexao.createStatement();
            ResultSet retorno = statement.executeQuery(sql);

            while (retorno.next()) {
                System.out.println("-----");
                System.out.println("E-mail: " + retorno.getString("email"));
                System.out.println("Nascimento: " + retorno.getString("dt_nasc"));
                System.out.println("Cartão: " + retorno.getString("cartao_credito"));
                System.out.println("-----");
            }

            System.out.println("");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void Questao3() {
        try {

            System.out.println("Questão 3");

            String email = eEmail.getText();
            String senha = String.valueOf(eSenha.getPassword());

            String sql = "SELECT * FROM USUARIOS WHERE email = ? AND senha = ?";
            System.out.println(sql);

            try (PreparedStatement statement = this.conexao.prepareStatement(sql)) {

                statement.setString(1, email);
                statement.setString(2, senha);

                ResultSet retorno = statement.executeQuery();

                while (retorno.next()) {
                    System.out.println("-----");
                    System.out.println("E-mail: " + retorno.getString("email"));
                    System.out.println("Nascimento: " + retorno.getString("dt_nasc"));
                    System.out.println("Cartão: " + retorno.getString("cartao_credito"));
                    System.out.println("-----");
                }
            };

            System.out.println("");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        eEmail.setText("");
        eSenha.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Conecta com o banco de dados
        Conexao con = new Conexao();

        Login.conexao = con.conecta();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField eEmail;
    private javax.swing.JPasswordField eSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton rbQuestao1;
    private javax.swing.JRadioButton rbQuestao2;
    private javax.swing.JRadioButton rbQuestao3;
    // End of variables declaration//GEN-END:variables
}
