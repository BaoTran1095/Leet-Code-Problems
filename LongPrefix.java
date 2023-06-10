import java.util.Arrays;

public class LongPrefix {
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
		
		String[] strs1 = {"dog","racecar","car"};
		System.out.println(longestCommonPrefix(strs1));
		
		String[] strs2 = {""};
		System.out.println(longestCommonPrefix(strs2));
	}
	
	
	public static String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i = 0; i < Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans;
            }
            ans += first.charAt(i);
        }

        return ans;
    }
}
