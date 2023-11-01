package question1;

public class Invoice {
	
	private String partNo;
	private String partDesc;
	private int partQuantity;
	private double partPrice;
	
	Invoice(String partNo, String partDesc, int partQuantity, double partPrice){
		if(partQuantity < 0) {
			this.partQuantity = 0;
		}
		else {
			this.partQuantity = partQuantity;
		}
		
		if(partPrice < 0) {
			this.partPrice = 0.0;
		}
		else {
			this.partPrice = partPrice;
		}
		
		this.partDesc = partDesc;
		this.partNo = partNo;	
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public void setPartPrice(double partPrice) {
		this.partPrice = partPrice;
	}
	public void setPartQuantity(int partQuantity) {
		this.partQuantity = partQuantity;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public String getPartNo() {
		return partNo;
	}
	public double getPartPrice() {
		return partPrice;
	}
	public int getPartQuantity() {
		return partQuantity;
	}
	
	public double calculateBill() {
		return this.partPrice * this.partQuantity;
	}
}
