package wa_lab.stepB;

import java.util.Scanner;

public class StepBManager {
   public StepBManager() {
      int menu;
      Scanner s = new Scanner(System.in);
      while(true) {
         System.out.println("\n---------------------");
         System.out.println("1. 나이계산 및 미성년나 판별");
         System.out.println("2. 온도변환");
         System.out.println("3. 직사각형 넓이계산");
         System.out.println("4. 아파트 평형 계산");
         System.out.println("5. 날짜계산");
         System.out.println("6. 점수계산");
         System.out.println("7. 파일 용량 계산");
         System.out.println("8. 다양한 조건 판정");
         System.out.println("9. 비만 판정");
         System.out.println("=>원하는 메뉴는?(0:exit) :");
         menu = s.nextInt();
         if(menu == 0) break;
         switch(menu) {
         case 1: 				
        	 	CalculateAge1 a1 = new CalculateAge1();
				a1.printA1();
				break;
			case 2:
				ChangeTemp2 a2 = new ChangeTemp2();
				a2.printA2();
				break;
			case 3:
				CalculateRect3 a3 = new CalculateRect3();
				break;
				
			case 4:
				CalculatePyung4 a4 = new CalculatePyung4();
				break;
			case 5:
				CalculateDay5 a5 = new CalculateDay5();
				break;
			case 6:
				CalculateScore6 a6 = new CalculateScore6();		
				break;
			case 7:
				CalculateFile7 a7 = new CalculateFile7();
				break;
			case 8:
				VariousCondition8 a8 = new VariousCondition8();
				break;
			case 9:
				CalculateBMI9 a9 = new CalculateBMI9();
				break;
         }
      }
      
   }
   void printf(String s){
	   System.out.print(s);
   } 
}