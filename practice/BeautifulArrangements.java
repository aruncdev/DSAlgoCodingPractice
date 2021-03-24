package practice;

public class BeautifulArrangements {
	static int count = 0;
	public static void main(String[] args) {
		int N = 3;
		boolean[] visited = new boolean[N + 1];
	        
	    combinations(N, 1, visited);
	        
	    System.out.println(count);

	}

	public static void combinations(int N, int index, boolean[] visited){
        if(index > N){
            count++;
        }
        
        for(int i = 1; i <= N; i++){
            if(!visited[i] && (index % i == 0 || i % index == 0)){
                visited[i] = true;
                combinations(N, index + 1, visited);
                visited[i] = false;
            }
        }
    }
}