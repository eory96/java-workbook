package wa_lab.stepK;

import java.util.*;

public class Point {
	Scanner s = new Scanner(System.in);
	double x_point[]=new double[100];
	double y_point[]=new double[100];
	int i=0;
	
	public int get_area(double x, double y) {
		x_point[i]=x;
		y_point[i]=y;
		i++;
		if(x>0&&y>0)
			return 1;
		else if(x<0&&y>0)
			return 2;
		else if(x<0&&y<0)
			return 3;
		else if(x>0&&y<0)
			return 4;
		else
			return 0;
	}
}
