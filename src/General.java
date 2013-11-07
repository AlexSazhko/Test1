import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;




 class A{
		 public A(){
			System.out.println("In constr A");
		}
		
		void f(){
			System.out.println("Funcrion f in A");
		}
		
		public void Met(){
			System.out.println("Metod AAAAA");
		}
		

	}
	
	class B extends A{
		public B(){
			System.out.println("In constr B");
		}
		
		void f(){
			System.out.println("Funcrion f in B");
		}
		public void Met(){
			System.out.println("Metod BBBBB");
		}
		
		public void Met2(){
			System.out.println("Metod 222222222BBBBB");
		}
	}
	
public class General {

	
	public static void main(String[] args) throws IOException {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		if (i1.equals(i2)) System.out.println("true");
		else System.out.println("false");
		// TODO Auto-generated method stub
		//General g = new General();
		//A a = (B)new B();
		//Class c1 = new ArrayList<String>().getClass();

		try {
			String str = "123";
			PrintWriter p =  new PrintWriter(new FileWriter("2.txt"));
			p.println(str);
			p.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			DataInputStream dt = new DataInputStream(new FileInputStream("1.txt"));
			Scanner s = new Scanner(dt);
			while(s.hasNext()){
				System.out.print(s.next());
			}
			dt.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(c1);
		
	}

}
