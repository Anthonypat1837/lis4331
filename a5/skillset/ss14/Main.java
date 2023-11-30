import java.util.Scanner;
class Main {
    public static void main(String args[]) {

        double p = 0.0;
        double r = 0.0;
        int t = 0;

        Methods.getRequirements();

        p=Methods.getPrincipal();
        r=Methods.getRate();
        t=Methods.getTime();

        Methods.calculateInterest(p,r,t);
    }
}