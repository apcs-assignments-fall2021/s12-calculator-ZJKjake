import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Calculator implements ActionListener {

    // Swing instance variables
    JFrame frame;
    JTextField field1;
    JPanel panel1, panel2, panel3, panel4;
    JButton button1, button2, button3, button4, button5,
            button6, button7, button8, button9, button0,
            buttonDivide, buttonTimes, buttonMinus, buttonPlus,
            buttonClear, buttonEquals, buttonPowers,buttonSqrt, buttonFactorial,buttonSin;

    // Instance variables that will be used for our math
    String op;
    int arg1;

    public Calculator() {
        // 1. Create the frame (the window that will pop up)
        frame = new JFrame("Calculator");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        field1 = new JTextField(15);
        field1.setHorizontalAlignment(SwingConstants.RIGHT);

        panel1 = new JPanel();
        button7 = new JButton("7");
        panel1.add(button7);
        button8 = new JButton("8");
        panel1.add(button8);
        button9 = new JButton("9");
        panel1.add(button9);
        buttonDivide = new JButton("/");
        panel1.add(buttonDivide);

        panel2 = new JPanel();
        button4 = new JButton("4");
        panel2.add(button4);
        button5 = new JButton("5");
        panel2.add(button5);
        button6 = new JButton("6");
        panel2.add(button6);
        buttonTimes = new JButton("*");
        panel2.add(buttonTimes);

        panel3 = new JPanel();
        button1 = new JButton("1");
        panel3.add(button1);
        button2 = new JButton("2");
        panel3.add(button2);
        button3 = new JButton("3");
        panel3.add(button3);
        buttonMinus = new JButton("-");
        panel3.add(buttonMinus);

        panel4 = new JPanel();
        button0 = new JButton("0");
        panel4.add(button0);
        buttonClear = new JButton("AC");
        panel4.add(buttonClear);
        buttonEquals = new JButton("=");
        panel4.add(buttonEquals);
        buttonPlus = new JButton("+");
        panel4.add(buttonPlus);
        buttonPowers = new JButton("^");
        panel4.add(buttonPowers);
        buttonSqrt = new JButton("log");
        panel4.add(buttonSqrt);
        buttonFactorial = new JButton("!");
        panel4.add(buttonFactorial);
        buttonSin = new JButton("sin");
        panel4.add(buttonSin);


        // Add implemented actionListener method to each button
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonTimes.addActionListener(this);
        buttonPowers.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonFactorial.addActionListener(this);
        buttonSin.addActionListener(this);
        // Add panels and everything to the actual frame
        frame.add(field1);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);
    }
    public void num(ActionEvent ae) {
        String buttonName = ae.getActionCommand();
        if (buttonName.equals("1")) {
            field1.setText(field1.getText() + "1");
        }
        else if (buttonName.equals("2")) {
            field1.setText(field1.getText() + "2");
        }
        else if (buttonName.equals("3")) {
            field1.setText(field1.getText() + "3");
        }
        else if (buttonName.equals("4")) {
            field1.setText(field1.getText() + "4");
        }
        else if (buttonName.equals("5")) {
            field1.setText(field1.getText() + "5");
        }
        else if (buttonName.equals("6")) {
            field1.setText(field1.getText() + "6");
        }
        else if (buttonName.equals("7")) {
            field1.setText(field1.getText() + "7");
        }
        else if (buttonName.equals("8")) {
            field1.setText(field1.getText() + "8");
        }
        else if (buttonName.equals("9")) {
            field1.setText(field1.getText() + "9");
        }
        else if (buttonName.equals("0")) {
            field1.setText(field1.getText() + "0");
        }
    }
    public void actionPerformed(ActionEvent aee) {
        String buttonNamee = aee.getActionCommand();
        int result=0;
        num(aee);
        if (buttonNamee.equals("AC")) {
            field1.setText("");
        }
        else if (buttonNamee.equals("+")) {
            arg1 = Integer.parseInt(field1.getText());
            op = "+";
            field1.setText("");
        }
        else if (buttonNamee.equals("-")) {
            arg1=Integer.parseInt(field1.getText());
            op="-";
            field1.setText("");
        }
        else if (buttonNamee.equals("*")) {
            arg1=Integer.parseInt(field1.getText());
            op="*";
            field1.setText("");
        }
        else if (buttonNamee.equals("/")) {
            arg1=Integer.parseInt(field1.getText());
            op="/";
            field1.setText("");
        }
        else if (buttonNamee.equals("^")) {
            arg1=Integer.parseInt(field1.getText());
            op="^";
            field1.setText("");
        }
        else if (buttonNamee.equals("sqrt")) {
            arg1=Integer.parseInt(field1.getText());
            op="sqrt";
            field1.setText("");
        }
        else if (buttonNamee.equals("!")) {
            arg1=Integer.parseInt(field1.getText());
            op="!";
            field1.setText("");
        }
        else if (buttonNamee.equals("sin")) {
            arg1=Integer.parseInt(field1.getText());
            op="sin";
            field1.setText("");
        }
        else if (buttonNamee.equals("=")) {
            if(Objects.equals(op, "+")){
                result += Integer.parseInt(field1.getText())+arg1;}
            if(Objects.equals(op, "-")){
                result += Integer.parseInt(field1.getText())-arg1;}
            if(Objects.equals(op, "*")){
                result += Integer.parseInt(field1.getText())*arg1;}
            if(Objects.equals(op, "/")){
                result += arg1/Double.parseDouble(field1.getText());}
            if(Objects.equals(op, "^")){
                result += Math.pow(arg1,Double.parseDouble(field1.getText()));
            }
            if(Objects.equals(op, "sqrt")){
                result += Math.sqrt((double)arg1);
            }
            if(Objects.equals(op, "!")){
                result =1;
                for (int i=1;i<arg1+1;i++){
                    result=result*i;
                }
            }
            if(Objects.equals(op, "sin")){
                result+=100*Math.sin(Math.toRadians(arg1));
            }
            field1.setText(Integer.toString(result));
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}
