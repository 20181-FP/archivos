import java.util.Scanner;

public class Archi01{
	public static void main(String[] args) {
		int n=0;
		while(n>=0){
			Scanner reader = new Scanner(System.in);
			System.out.print("n:");
			n = Integer.parseInt( reader.nextLine() );
			try{
				int d=2/n;
				System.out.println("2/n="+d);
			}catch (Exception e) {
				System.out.println("Mierror="+e);
			}
		}

	}
}