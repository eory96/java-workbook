package wa_lab.stepJ;

import java.util.*;

public class J1 {
	int birth_year; 
	int age[] = new int[100];
	int count_person; 
	//int count_baby;
	//int count_child; 
	//int count_youth; 
	//int count_young;
	//int count_adult; 
	//int count_old;
	int counting[]=new int[6];
	String p[]= {"유아","어린이","청소년","청년","중년","노년"};
	int i;
	
	Scanner s = new Scanner(System.in);
	J1(){
		input();
	}
	public void input() {
		for(i=0;i<100;i++) {
			System.out.printf("%d번째 사람의 태어난 년도럴 입력하시오.",i+1);
			birth_year = s.nextInt();
			if(birth_year>2012)
				break;
			else
				count_person = askAge(birth_year);
			
			if(count_person==0) counting[0]++;
			else if(count_person==1)counting[1]++;
			else if(count_person==2)counting[2]++;
			else if(count_person==3)counting[3]++;
			else if(count_person==4)counting[4]++;
			else counting[5]++;
		}
	}
	
	public int askAge(int b) {
		age[i] = 2018-b+1;
		System.out.printf("나이는 %d입니다.\n",age[i]);
		if(age[i]<7&&age[i]>=1) {
			return 0;
		}
		else if(age[i]<13) {
			return 1;
		}
		else if(age[i]<20) {
			return 2;
		}
		else if(age[i]<30) {
			return 3;
		}
		else if(age[i]<60) {
			return 4;
		}
		else {
			return 5;
		}
	}
	
	public void print_result() {
		for(int k=0;k<6;k++) {
			System.out.printf("%s는 %d명 입니다.\n",p[k],counting[k]);
		}
	}
}
