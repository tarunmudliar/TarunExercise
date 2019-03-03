package basic.programs;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		// revEachWordoftheString();
		//declaringStrings();
		//replaceSubstring();
		//caseChangeString();
		//removeCharacter();
		//compareString();
		 //revString();
		//allSubStrings();
		//repetitiveChar();
		//StringBufferExample();
		//capEach();
		//printingString();
		removeNos();
	}
	
	public static void capEach(){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Scanner d = new Scanner(s);
		String n = "";
		
		while(d.hasNext()){
			
			String w = d.next();
			n += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
			
			
			
		}
		
		System.out.println(n);
		
		Scanner sc2 = new Scanner(System.in);
		String s2 = sc2.nextLine();
		
		String[] a = s2.split(" ");
		
		for(String x: a){
			
			System.out.print(Character.toUpperCase(x.charAt(0)) + x.substring(1) + " "); 
		}
		
		
		
	}
	
	public static void replaceSubstring(){
		
		String s = "taruncoolcool";
		System.out.println(s.replace("cool", "awesome"));
		System.out.println(s.replaceFirst("cool", "awesome"));
		System.out.println(s.replaceAll("cool", "awesome"));
		//An interface implemented by String 
		CharSequence t = "tarun";
		
		
	}
	
	
	public static void splitEx(){
		
		String s = "rTarunr";
		String[] x = s.split("r", -1);		
		System.out.println(x.length);
		for(String h : x){
			System.out.println(h);
		}
	}
	
	public static void removeCharacter(){
		String s = "Tarun";
		String[] x = s.split("r");		
		for(String h : x){
			System.out.print(h);
		}
		System.out.print("\n");
		//Remove at 2
		System.out.println(s.substring(0, 2)+ s.substring(3));

		for(int i = 0; i<s.length();i++){
			if(s.charAt(i)=='r'){
				continue;
			}
			else{
				
				System.out.print(s.charAt(i));
			}
			
		}
		
	}
	
	public static void compareString(){
		
		String s = "Tarun";
		String d = "tarun";
		System.out.println(s==d);
		System.out.println(s.equals(d));
		System.out.println(s.compareTo(d));
		System.out.println(s.compareToIgnoreCase(d));
		
		
	}
	
	public static void caseChangeString(){
		String s = "the name is tarun mudaliar";
		String[] a = s.split(" ", 3);
		for(String f : a ){
			System.out.print(f);
			System.out.print(" ");
		}
		System.out.println();
		
		for(int i =0; i<a.length; i++){
			
			for(int j = 0; j<a[i].length(); j++ ){
				if (j == 0){
					char f = Character.toUpperCase(a[i].charAt(0));
					System.out.print(f);
					
				}
				else if(j ==(a[i].length() - 1) ){
					char l = Character.toUpperCase(a[i].charAt((a[i].length() - 1)));
					System.out.print(l);
				}
				else{
				System.out.print(a[i].charAt(j));
				}
			}
			
			
			System.out.print(" ");
			//Below replaces all occurrences of the first parameter
			//a[i] = a[i].replace(a[i].charAt(0), f);
			//a[i] = a[i].replace(a[i].charAt((a[i].length() - 1)), l);
		}

		
		
	}

	public static void removeNos(){
		
		String s = "123tar456";
		for(int i = 0; i<s.length(); i++){
			
			if(!Character.isDigit(s.charAt(i))){
				
				System.out.print(s.charAt(i));
			}
		}
	}
	
	public static void declaringStrings() {

		// String str1 = "Tarun Mudaliar";
		String str1 = new String("Tarun Mudaliar");
		String str2 = "Mudaliar";
		String str3 = "  Ta r  ";
		//Same object now has two references
		String str4 = str3;
		String str5 = "Hello mate Hello";
		//From Back
		boolean match = str1.regionMatches(6, str2, 0, 8);
		System.out.println(str5.lastIndexOf("Hello", 2));
		//From Front
		System.out.println(str5.lastIndexOf("Hello"));
		System.out.println(str1.lastIndexOf('r'));
		System.out.println(str4);
		System.out.println(str3);
		System.out.println(str1);
		System.out.println(str1.concat(str2));
		System.out.println(str1.substring(1));
		System.out.println(str1.equals("Tarun"));
		System.out.println(String.join("-", "Tarun", "Mudaliar", "is", "Awesome"));
		System.out.println(str1.replace("n", "nn"));
		System.out.println(str3.trim());
		//returns -1 if no such character present
		System.out.println(str1.indexOf('r'));
		System.out.println(str1.contains("ar"));
		//Above two are used to search for word in a string
		System.out.println(str1.toLowerCase());
		String name = "boo:and:foo";
		//Read jdoc below:
		System.out.println("---------");
		//?
		String[] t = name.split("o",5);
		String numx = String.valueOf(5);
		boolean tO = Character.isLetter(5);
		boolean t1 = Character.isUpperCase('a');
		
		for (String x : t) {

			System.out.println(x);
		}
		System.out.println("---------");
		System.out.println(name.compareTo("Tarun"));
		System.out.println(name.compareTo("Tarun Devraj Mudaliar"));
		
		
	}

	public static void printingString() {

		/* All the below are different things */
		//Null is the value of reference variable. But empty string is blank.It gives the length=0 . Empty string is a blank value,means the string does not have any thing. No method can be invoked on a object which is assigned a NULL
		// String name = null;
		// String name = "";
		// String name = " ";
		String name = "Tarun Devraj";
		int x = name.length();
		System.out.println(x);

		for (int i = 0; i < x; i++) {
			if (name.charAt(i) == ' ') {
				continue;
			} else {
				System.out.print(name.charAt(i));
			}
		}
		double g = 5.22134664;
		//printf does the same thing
		//out is a field of type PrintStream in System class, which later invokes PrintStrem methods
		//One can use other conversion specifiers as %d, %s, %n
		System.out.format("%5.4f", g);
		
	}

	public static void revEachWordoftheString() {
		String name = "Tarun Devraj Mudaliar";
		String[] afterSplit = name.split(" ");
		System.out.println(afterSplit.length);
		for (int j = 0; j < afterSplit.length; j++) {

			for (int i = afterSplit[j].length() - 1; i >= 0; i--) {

				System.out.print(afterSplit[j].charAt(i));
			}
			System.out.print(" ");
		}
	}

	public static void revString() {
		String a = "Tarun";
		int b = a.length();

		for (int i = b - 1; i >= 0; i--) {

			System.out.print(a.charAt(i));

		}
		System.out.println();
		// Another method
		String d = new StringBuffer(a).reverse().toString();
		System.out.println(d);
		// To find case
		char c = a.charAt(0);
		if (Character.isUpperCase(c)) {
			System.out.println(c);
		}
	}

	public static void allSubStrings() {

		String a = "Tarun";
		int b = a.length();
		for (int i = 0; i < b; i++) {

			for (int j = 1; j <= b - i; j++)
				//see jdoc below
				System.out.println(a.substring(i,j+i));
		}

	}
	
	public static void repetitiveChar(){
		LinkedHashSet<String> lsh = new LinkedHashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == ' ')
			continue;
			int count = 0;
			for(int j = 0; j<s.length(); j++){
				if(s.charAt(j) == ' ')
					continue;
				else if(s.charAt(i)==s.charAt(j))
					count++;
			}
			//+ is overloaded for concat operation
			String a = "Count of "+ s.charAt(i) + " is " + count;
			lsh.add(a);
		}
		for (String t : lsh){
			System.out.println(t);
			
		}
	}

	public static void repetitiveChar2(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		String temp = "";
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == ' ')
			continue;
			int count = 0;
			char c1 = s.charAt(i);
			for(int j = 0; j<s.length(); j++){
				if(s.charAt(j) == ' ')
					continue;
				else if(c1==s.charAt(j) && temp.indexOf(c1)== -1)
					count++;
			}
			if(temp.indexOf(c1) == -1){
				temp = temp+c1;
				System.out.println("Count of "+ s.charAt(i) + " is " + count);
			}
		}
		
	}
	
	public static void StringBufferExample(){
		
		StringBuffer sb = new StringBuffer("Tarun Mudaliar");
		sb.insert(0, "I am ");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append(" is a great guy"));
		System.out.println(sb.substring(1, 5));
		System.out.println(sb.reverse());
		
		
		
	}
}
