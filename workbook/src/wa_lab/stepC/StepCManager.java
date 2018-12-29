package wa_lab.stepC;

import java.util.Scanner;

public class StepCManager {
   public StepCManager() {
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
         System.out.println("9. 소득세 계산");
         System.out.println("10. 계산기");
         System.out.println("11. 윤년 판정");
         System.out.println("=>원하는 메뉴는?(0:exit) :");
         menu = s.nextInt();
         if(menu == 0) break;
         switch(menu) {
         case 1: 				
        	 	CalculateAge1 a1 = new CalculateAge1();
				a1.printA1();
				break;
			case 2:
				CalculateTemp2 a2 = new CalculateTemp2();
				break;
			case 3:
				CalculateRect3 a3 = new CalculateRect3();
				break;
			case 4:
				CalculatePyung4 a4 = new CalculatePyung4();
				a4.result();
				break;
			case 5:
				CalculateDay5 a5 = new CalculateDay5();
				break;	
			case 6:
				CalculateScore6 a6 = new CalculateScore6();		
				break;
			case 7:
				CalculateFile7 a7 = new CalculateFile7();
				a7.result();
				break;
				
			case 8:
				CalculateMaxMin a8 = new CalculateMaxMin();
				a8.result();
				break;
			case 9:
				CalculateTax9 a9 = new CalculateTax9();
				a9.result();
				break;
			case 10:
				SimpleCal10 a10 = new SimpleCal10();
				a10.print_result();
				break;
			case 11:
				JudgeYear a11 = new JudgeYear();
				a11.result();
				break;
         }
      }
      
   }
   void printf(String s){
	   System.out.print(s);
   } 
}