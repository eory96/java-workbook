package wa_lab.stepK;

import java.util.*;

public class MenuPan {
	Scanner s = new Scanner(System.in);
	int num[]=new int[100];
	int cost[] = new int[100];
	String name[] = new String[100];
	String nation[] = new String[100];
	
	MenuPan(){
	}
	
	public void input(int n) {
		for(int i=0;i<n;i++) {
			System.out.printf("%d번 메뉴의 번호, 메뉴명, 윈산지, 가격을 입력하시오.",i+1);
			num[i] = s.nextInt();
			name[i] = s.next();
			nation[i] = s.next();
			cost[i] = s.nextInt();
		}
	}
	
	public void output(int n) {
		System.out.println("==================================");
		System.out.print("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		for(int i=0;i<n;i++)
			System.out.printf("%d\t%s\t%s\t%d\n",num[i],name[i],nation[i],cost[i]);
	}

}
