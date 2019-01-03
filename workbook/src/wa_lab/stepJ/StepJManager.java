package wa_lab.stepJ;

import java.util.Scanner;

public class StepJManager {
	public StepJManager() {
	      int menu;
	      Scanner s = new Scanner(System.in);
	      while(true) {
	         System.out.println("\n---------------------");
	         System.out.println("1. 나이 계산 및 연령대 판");
	         System.out.println("2. 심사점수 계산 하기.");
	         System.out.println("3. 물의 온도 구간 개수 판정.");
	         System.out.println("4. 연중 날짜 계산 메소드를 이용한 날짜 간격 세기.");
	         System.out.println("5. 주차 관리 시스템.");
	         System.out.println("6. 피보나치 수 구하기.");
	         System.out.println("7.2의 제곱수 구하기.");
	         System.out.println("8. Ackermann수 구하기");
	         System.out.println("9. pow()메소드 만들기.");
	         System.out.println("10. 피보나치 수열로 황금비율 구하기.");
	         System.out.println("=>원하는 메뉴는?(0:exit) :");
	         menu = s.nextInt();
	         if(menu == 0) break;
	         switch(menu) {
	         	case 1: 				
	        	 	J1 a1 = new J1();
					a1.print_result();
					break;
				case 2:
					J2 a2 = new J2();
					a2.print_result();
					break;
				case 3:
					J3 a3 = new J3();
					a3.print_result();
					break;
				case 4:
					J4 a4 = new J4();
					a4.print_result();
					break;
				case 5:
					J5 a5 = new J5();
					//a5.print_result();
					break;	
				case 6:
					J6 a6 = new J6();		
					//a6.print_result();
					break;
				case 7:
					J7 a7 = new J7();
					//a7.print_result();
					break;
					
				case 8:
					J8 a8 = new J8();
					//a8.print_result();
					break;
				case 9:
					J9 a9 = new J9();
					//a9.print_result();
					break;
				case 10:
					J10 a10 = new J10();
					//a10.print_result();
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StepJManager j = new StepJManager();
	}

}
