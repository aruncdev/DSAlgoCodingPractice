package roblox;

import java.util.ArrayList;
import java.util.List;

public class CuttingMetalSurplus {

	public static void main(String[] args) {
		
		int costPerCut = 10;
		int salePrice = 20;
		List<Integer> lengths = new ArrayList();
		
		int max = Integer.MIN_VALUE;

        for(int i = 0; i < lengths.size(); i++){
            max = Math.max(max, lengths.get(i));
        }

        long res = Long.MIN_VALUE;

        for(int len = 1; len <= max; len++){
            int val = 0;
            for(int rod: lengths){
                int k = rod / len, ext = 0;
                if(k * len == rod){
                    k--;
                    ext = 1;
                }
                int v = (k+ext) * len * salePrice - k * costPerCut;
                val += Math.max(v, 0);
            }
            res = Math.max(val, res);
        }

	}

}
