package misc.concepts;

import misc.concepts.Relatable;

public class TypeCasting implements Relatable {

	int width = 0;
	int height = 0;
	
	public TypeCasting(int w, int h){
		
		width = w;
		height =h;
	}
	
	public int getArea(){
		
		return width*height;
	}
	
	 public int isLargerThan(Relatable other) {
		 //Explicit casting
	        TypeCasting otherRect 
	            = (TypeCasting)other;
	        if (this.getArea() < otherRect.getArea())
	            return -1;
	        else if (this.getArea() > otherRect.getArea())
	            return 1;
	        else
	            return 0;               
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TypeCasting tc = new TypeCasting(1, 3);
			TypeCasting tc2 = new TypeCasting(1,3);
			int x = tc.isLargerThan(tc2); 
			
			System.out.println(x);
					
	}

}
