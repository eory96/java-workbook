package wa_lab.stepJ;

import java.util.*;

public class J10 {
	double gap;
	int i;
	double previous=3;
	J10(){
		input();
	}
	
	public void input() {
		int f,s;
		double g;
		i=2;
		while(true) {
			f = fibonacci(i+1);
			s = fibonacci(i);
			g = (float)fibonacci(i+1)/(float)fibonacci(i);
			System.out.printf("%d번째 비율 (%d / %d) : %f\n", i,f,s,g);
			gap = Math.abs(previous-g);
		
			if(gap<0.000001)
				break;
			
			previous = g;
			i++;
		}
	}
	
	int fibonacci(int n) {
		if(n==1 || n==2)
			return 1;
		else
			return fibonacci(n-1)+ fibonacci(n-2);
	}
}
