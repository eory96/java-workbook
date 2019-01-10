package wa_lab.stepG;

import java.util.*;

public class G2 {
	int input_degree;
	double degrees[] = new double[10];
	String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
	int count[] = {0,0,0,0};
	int i;
	Scanner s = new Scanner(System.in);
	
	G2(){
		input();
	}
	public void input() {
		for(i=0;i<10;i++) {
			System.out.printf("%d번 물의 온도를 입력하시오.", i+1);
			degrees[i] = s.nextDouble();
		}
	}
	public void print_result() {
		for(i=0;i<10;i++) {
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.\n",i+1,degrees[i]);
			int val = checkSection(degrees[i]);
			count[val]++;
		}
		for(i=0;i<4;i++) {
			System.out.printf("%s 입력 횟수 : %d\n", degree_name[i],count[i]);
		}
	}
	
	private int checkSection(double degree) {
		//if(degree<0) return -1;
		if(degree<25&&degree>=0) return 0;
		else if(degree<40) return 1;
		else if(degree<80) return 2;
		else return 3;
		/*
		if(degrees[i]>=0&&degrees[i]<25) {
			count[0]++;
			System.out.println(degree_name[0]);
		}else if(degrees[i]>=25&&degrees[i]<40) {
			count[1]++;
			System.out.println(degree_name[1]);
		}
		else if(degrees[i]>=40&&degrees[i]<80) {
			count[2]++;
			System.out.println(degree_name[2]);
		}else {
			count[3]++;
			System.out.println(degree_name[3]);
		}*/
	}
}
