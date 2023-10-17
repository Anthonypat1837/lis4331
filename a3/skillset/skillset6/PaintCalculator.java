import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PaintCalculator {

    public static boolean isNumber(String n) {
        try {
            Double.parseDouble(n);
            return true;
        }
        catch (NumberFormatException nfe) {
            return false;
    }
}
    public static void main(String[] args) {

        String paintCostString = "", lengthString = "", widthString = "", heightString = "";
        double paintCost = 0.0, length = 0.0, width = 0.0, height = 0.0, area = 0.0, total = 0.0, gallons = 0.0;
        final int SQFT_PER_GAL = 350;

        DecimalFormat moneyFormat = new DecimalFormat("$#, ###, ##0.00");
        DecimalFormat numberFormat = new DecimalFormat("$#, ###, ##0.00");
        
        JOptionPane.showMessageDialog(null, 
                            "Program uses Java GUI message and input dialogs.\n" +
                            "Program determines paint cost per room\n" + 
                            "For paint \"area\" simplicity: use length X height X2 + width X height X2.\n" +
                            "Format numbers as per below: thousands separator, decimal point and $ sign for currency.\n" + 
                            "Research how many square feet a gallon of paint covers, \n" +
                            "Note: Program performs data validation.");

        paintCostString = JOptionPane.showInputDialog(null, 
                                    "Paint price per gallon:",
                                    "Paint Cost Calculator",
                                    JOptionPane.INFORMATION_MESSAGE);
        
        
        if (!isNumber(paintCostString)) {
            JOptionPane.showMessageDialog(null, "Invalid Number. Please enter number.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
        paintCost = Double.parseDouble(paintCostString);
        }
        if (isNumber(lengthString)) {
            JOptionPane.showMessageDialog(null, "Invalid Number. Please enter number.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
        lengthString = JOptionPane.showInputDialog(null, "Length", "Paint Cost Calculator", JOptionPane.INFORMATION_MESSAGE);
        length = Double.parseDouble(lengthString);

        }
        if (isNumber(widthString)) {
            JOptionPane.showMessageDialog(null, "Invalid Number. Please enter number.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
        widthString = JOptionPane.showInputDialog(null, "Width", "Paint Cost Calculator", JOptionPane.INFORMATION_MESSAGE);
        width = Double.parseDouble(widthString);
        }
        if (isNumber(heightString)) {
            JOptionPane.showMessageDialog(null, "Invalid Number. Please enter number.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
        heightString = JOptionPane.showInputDialog(null, "Height", "Paint Cost Calculator", JOptionPane.INFORMATION_MESSAGE);
        height = Double.parseDouble(heightString);
        }
        area = (length * height * 2) + (width * height *2);
        gallons = area / SQFT_PER_GAL;
        total = gallons * paintCost;

    
        JOptionPane.showMessageDialog(null, 
                                    "Paint = "
                                    + moneyFormat.format(paintCost)
                                    + " per gallon \nArea of room = " 
                                    + numberFormat.format(area)
                                    + "sqft. \nTotal = "
                                    + moneyFormat.format(total));

    }
}