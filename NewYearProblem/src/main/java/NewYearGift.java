import java.util.*;
public class NewYearGift {

	public static void main(String[] args) {
		
		String sweets[]= {"chocolates","Julab jamun","Rasgulla"};
		int chocolateWeights[]= {5,2,5,7,5,2};
		Arrays.sort(chocolateWeights);
		for(int i : chocolateWeights)
			System.out.print(i+" ");
	}

}

