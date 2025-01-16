public class BitwiseXOR_ofAllPairings_2425 {

    public int xorAllNums(int[] nums1, int[] nums2) {

//            METHOD 1: BRUTE FORCE (TLE)
        // int[][] arr = new int[nums1.length][nums2.length];
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        // System.out.print("numsi: "+nums1[i]+"numsj:"+nums2[j]);
        //         arr[i][j] = (nums1[i] ^ nums2[j]);
        // System.out.println("ansss: "+arr[i+j]);
        //     }
        // }

        // int ans = 0;
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         System.out.print(arr[i][j]+" ");
        //         ans = arr[i][j] ^ ans;
        //     }
        // }
        // return ans;

        int xor1 = 0;
        int xor2 = 0;

        for(int i=0;i<nums1.length;i++){
            xor1 ^= nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            xor2 ^= nums2[i];
        }
        int res1=0;
        int res2=0;
        for(int i=0;i<nums1.length;i++){
            res1 ^= xor2;
        }
        for(int i=0;i<nums2.length;i++){
            res2 ^= xor1;
        }
        return res1 ^ res2;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,1,3};
        int[] nums2 = {10,2,5,0};

        BitwiseXOR_ofAllPairings_2425 obj = new BitwiseXOR_ofAllPairings_2425();
        System.out.println(obj.xorAllNums(nums1,nums2));


    }
}
