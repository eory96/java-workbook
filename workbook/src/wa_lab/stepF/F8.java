package wa_lab.stepF;

import java.util.*;

public class F8 {
	int number[] = new int[10];// 사용자가 입력한 숫자 10개
	boolean dup=false; 
	int i;
	Scanner s = new Scanner(System.in);
	
	F8(){
		input();
	}
	
	public void input() {
		System.out.print("1부터 100사이의 숫자를 입력하시오.\n");
		for(i=0;i<10;i++) {
			System.out.printf("%d번째 숫자를 입력하시오.",i+1);
			number[i]=s.nextInt();
			
			if(re(number[i],i)==true) {
				i--;
				System.out.print("잘못 입력하였습니다. 다시 입력하세요.\n");
			}
			
		}
	}
	
	private Boolean re(int j,int k) {
		if(k!=0) {
			for(int a=0;a<=k-1;a++) {
				if(number[a]==j) {
					dup = true;
					return dup;
				}
				else
					dup = false;
			}
		}
		return dup;
	}
	
	public void print_result() {
		for(i=0;i<10;i++) {
			System.out.printf("%d번째 숫자는 %d 입니다.\n",i+1,number[i]);
		}
	}
}
