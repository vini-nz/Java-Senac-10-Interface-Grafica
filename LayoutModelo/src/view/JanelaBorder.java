package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaBorder implements ActionListener {
    JFrame janela;
    JButton btCadastro, btConsultar, btAlterar, btDeletar, btSair;

    public JanelaBorder(){
        janela = new JFrame("Layout Border | Botões");
        janela.setSize(300, 200); // tamanho janela
        janela.setLocationRelativeTo(null); // centraliza "em partes" DEPENDE
        janela.getContentPane().setBackground(Color.lightGray);
        janela.setLayout(new BorderLayout(10,10));

        // instanciar componentes
        btCadastro = new JButton("Cadastro");
        btAlterar = new JButton("Alterar");
        btConsultar = new JButton("Consutar");
        btDeletar = new JButton("Deletar");
        btSair = new JButton("Sair");

        // add os componentes a janela
        janela.add("North",btCadastro);
        janela.add("West",btAlterar);
        janela.add("Center",btConsultar);
        janela.add("East",btDeletar);
        janela.add("South",btSair);

        // estilização dos componentes (Cor e fonte)
        btSair.setBackground(new Color(165, 36, 36).brighter());
        btSair.setFont(new Font("Jokerman",Font.BOLD,18));
        btSair.setForeground(Color.WHITE);


        // add action ao botão
        btCadastro.addActionListener(this);
        btAlterar.addActionListener(this);
        btConsultar.addActionListener(this);
        btDeletar.addActionListener(this);
        btSair.addActionListener(this);

        // torna a janela visível
        janela.setVisible(true);
        // fecha a janela e encerra o processo
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mensagem = "";
        if (e.getSource() == btCadastro) {
            mensagem = "Botão cadastrar";
        } else if (e.getSource() == btAlterar) {
            mensagem = "Botão alterar";
        } else if (e.getSource() == btConsultar) {
            mensagem = "Botão consultar";
        } else if (e.getSource() == btDeletar) {
            mensagem = "Botão deletar";
        } else if (e.getSource() == btSair) {
            mensagem = "Processo finalizado!";
            JOptionPane.showMessageDialog(null, mensagem);
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
