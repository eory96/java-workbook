package wa_lab.stepI;

import java.util.Scanner;

public class I7 {
	int menu,price;
	//String no ="N";
	int count=0;
	String str;
	Scanner s = new Scanner(System.in);
	
	public I7(){
		input();
	}
	
	public void input() {
		
		while(true) {
			count++;
			System.out.print("1.콜라(700원) 2.커피(300원) 3. 레몬주스(1000원) 4. 홍차(500원) 5. 코코아(600원)\n");
			price += SelectCan();
			System.out.print("더 필요하십니까 (Y/N)");
			str = s.next();
			if(str.equalsIgnoreCase("N"))
				break;
		}
		System.out.printf("%d개의 음료를 선택하여 총 %d원 입니다.",count, price);
	}
	
	int SelectCan() {
		
		System.out.print("메뉴를 선택해주세요 : ");
		menu = s.nextInt();
		
		if(menu==1)
			return 700;
		else if(menu==2)
			return 300;
		else if(menu==3)
			return 1000;
		else if(menu==4)
			return 500;
		else if(menu==5)
			return 600;
		
		return 0;
		
	}
}
