public class MinimumLengthofString_AfterOperations3223 {
    public int minimumLength(String s) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                if(arr[i]%2 == 0){
                    count += 2;
                }
                else{
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abaacbcbb";
        MinimumLengthofString_AfterOperations3223 obj = new MinimumLengthofString_AfterOperations3223();
        System.out.println("ANS: "+ obj.minimumLength(s));
    }
}
