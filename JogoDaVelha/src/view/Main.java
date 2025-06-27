package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JFrame janela;
    JButton bt11, bt12, bt13,
            bt21, bt22, bt23,
            bt31, bt32, bt33;
    public Main() {
        janela = new JFrame("Jogo da Veínha");
        janela.setSize(300, 300);
        janela.setLocationRelativeTo(null);
        janela.setBackground(Color.darkGray);

        Container container = new JPanel();
        container.setLayout(new GridLayout(3,3,2,2));
        container.setBackground(Color.darkGray);


        bt11 = new JButton(""); bt12 = new JButton(""); bt13 = new JButton("");
        bt21 = new JButton(""); bt22 = new JButton(""); bt23 = new JButton("");
        bt31 = new JButton(""); bt32 = new JButton(""); bt33 = new JButton("");

        container.add(bt11); container.add(bt12); container.add(bt13);
        container.add(bt21); container.add(bt22); container.add(bt23);
        container.add(bt31); container.add(bt32); container.add(bt33);

        // add ação ao botao
        bt11.addActionListener(this); bt12.addActionListener(this); bt13.addActionListener(this);
        bt21.addActionListener(this); bt22.addActionListener(this); bt23.addActionListener(this);
        bt31.addActionListener(this); bt32.addActionListener(this); bt33.addActionListener(this);

        janela.add(container);
        // torna a janela visivel
        janela.setVisible(true);
        // ao fechar a janela, encerra o processo
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }

    public String verificaOpcao (int opcao) {
        String resultado = "";
        switch (opcao) {
            case 0:
                resultado = "<html><h1> X </h1></html>";
                break;
            case 1:
                resultado = "<html><h1 style='color:red;'> O </h1></html>";
                break;
        }
        return resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String [] botoes  ={ "X", " O"};
        int opcao = 0;
        // lógica
        if (e.getSource() == bt11) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "JOGO DA VELHA", 0, 3, null, botoes, 0);
            bt11.setText(verificaOpcao(opcao));
        } else if (e.getSource() == bt12) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "JOGO DA VELHA", 0, 3, null, botoes, 0);
            bt12.setText(verificaOpcao(opcao));
        } else if (e.getSource() == bt13) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "JOGO DA VELHA", 0, 3, null, botoes, 0);
            bt13.setText(verificaOpcao(opcao));
        } else if (e.getSource() == bt21) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "JOGO DA VELHA", 0, 3, null, botoes, 0);
            bt21.setText(verificaOpcao(opcao));
        } else if (e.getSource() == bt22) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "JOGO DA VELHA", 0, 3, null, botoes, 0);
            bt22.setText(verificaOpcao(opcao));
        } else if (e.getSource() == bt23) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "JOGO DA VELHA", 0, 3, null, botoes, 0);
            bt23.setText(verificaOpcao(opcao));
        } else if (e.getSource() == bt31) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "JOGO DA VELHA", 0, 3, null, botoes, 0);
            bt31.setText(verificaOpcao(opcao));
        } else if (e.getSource() == bt32) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "JOGO DA VELHA", 0, 3, null, botoes, 0);
            bt32.setText(verificaOpcao(opcao));
        } else if (e.getSource() == bt33) {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "JOGO DA VELHA", 0, 3, null, botoes, 0);
            bt33.setText(verificaOpcao(opcao));
        }
        String winner = "";
        if ((bt11.getText() == bt12.getText() && bt12.getText() == bt13.getText() && bt11.getText() !="") ||
            (bt12.getText() == bt22.getText() && bt22.getText() == bt32.getText() && bt12.getText() !="")){
            winner = bt12.getText();
        } else if ( (bt11.getText() == bt21.getText() && bt21.getText() == bt31.getText() && bt11.getText() !="") ||
                    (bt11.getText() == bt22.getText() && bt22.getText() == bt33.getText() && bt11.getText() !="")){
            winner = bt11.getText();
        } else if ( (bt13.getText() == bt23.getText() && bt23.getText() == bt33.getText() && bt13.getText() !="") ||
                    (bt13.getText() == bt22.getText() && bt22.getText() == bt31.getText() && bt13.getText() !="")){
            winner = bt13.getText();
        } else if ( (bt21.getText() == bt22.getText() && bt22.getText() == bt23.getText() && bt21.getText() !="")){
            winner = bt21.getText();
        } else if ( (bt31.getText() == bt32.getText() && bt32.getText() == bt33.getText() && bt31.getText() !="")) {
            winner = bt31.getText();
        }
        if (winner != "") {
            JOptionPane.showMessageDialog(null, "PARABÉNS" + winner + "ganhou!! Parabéns");
            System.exit(0);
        }
    }
}