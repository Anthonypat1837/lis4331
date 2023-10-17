import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EvenOrOddDataValidationSwing extends JFrame {
    private JTextField jT;
    private JButton jB;
    private JLabel jL;


    public EvenOrOddDataValidationSwing() {
        JOptionPane.showMessageDialog(null, 
        "Program uses Java GUI message and input dialogs.\n" +
        "Program evaluates integers as even or add.\n" + 
        "Note: Program performs data validation.");


        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.setBackground(Color.lightGray);

        cp.add(new JLabel("Enter:"));
        jT = new JTextField("0");
        jT.setColumns(2);
        jT.setBackground(Color.BLUE);
        jT.setForeground(Color.cyan);
        jT.setEditable(true);
        cp.add(jT);

        jB = new JButton("Evaluate");
        cp.add(jB);

        jL = new JLabel();
        jL.setOpaque(true);
        cp.add(jL);

        jB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String str = jT.getText();
                if (str.equals("")) {
                    JOptionPane.showMessageDialog(null, "Invalid Integer. Please enter integer.", "Error", JOptionPane.ERROR_MESSAGE);
                    jT.requestFocusInWindow();
                } else  if (!isNumber(str)){
                    JOptionPane.showMessageDialog(null, "Invalid Integer. Please enter integer.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int num = Integer.parseInt(str);
                    jL.setBackground(Color.gray);
                    jL.setForeground(Color.pink);
                    if (num % 2 == 0) {
                        jL.setText(num + " is an even number.");
                    }
                    else {
                        jL.setText(num + " is an odd number.");
                    }
                }
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Even Or Odd");
        setSize(220, 100);
        setVisible(true);
    }

        public static boolean isNumber(String n) {
            try {
                Integer.parseInt(n);
                return true;
            }
            catch (NumberFormatException nfe) {
                return false;
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EvenOrOddDataValidationSwing();
            }
        });
    }
}
