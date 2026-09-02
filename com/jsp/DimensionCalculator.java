package com.jsp;

public interface DimensionCalculator{
	double pi = 22.0/7.0;
	
	public abstract void areaOfCircle(int rad);
	
	abstract void circumfaranceOfCircle(int rad);
	
	void volumeOfSpere(int rad);
}