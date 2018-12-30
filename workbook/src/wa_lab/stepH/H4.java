package wa_lab.stepH;

import java.util.*;

public class H4 {
	int com_finger; 
	int my_finger; 
	int score[][] = new int[2][3];
	int i, j;
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	
	H4(){
		input();
	}
	public void input() {
		while(true) {
			com_finger = r.nextInt(2)+1;
			System.out.print("가위(1), 바위(2), 보(3)를 입력하세요.");
			my_finger = s.nextInt();
			
			if(my_finger ==0)
				break;
			else if(my_finger ==1 && com_finger ==2) { 
				System.out.print("컴퓨터가 낸 것은 바위입니다.---> 컴퓨터 승!\n");
				score[0][0]++;
				score[1][2]++;
			}
			else if(my_finger ==2 && com_finger ==3) { 
				System.out.print("컴퓨터가 낸 것은 보입니다.---> 컴퓨터 승!\n");
				score[0][0]++;
				score[1][2]++;
				
				}
			else if(my_finger ==3 && com_finger ==1) { 
				System.out.print("컴퓨터가 낸 것은 가위입니다.---> 컴퓨터 승!\n");
				score[0][0]++;
				score[1][2]++;
			}
			else if(my_finger ==1 && com_finger ==3) {
				System.out.print("컴퓨터가 낸 것은 보입니다.---> 사용자 승!\n");
				score[0][2]++;
				score[1][0]++;
			}
			else if(my_finger ==2 && com_finger ==1) { 
				System.out.print("컴퓨터가 낸 것은 가위입니다.---> 사용자 승!\n");
				score[0][2]++;
				score[1][0]++;
			}
			else if(my_finger ==3 && com_finger ==2) {
				System.out.print("컴퓨터가 낸 것은 바위입니다.---> 사용자 승!\n");
				score[0][2]++;
				score[1][0]++;
			}
			else if(my_finger == com_finger) { 
				if(com_finger ==1)
					System.out.print("컴퓨터가 낸 것은 가위입니다.---> 비김!\n");
				else if(com_finger ==2)
					System.out.print("컴퓨터가 낸 것은 바위입니다.---> 비김!\n");
				else if(com_finger ==3)
					System.out.print("컴퓨터가 낸 것은 보입니다.---> 비김!\n");
				score[0][1]++;
				score[1][1]++;
			}
		}
	}
	public void print_result() {
		System.out.printf("컴퓨터 : 이긴 횟수는 %d회, 진 횟수는 %d회, 비긴 횟수는 %d회 입니다.\n",score[0][0],score[0][2],score[0][1]);
		System.out.printf("사용자 : 이긴 횟수는 %d회, 진 횟수는 %d회, 비긴 횟수는 %d회 입니다.\n",score[1][0],score[1][2],score[1][1]);
	}
}
