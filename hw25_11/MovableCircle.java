package com.demo.hwoop2;

public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;
	
    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed ) {
		// TODO Auto-generated constructor stub
		center = new MovablePoint(x,y,xSpeed,ySpeed);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		center.moveUp();
	}
	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		center.moveDown();
	}
	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		center.moveLeft();
	}
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		center.moveRight();
	}
}
