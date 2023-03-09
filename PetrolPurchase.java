public class PetrolPurchase{
	
	//instance variable
	
	private String location;
	private String petrolType;
	private int petrolQuantity;
	private double pricePerLiter;
	private double discountPercentage;
	
	//constructor
	
	public Petrol(String location, String petrolType, int petrolQuantity, double pricePerLiter, double discountPercentage){
	
	this.location = location;
	this.petrolType = petrolType;
	this.petrolQuantity = petrolQuantity;
	this.pricePerLiter = pricePerLiter;
	this.discountPercentage = discountPercentage;
	
	
	}
	
	//setter and getter methods
	
	public void setLocation(String location){
		
		this.location = location;
	
	}

	public String getLocation(){
		
		return location;
	
	}


	public void setPetrolType(String petrolType){
		
		this.petrolType  = petrolType;
	
	}

	public String getPetrolTyp(){
		
		return petrolType;
	
	}

	public void setPetrolQuantity(int petrolQuantity){
		
		this.petrolQuantity = petrolQuantity;
	
	}

	public int getPetrolQuantity(){
		
		return petrolQuantity;
	
	}
	
	public void setPricePerLiter(double pricePerLiter){
		
		this.pricePerLiter = pricePerLiter;
	
	}

	public double getPricePerLiter(){
		
		return pricePerLiter;
	
	}

	public void setDiscountPercentage(double location){
		
		this.discountPercentage = discountPercentage;
	
	}

	public double getDiscountPercentage(){
		
		return discountPercentage;
	
	}


	//other methods
	
	public double getPurchaseAmount(){
	
			double netPurchaseAmount = (petrolQuantity * pricePerLiter)  ;
			double netPurchaseAmountDiscount = netPurchaseAmount - ((10/100) * netPurchaseAmount);
			return netPurchaseAmountDiscount;
	
	}

























}


