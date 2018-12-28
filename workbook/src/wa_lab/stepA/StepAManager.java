package wa_lab.stepA;

import java.util.Scanner;

public class StepAManager {
   public StepAManager() {
      int menu;
      Scanner s = new Scanner(System.in);
      while(true) {
         System.out.println("---------------------\n");
         System.out.println("1. 나이계산\n");
         System.out.println("2. 온도변환\n");
         System.out.println("3. 직사각형 넓이계산\n");
         System.out.println("4. 아파트 평형 계산\n");
         System.out.println("5. 날짜계산\n");
         System.out.println("6. 점수계산\n");
         System.out.println("7. 파일 용량 계산\n");
         System.out.println("=>원하는 메뉴는?(0:exit) :");
         menu = s.nextInt();
         if(menu == 0) break;
         switch(menu) {
         case 1: 				
        	 	CalculateAge a1 = new CalculateAge();
				a1.printA1();
				break;
			case 2:
				ChageTemp a2 = new ChageTemp();
				a2.printA2();
				break;
			case 3:
				CalculateRect a3 = new CalculateRect();
				a3.printA3();
				break;
			case 4:
				ClaculatePyung a4 = new ClaculatePyung();
				a4.printA4();
				break;
			case 5:
				CalculateDay a5 = new CalculateDay();
				a5.printA5();
				break;
			case 6:
				CalculateScore a6 = new CalculateScore();
				a6.printA6();
				break;
			case 7:
				CalculateFile a7 = new CalculateFile();
				a7.printA7();
				break;
         }
      }
      
   }
   void printf(String s){System.out.print(s);} 
}