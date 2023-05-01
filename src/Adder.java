import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class Adder implements ActionListener{
    JFrame frame;
    JLabel label1,label2,label3;
    JTextField[] textfields = new JTextField[4];
    JButton[] buttons = new JButton[4];
    JButton add,clear,exit;
    char operator;
    double value1=0,value2=0,value3=0,result=0;

    public static void main(String[] args){

        Adder Adder = new Adder();


    }

    public Adder() {

        frame = new JFrame("Addition");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(400,300,200,300);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());

        label1 = new JLabel("First Number:");
        label2 = new JLabel("Second Number:");
        label3 = new JLabel("Result:");

        textfields[0] = new JTextField(10);
        textfields[1] = new JTextField(10);
        textfields[2] = new JTextField(10);

        buttons[0] = new JButton();
        buttons[1] = new JButton();
        buttons[2] = new JButton();
        buttons[0].addActionListener(this);
        buttons[1].addActionListener(this);
        buttons[2].addActionListener(this);



        frame.add(label1);
        frame.add(textfields[0]);
        frame.add(label2);
        frame.add(textfields[1]);
        frame.add(label3);
        frame.add(textfields[2]);

        frame.add(buttons[0]);
        frame.add(buttons[1]);
        frame.add(buttons[2]);



        frame.setVisible(true);


    }






    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== buttons[0]) {

            value1 = Double.valueOf(parseInt(textfields[0].getText()));

            value2 = Double.valueOf(parseInt(textfields[1].getText()));

            Double value3 = value1+value2;

            String result = String.valueOf(value3);

            textfields[2].setText(result);


        }
        else if(e.getSource()==buttons[1]) {
            textfields[0].setText("");
            textfields[1].setText("");
            textfields[2].setText("");


        }
        else if(e.getSource()==buttons[2]){

            System.exit(0);



        }



    }
}







   // String num1 = JOptionPane.showInputDialog("First Number:");
   // String num2 = JOptionPane.showInputDialog("Second Number:");










