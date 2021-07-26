package org.bank;

public class HdfcBank extends AxixBank {
	
	public void rateOfInterest() {
		System.out.println("get rate of interest 12%");
}
	public static void main(String[] args) {
		Bank b=new Bank();
		b.getRateOfInterest();
		
	}

}
