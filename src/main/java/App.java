import java.util.Scanner;
public class App {
    public static int add(int n1,int n2){
    	return n1+n2;
    }
    public static void main(String args[]) {
    	int n1, n2, res;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number:");
    	n1 = sc.nextInt();
    	System.out.println("Enter number:");
    	n2 = sc.nextInt();
			res = add(n1,n2);
    	System.out.println("Sum is: " + res);
    }
}
