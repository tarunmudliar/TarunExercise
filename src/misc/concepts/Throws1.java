package misc.concepts;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Throws1 {
	
	
	private List<Integer> list;
    private static final int SIZE = 10;

    public Throws1 () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() throws IOException  {
	// The FileWriter constructor throws IOException, which must be caught.
    	 PrintWriter out = new PrintWriter(new FileWriter(""));

         for (int i = 0; i < SIZE; i++) {
             // The get(int) method throws IndexOutOfBoundsException, which must be caught.
             out.println("Value at: " + i + " = " + list.get(i));
         }
         out.close();
         System.out.println("tm");
     }
    
    public void thex(){
    	
    	int i = 300;
    	if(i>200){
    		
    		throw new ArithmeticException("This is big");
    	}
    	
    }
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			Throws1 s = new Throws1();
			//s.writeList();
			//s.thex();
			try{
			s.thex();
			}catch(ArithmeticException a){
				a.printStackTrace();
			}
}
	
}