public class Construct_K_Palindrome_Strings_1400 {

    public boolean canConstruct(String s, int k) {
        if(s.length() < k){
            return false;
        }
        if(k == s.length()){
            return true;
        }
        int hash[] = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
        }

        int oddCount = 0;
        for(int i=0;i<26;i++){
            if(hash[i] % 2 != 0){
                oddCount++;
            }
        }
        if(oddCount > k){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
          String s = "annabelle";
          int k = 2;

          Construct_K_Palindrome_Strings_1400 obj = new Construct_K_Palindrome_Strings_1400();

//        Output: true
//        Explanation: You can construct two palindromes using all characters in s.
//        Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"

        System.out.println("ANS: " + obj.canConstruct(s,k));
    }
}
