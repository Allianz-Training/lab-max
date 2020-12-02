package com.demo.hwoop2;

public class MovablePoint implements Movable {
	public int x;
	public int y;
	public int xSpeed;
	public int ySpeed;
	
	public MovablePoint(int x,int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	@Override
	public String toString() {
		return "X: "+x+" Y: "+y;
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		y += 1;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		y -= 1;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		x -= 1;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		x += 1;
	}

}
