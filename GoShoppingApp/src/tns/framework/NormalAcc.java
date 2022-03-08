package tns.framework;

public class NormalAcc  extends ShopAcc {
	protected float deliverycharges=50;
	public NormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	}

	
	public float getDeliverycharges() {
		return deliverycharges;
	}

	public void setDeliverycharges(float deliverycharges) {
		this.deliverycharges = deliverycharges;
	}
	

 

}
