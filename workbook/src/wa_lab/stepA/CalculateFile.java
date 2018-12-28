package wa_lab.stepA;

import java.util.*;

public class CalculateFile {
	int giga;
	int mega;
	int kilo;
	long bytes;
	

	public CalculateFile() {input();}
	public void printA7() {
		System.out.print(output_mega()+"메가바이트,\n");
		System.out.print(output_kilo()+"킬로바이트,\n");
		System.out.print(output_byte()+"바이트 입니다.\n");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요.\n");
		giga = s.nextInt();

	}
	
	int output_mega() {
		mega = giga *1024;
		return mega;
	}
	int output_kilo() {
		kilo = mega *1024;
		return kilo;
	}
	
	long output_byte() {
		bytes = (long)kilo *1024;
		return bytes;
	}
}
