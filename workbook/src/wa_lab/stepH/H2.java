package wa_lab.stepH;

import java.util.*;

public class H2 {
	int lotto[] = new int[6]; 
	int count;
	String onemore;
	int i;
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	H2(){
		input();
	}
	public void input() {
		while(true) {
			generate();
			System.out.printf("생성된 로또 번호는 ");
			for(i=0;i<6;i++) {
				System.out.printf("%d ", lotto[i]);
			}
			System.out.printf("입니다.\n ");
			System.out.print("더 만드시겠습니까?(Y/N)");
			onemore = s.nextLine();
			if(onemore.equals("N"))
				break;
		}
	}
	
	private void generate() {
		for(i=0;i<6;i++) {
			lotto[i] = r.nextInt(44)+1;
			for(int j=0;j<i;j++) {
				if(lotto[j]==lotto[i]) {
					while(true) {
						if(lotto[j]==lotto[i])
							lotto[i] = r.nextInt(45);
						else if(lotto[i-1]!=lotto[i])
							break;
					}
				}
			}
		}
	}
}
