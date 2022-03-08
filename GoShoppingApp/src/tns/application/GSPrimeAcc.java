package tns.application;

import tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
	}

	@Override
	public void bookProducts(float charges) {
		System.out.println("You have purchesed the product of charge"+charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [isIsprime()=" + isIsprime() + ", toString()=" + super.toString() + ", getAccno()="
				+ getAccno() + ", getAccname()=" + getAccname() + ", getCharges()=" + getCharges() + ", getClass()="
				+ getClass() + "]";
	}
	
	



}
