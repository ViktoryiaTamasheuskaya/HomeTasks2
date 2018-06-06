package Tasks;

import java.util.Scanner;

public class Task3  {
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in); 
		  System.out.print("Введите радиус круга: ");
		  double R=in.nextDouble();
		  double L=0, S=0;
		  
		  if (R != 0 & R>0) {    
			  L=2*3.14*R;
			  S=3.14*Math.pow(R, 2);}
		  else {    System.out.println("Такой окружности не существует");
		  String s=in.next();
		    } 
		 
		  System.out.println("Длина окружности=" + L);
		  System.out.println("Площадь круга=" + S); } 
	}
