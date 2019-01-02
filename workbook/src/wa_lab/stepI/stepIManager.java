package wa_lab.stepI;

import java.util.Scanner;

public class stepIManager {
   public stepIManager() {
      int menu;
      Scanner s = new Scanner(System.in);
      while(true) {
         System.out.println("\n---------------------");
         System.out.println("1. 메뉴판 보여주기");
         System.out.println("2. 빈칸과 함께 특정 문자를 개수만큼 찍기");
         System.out.println("3. 비만판정.");
         System.out.println("4. 메뉴번호 받아오기.");
         System.out.println("5. 최댓값 리턴하는 메서드.");
         System.out.println("6.	임의의 숫자를 만들어 구간을 리턴하는 메소드 만들기.");
         System.out.println("7. 자판기에서 선택한 음료 가격을 리턴하는 메소드 만들기.");
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