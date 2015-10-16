package simpleDecision;
import java.util.Scanner;

public class DesicisionSwitchCase {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
//		char rate='B';
		
		System.out.print("Masukkan angka : ");
		int angka=input.nextInt();
		
		switch (angka%2) {
		case 0 :
			System.out.println(angka+" adalah bilangan genap");
			break;
		case 1:
			System.out.println(angka+" adalah bilangan ganjil");
			break;
		default:
			System.out.println("null");
			break;
		}
		input.close();
	}
}
