package wa_lab.stepI;

import java.util.Scanner;

public class stepIManager {
   public stepIManager() {
      int menu;
      Scanner s = new Scanner(System.in);
      while(true) {
         System.out.println("\n---------------------");
         System.out.println("1. 1에100사이의 숫자 맞추기");
         System.out.println("2. 로또 번호 만들기.");
         System.out.println("3. 로또 번호 당첨 확인하기.");
         System.out.println("4. 가위바위보 게임하기.");
         System.out.println("5. pc방 요금 계산하기.");
         System.out.println("6.	쇼핑몰 매풀 계산기.");
         System.out.println("7. 놀이공원 매표소.");
         //System.out.println("8. 겹치지 않는 숫자 10개 입력받기");
         //System.out.println("9. 배열을 이용한 연중 날ㅉ 계산");
         //System.out.println("10. 배타적 배수 출력하기");
         System.out.println("=>원하는 메뉴는?(0:exit) :");
         menu = s.nextInt();
         if(menu == 0) break;
         switch(menu) {
         	case 1: 				
        	 	I1 a1 = new I1();
				a1.pick();
				break;
			case 2:
				I2 a2 = new I2();
				//a2.PrintCharWithBlank(c, h, b);
				break;
			case 3:
				I3 a3 = new I3();
				//a3.print_result();
				break;
			case 4:
				I4 a4 = new I4();
				//a4.print_result();
				break;
			case 5:
				I5 a5 = new I5();
				a5.print_result();
				break;	
			case 6:
				I6 a6 = new I6();		
				//a6.print_result();
				break;
			case 7:
				I7 a7 = new I7();
				//a7.print_result();
				break;
				
			/*case 8:
				I8 a8 = new I8();
				//a8.print_result();
				break;
			case 9:
				I9 a9 = new I9();
				a9.print_result();
				break;
			/*case 10:
				ExclusiveMultiple10 a10 = new ExclusiveMultiple10();
				a10.print_result();
				break;
			case 11:
				JudgeYear a11 = new JudgeYear();
				a11.result();
				break;*/
         }
      }
      
   }
   void printf(String s){
	   System.out.print(s);
   } 
   public static void main(String[] args) {
		// TODO Auto-generated metIod stub
		stepIManager g = new stepIManager();
	}
}