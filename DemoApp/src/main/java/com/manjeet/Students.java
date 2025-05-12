package com.manjeet;

import java.util.concurrent.locks.ReadWriteLock;

import javax.imageio.ImageTranscoder;

public class Students {
	
	String nameString;
	int rollNum;
	
	public Students(int roll , String name) {
		// TODO Auto-generated constructor stub
		
		nameString =name;
		rollNum = roll;
		
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	

	@Override
	public String toString() {
		return "Students [nameString=" + nameString + ", rollNum=" + rollNum + "]";
	}
	
	

}
