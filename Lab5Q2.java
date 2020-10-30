package com.Multithread;

import java.util.Random;

class RandomNumber implements Runnable{
	private Thread thread;
	public RandomNumber() {
		this.thread=new Thread(this);
	}
	int sum=0;
	public void run() {
		
		
		
			Random random=new Random();
		   int number=random.nextInt(10);
		   System.out.println("Number is: "+number);
		   sum=sum+number;
	}
		public void printAdd(){
		System.out.println(" random Sum value is "+sum);
		}
	
	public void start() {
		if(thread==null) {
			thread=new Thread(this);
		}
		thread.start();
	}
}

public class Lab5Q2 {

	public static void main(String[] args) {
		RandomNumber randnum=new RandomNumber();
     Thread randnum1=new Thread(randnum);
      Thread randnum2=new Thread(randnum);
      Thread randnum3=new Thread(randnum);
      Thread randnum4=new Thread(randnum);
      Thread randnum5=new Thread(randnum);
      randnum1.start();
      randnum2.start();
      randnum3.start();
      randnum4.start();
      randnum5.start();
	
	try {
		randnum1.join();
		randnum2.join();
		randnum3.join();
		randnum4.join();
		randnum5.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	randnum.printAdd();
	}
}
