package wa_lab.stepK;

import java.util.Scanner;

public class K4 {
	Scanner s = new Scanner(System.in);
	int count[] = new int[5];
	int point[] = new int[100];
	
	public void main() {
		double x,y;
		int num;
		int judge;
		Point p = new Point();
		
		System.out.print("몇 개의 좌표를 입력하시겠습니까?");
		num = s.nextInt();
		
		for(int j=0;j<num;j++) {
			System.out.printf("%d번째 좌표의 X,Y값을 입력하시오-->",j+1);
			x = s.nextDouble();
			y = s.nextDouble();
			judge=p.get_area(x, y);
			
			if(judge==1) {
				count[0]++;
				point[j]=judge;
			}
			else if(judge==2) {
				count[1]++;
				point[j]=judge;
			}
			else if(judge==3) {
				count[2]++;
				point[j]=judge;
			}
			else if(judge==4) {
				count[3]++;
				point[j]=judge;
			}
			else {
				count[4]++;
				point[j]=judge;
			}
		}
		
		for(int a=0;a<num;a++) {
			System.out.printf("%d번째 좌표는 %d사분면에 위치합니다.\n", a+1,point[a]);
		}
		
		for(int k=0;k<4;k++) {
			System.out.printf("%d사분면의 좌표는 모두%d 개입니다.\n", k+1,count[k]);
		}
	}
}
