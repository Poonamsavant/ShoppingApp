package tns.application;

import tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
			}

	public void bookProducts(float charges) {
		//String deliverycharges = null;
		// TODO Auto-generated method stub
		System.out.println("You have purchesed the product with charges "+charges+ " along with deliverycharges"+deliverycharges);
	}


}
