package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    // declarar container e componentes
    JFrame janela;
    JButton btCadastro, btCancela;
    JLabel lbTexto, lbNome, lbSenha, lbEstadoCivil, lbGenero;
    JTextField tfNome;
    JPasswordField pfSenha;
    JCheckBox cbEstudante, cbAtleta, cbPcD;
    JRadioButton rbSolteiro, rbCasado, rbDivorciado, rbViuvo;
    ButtonGroup bgEstadoCivil;
    String [] genero = {" --Selecione uma opção--", "Masculino", "Feminino", "Outros"};
    JComboBox cbxGenero;

    // construtor
    public Main() {
        janela = new JFrame("Cadastro de usúario");
        janela.setSize(300, 420); // tamanho janela
        janela.setLocationRelativeTo(null); // centraliza "em partes" DEPENDE
        janela.setLayout(new FlowLayout(1, 20, 10));

        //instaciar os componentes

        btCadastro = new JButton("Cadastrar");
        btCancela = new JButton("Cancelar");
        lbTexto = new JLabel(" ");
        lbNome = new JLabel("Nome:");
        tfNome = new JTextField(20);
        lbSenha = new JLabel("Senha:");
        pfSenha = new JPasswordField(20);
        cbEstudante = new JCheckBox("Estudante");
        cbAtleta = new JCheckBox("Atleta");
        cbPcD = new JCheckBox("PCD");
        lbEstadoCivil = new JLabel("    Estado Civil:");
        rbCasado = new JRadioButton("Casado");
        rbSolteiro = new JRadioButton("Solteiro");
        rbViuvo = new JRadioButton("Viuvo");
        rbDivorciado = new JRadioButton("Divorciado");
        bgEstadoCivil = new ButtonGroup();
        bgEstadoCivil .add(rbCasado);
        bgEstadoCivil .add(rbSolteiro);
        bgEstadoCivil .add(rbDivorciado);
        bgEstadoCivil .add(rbViuvo);
        lbGenero = new JLabel("                    Gênero: ");
        cbxGenero = new JComboBox(genero);

        // add o componente à janela
        janela.add(lbNome);
        janela.add(tfNome);
        janela.add(lbSenha);
        janela.add(pfSenha);
        janela.add(cbEstudante);
        janela.add(cbAtleta);
        janela.add(cbPcD);
        janela.add(lbEstadoCivil);
        janela.add(rbSolteiro);
        janela.add(rbCasado);
        janela.add(rbDivorciado);
        janela.add(rbViuvo);
        janela.add(lbGenero);
        janela.add(cbxGenero);
        janela.add(btCadastro);
        janela.add(btCancela);
        janela.add(lbTexto);

        //adicionar action ao botão
        btCadastro.addActionListener(this);
        btCancela.addActionListener(this);

        // torna a janela visível
        janela.setVisible(true);

        // fecha a janela e encerra o processo
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {

        new Main(); // instanciando a classe Main
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mensagem = "";
        if (e.getSource() == btCadastro){
            mensagem = tfNome.getText();
            if (cbEstudante.isSelected()) {
                mensagem += " - Estudante";
            }
            if (cbAtleta.isSelected()) {
                mensagem += " - Atleta";
            }
            if (cbPcD.isSelected()) {
                mensagem += " - PCD";
            }

            if (rbSolteiro.isSelected()) {
                mensagem += " - Solteiro";
            }
            else if (rbCasado.isSelected()) {
                mensagem += " - Casado";
            }
            else if (rbDivorciado.isSelected()) {
                mensagem += " - Divorciado";
            }
            else if (rbViuvo.isSelected()) {
                mensagem += " - Viuvo";
            }

            mensagem += " - " + cbxGenero.getSelectedItem();
            //lbTexto.setText("\nCadastro realizado com sucesso!"); // altera o lbTexto
            JOptionPane.showMessageDialog(null, mensagem + "\nCadastro realizado com sucesso!"); // aparece um "PopUp" com a mesma msg
        } else if (e.getSource() == btCancela) {
            lbTexto.setText("Cadastro cancelado!");
            tfNome.setText("");
            pfSenha.setText("");
            cbEstudante.setSelected(false);
            cbAtleta.setSelected(false);
            cbPcD.setSelected(false);
            bgEstadoCivil.clearSelection();
            cbxGenero.setSelectedItem(null);
        }
    }
}
