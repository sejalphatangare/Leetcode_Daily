public class Counting_words_with_a_given_prefix_2185 {
//    Method1: brute force
    public boolean helper(String word, String prefix){
        int n = word.length();
        int m = prefix.length();

        if(n < m){
            return false;
        }

        for(int i=0;i<m;i++){
            if(word.charAt(i) != prefix.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word: words){
            if(helper(word,pref)){
                count++;
            }
        }
        return count;
    }

//    Method2:
    public int prefixCount_2(String[] words, String pref) {
        int count = 0;
        for(String word: words){
            if(word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";

        Counting_words_with_a_given_prefix_2185 obj = new Counting_words_with_a_given_prefix_2185();
        int ans = obj.prefixCount(words,pref);
        System.out.println("ANSWER IS: "+ ans);
        int ans2 = obj.prefixCount_2(words,pref);
        System.out.println("ANSWER WITH METHOD2: "+ ans2);
    }


}
