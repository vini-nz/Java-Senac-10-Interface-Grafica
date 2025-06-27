package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaMix implements ActionListener {
    JFrame janela;
    JButton btInicio, btQmSomos, btContato, btMapa, btSair, btCentro;

    public JanelaMix() {
        janela = new JFrame("Modelo Layout Misto");
        janela.setSize(450, 200); // tamanho janela
        janela.setLocationRelativeTo(null); // centraliza "em partes" DEPENDE
        janela.getContentPane().setBackground(Color.lightGray);

        Container container = janela.getContentPane();
        container.setLayout(new BorderLayout(10,10));

        Container container2 = new JPanel();
        container2.setLayout(new GridLayout(1,5,2,2));

        // instanciar componentes
        btCentro = new JButton("<html><h1 Style=color:#0000FF;" +
                "background:black;font-family:Jokerman;'>" +
                "Centro</h1></html>");
        btInicio = new JButton("Inicio");
        btQmSomos = new JButton("Quem Somos");
        btContato = new JButton("Contato");
        btMapa = new JButton("Mapa");
        btSair = new JButton("Saír");

        // add os componentes no container 2
        container2.add(btInicio);
        container2.add(btQmSomos);
        container2.add(btContato);
        container2.add(btMapa);
        container2.add(btSair);
        // add o container 2 ao container
        container.add(container2, "North");
        container.add(btCentro, "Center");

        // add action ao botão
        btCentro.addActionListener(this);
        btInicio.addActionListener(this);
        btQmSomos.addActionListener(this);
        btContato.addActionListener(this);
        btMapa.addActionListener(this);
        btSair.addActionListener(this);

        // torna a janela visível
        janela.setVisible(true);
        // fecha a janela e encerra o processo
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mensagem = "";
        int opcao = 0;
        if (e.getSource() == btInicio) {
            mensagem = "Botão cadastrar";
        } else if (e.getSource() == btCentro) {
            mensagem = "Botão centro";
        } else if (e.getSource() == btQmSomos) {
            mensagem = "Botão quem somos";
        } else if (e.getSource() == btContato) {
            mensagem = "Botão Contato";
        } else if (e.getSource() == btMapa) {
            mensagem = "Botão mapa";
        } else if (e.getSource() == btSair) {
            opcao = JOptionPane.showConfirmDialog(null,
                    "Deseja realmente sair?", "ENCERRAR PROCESSO",0,3);
            if (opcao == 0) {
                janela.setVisible(false);
                mensagem = "Processo Finalizado!";
            }
        }
        if (opcao != 1) {
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}