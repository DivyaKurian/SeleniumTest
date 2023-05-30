import java.util.Scanner;

public class programs {
	
	public static void oddEven() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number limit");
		int num=s.nextInt();
		for(int i=2; i<=num;i++)
		if (i%2==0){
			System.out.println(i);		
		}
	}

	public static void main(String[] args) {
	

	}

}
