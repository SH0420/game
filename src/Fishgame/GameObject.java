package Fishgame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor 
public abstract class GameObject {
	protected int distance; // 이동  거리
	protected int x,y; // 현재 위치

	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	protected abstract void move();
	protected abstract char getShape();
	
	
	
}
