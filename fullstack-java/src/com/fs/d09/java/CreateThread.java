package com.fs.d09.java;

public class CreateThread extends Thread{
		
		String name;
		public CreateThread(String name){
			this.name = name;
			setName(name);
			start();
		}
		
		@Override
		public void run() {
			for(int i=0;i<10;i++){
				System.out.println(name + " "+Thread.currentThread());
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				testOne();
			}
//			CreateThread two = new CreateThread("three");
		}
		public void testOne() {
			int k = 10;
			String s = "test";
			//int j = k/0;
		}
		
		public static void main(String[] args) {
			CreateThread one = new CreateThread("one");
			
			CreateThread two = new CreateThread("two");
			//int k = 10/0;
			try {
				one.join();
				two.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
				
			
			System.out.println("Main Done "+Thread.currentThread());
		}
}
