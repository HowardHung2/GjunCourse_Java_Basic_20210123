package java_basic0123;

public class ChickenAndRabbit {
	
	public static void main(String[] args) {
	int n = 83 ;
	int f = 240 ;
	int rabbit  = (f - (n * 2))/(4-2) ;
	int chicken = n - rabbit ;
	System.out.printf("Rabbit : %d \nChicken : %d\n", rabbit, chicken) ;
	}

}
