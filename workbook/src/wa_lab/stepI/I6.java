package wa_lab.stepI;

import java.util.*;

public class I6 {
	int i;
	//int list[] = new int[10];
	int num;
	Random r = new Random();
	I6(){
		generate();
	}
	
	byte GetRandom() {
		num=r.nextInt(99)+1;
		System.out.printf("생성된 임의의 숫자는 %d입니다.\n", num);
		if(num>=70) return 0;
		else if(num>=40&&num<70) return 1;
		else return 2;
	}
	
	public void generate() {
		int big=0;
		int mid=0;
		int small=0;
		for(i=0;i<10;i++) {
			int k = GetRandom();
			if(k==0) big++;
			else if(k==1) mid++;
			else small++;
		}
		System.out.printf("1. 대 (70 이상) : %d회 생성\n", big);
		System.out.printf("2. 대 (40 이상) : %d회 생성\n", mid);
		System.out.printf("3. 대 (40 미만) : %d회 생성\n", small);
	}
}
