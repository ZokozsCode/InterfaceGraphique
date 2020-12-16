package com.company;

import javax.swing.*;
import java.awt.*;

public class Biblio extends JFrame {

    public Biblio(){
         super("Bibliotheque");
         setSize(500,500);

         JPanel monPanel = new JPanel();
         this.setContentPane(monPanel);
         monPanel.setBackground(Color.LIGHT_GRAY);
         JMenuBar monMenuBarr = new JMenuBar();
         this.setJMenuBar(monMenuBarr);

        GridBagLayout monLayout = new GridBagLayout();
        monPanel.setLayout(monLayout);

         //menu du Panel
         JMenu fileJMenu = new JMenu();
         fileJMenu.setText("Fichier");
         monMenuBarr.add(fileJMenu);

        JMenu EditJMenu = new JMenu();
        EditJMenu.setText("Editer");
        monMenuBarr.add(EditJMenu);

        JMenu AboutJMenu = new JMenu();
        AboutJMenu.setText("A Propos");
        monMenuBarr.add(AboutJMenu);
//menu deroulant 
        JMenuItem sous1 = new JMenuItem("Ouvrir");
        JMenuItem sous2 = new JMenuItem("Quitter");
        fileJMenu.add(sous1);
        fileJMenu.add(sous2);


        //Tableau
        JTable monTable = new JTable();








        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // ferme le Jframe quand on met la croix rouge
    }



}
