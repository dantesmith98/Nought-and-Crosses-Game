package noughtsandcrosses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout extends JFrame implements ActionListener
{   
    int btn1_chck =0, btn2_chck = 0, btn3_chck = 0, btn4_chck = 0, btn5_chck = 0, btn6_chck = 0, btn7_chck = 0, btn8_chck = 0, btn9_chck = 0, ifRun = 0, turn = 1;
    Container contentPane = getContentPane();
    JPanel grid = new JPanel(new GridLayout(3,3));
    //making each button unique with a name
    JButton btn1 = new JButton("");
    JButton btn2 = new JButton("");
    JButton btn3 = new JButton("");
    JButton btn4 = new JButton("");
    JButton btn5 = new JButton("");
    JButton btn6 = new JButton("");
    JButton btn7 = new JButton("");
    JButton btn8 = new JButton("");
    JButton btn9 = new JButton("");

    public Layout()
    {
        super("Noughts and Crosses");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        grid.add(btn1);
        btn1.addActionListener(this);
        
        grid.add(btn2);
        btn2.addActionListener(this);
        
        grid.add(btn3);
        btn3.addActionListener(this);
        
        grid.add(btn4);
        btn4.addActionListener(this);
        
        grid.add(btn5);
        btn5.addActionListener(this);
        
        grid.add(btn6);
        btn6.addActionListener(this);
        
        grid.add(btn7);
        btn7.addActionListener(this);
        
        grid.add(btn8);
        btn8.addActionListener(this);
        
        grid.add(btn9);
        btn9.addActionListener(this);
       
        contentPane.add("Center",grid);
        setVisible(true);
        //ActionListenter now means we can tell when the button has been clicked
    } 
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource()==btn1 && turn == 1)
        {
            if (btn1_chck == 0)
            {
                btn1.setText("X"); 
                turn = 2;
                btn1_chck = 1;
                
            }
        }
        else if (event.getSource()==btn2 && turn == 1)
        {
             if (btn2_chck == 0)
            {
                btn2.setText("X");
                turn = 2;
                btn2_chck = 1;
                
            }
        }
        else if (event.getSource()==btn3 && turn == 1)
        {
             if (btn3_chck == 0)
            {
                btn3.setText("X");
                turn = 2;
                btn3_chck = 1;
                
            }
        }
        else if (event.getSource()==btn4 && turn == 1)
        {
             if (btn4_chck == 0)
            {
                btn4.setText("X");
                turn = 2;
                btn4_chck = 1;
                
            }
        }
        else if (event.getSource()==btn5 && turn == 1)
        {
             if (btn5_chck == 0)
            {
                btn5.setText("X");
                turn = 2;
                btn5_chck = 1;
                
            }
        }
        else if (event.getSource()==btn6 && turn == 1)
        {
             if (btn6_chck == 0)
            {
                btn6.setText("X");
                turn = 2;
                btn6_chck = 1;
                
            }
        }
        else if (event.getSource()==btn7 && turn == 1)
        {
             if (btn7_chck == 0)
            {
                btn7.setText("X");
                turn = 2;
                btn7_chck = 1;
                
            }
        }
        else if (event.getSource()==btn8 && turn == 1)
        {
             if (btn8_chck == 0)
            {
                btn8.setText("X");
                turn = 2;
                btn8_chck = 1;
                
            }
        }
        else if (event.getSource()==btn9 && turn == 1)
        {
             if (btn9_chck == 0)
            {
                btn9.setText("X");
                turn = 2;
                btn9_chck = 1;
                
            }
        }
        if (event.getSource()==btn1 && turn == 2)
        {
            if (btn1_chck == 0)
            {
                btn1.setText("O");
                turn = 1;
                btn1_chck = 1;
                
            }
        }
        else if (event.getSource()==btn2 && turn == 2)
        {
             if (btn2_chck == 0)
            {
                btn2.setText("O");
                turn = 1;
                btn2_chck = 1;
                
            }
        }
        else if (event.getSource()==btn3 && turn == 2)
        {
             if (btn3_chck == 0)
            {
                btn3.setText("O");
                turn = 1;
                btn3_chck = 1;
               
            }
        }
        else if (event.getSource()==btn4 && turn == 2)
        {
             if (btn4_chck == 0)
            {
                btn4.setText("O");
                turn = 1;
                btn4_chck = 1;
              
            }
        }
        else if (event.getSource()==btn5 && turn == 2)
        {
             if (btn5_chck == 0)
            {
                btn5.setText("O");
                turn = 1;
                btn5_chck = 1;
                
            }
        }
        else if (event.getSource()==btn6 && turn == 2)
        {
             if (btn6_chck == 0)
            {
                btn6.setText("O");
                turn = 1;
                btn6_chck = 1;
               
            }
        }
        else if (event.getSource()==btn7 && turn == 2)
        {
             if (btn7_chck == 0)
            {
                btn7.setText("O");
                turn = 1;
                btn7_chck = 1;
                
            }
        }
        else if (event.getSource()==btn8 && turn == 2)
        {
             if (btn8_chck == 0)
            {
                btn8.setText("O");
                turn = 1;
                btn8_chck = 1;
                
            }
        }
        else if (event.getSource()==btn9 && turn == 2)
        {
             if (btn9_chck == 0)
            {
                btn9.setText("O");
                turn = 1;
                btn9_chck = 1;
                
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Layout gui = new Layout();
    }
}


