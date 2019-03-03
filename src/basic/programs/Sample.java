package basic.programs;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Compile error
//import misc.concepts.Sample;

public class Sample {
	
	
	private List<Integer> list;
    private static final int SIZE = 10;

    public Sample () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList()  {
	// The FileWriter constructor throws IOException, which must be caught.
    	PrintWriter out = null;

        try {
            System.out.println("Entering" + " try statement");

            out = new PrintWriter(new FileWriter(""));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: "
                               +  e.getMessage());
                                     
        } catch (IOException e) {
            System.err.println("Caught IOException: " +  e.getMessage());
                                     
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } 
            else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Sample s = new Sample();
			s.writeList();
}
	
}