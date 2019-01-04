package wa_lab.stepK;

import java.util.*;

public class K3 {
	Scanner s = new Scanner(System.in);
	int count[] = new int[5];
	
	
	public void main() {
		double x,y;
		int judge;
		Point p = new Point();
		System.out.print("좌표의 X,Y값을 입력하시오-->");
		x = s.nextDouble();
		y = s.nextDouble();
		judge=p.get_area(x, y);
		
		if(judge==1) {
			System.out.printf("1번째 좌표는 %d사분면에 위치합니다.\n",judge);
			count[0]++;
		}
		else if(judge==2) {
			System.out.printf("1번째 좌표는 %d사분면에 위치합니다.\n",judge);
			count[1]++;
		}
		else if(judge==3) {
			System.out.printf("1번째 좌표는 %d사분면에 위치합니다.\n",judge);
			count[2]++;
		}
		else if(judge==4) {
			System.out.printf("1번째 좌표는 %d사분면에 위치합니다.\n",judge);
			count[3]++;
		}
		else count[4]++;
		
		for(int k=0;k<4;k++) {
			System.out.printf("%d사분면의 좌표는 모두%d 개입니다.\n", k+1,count[k]);
		}
	}
}
