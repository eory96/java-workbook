package wa_lab.stepJ;

import java.util.*;

public class J3 {
	double degrees[] = new double[10];
	int i;
	String str[] = {"냉수","미온수","온수","끓는 물"};
	int counting[] = new int[4];
	Scanner s = new Scanner(System.in);
	J3(){
		input();
	}
	public void input() {
		for(i=0;i<10;i++) {
			System.out.printf("%d번째 물의 온도를 입력하시오.", i+1);
			degrees[i]=s.nextDouble();
			
			
			if(askWater(degrees[i])==0) counting[0]++;
			else if(askWater(degrees[i])==1)counting[1]++;
			else if(askWater(degrees[i])==2)counting[2]++;
			else counting[3]++;
		}
	}
	private int askWater(double t) {
		if(degrees[i]>=0&&degrees[i]<25) {
			return 0;
		}else if(degrees[i]>=25&&degrees[i]<40) {
			return 1;
		}
		else if(degrees[i]>=40&&degrees[i]<80) {
			return 2;
		}else {
			return 3;
		}
	}
	
	public void print_result() {
		for(int j=0;j<10;j++) {
			System.out.printf("%d번째 물의 온도는 %.1f입니다.\n", j+1,degrees[j]);
		}
		for(int k=0;k<4;k++) {
			System.out.printf("%s 입력 횟수는 %d입니다.\n",str[k],counting[k]);
		}
	}
}
