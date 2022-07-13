import java.util.Random;
import java.util.Scanner;

class HeadsorTails{
    public static void main(String[] args){
	Random rand = new Random();
	int countH, countT;
	countH = 0;
	countT = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Who are you ?");
	String name = scan.next();
	System.out.println("Hello, "+name);
	
 System.out.println("Tossing a coin...");
 
	for(int i = 1; i < 6; i++){
	    if(rand.nextInt(100)%2 == 0) {
		System.out.println("Round "+i+": Heads");
		countH++;
	    }
	    else  {
		System.out.println("Round "+i+": Tails");
		countT++;
	    }
	}

		System.out.println("Heads: "+countH+": Tails: "+countT);
		if(countH > countT) System.out.println(name+" won");
		else System.out.println(name+" lose");
    }
}
	
	    
