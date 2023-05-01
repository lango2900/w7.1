import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class Adder implements ActionListener{
    JFrame frame;
    JLabel[] labels = new JLabel[4];
    JTextField[] textfields = new JTextField[4];
    JButton[] buttons = new JButton[4];

    JPanel[] panels = new JPanel[3];

    double value1=0,value2=0;

    public static void main(String[] args){

        Adder Adder = new Adder();


    }

    public Adder() {

        frame = new JFrame("Addition");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(400,300,350,250);
        frame.setResizable(false);
        frame.setLayout(null);

        panels[0] = new JPanel();
        panels[0].setLayout(null);
        panels[0].setBounds(9,20,320,200);
        panels[0].setBackground(Color.cyan);







        labels[0] = new JLabel("First Number:");
        labels[0].setBounds(25,50,150,25);
        labels[1] = new JLabel("Second Number:");
        labels[1].setBounds(23,75,150,25);
        labels[2] = new JLabel("Result:");
        labels[2].setBounds(25,100,150,25);

        labels[3] = new JLabel("Addition Program");
        labels[3].setLayout(new BorderLayout());
        labels[3].setBounds(2,0,150,25);

        textfields[0] = new JTextField(10);
        textfields[0].setBounds(150,50,150,25);
        textfields[1] = new JTextField(10);
        textfields[1].setBounds(150,75,150,25);
        textfields[2] = new JTextField(10);
        textfields[2].setBounds(150,100,150,25);


        buttons[0] = new JButton();
        buttons[0].addActionListener(this);
        buttons[0].setText("Add");
        buttons[0].setBounds(45,150,65,35);
        buttons[0].setHorizontalTextPosition(JButton.CENTER);
        buttons[0].setVerticalTextPosition(JButton.CENTER);

        buttons[1] = new JButton();
        buttons[1].addActionListener(this);
        buttons[1].setText("Clear");
        buttons[1].setBounds(145,150,65,35);
        buttons[1].setHorizontalTextPosition(JButton.CENTER);
        buttons[1].setVerticalTextPosition(JButton.CENTER);

        buttons[2] = new JButton();
        buttons[2].addActionListener(this);
        buttons[2].setText("Exit");
        buttons[2].setBounds(245,150,65,35);
        buttons[2].setHorizontalTextPosition(JButton.CENTER);
        buttons[2].setVerticalTextPosition(JButton.CENTER);

        frame.add(panels[0]);

        panels[0].add(labels[3]);
        panels[0].add(labels[0]);
        panels[0].add(textfields[0]);
        panels[0].add(labels[1]);
        panels[0].add(textfields[1]);
        panels[0].add(labels[2]);
        panels[0].add(textfields[2]);


        panels[0].add(buttons[0]);
        panels[0].add(buttons[1]);
        panels[0].add(buttons[2]);


       // buttons[0].setVisible(true);
       // buttons[1].setVisible(true);
       // buttons[2].setVisible(true);
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










