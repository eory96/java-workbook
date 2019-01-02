package wa_lab.stepE;
import java.util.*;
public class Triangle2 {
	int height;
	int blank;
	int i,j,k;
	Scanner s = new Scanner(System.in);
	
	Triangle2(){
		input();
	}
	public void input() {
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
		height = s.nextInt();
		blank = s.nextInt();
	}
	public void print_result() {
		for(i=0;i<height;i++) {

			for(j=i;j<height-1+blank;j++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
