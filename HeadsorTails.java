import java.util.Random;

class HeadsorTails{
    public static void main(String[] args){
	Random rand = new Random();
	int countH, countT;
	countH = 0;
	countT = 0;
	
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
		if(countH > countT) System.out.println("You won");
		else System.out.println("You lose");
    }
}
	
	    
