package wa_lab.stepH;

import java.util.*;

public class H6 {
	int number[] = new int[5];
	int pow_value[][] = new int[5][5]; 
	int max, min;
	int max_a, max_b;
	int min_a, min_b;
	int i, j;
	Scanner s = new Scanner(System.in);
	
	H6(){
		input();
	}
	
	public void input() {
		System.out.print("2 에서 9사이의 숫자 5개를 입력하세요.");
		for(int i=0;i<5;i++) 
			number[i] = s.nextInt();	
	}
	
	public void print_result() {
		min=1000000000;
		System.out.print("입력하신 5개의 수로 제곱수를 만들면....\n");
		int i,j;
		for(i=0;i<5;i++) { 
			for(j=0;j<5;j++) {
				pow_value[i][j]= (int) Math.pow(number[i], number[j]);
			}
		}
		for(i=0;i<5;i++) { 
			for(j=0;j<5;j++) {
				if(i!=j) {
					if(pow_value[i][j]>max) {
						max = pow_value[i][j];
						max_a = number[i];
						max_b=number[j];
						
					}
					if(pow_value[i][j]<min) {
						min = pow_value[i][j];
						min_a = number[i];
						min_b=number[j];
					}
				}
			}
		}
		for(i=0;i<5;i++) { 
			for(j=0;j<5;j++) {
				System.out.println(pow_value[i][j]);
			}
		}
		System.out.print("가장 큰 수는 "+max_a+"의 "+max_b+"승인 "+max+"입니다.\n");
		System.out.print("가장 작은수는 "+min_a+"의 "+min_b+"승인 "+min+"입니다.\n");
		
	}
}
