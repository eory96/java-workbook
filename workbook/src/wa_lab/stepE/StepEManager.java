package wa_lab.stepE;

import java.util.Scanner;

public class StepEManager {
   public StepEManager() {
      int menu;
      Scanner s = new Scanner(System.in);
      while(true) {
         System.out.println("\n---------------------");
         System.out.println("1. 정사각형의 출력");
         System.out.println("2. 우직각 삼각형의 출력");
         System.out.println("3. 이등변 삼각형의 출력");
         System.out.println("4. 구구단의 출력");
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
        	 	Rect1 a1 = new Rect1();
				a1.print_result();
				break;
			case 2:
				Triangle2 a2 = new Triangle2();
				a2.print_result();
				break;
			case 3:
				EqualTriangle3 a3 = new EqualTriangle3();
				a3.print_result();
				break;
			case 4:
				Gugudan4 a4 = new Gugudan4();
				a4.print_result();
				break;
			case 5:
				GugudanCol5 a5 = new GugudanCol5();
				a5.print_result();
				break;	
			case 6:
				Number6 a6 = new Number6();		
				a6.print_result();
				break;
			/*case 7:
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