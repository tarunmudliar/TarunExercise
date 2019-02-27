package misc.concepts;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TryCatch {
	
	
	private List<Integer> list;
    private static final int SIZE = 10;

    public TryCatch () {
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
        }
        //Will throw compile error of unreachable catch blocks
        /*catch(Exception e){
        	
        	
        }*/ 
        //Either have these catch blocks or throws OR you'll get a compile error
        catch (IndexOutOfBoundsException e) {
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
        
        System.out.println("tm");
    }
    
    
    public void DivZero(){
    	//Will not throw compile error, as it will cause a Runtime Exception
    	//int z = 5/0;
    	try{
    		
    		int z = 5/0;
    	}finally{
    		
    		System.out.println("without catch" );
    	}
    	
    	
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TryCatch s = new TryCatch();
			s.writeList();
			//s.DivZero();
}
	
}


