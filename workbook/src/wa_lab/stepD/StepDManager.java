package wa_lab.stepD;

import java.util.Scanner;

public class StepDManager {
   public StepDManager() {
      int menu;
      Scanner s = new Scanner(System.in);
      while(true) {
         System.out.println("\n---------------------");
         System.out.println("1. 1부터 숫자 더하기");
         System.out.println("2. 입력받은 수중 가장 큰수와 작은수 구하기");
         System.out.println("3. 입력 받는 숫자들의 총합계과 평균");
         System.out.println("4. 미성년자 명수 계산");
         System.out.println("5. 직사각형의 종류별 갯수 파악");
         System.out.println("6. 아파트 종류별 갯수 파악");
         System.out.println("7. 1차 메소드의 좌표 구하기");
         System.out.println("8. 2차 메소드의 좌표 구하기");
         System.out.println("9. 구구단 출력");
         System.out.println("10. 배타적 배수 출력하기");
         System.out.println("=>원하는 메뉴는?(0:exit) :");
         menu = s.nextInt();
         if(menu == 0) break;
         switch(menu) {
         case 1: 				
        	 	AddOneToNum1 a1 = new AddOneToNum1();
				a1.print_result();
				break;
			case 2:
				JudgeMaxMin2 a2 = new JudgeMaxMin2();
				break;
			case 3:
				TotalAverage3 a3 = new TotalAverage3();
				break;
			case 4:
				CountAge4 a4 = new CountAge4();
				//a4.result();
				break;
			case 5:
				JudgeRect5 a5 = new JudgeRect5();
				a5.print_result();
				break;	
			case 6:
				JudgeApartment6 a6 = new JudgeApartment6();		
				a6.print_result();
				break;
			case 7:
				CalculateMethod7 a7 = new CalculateMethod7();
				a7.print_result();
				break;
				
			case 8:
				CalculateTwoMethod8 a8 = new CalculateTwoMethod8();
				a8.print_result();
				break;
			case 9:
				Gugudan9 a9 = new Gugudan9();
				a9.print_result();
				break;
			case 10:
				ExclusiveMultiple10 a10 = new ExclusiveMultiple10();
				a10.print_result();
				break;
			/*case 11:
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