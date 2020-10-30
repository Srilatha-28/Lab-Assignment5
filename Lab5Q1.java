package com.Multithread;
class MyThread implements Runnable{
private Thread thread;
private String name;

	public MyThread(String name) {
	this.thread=new Thread(this);
	this.name = name;
}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("thread Name: "+name+"  Number :"+i);		
		}
		
	}
	public void start() {
		if(thread==null) {
			thread=new Thread(this,name);
			thread.start();
		}
	}
	
}
public class Lab5Q1 {
	public static void main(String[] args) {
		MyThread mythread=new MyThread("Thread");
	      Thread thread=new Thread(mythread,"1");
	      Thread thread1=new Thread(mythread,"2");
	      Thread thread2=new Thread(mythread,"3");
	      
	      thread.start();
	      thread1.start();
	      thread2.start();
	}
      
      
}
