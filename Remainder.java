import java.util.*;
import java.lang.*;
import java.io.*;
public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int r=0;
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            r=a%b;
            System.out.println(r);

	}

}
}
