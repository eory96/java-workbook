package wa_lab.stepA;

import java.util.*;

public class CalculateRect {
	int weight;
	int height;
	int area;

	public CalculateRect() {
		input();
	}

	public void printA3() {
		System.out.println("\n직사각형의 넓이는,"+output()+"입니다.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);

		System.out.print("직사각형의 가로 크기를 입력하시오.");
		weight = s.nextInt();

		System.out.print("직사각형의 세로 크기를 입력하시오.");
		height = s.nextInt();
	}

	int output() {
		area = height * weight;

		return area;

	}
}
