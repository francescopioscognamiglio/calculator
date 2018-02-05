/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;

/**
 *
 * @author AntoFra
 */

public class Windows implements ActionListener, WindowListener, MouseListener {
    
    Calculator calcolo = new Calculator ();
    JFrame f = new JFrame ("Calcolatrice");
    JPanel p = new JPanel ();
    JTextField l_out = new JTextField (10);
    JLabel b_op1 = new JLabel ("   +  ");
    JLabel b_op2 = new JLabel ("   -  ");
    JLabel b_op3 = new JLabel ("   x  ");
    JLabel b_op4 = new JLabel ("   /  ");
    JLabel b_op5 = new JLabel ("   =  ");
    JLabel b_n0 = new JLabel ("  0  ");
    JLabel b_n1 = new JLabel ("  1  ");
    JLabel b_n2 = new JLabel ("  2  ");
    JLabel b_n3 = new JLabel ("  3  ");
    JLabel b_n4 = new JLabel ("  4  ");
    JLabel b_n5 = new JLabel ("  5  ");
    JLabel b_n6 = new JLabel ("  6  ");
    JLabel b_n7 = new JLabel ("  7  ");
    JLabel b_n8 = new JLabel ("  8  ");
    JLabel b_n9 = new JLabel ("  9  ");
    JLabel b_virgola = new JLabel ("    .    ");
    JLabel b_canc = new JLabel ("   Canc    ");
    
    JMenuBar bar = new JMenuBar ();
    JMenu menu = new JMenu ();
    JMenu menu1 = new JMenu ("Info");
    JMenu menu_change = new JMenu ("Cambia colore");
    JMenu menu_change1 = new JMenu ("Risultato");
    JMenu menu_change1_1 = new JMenu ("Sfondo");
    JMenu menu_change1_2 = new JMenu ("Bordo");
    JMenu menu_change1_3 = new JMenu ("Testo");
    JMenu menu_change2 = new JMenu ("Calcolatrice");
    JMenu menu_change2_1 = new JMenu ("Sfondo");
    JMenu menu_change2_2 = new JMenu ("Bordo");
    JMenu menu_change2_3 = new JMenu ("Testo");
    JMenu menu_change2_4 = new JMenu ("Pressione");
    
    
    GridBagLayout layout = new GridBagLayout ();
    GridBagConstraints g = new GridBagConstraints ();
    
    boolean control;
    boolean control_num;
    boolean control_op;
    boolean control_op_2;
    boolean control_op_3;
    boolean control_virgola;
    boolean control_virgola2;
    boolean control_op5;
    boolean control_op6;
    boolean control_op7=false;
    int cont_op;
    int cont_op2;
    int cont = 0;
    
    Border bordo;
    Border bordo2 = BorderFactory.createLineBorder(Color.green);
    
    JFrame f2 = new JFrame ();
    JColorChooser color_choose = new JColorChooser ();
    Color color;
    
    public Windows(){
        
        Image im = Toolkit.getDefaultToolkit().getImage("C:\\Calculator\\icona_frame.gif");
        f.setIconImage(im);
        f.addWindowListener(this);
        f.setBounds(500, 500, 450, 450);
        
        p.setLayout(layout);
        p.setBackground(Color.black);
        bordo = BorderFactory.createLineBorder(Color.BLUE, 5);
        p.setBorder(bordo);
        
        
        bar.setBackground(Color.black);
        menu.setIcon(new ImageIcon ("C:\\Calculator\\icona.png"));
        menu.setCursor(new Cursor(12));
        menu1.setForeground(Color.MAGENTA);
        menu1.addMouseListener(this);
        menu1.setCursor(new Cursor(12));
        menu_change.setForeground(Color.MAGENTA);
        menu_change.addMouseListener(this);
        menu_change.setCursor(new Cursor(12));
        menu_change1.setForeground(Color.MAGENTA);
        menu_change1.addMouseListener(this);
        menu_change1.setCursor(new Cursor(12));
        menu_change1_1.setForeground(Color.MAGENTA);
        menu_change1_1.addMouseListener(this);
        menu_change1_1.setCursor(new Cursor(12));
        menu_change1_2.setForeground(Color.MAGENTA);
        menu_change1_2.addMouseListener(this);
        menu_change1_2.setCursor(new Cursor(12));
        menu_change1_3.setForeground(Color.MAGENTA);
        menu_change1_3.addMouseListener(this);
        menu_change1_3.setCursor(new Cursor(12));
        menu_change2.setForeground(Color.MAGENTA);
        menu_change2.addMouseListener(this);
        menu_change2.setCursor(new Cursor(12));
        menu_change2_1.setForeground(Color.MAGENTA);
        menu_change2_1.addMouseListener(this);
        menu_change2_1.setCursor(new Cursor(12));
        menu_change2_2.setForeground(Color.MAGENTA);
        menu_change2_2.addMouseListener(this);
        menu_change2_2.setCursor(new Cursor(12));
        menu_change2_3.setForeground(Color.MAGENTA);
        menu_change2_3.addMouseListener(this);
        menu_change2_3.setCursor(new Cursor(12));
        menu_change2_4.setForeground(Color.MAGENTA);
        menu_change2_4.addMouseListener(this);
        menu_change2_4.setCursor(new Cursor(12));
        
        l_out.setEditable(false);
        l_out.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 20));
        l_out.setBackground(Color.white);
        bordo = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5);
        l_out.setBorder(bordo);
        bordo = BorderFactory.createLineBorder(Color.green, 1);
        b_op1.addMouseListener(this);
        b_op1.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 35));
        b_op1.setCursor(new Cursor(12));
        //b_op1.setBorder(bordo);
        b_op2.addMouseListener(this);
        b_op2.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 41));
        b_op2.setCursor(new Cursor(12));
        //b_op2.setBorder(bordo);
        b_op3.addMouseListener(this);
        b_op3.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_op3.setCursor(new Cursor(12));
        //b_op3.setBorder(bordo);
        b_op4.addMouseListener(this);
        b_op4.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 40));
        b_op4.setCursor(new Cursor(12));
        //b_op4.setBorder(bordo);
        b_op5.addMouseListener(this);
        b_op5.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 41));
        b_op5.setCursor(new Cursor(12));
        //b_op5.setBorder(bordo);
        b_n0.addMouseListener(this);
        b_n0.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_n0.setCursor(new Cursor(12));
        //b_n0.setBorder(bordo);
        b_n1.addMouseListener(this);
        b_n1.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_n1.setCursor(new Cursor(12));
        //b_n1.setBorder(bordo);
        b_n2.addMouseListener(this);
        b_n2.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_n2.setCursor(new Cursor(12));
        //b_n2.setBorder(bordo);
        b_n3.addMouseListener(this);
        b_n3.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_n3.setCursor(new Cursor(12));
        //b_n3.setBorder(bordo);
        b_n4.addMouseListener(this);
        b_n4.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_n4.setCursor(new Cursor(12));
        //b_n4.setBorder(bordo);
        b_n5.addMouseListener(this);
        b_n5.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_n5.setCursor(new Cursor(12));
        //b_n5.setBorder(bordo);
        b_n6.addMouseListener(this);
        b_n6.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_n6.setCursor(new Cursor(12));
        //b_n6.setBorder(bordo);
        b_n7.addMouseListener(this);
        b_n7.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_n7.setCursor(new Cursor(12));
        //b_n7.setBorder(bordo);
        b_n8.addMouseListener(this);
        b_n8.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_n8.setCursor(new Cursor(12));
        //b_n8.setBorder(bordo);
        b_n9.addMouseListener(this);
        b_n9.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 42));
        b_n9.setCursor(new Cursor(12));
        //b_n9.setBorder(bordo);
        b_virgola.addMouseListener(this);
        b_virgola.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 34));
        b_virgola.setCursor(new Cursor(12));
        //b_virgola.setBorder(bordo);
        b_canc.addMouseListener(this);
        b_canc.setFont(new Font(" ", Font.LAYOUT_NO_LIMIT_CONTEXT, 35));
        b_canc.setCursor(new Cursor(12));
        //b_canc.setBorder(bordo);
        
        f.add(p);
        /*
        f.add(l_out, "North");
        p.add(b_n7);
        p.add(b_n8);
        p.add(b_n9);
        p.add(b_op4);
        p.add(b_n4);
        p.add(b_n5);
        p.add(b_n6);
        p.add(b_op3);
        p.add(b_n1);
        p.add(b_n2);
        p.add(b_n3);
        p.add(b_op2);
        p.add(b_virgola);
        p.add(b_n0);
        p.add(b_op5);
        p.add(b_op1);
        f.add(b_canc, "South");
        */
        
        f.setJMenuBar(bar);
        bar.add(menu);
        menu.add(menu_change);
        menu.add(menu1);
        menu_change.add(menu_change1);
        menu_change.add(menu_change2);
        menu_change1.add(menu_change1_1);
        menu_change1.add(menu_change1_2);
        menu_change1.add(menu_change1_3);
        menu_change2.add(menu_change2_1);
        menu_change2.add(menu_change2_2);
        menu_change2.add(menu_change2_3);
        menu_change2.add(menu_change2_4);
        
        f.add(l_out, "North");
        
        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 2;
        g.gridheight = 1;
        
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_canc, g);
        p.add(b_canc);
        
        g.gridx = 2;
        g.gridy = 0;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_virgola, g);
        p.add(b_virgola);
        
        g.gridx = 3;
        g.gridy = 0;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_op1, g);
        p.add(b_op1);
        
        g.gridx = 3;
        g.gridy = 1;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_op2, g);
        p.add(b_op2);
        
        g.gridx = 3;
        g.gridy = 2;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_op3, g);
        p.add(b_op3);
        
        g.gridx = 3;
        g.gridy = 3;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_op4, g);
        p.add(b_op4);
        
        g.gridx = 3;
        g.gridy = 4;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_op5, g);
        p.add(b_op5);
        
        g.gridx = 1;
        g.gridy = 4;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_n0, g);
        p.add(b_n0);
        
        g.gridx = 0;
        g.gridy = 1;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_n1, g);
        p.add(b_n1);
        
        g.gridx = 1;
        g.gridy = 1;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_n2, g);
        p.add(b_n2);
        
        g.gridx = 2;
        g.gridy = 1;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_n3, g);
        p.add(b_n3);
        
        g.gridx = 0;
        g.gridy = 2;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_n4, g);
        p.add(b_n4);
        
        g.gridx = 1;
        g.gridy = 2;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_n5, g);
        p.add(b_n5);
        
        g.gridx = 2;
        g.gridy = 2;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_n6, g);
        p.add(b_n6);
        
        g.gridx = 0;
        g.gridy = 3;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_n7, g);
        p.add(b_n7);
        
        g.gridx = 1;
        g.gridy = 3;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_n8, g);
        p.add(b_n8);
        
        g.gridx = 2;
        g.gridy = 3;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(b_n9, g);
        p.add(b_n9);
        
        
        
        control_num=false;
        control_op=false;
        control_op_2=false;
        control_op_3=false;
        control_virgola=false;
        control_virgola2=false;
        control_op5=false;
        control_op6=false;
        control_op7=false;
        cont_op=0;
        cont_op2=0;
        
        
        
        f2.addWindowListener(this);
        f2.setBounds(400, 300, 650, 400);
        f2.add(color_choose);
    }

    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void windowOpened(WindowEvent e) {
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        Component conf = e.getComponent();
        if (conf.equals(f2))
        {
            color = color_choose.getColor();
            switch (cont)
            {
                case 1:
                    l_out.setBackground(color);
                    break;
                case 2:
                    bordo = BorderFactory.createLineBorder(color, 5);
                    l_out.setBorder(bordo);
                    break;
                case 3:
                    l_out.setForeground(color);
                    break;
                case 4:
                    p.setBackground(color);
                    break;
                case 5:
                    bordo = BorderFactory.createLineBorder(color, 5);
                    p.setBorder(bordo);
                    break;
                case 6:
                    b_op1.setForeground(color);
                    b_op2.setForeground(color);
                    b_op3.setForeground(color);
                    b_op4.setForeground(color);
                    b_op5.setForeground(color);
                    b_n0.setForeground(color);
                    b_n1.setForeground(color);
                    b_n2.setForeground(color);
                    b_n3.setForeground(color);
                    b_n4.setForeground(color);
                    b_n5.setForeground(color);
                    b_n6.setForeground(color);
                    b_n7.setForeground(color);
                    b_n8.setForeground(color);
                    b_n9.setForeground(color);
                    b_canc.setForeground(color);
                    b_virgola.setForeground(color);
                    break;
                case 7:
                    bordo2 = BorderFactory.createLineBorder(color, 1);
                    break;
            }
            cont = 0;
        }
        else
            if (conf.equals(f))
                System.exit(0);
    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }

    public void mouseClicked(MouseEvent e) {
        Component bap = e.getComponent();
        if (bap.equals(menu1))
            JOptionPane.showMessageDialog(f, "", "Info", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Calculator\\info.png"));
        else
        {
            if (bap.equals(menu_change1_1))
            {
                cont = 1;
                f2.setVisible(true);
            }
            else
            {
                if (bap.equals(menu_change1_2))
                {
                    cont = 2;
                    f2.setVisible(true);
                }
                else
                {
                    if (bap.equals(menu_change1_3))
                    {
                        cont = 3;
                        f2.setVisible(true);
                    }
                    else
                    {
                        if (bap.equals(menu_change2_1))
                        {
                            cont = 4;
                            f2.setVisible(true);
                        }
                        else
                        {
                            if (bap.equals(menu_change2_2))
                            {
                                cont = 5;
                                f2.setVisible(true);
                            }
                            else
                            {
                                if (bap.equals(menu_change2_3))
                                {
                                    cont = 6;
                                    f2.setVisible(true);
                                }
                                else
                                {
                                    if (bap.equals(menu_change2_4))
                                    {
                                        cont = 7;
                                        f2.setVisible(true);
                                    }
                                    else
                                    {
                                        b_op1.setBorder(null);
                                        b_op2.setBorder(null);
                                        b_op3.setBorder(null);
                                        b_op4.setBorder(null);
                                        b_op5.setBorder(null);
                                        b_n0.setBorder(null);
                                        b_n1.setBorder(null);
                                        b_n2.setBorder(null);
                                        b_n3.setBorder(null);
                                        b_n4.setBorder(null);
                                        b_n5.setBorder(null);
                                        b_n6.setBorder(null);
                                        b_n7.setBorder(null);
                                        b_n8.setBorder(null);
                                        b_n9.setBorder(null);
                                        b_canc.setBorder(null);
                                        b_virgola.setBorder(null);

                                        JLabel b1 = null;
                                        if (!bap.equals(menu)&&(!bap.equals(menu_change))&&(!bap.equals(menu_change1))&&(!bap.equals(menu_change2)))
                                        {
                                            b1 = (JLabel) bap;
                                            String b2;
                                            String n1 = null, n2 = null, n_ap = null;
                                            double n_ris = 0;
                                            if (b1.equals(b_canc))
                                            {
                                                l_out.setText(null);
                                                f.add(l_out, "North");
                                                control_num=false;
                                                control_op=false;
                                                control_op_2=false;
                                                control_op_3=false;
                                                control_virgola=false;
                                                control_virgola2=false;
                                                control_op5=false;
                                                control_op6=false;
                                                control_op7=false;
                                                cont_op=0;
                                                cont_op2=0;
                                            }
                                            else
                                            {
                                                if (((b1.equals(b_n0))||(b1.equals(b_n1))||(b1.equals(b_n2))||(b1.equals(b_n3))||(b1.equals(b_n4))||(b1.equals(b_n5))||(b1.equals(b_n6))||(b1.equals(b_n7))||(b1.equals(b_n8))||(b1.equals(b_n9)))&&(control_op7==false))
                                                {
                                                    b2 = l_out.getText();
                                                    if (b1.equals(b_n0))
                                                        l_out.setText(b2+"0");
                                                    else
                                                    {
                                                        if (b1.equals(b_n1))
                                                            l_out.setText(b2+"1");
                                                        else
                                                        {
                                                            if (b1.equals(b_n2))
                                                                l_out.setText(b2+"2");
                                                            else
                                                            {
                                                                if (b1.equals(b_n3))
                                                                    l_out.setText(b2+"3");
                                                                else
                                                                {
                                                                    if (b1.equals(b_n4))
                                                                        l_out.setText(b2+"4");
                                                                    else
                                                                    {
                                                                        if (b1.equals(b_n5))
                                                                            l_out.setText(b2+"5");
                                                                        else
                                                                        {
                                                                            if (b1.equals(b_n6))
                                                                                l_out.setText(b2+"6");
                                                                            else
                                                                            {
                                                                                if (b1.equals(b_n7))
                                                                                    l_out.setText(b2+"7");
                                                                                else
                                                                                {
                                                                                    if (b1.equals(b_n8))
                                                                                        l_out.setText(b2+"8");
                                                                                    else
                                                                                        if (b1.equals(b_n9))
                                                                                            l_out.setText(b2+"9");
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    f.add(l_out, "North");
                                                    f.setVisible(true);
                                                    control_num=true;
                                                    control_op=false;
                                                    control_op_2=false;
                                                    control_op5=false;
                                                    control_virgola=false;
                                                }
                                                else
                                                {
                                                    if (((b1.equals(b_op1))||(b1.equals(b_op2))||(b1.equals(b_op3))||(b1.equals(b_op4)))&&(control_op==false)&&(control_num==true)&&(control_op_3==false)&&(control_virgola==false))
                                                    {
                                                        b2 = l_out.getText();
                                                        if (b1.equals(b_op1))
                                                        {
                                                            cont_op = 1;
                                                            l_out.setText(b2+"+");
                                                        }
                                                        else
                                                        {
                                                            if (b1.equals(b_op2))
                                                            {
                                                                cont_op = 2;
                                                                l_out.setText(b2+"-");
                                                            }
                                                            else
                                                            {
                                                                if (b1.equals(b_op3))
                                                                {
                                                                    cont_op = 3;
                                                                    l_out.setText(b2+"x");
                                                                }
                                                                else
                                                                {
                                                                    cont_op = 4;
                                                                    l_out.setText(b2+"/");
                                                                }
                                                            }
                                                        }
                                                        f.add(l_out, "North");
                                                        f.setVisible(true);
                                                        control_op=true;
                                                        control_op_2=true;
                                                        control_op_3=true;
                                                        control_op7=false;
                                                        control_virgola=true;
                                                        control_virgola2=false;
                                                        cont_op2++;
                                                    }
                                                    else
                                                    {
                                                        if (((b1.equals(b_op1))||(b1.equals(b_op2))||(b1.equals(b_op3))||(b1.equals(b_op4)))&&(control_op==false)&&(control_num==true)&&(control_op_3==true)&&(control_virgola==false))
                                                        {
                                                            n_ap=l_out.getText();
                                                            int x=0, i=0, j=0, t=0;
                                                            if (control_op6==true)
                                                                x=2;
                                                            boolean verify=false;
                                                            for (i=x; i<n_ap.length(); i++)
                                                            {
                                                                if ((n_ap.charAt(i)=='+')||(n_ap.charAt(i)=='-')||(n_ap.charAt(i)=='x')||(n_ap.charAt(i)=='/'))
                                                                {
                                                                    j=i+1;
                                                                    verify=true;
                                                                    switch (n_ap.charAt(i))
                                                                    {
                                                                        case '+':
                                                                            cont_op=1;
                                                                            break;
                                                                        case '-':
                                                                            cont_op=2;
                                                                            break;
                                                                        case 'x':
                                                                            cont_op=3;
                                                                            break;
                                                                        case '/':
                                                                            cont_op=4;
                                                                            break;
                                                                    }
                                                                }
                                                                else
                                                                    if (verify==false)
                                                                        t++;
                                                            }
                                                            control = false;
                                                            if (x==2)
                                                            {
                                                                n1=n_ap.substring(1, t);
                                                                control = true;
                                                            }
                                                            else
                                                            {
                                                                n1=n_ap.substring(0, t);
                                                                control = false;
                                                            }
                                                            n2=n_ap.substring(j);
                                                            switch (cont_op)
                                                            {
                                                                case 1:
                                                                    n_ris=calcolo.add(control, n1, n2);
                                                                    break;
                                                                case 2:
                                                                    n_ris=calcolo.sub(control, n1, n2);
                                                                    break;
                                                                case 3:
                                                                    n_ris=calcolo.mul(control, n1, n2);
                                                                    break;
                                                                case 4:
                                                                    n_ris=calcolo.div(control, n1, n2);
                                                                    break;
                                                            }
                                                            l_out.setText(+n_ris +b1.getText());
                                                            f.add(l_out, "North");
                                                            cont_op2++;
                                                            control_op7=false;
                                                            control_virgola=true;
                                                            control_virgola2=false;
                                                            n_ap=l_out.getText();
                                                            control_op6=false;
                                                            if (n_ap.charAt(0)=='-')
                                                                control_op6=true;
                                                        }
                                                        else
                                                        {
                                                            if ((b1.equals(b_virgola))&&(control_virgola==false)&&(control_num==true)&&(control_op_2==false)&&(control_virgola2==false))
                                                            {
                                                                b2 = l_out.getText();
                                                                l_out.setText(b2+".");
                                                                f.add(l_out, "North");
                                                                f.setVisible(true);
                                                                control_virgola=true;
                                                                control_virgola2=true;
                                                            }
                                                            else
                                                            {
                                                                if ((b1.equals(b_op5))&&(control_op5==false)&&(cont_op2!=0)&&(control_virgola==false)&&(control_virgola==false))
                                                                {
                                                                    n_ap=l_out.getText();
                                                                    int x=0, i=0, j=0, t=0;
                                                                    if (control_op6==true)
                                                                        x=2;
                                                                    boolean verify=false;
                                                                    for (i=x; i<n_ap.length(); i++)
                                                                    {
                                                                        if ((n_ap.charAt(i)=='+')||(n_ap.charAt(i)=='-')||(n_ap.charAt(i)=='x')||(n_ap.charAt(i)=='/'))
                                                                        {
                                                                            j=i+1;
                                                                            verify=true;
                                                                            switch (n_ap.charAt(i))
                                                                            {
                                                                                case '+':
                                                                                    cont_op=1;
                                                                                    break;
                                                                                case '-':
                                                                                    cont_op=2;
                                                                                    break;
                                                                                case 'x':
                                                                                    cont_op=3;
                                                                                    break;
                                                                                case '/':
                                                                                    cont_op=4;
                                                                                    break;
                                                                            }
                                                                        }
                                                                        else
                                                                            if (verify==false)
                                                                                t++;
                                                                    }
                                                                    control = false;
                                                                    if (x==2)
                                                                    {
                                                                        n1=n_ap.substring(1, t);
                                                                        control = true;
                                                                    }
                                                                    else
                                                                    {
                                                                        n1=n_ap.substring(0, t);
                                                                        control = false;
                                                                    }
                                                                    n2=n_ap.substring(j);
                                                                    switch (cont_op)
                                                                    {
                                                                        case 1:
                                                                            n_ris=calcolo.add(control, n1, n2);
                                                                            break;
                                                                        case 2:
                                                                            n_ris=calcolo.sub(control, n1, n2);
                                                                            break;
                                                                        case 3:
                                                                            n_ris=calcolo.mul(control, n1, n2);
                                                                            break;
                                                                        case 4:
                                                                            n_ris=calcolo.div(control, n1, n2);
                                                                            break;
                                                                    }
                                                                    l_out.setText(String.valueOf(n_ris));
                                                                    f.add(l_out, "North");
                                                                    control_op5=true;
                                                                    control_op_3=false;
                                                                    control_op7=true;
                                                                    control_virgola=false;
                                                                    n_ap=l_out.getText();
                                                                    control_op6=false;
                                                                    if (n_ap.charAt(0)=='-')
                                                                        control_op6=true;
                                                                }

                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }

    public void mousePressed(MouseEvent e) {
        Component conf = e.getComponent();
            if (conf.equals(b_op1))
                b_op1.setBorder(bordo2);
            else
            {
                if (conf.equals(b_op2))
                    b_op2.setBorder(bordo2);
                else
                {
                    if (conf.equals(b_op3))
                        b_op3.setBorder(bordo2);
                    else
                    {
                        if (conf.equals(b_op4))
                            b_op4.setBorder(bordo2);
                        else
                        {
                            if (conf.equals(b_op5))
                                b_op5.setBorder(bordo2);
                            else
                            {
                                if (conf.equals(b_n0))
                                    b_n0.setBorder(bordo2);
                                else
                                {
                                    if (conf.equals(b_n1))
                                        b_n1.setBorder(bordo2);
                                    else
                                    {
                                        if (conf.equals(b_n2))
                                            b_n2.setBorder(bordo2);
                                        else
                                        {
                                            if (conf.equals(b_n3))
                                                b_n3.setBorder(bordo2);
                                            else
                                            {
                                                if (conf.equals(b_n4))
                                                    b_n4.setBorder(bordo2);
                                                else
                                                {
                                                    if (conf.equals(b_n5))
                                                        b_n5.setBorder(bordo2);
                                                    else
                                                    {
                                                        if (conf.equals(b_n6))
                                                            b_n6.setBorder(bordo2);
                                                        else
                                                        {
                                                            if (conf.equals(b_n7))
                                                                b_n7.setBorder(bordo2);
                                                            else
                                                            {
                                                                if (conf.equals(b_n8))
                                                                    b_n8.setBorder(bordo2);
                                                                else
                                                                {
                                                                    if (conf.equals(b_n9))
                                                                        b_n9.setBorder(bordo2);
                                                                    else
                                                                    {
                                                                        if (conf.equals(b_canc))
                                                                            b_canc.setBorder(bordo2);
                                                                        else
                                                                            if (conf.equals(b_virgola))
                                                                                b_virgola.setBorder(bordo2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        b_op1.setBorder(null);
        b_op2.setBorder(null);
        b_op3.setBorder(null);
        b_op4.setBorder(null);
        b_op5.setBorder(null);
        b_n0.setBorder(null);
        b_n1.setBorder(null);
        b_n2.setBorder(null);
        b_n3.setBorder(null);
        b_n4.setBorder(null);
        b_n5.setBorder(null);
        b_n6.setBorder(null);
        b_n7.setBorder(null);
        b_n8.setBorder(null);
        b_n9.setBorder(null);
        b_canc.setBorder(null);
        b_virgola.setBorder(null);
    }

    public void mouseExited(MouseEvent e) {
        b_op1.setBorder(null);
        b_op2.setBorder(null);
        b_op3.setBorder(null);
        b_op4.setBorder(null);
        b_op5.setBorder(null);
        b_n0.setBorder(null);
        b_n1.setBorder(null);
        b_n2.setBorder(null);
        b_n3.setBorder(null);
        b_n4.setBorder(null);
        b_n5.setBorder(null);
        b_n6.setBorder(null);
        b_n7.setBorder(null);
        b_n8.setBorder(null);
        b_n9.setBorder(null);
        b_canc.setBorder(null);
        b_virgola.setBorder(null);
    }
}