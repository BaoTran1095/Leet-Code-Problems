//Incompleted solution. Will crash with hugh data size, because of long running time.
public class Number_of_Equivalent_Domino_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] pairs = {{1,2}
						 ,{2,1}
						 ,{3,4}
						 ,{5,6}};
		int [][] pairs2 = {};
		System.out.println(pairs2.length);
		System.out.println(numEquivDominoPairs(pairs2));
	}
	
	public static int numEquivDominoPairs(int[][] dominoes) {
		int count = 0;
		if (dominoes.length == 1 ||dominoes.length == 0) {return count;}
        for (int i = 0; i < dominoes.length; i++) {
        	for (int j = i+1; j < dominoes.length; j++) {
            	if(((dominoes[i][0] == dominoes[j][0]) && (dominoes[i][1] == dominoes[j][1]))
            	|| ((dominoes[i][0] == dominoes[j][1]) && (dominoes[i][1] == dominoes[j][0]))) {
            		count++;
            	}
            }
        	
        }
		return count;
    }
}
