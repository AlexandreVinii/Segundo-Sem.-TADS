/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Ale;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author alexandre.vfsilva
 */
public class Main {
    public static void main(String[] args) {
        Thread t = new Thread ();
        SwingUtilities.invokeLater(t);
        
        
    }
    
    public static void criarGUI (){
        JFrame tela = new JFrame ();
        
        // Tamanho da Tela/Janela/programa
        Dimension d = new Dimension (800, 600);
        tela.setMinimumSize (d);
       
        //Fecha a Janela no Botão 'X'
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Titulo escrito
        tela.setTitle("Swing App 02");
        
        JPanel panel = new JPanel ();
        tela.getContentPane().add(panel);
        
                
        //Cria e mostra na tela o label
        JLabel label = new JLabel ("Hello World!");
        panel.add(label);
        
        //Caixa de Texto
        JTextField field = new JTextField (20);
        panel.add(field);
        
        JButton button = new JButton ("Leandro");
        panel.add(button);
        JButton button2 = new JButton ("Yamamoto");
        panel.add(button2);
        
        //JOptionPane caixa de diálogo ao clicar no botão
        TestActionListener listener = new TestActionListener();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(tela, "Pau no seu cu");
            }
        });
        
                //Check Box
        JCheckBox checkBox01 = new JCheckBox ("Item do Caralho"); 
        JCheckBox checkBox02 = new JCheckBox ("Item do Caralho2"); 
        panel.add(checkBox01);
        panel.add(checkBox02);
                
       checkBox01.addItemListener ( new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
               JOptionPane.showMessageDialog(tela,
"Item 01 Selecionado: " + checkBox01.isSelected() +
"\nItem 02 Selecionado: " + checkBox02.isSelected());
            }
            
        });
        
        tela.pack();
        tela.setVisible(true);
    }
}
