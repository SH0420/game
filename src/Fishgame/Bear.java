package Fishgame;

import java.util.Scanner;

public class Bear extends GameObject{
	
	private Scanner sc;

	public Bear(int distance, int x, int y) {
		super(distance, x, y);
		sc=new Scanner(System.in);
	}

	@Override
	public void move() {
		System.out.println("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		char c;
		c = sc.next().charAt(0);
		if(c == 'a') {
			x--;
			if(x < 0)
				x = 0;
		}else if((c == 'f')) {
			x++;
			if(x >= Game.MAX_X)
				x = Game.MAX_X - 1; 
		}else if((c == 'd')) {
			y--;
			if(y < 0)
				y =0;
		}else if((c == 's')) {
			y++;
			if(y >= Game.MAX_Y)
				y = Game.MAX_Y - 1;
		}
	} 

	@Override
	public char getShape() {
		
		return 'B'; 
	}
	

}
