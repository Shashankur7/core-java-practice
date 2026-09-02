class Mobile{
	String brand;
	double price;
	String model;
		Mobile(String brand, double price, String model){
			this.brand= brand;
			this.price= price;
			this.model= model;
		}
		void displayMobile(){
			System.out.println(brand);	
			System.out.println(price);
			System.out.println(model);
		}
		public static void main(String[] args){
			Mobile obj = new Mobile("Samsung" , 1000 , "A6");
			obj.displayMobile();
		}
}