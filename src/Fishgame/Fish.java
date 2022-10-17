package Fishgame;

public class Fish extends GameObject{

	public Fish(int distance, int x, int y) {
		super(distance, x, y); 
		
	}

	@Override
	protected void move() {
		int n = (int)(Math.random() * 5);
		if(n == 0) {
			x += distance;
		}else if(n == 1) {
			x -= distance;
		}
		
		if (x < 0)
			x = 0;
		if(x >= Game.MAX_X)
			x = Game.MAX_X - 1;
		
		n = (int)(Math.random() * 5);
		if(n == 0)
			y += distance;
		else if(n == 1)
			x -= distance;
		
		if(y < 0)
			y = 0;
		if(y >= Game.MAX_Y)
			y = Game.MAX_Y -1;
		
	}

	@Override
	protected char getShape() {
		
		return '@';
	}
	
}
