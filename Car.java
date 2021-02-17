package term2;

public class Car {
    int id;
    String Type;
    String Color;
    double Price;
    
    
    
    Car (int d , String t , String c  ){
    	id=d;
    	Type=t;
    	Color=c;
    	
    	
    }
	Car (int D , String T ,String C, double P ) {
	id= D;
	Type= T;
	Color = C;
	Price = P;
	}
	public void Set_price(double SP) {
	Price = SP;

	}
	
	public void Get_info() {
		
		System.out.println(Type);
		System.out.println(Price);
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Car1");
		Car Car1 = new Car(101, "BMW", "Black" , 850000 );
		Car1.Get_info();
		System.out.println("Car2");
		Car Car2 = new Car(102 , "Audi" , "RED");
		
		Car2.Set_price(150000);
		Car2.Get_info();
		

	}

}
