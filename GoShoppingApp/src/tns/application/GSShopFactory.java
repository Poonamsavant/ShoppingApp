package tns.application;

import tns.framework.NormalAcc;
import tns.framework.PrimeAcc;
import tns.framework.ShopFactory;

public class GSShopFactory implements ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accno, String accname, float charges) {
		PrimeAcc pa = new PrimeAcc(accno, accname,charges);
		return pa;
	}

	@Override
	public NormalAcc getNormalAccount(int accno, String accname, float charges) {
		NormalAcc na =new NormalAcc(accno, accname, charges);
		return na;
	}
	


}
