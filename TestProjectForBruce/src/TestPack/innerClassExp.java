package TestPack;

import java.awt.Button;
import java.awt.Frame;

public class innerClassExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerClass1 iObj =  new innerClass1();
		iObj.method2();
		
		innerClass1.MyHelperClass obj1 =  iObj.new MyHelperClass();
		obj1.someHelperMethod(0, 0);
		
		 
			      Frame frame=new Frame("ActionListener java8");  
			     
			      Button b=new Button("Click Here");  
			      b.setBounds(50,100,80,50); 
			  
			      b.addActionListener(e -> {System.out.println("Hello World!"); System.out.println("Hello World!");System.out.println("Hello World!");}); 
			      frame.add(b);
			  
			      frame.setSize(200,200);  
			      frame.setLayout(null);  
			      frame.setVisible(true);   
			   } 

}
