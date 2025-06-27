package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaFlow implements ActionListener {
    JFrame janela;
    JLabel lbValor, lbTexto;
    JTextField tfValor;
    JButton btCalcular;

    public JanelaFlow() {
        janela = new JFrame("Layout Flow | Calc Expert");
        janela.setSize(300, 150); // tamanho janela
        janela.setLocationRelativeTo(null); // centraliza "em partes" DEPENDE
        janela.getContentPane().setBackground(Color.lightGray);
        janela.setLayout(new FlowLayout(1, 10, 10));

        // instanciar componentes
        lbValor = new JLabel("Valor:");
        lbTexto = new JLabel("O valor calculado com juros é: ");
        tfValor = new JTextField(20);
        btCalcular = new JButton("Calcular");

        // add os componentes a janela
        janela.add(lbValor);
        janela.add(tfValor);
        janela.add(btCalcular);
        janela.add(lbTexto);

        // add action ao botão
        btCalcular.addActionListener(this);

        // torna a janela visível
        janela.setVisible(true);
        // fecha a janela e encerra o processo
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String resultado = "";
        if (e.getSource() == btCalcular){
            double juros = Double.parseDouble(tfValor.getText()) * 0.16;

            resultado += String.format("%.2f",juros);
            lbTexto.setText(resultado);
        }
    }
}