package simpleDecision;

import java.util.Scanner;

public class DecisionIf {
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Mengecek suatu bilangan genap atau ganjil");
		System.out.print("Masukkan angka : ");
		int x=input.nextInt();
		if(x%2==0&&x!=0){
			System.out.println(x+" adalah bilangan genap");
		}
		input.close();
	}
}
