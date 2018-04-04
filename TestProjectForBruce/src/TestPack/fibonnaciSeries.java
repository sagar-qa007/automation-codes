package TestPack;

import org.apache.xalan.xsltc.compiler.sym;

public class fibonnaciSeries {
	
	public static void main(String[] a) {
		
		int init = 0;
		int first = 0;
		int second = 1;
		int numOfFibbo = 10;
		
		System.out.println(init);
		System.out.println(first);		
		for(int i=0;i<numOfFibbo;i++)
		{
			init = first;
			first = second;
			second = init+first;
			System.out.println(init);	
					
			
		}
		
	}

}
