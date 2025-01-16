import java.awt.*;

public class Findthe_PrefixCommonArrayofTwoArrays_2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int hash[] = new int[A.length+1];
        int count = 0;
        int ans[] = new int[A.length];

        for(int i=0;i<A.length;i++) {
            if (++hash[A[i]] == 2) {
                count++;
            }
            if (++hash[B[i]] == 2) {
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};

        Findthe_PrefixCommonArrayofTwoArrays_2657 obj = new Findthe_PrefixCommonArrayofTwoArrays_2657();
        int[] ans = obj.findThePrefixCommonArray(A,B);
        System.out.print("Ans: {");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
            if(i < ans.length-1){
                System.out.print(",");
            }

        }
        System.out.print("}");

    }
}
