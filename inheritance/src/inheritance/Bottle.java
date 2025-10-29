class Bottle extends Steel{
	int price =1200;
	String brand="Milton";
	public void cost(){
System.out.println("The price of the steel is :"+price);
}
	public void about(){
		System.out.println("This Bottle is "+brand+" Brand. ");
	}
	public static void main (String [] args){
		 
		
		 Steel s=new Steel();
		 s.cost();
		 s.length();
		 
		 
		 Bottle bottle=new Bottle();
		 bottle.cost();
		 bottle.about();
		 
		 
		 Steel steel =new Bottle();
		 steel.cost();
		 
		 steel.length();
		 
		 
		
	}
	
}