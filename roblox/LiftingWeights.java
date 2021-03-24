package roblox;

import java.util.*;

public class LiftingWeights {

	public static void main(String[] args) {
		List<Integer> weights = new ArrayList<>();
		int maxCapacity = 0;
		
		int opt = 0;
        Set<Integer> sums = new HashSet<>();

        sums.add(opt);

        for(Integer weight: weights){
            Set<Integer> newsums = new HashSet<>();

            for(Integer sum: sums){
                int newSum = sum + weight;

                if(newSum <= maxCapacity){
                    newsums.add(newSum);

                    if(newSum > opt){
                        opt = newSum;
                    }
                }
            }

            sums.addAll(newsums);
        }
	}

}
