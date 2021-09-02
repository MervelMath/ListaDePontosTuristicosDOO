package Telas;

import Controladores.ControladorPontoTuristico;
import Dominios.PontoTuristico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPrincipal extends javax.swing.JFrame {

    ArrayList<PontoTuristico> listaPontos;
    public static TelaPrincipal instancia;
    ControladorPontoTuristico controlador;

    public TelaPrincipal() {
        initComponents();
        controlador = new ControladorPontoTuristico();
        this.listaPontos = new ArrayList<>();
        try {
            CarregarArrayList();
            CarregarComboBoxPontosTuristicos(listaPontos);
        } catch (Exception ex) {
            //criarArquivoDeExemplo();
            CarregarComboBoxPontosTuristicos(listaPontos);
        }
        instancia = this;
    }

    public void criarArquivoDeExemplo() {
        PontoTuristico pontoTuristico = new PontoTuristico("exemplo", "exemplo", 2);

        listaPontos.add(pontoTuristico);

    }

    public void CarregarComboBoxPontosTuristicos(ArrayList<PontoTuristico> listaPontos) {
        cmbPontosTuristicos.removeAllItems();
        for (PontoTuristico ponto : listaPontos) {
            cmbPontosTuristicos.addItem(ponto.toString());
        }
    }

    private void CarregarArrayList() throws ClassNotFoundException {
        //criarArquivoDeExemplo();
        if (controlador.SelecionarTodos()[0] != null) {
            try {
                listaPontos.addAll(Arrays.asList(controlador.SelecionarTodos()));
            } catch (ClassNotFoundException ex) {
                System.out.println("Erro ao criar lista de pontos turísticos.");

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPontosTuristicos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cmbPontosTuristicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("PONTOS TURÍSTICOS");

        jButton1.setText("VISUALIZAR DETALHES");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        jButton3.setText("Fechar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Reclamações");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(cmbPontosTuristicos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPontosTuristicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        TelaCadastro telaAddPT = new TelaCadastro(listaPontos);
        telaAddPT.setVisible(true);
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        PontoTuristico[] vetorPTuristicos = new PontoTuristico[listaPontos.size()];
        int indice = 0;

        for (PontoTuristico pontos : listaPontos) {
            vetorPTuristicos[indice] = pontos;
            indice++;
        }
        controlador.Inserir(vetorPTuristicos);
    }//GEN-LAST:event_formWindowClosing

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        PontoTuristico[] vetorPTuristicos = new PontoTuristico[listaPontos.size()];
        int indice = 0;

        for (PontoTuristico pontos : listaPontos) {
            vetorPTuristicos[indice] = pontos;
            indice++;
        }
        controlador.Inserir(vetorPTuristicos);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        PontoTuristico pontoTuristico = null;

        for (PontoTuristico pontoTEncontrado : listaPontos) {
            if (pontoTEncontrado.getNome() == cmbPontosTuristicos.getSelectedItem()) {
                pontoTuristico = pontoTEncontrado;
            }
        }
        TelaDetalhes telaDetalhes = new TelaDetalhes(pontoTuristico);
        telaDetalhes.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        PontoTuristico pontoTuristico = null;

        for (PontoTuristico pontoTEncontrado : listaPontos) {
            if (pontoTEncontrado.getNome() == cmbPontosTuristicos.getSelectedItem()) {
                pontoTuristico = pontoTEncontrado;
            }
        }

        TelaReclamacao telaReclamacao = new TelaReclamacao(pontoTuristico);
        telaReclamacao.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cmbPontosTuristicos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
