package simpleDecision;

import java.util.Scanner;

public class DecisionIfElseifElse {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan angka : ");
		int x = input.nextInt();

		if(x!=0&&x%2==0){
			System.out.println(x+" adalah bilangan genap");
		}else if(x==0){
			System.out.println("null");
		}else{
			System.out.println(x+" adalah bilangan ganjil");
		}
		input.close();
	}

}
