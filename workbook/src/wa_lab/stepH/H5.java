package wa_lab.stepH;
import java.util.*;
public class H5 {
	int coins; // 사용자의 코인 수. (최초에 입력받음)
	int number[] = new int[3]; // 랜덤하게 만들어진 슬롯 머신의 숫자 3개의 리스트 
	int dummy; // 게임스타트를 위한 의미 없는 입력 숫자
	int i;
	Scanner s =  new Scanner(System.in);
	Random r = new Random();
	
	H5(){
		input();
	}
	private void generate() {
		int j;
		for(j=0;j<3;j++) {
			number[j]= r.nextInt(8)+1;
		}
	}
	
	public void input() {
		System.out.print("사용하실 코인의 개수를 입력하세요.\n");
		coins = s.nextInt();
		for(i=0; i<coins;i++) {
			System.out.printf("게임%d회 Start!!(아무 숫자나 입력하세요)", i+1);
			dummy = s.nextInt();
			generate();
			coins+=judge();
		}
		System.out.printf("\n게임 종료 \n", i+1);
	}
	
	public int judge() {
		int count=0 ;
		int k;
		System.out.print("게임 결과 : ");
		for(k=0;k<3;k++) {
			System.out.printf("   %d   ",number[k]);
		}
		if(number[0]==number[1]&&number[1]==number[2]) {
			System.out.printf("숫자 3개 일치... 코인 4개 증정\n");
			count+=4;
		}else if(number[0]==number[1]||number[1]==number[2]||number[0]==number[2]) {
			System.out.printf("숫자 2개 일치... 코인 2개 증정\n");
			count+=2;
		}else {
			System.out.printf("꽝입니다... 아쉽군요..\n");
		}
		return count;
	}
}
