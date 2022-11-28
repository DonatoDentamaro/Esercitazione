
import java.util.Arrays;
import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		
		int n;
		int na[]= new int[10];
		for(int i = 0; i<10;i++) {
			System.out.println("inserisci il "+(i+1)+" numero");
			n = scan.nextInt();
			na[i]=n;
			
		}
		
		Arrays.sort(na);
		for(int a :na) {
			
			System.out.println(a);
		}
		
		scan.close();
		
	}

}

