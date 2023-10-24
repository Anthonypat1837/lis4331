import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DistanceCalculator implements ActionListener {
    public static void main(String[] args)
    {
        DistanceCalculator gui = new DistanceCalculator();

    }

    private JFrame frame;
    private JTextField heightField;
    private JTextField weightField;
    private JLabel bmiLabel;
    private JButton computeButton;

    public DistanceCalculator()
    {
        heightField = new JTextField(5);
        weightField = new JTextField(5);
        bmiLabel = new JLabel("Computer Distance Leg C.");
        computeButton = new JButton("Compute");

        computeButton.addActionListener(this);

        JPanel north = new JPanel(new GridLayout(2,2));
        north.add(new JLabel("Leg A: "));
        north.add(heightField);
        north.add(new JLabel("Leg B: "));
        north.add(weightField);

        frame = new JFrame("BMI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(north, BorderLayout.NORTH);
        frame.add(bmiLabel, BorderLayout.CENTER);
        frame.add(computeButton, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        String heightText = heightField.getText();
        double height = Double.parseDouble(heightText);
        String weightText = weightField.getText();
        double weight = Double.parseDouble(weightText);

        double bmi = Math.sqrt(Math.pow(height, 2) + Math.pow(weight, 2));

        bmiLabel.setText(String.format("Leg C: %,.2f", bmi));
    }
    
}