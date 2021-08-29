/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Livros;
import dao.DAORecomendacoes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author natim
 */
public class TelaRecomendacoes extends javax.swing.JFrame {

    /**
     * Creates new form TelaRecomendacoes
     */
    public TelaRecomendacoes(String usuario) {
        super("Recomendacoes");
        initComponents();
        jLabelUsuario.setText(usuario);
        setLocationRelativeTo(null);

        DefaultTableModel modelo = (DefaultTableModel) tabelaRecomendacoes.getModel();

        tabelaRecomendacoes.getColumnModel().getColumn(0);
        tabelaRecomendacoes.getColumnModel().getColumn(1);
        tabelaRecomendacoes.getColumnModel().getColumn(2);

        DAORecomendacoes daoR = new DAORecomendacoes();

        try {
            for (Livros m : daoR.listarRecomendacoes()) {
                modelo.addRow(new Object[]{
                    modelo.getRowCount()+1,
                    m.getNome(),
                    m.getNota(),});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível carregar as músicas!" + e);
        }

    }

    public TelaRecomendacoes() {

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
        voltarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRecomendacoes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 247, 247));

        voltarButton.setBackground(new java.awt.Color(255, 255, 255));
        voltarButton.setForeground(new java.awt.Color(255, 255, 255));
        voltarButton.setIcon(new javax.swing.ImageIcon("D:\\natim\\Desktop\\Estudos\\Desenvolvimento\\BookShelf\\BookShelf\\src\\main\\java\\images\\iconVoltar.png")); // NOI18N
        voltarButton.setBorder(null);
        voltarButton.setBorderPainted(false);
        voltarButton.setContentAreaFilled(false);
        voltarButton.setPressedIcon(new javax.swing.ImageIcon("D:\\natim\\Desktop\\Estudos\\Desenvolvimento\\BookShelf\\BookShelf\\src\\main\\java\\images\\iconVoltarPres.png")); // NOI18N
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\natim\\Desktop\\Estudos\\Desenvolvimento\\BookShelf\\BookShelf\\src\\main\\java\\images\\BookShelf.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabelUsuario.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuario.setText("jLabelUsuario");

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        jLabel2.setText("Usuário:");

        tabelaRecomendacoes.setBackground(new java.awt.Color(255, 255, 255));
        tabelaRecomendacoes.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        tabelaRecomendacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posição", "Nome", "Sua nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRecomendacoes.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tabelaRecomendacoes.setSelectionForeground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(tabelaRecomendacoes);
        if (tabelaRecomendacoes.getColumnModel().getColumnCount() > 0) {
            tabelaRecomendacoes.getColumnModel().getColumn(0).setResizable(false);
            tabelaRecomendacoes.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaRecomendacoes.getColumnModel().getColumn(1).setResizable(false);
            tabelaRecomendacoes.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelaRecomendacoes.getColumnModel().getColumn(2).setResizable(false);
            tabelaRecomendacoes.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 17)); // NOI18N
        jLabel3.setText("Quer saber quais livros te trouxeram mais imersões de experiências?");

        jLabel4.setFont(new java.awt.Font("Poor Richard", 0, 16)); // NOI18N
        jLabel4.setText("Se liga no seu ranking:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(311, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarButton)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(voltarButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabel2))
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

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        String nome = jLabelUsuario.getText();
        TelaMenu viewMenu = new TelaMenu(nome);
        viewMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRecomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRecomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRecomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRecomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRecomendacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRecomendacoes;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}