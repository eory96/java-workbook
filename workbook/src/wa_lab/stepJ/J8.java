package wa_lab.stepJ;

import java.util.*;

public class J8 {
	Scanner s = new Scanner(System.in);
	
	J8(){
		input();
	}
	
	public void input() {
		for(int a=0;a<4;a++) {
			for(int b=0;b<4;b++) {
				System.out.printf("Ackermann(%d,%d) = %d\n", a,b,Ackemann(a,b));
			}
		}
	}
	
	private int Ackemann(int i,int j) {
		if(i==0&&j>=0) {
			return j+1;
		}else if(i>0&&j==0) {
			return Ackemann(i-1,1);
		}else {
			return Ackemann(i-1,Ackemann(i,j-1));
		}
	}
}
