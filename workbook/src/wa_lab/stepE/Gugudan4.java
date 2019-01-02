package wa_lab.stepE;

import java.util.*;

public class Gugudan4 {
	int mode;
	int i,j;
	Scanner s = new Scanner(System.in);
	Gugudan4(){
		input();
	}
	public void input() {
		System.out.print("구구단의 출력모드(1:홀수단, 2:짝수단)를 입력하세요");
		mode = s.nextInt();
	}
	
	public void print_result() {
		if(mode==1)
			mode=mode+2;
		
		for(i=mode;i<10;i=i+2) {
			for(j=1;j<10;j++) {
				System.out.printf("%d x %d = %d		",i,j,i*j);
				if(j%3==0)
					System.out.print("\n");
			}
			System.out.print("\n");
		}
		/*if(mode==1) {
			for(i=3;i<10;i=i+2) {
				for(j=1;j<10;j++) {
					System.out.printf("%d x %d = %d		",i,j,i*j);
					if(j%3==0)
						System.out.print("\n");
				}
				System.out.print("\n");
			}
		}else {
			for(i=2;i<9;i=i+2) {
				for(j=1;j<10;j++) {
					System.out.printf("%d x %d = %d		",i,j,i*j);
					if(j%3==0)
						System.out.print("\n");
				}
				System.out.print("\n");
			}
		}*/
	}
}
