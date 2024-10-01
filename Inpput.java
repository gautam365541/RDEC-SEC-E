import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Inpput {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out =  new PrintStream("C:\\Users\\ACER\\Documents\\RDEC_JAVA_E\\temp2.txt");
        // System.setOut(new PrintStream("C:\\Users\\ACER\\Documents\\RDEC_JAVA_E\\temp.txt"));
        out.println("Komal Verma");
    }
}
