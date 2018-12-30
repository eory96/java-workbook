package wa_lab.stepF;

import java.util.Scanner;

public class StepFManager {
   public StepFManager() {
      int menu;
      Scanner s = new Scanner(System.in);
      while(true) {
         System.out.println("\n---------------------");
         System.out.println("1. 두 번째로 큰 수의 순서 찾기.");
         System.out.println("2. 심사점수 계산.");
         System.out.println("3. 5명의 국,영,수 3과목 점수의 학생별 총점, 평균값 구하기1.");
         System.out.println("4. 5명의 국,영,수 3과목 점수의 학생별 총점, 평균값 구하기2.");
         System.out.println("5. 비만 판정.");
         System.out.println("6.	5층 아파트의 거주자 숫자 구하기.");
         System.out.println("7. 5층 아파트의 층별, 호수별 거주자 숫자 구하기.");
         System.out.println("8. 겹치지 않는 숫자 10개 입력받기");
         System.out.println("9. 배열을 이용한 연중 날ㅉ 계산");
         //System.out.println("10. 배타적 배수 출력하기");
         System.out.println("=>원하는 메뉴는?(0:exit) :");
         menu = s.nextInt();
         if(menu == 0) break;
         switch(menu) {
         	case 1: 				
        	 	F1 a1 = new F1();
				a1.print_result();
				break;
			case 2:
				F2 a2 = new F2();
				a2.print_result();
				break;
			case 3:
				F3 a3 = new F3();
				a3.print_result();
				break;
			case 4:
				F4 a4 = new F4();
				a4.print_result();
				break;
			case 5:
				F5 a5 = new F5();
				a5.print_result();
				break;	
			case 6:
				F6 a6 = new F6();		
				a6.print_result();
				break;
			case 7:
				F7 a7 = new F7();
				a7.print_result();
				break;
				
			case 8:
				F8 a8 = new F8();
				a8.print_result();
				break;
			case 9:
				F9 a9 = new F9();
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
}