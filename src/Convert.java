
import java.io.*;


public class Convert {
    public static void main(String[] args) throws IOException {


       BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
       String text = reader.readLine().toUpperCase();
       FileWriter fr = new FileWriter("test2.txt");
       fr.write(text);
       fr.close();







    }
    }
