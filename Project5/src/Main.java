//Java Start 03.03.20

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			Scanner sc = new Scanner (System.in);
			System.out.println("enter points x,y");
			double x = sc.nextInt();
			double y = sc.nextInt();
			if((((x-0)*(y-4)-(y-0)*(0-4)>=0)&&((x-0)*(4-1)-(y-4)*(0-6)>=0))&&((x-6)*(1-4)-(y-1)*(6-0)>=0)) {
	            System.out.println("lies");
	        }
	        else System.out.println("does not lie");
	    }

		
		
	}


