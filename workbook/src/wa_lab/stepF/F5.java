package wa_lab.stepF;

import java.util.*;

public class F5 {
	int height, weight;
	int bmilist[][] = new int[10][3];
	int count;
	int i;
	Scanner s = new Scanner(System.in);
	
	F5(){
		input();
	}
	public void input() {
		for(i=0;i<10;i++) {
			System.out.printf("%d번째 사람의 신장과 체중을 입력하시오.", i+1);
			height = s.nextInt();
			weight = s.nextInt();
			
			bmilist[i][0]=height;
			bmilist[i][1]=weight;
			bmilist[i][2]=(int) (weight/((height*0.01)*(height*0.01)));
		}
	}
	
	public void print_result() {
		for(int i = 0; i < 10; i++) {			
			if(bmilist[i][2]>= 25) {
				System.out.println( i+1 +"번째 사람은 비만입니다.");
				count ++;
			}
		}
		System.out.println("총" + count + "명의 사람이 비만입니다.");
	}
}
