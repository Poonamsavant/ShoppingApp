package tns;

import tns.application.GSNormalAcc;
import tns.application.GSPrimeAcc;
import tns.application.GSShopFactory;
import tns.framework.NormalAcc;
import tns.framework.PrimeAcc;
import tns.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory sf = new GSShopFactory();
		PrimeAcc pa =new GSPrimeAcc(123, "sanjana",1000);
		pa.bookProducts(500);
		NormalAcc na = new GSNormalAcc(1234,"poonam",0);
		na.bookProducts(500);
	
	}


}
