package com.ibm.banking.basics;

public class Project2 {
	static class vehicle {
		protected int speedup = 0 ;
		public void speedup() {
			speedup += 5;
	        System.out.println("Vehicle speed increased to " + speedup + " km/h");
		}
		

		public void brake() {
			speedup = 0 ;
			System.out.println("Brakes applied successfully");
		}
		
	}

   static class car extends vehicle {
		@Override
		public void speedup() {
			speedup += 20;
	        System.out.println("Car speed increased to " + speedup + " km/h");
		}
	}
	public static void main(String[] args) {
		vehicle maruti = new vehicle();
		car alto = new car();
		maruti.speedup();
		maruti.brake();
		
		alto.speedup();
		alto.brake();
	}
}
