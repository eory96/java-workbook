package wa_lab.stepB;

import java.util.*;

public class CalculateFile7 {
	int megabytes;
	long bytes; 
	String usb2; 
	int time;
	Scanner s =  new Scanner(System.in);
	
	CalculateFile7(){
		print_result();
	}
	
	private void print_result() {
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요 ");
		megabytes=s.nextInt();
		System.out.print("USB포트가 2.0이면Y, 아니면 N을 입력하세요 ");
		usb2 = s.next();
		bytes=megabytes*1024*1024;
		
		if(usb2.equals("Y")) {
			time=(int) (bytes/60000000);
		}else {
			time=(int) (bytes/1500000);
		}
		System.out.print("파일 전송 시간은"+time+"초 입니다.");
	}
}
