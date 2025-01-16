import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word_Subsets_916 {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        int max[] = new int[26];
        int helper[] = new int[26];

        for(String word: words2){
            Arrays.fill(helper,0);
            for(int i=0;i<word.length();i++){
                helper[word.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++) {
                max[i] = Math.max(max[i], helper[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        for(String word: words1){
            Arrays.fill(helper,0);
            for(int i=0;i<word.length();i++){
                helper[word.charAt(i) - 'a']++;
            }
            boolean flag = true;
            for(int i=0;i<26;i++){
                if(max[i] > helper[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans.add(word);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//      input
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};
//        Output: ["facebook","google","leetcode"]

        Word_Subsets_916 ws = new Word_Subsets_916();
        List<String> ans = ws.wordSubsets(words1,words2);
        System.out.println("Ans: "+ ans);


    }
}
