package wa_lab.stepC;

import java.util.*;

public class CalculateFile7 {
	int megabytes;
	long bytes;
	byte kind;
	double time;
	Scanner s = new Scanner(System.in);
	
	CalculateFile7(){
		print_result();
	}
	public void print_result() {
		System.out.print("파일 용량을 메가 바이트 단위로 입력하세요.");
		megabytes = s.nextInt();
		
		System.out.print("전송방식을 1: WI-FI, 2: BlueTooth, 3: LTE, 4:USB 에서 선택하여 입력하세요. ");
		kind=s.nextByte();
	}
	private double calculate() {
		bytes = (long)megabytes*1024*1024;
		if(kind==1) {
			time = (double)bytes /1500000;
		}
		else if(kind==2) {
			time = (double)bytes /300000;
		}
		else if(kind==3) {
			time = (double)bytes /1000000;
		}
		else if(kind==4) {
			time = (double)bytes /60000000;
		}
		return time;
	}
	public void result() {
		System.out.printf("파일 전송 시간은 %.1f 초입니다",calculate());
	}
}
