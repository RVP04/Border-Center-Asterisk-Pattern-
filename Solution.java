import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int counter = 1;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==0||j==0||i==n-1||j==n-1)
		        {
		               System.out.print("*"+" ");
		        }
		        else if(n/2==i && n/2==j)
		        {
		            System.out.print("* ");
		            counter++;
		        }
		        else
		        {
		            System.out.print(counter++ +" ");
		        }
		    }
		    System.out.println();
		}

	}
}
