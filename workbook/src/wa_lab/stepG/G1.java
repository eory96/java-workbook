package wa_lab.stepG;

import java.util.*;

public class G1 {
	int birth_year; 
	int age[] = new int[100];
	int count_person; 
	int count_baby;
	int count_child; 
	int count_youth; 
	int count_young;
	int count_adult; 
	int count_old;
	int i;
	Scanner s = new Scanner(System.in);
	G1(){
		input();
	}
	public void input() {
		for(i=0;i<100;i++) {
			System.out.printf("%d번째 사람의 태어난 년도를 입력하시오.", i+1);
			birth_year=s.nextInt();
			if(birth_year>=2019)
				break;
			age[i]=2018-birth_year+1;	
		}
	}
	private void counting() {
		for(i=0;i<100;i++) {
			if(age[i]<7&&age[i]>=1) {
				count_baby++;
			}
			else if(age[i]<13) {
				count_child++;
			}
			else if(age[i]<20) {
				count_youth++;
			}
			else if(age[i]<30) {
				count_young++;
			}
			else if(age[i]<60) {
				count_adult++;
			}
			else {
				count_old++;
			}
		}
	}
	public void print_result() {
		for(i=0;i<100;i++) {
			if(age[i]==0)
				break;
			System.out.printf("%d번째 사람의 나이는 %d 입니다.\n",i+1,age[i]);
		}
		counting();
		System.out.println("유아는 "+count_baby+"명 입니다. ");
		System.out.println("어린이는 "+count_child+"명 입니다. ");
		System.out.println("청소년은 "+count_youth+"명 입니다. ");
		System.out.println("청년은 "+count_young+"명 입니다. ");
		System.out.println("중년은 "+count_adult+"명 입니다. ");
		System.out.println("노년은 "+count_old+"명 입니다. ");
	}
}
