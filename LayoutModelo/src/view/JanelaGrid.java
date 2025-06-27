package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaGrid implements ActionListener {
    JFrame janela;
    JButton btJogos, btFilmes, btSair, btSeries, btNovelas, btAnimes;

    public JanelaGrid() {
        janela = new JFrame("Layout Grid | Botôes");
        janela.setSize(300, 200); // tamanho janela
        janela.setLocationRelativeTo(null); // centraliza "em partes" DEPENDE
        janela.getContentPane().setBackground(Color.lightGray);
        janela.setLayout(new GridLayout(2,3,5,5));

        // instanciar componentes
        btFilmes = new JButton("Filmes");
        btJogos = new JButton("Jogos");
        btSeries = new JButton("Séries");
        btNovelas = new JButton("Novelas");
        btAnimes = new JButton("Animes");
        btSair = new JButton("Saír");

        // add os componentes a janela
        janela.add(btJogos);
        janela.add(btFilmes);
        janela.add(btSeries);
        janela.add(btNovelas);
        janela.add(btAnimes);
        janela.add(btSair);

        // estilização dos componentes (Cor e fonte)
        btSair.setBackground(new Color(188, 164, 25).brighter());
        btSair.setFont(new Font("Arial",Font.BOLD,15));
        btSair.setForeground(Color.WHITE);
        btJogos.setBackground(new Color(140, 87, 53).brighter());
        btJogos.setFont(new Font("Arial",Font.BOLD,15));
        btJogos.setForeground(Color.WHITE);

        // add action ao botão
        btJogos.addActionListener(this);
        btFilmes.addActionListener(this);
        btSeries.addActionListener(this);
        btNovelas.addActionListener(this);
        btAnimes.addActionListener(this);
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
        if (e.getSource() == btJogos) {
            mensagem = "Botão jogos";
        } else if (e.getSource() == btFilmes) {
            mensagem = "Botão filmes";
        } else if (e.getSource() == btSeries) {
            mensagem = "Botão séries";
        } else if (e.getSource() == btNovelas) {
            mensagem = "Botão novelas";
        } else if (e.getSource() == btAnimes) {
            mensagem = "Botão animes";
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
