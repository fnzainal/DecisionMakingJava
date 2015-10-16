package simpleDecision;

import java.util.Scanner;

public class DecisionNestedIfElse {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan angka : ");
		int x =input.nextInt();
		
		if(x!=0){
			if(x%2==0){
				System.out.println(x+" adalah bilangan genap");
			}else{
				System.out.println(x+" adalah bilangan ganjil");
			}
		}
		else{
			System.out.println("null");
		}
		input.close();
	}
}
