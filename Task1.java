package Tasks;

import java.util.Scanner;

public class Task1 {

	 public static void main(String[] args) {   
		 int n = 10;   
		 Scanner sc = new Scanner(System.in);   
		 String max = "", min = "", str = "";   
		 for (int i = 0; i < n; i++) {    //ввод с клавиатуры n количества строк (в данном случае 10)
			 System.out.print("> ");    
			 if (sc.hasNextLine()) { 
	 
		 str = sc.nextLine();     
		 if (i == 0) {      
			 min = str;     
			 }     
		 if (str.length() > max.length()) {   //сравнение длины строк    
			 max = str;     } 
		 else if (str.length() < min.length()) {      
			 min = str;     
			 }    
		 }   
	 }
	  System.out.println("max string = " + max + " length=" + max.length()); //вывод макс строки и ее длины
	  System.out.println("min string = " + min + " length=" + min.length()); //вывод мин строки и ее длины
	  
}
	 } 
	 


