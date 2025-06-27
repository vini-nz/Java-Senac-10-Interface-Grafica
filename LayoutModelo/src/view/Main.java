package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JFrame janela;
    JMenuItem jmiFlow, jmiBorder, jmiGrid, jmiMix, jmiExit;

    // construtor
    public Main() {
        janela = new JFrame("Modelo de Layouts");
        janela.setSize(400, 150);
        janela.setLocationRelativeTo(null);

        // barra de menu
        JMenuBar jmBar = new JMenuBar();
        jmBar.setBackground(new Color(147, 92, 56));
        janela.setJMenuBar(jmBar);

        // instanciar o menu
        JMenu jmLayout = new JMenu("Layouts");
        JMenu jmSair = new JMenu("Sair");
        jmiBorder = new JMenuItem("Border");
        jmiFlow = new JMenuItem("Flow");
        jmiGrid = new JMenuItem("Grid");
        jmiMix = new JMenuItem("Mix");
        jmiExit = new JMenuItem("Finalizar");

        // adicionar o menu a Barra de menu
        jmBar.add(jmLayout);
        jmBar.add(jmSair);
        // adicionar os itens aos respctivos menus
        jmLayout.add(jmiFlow);
        jmLayout.add(jmiBorder);
        jmLayout.add(jmiGrid);
        jmLayout.add(jmiMix);
        jmSair.add(jmiExit);

        // adicionar ação ao item do Menu
        jmiExit.addActionListener(this);
        jmiFlow.addActionListener(this);
        jmiBorder.addActionListener(this);
        jmiGrid.addActionListener(this);
        jmiMix.addActionListener(this);

        // torna a janela visivel
        janela.setVisible(true);

        // ao fechar a janela, encerra o processo
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jmiExit) {
            System.exit(0);
        } else if (e.getSource() == jmiFlow) {
            new JanelaFlow();
        }else if (e.getSource() == jmiBorder) {
            new JanelaBorder();
        } else if (e.getSource() == jmiGrid) {
            new JanelaGrid();
        } else if (e.getSource() == jmiMix) {
            new JanelaMix();
        }
    }
}
