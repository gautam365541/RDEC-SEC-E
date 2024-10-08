import java.util.*;
import java.text.*;

public class BillPrint {

    static String formatTotal(double tot, Locale l) {
        // NumberFormat nf = new NumberFormat();
        // NumberFormat nf = NumberFormat.getInstance(l);
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);
        return nf.format(tot);
    }

    static String formatDate(Locale l) {
        // NumberFormat nf = new NumberFormat();
        // NumberFormat nf = NumberFormat.getInstance(l);
        Date dt = new Date();
        // dt.getTime();
        DateFormat dtf = DateFormat.getDateInstance(DateFormat.LONG, l);
        return dtf.format(dt);
    }

    public static void main(String[] args) {
        Locale locale = new Locale("fr", "FR");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName = sc.nextLine();
        System.out.println("Please enter the name of the item");
        String itemName = sc.nextLine();
        System.out.println("Price?");
        double price = sc.nextDouble();
        System.out.println("Tax in %?");
        double taxRate = sc.nextDouble();
        double taxPaid = ((taxRate / 100) * price);
        double netPrice = price - taxPaid;

        System.out.println("***************************");
        System.out.println("Welcome, " + userName);
        System.out.println("You have bought " + itemName + " on " + formatDate(locale));
        System.out.println("Net amount paid :" + formatTotal(netPrice, locale));
        System.out.println("Tax Rate :" + taxRate);
        System.out.println("Tax paid :" + formatTotal(taxPaid, locale));
        System.out.println("Total Amount paid :" + formatTotal(price, locale));
    }
}
