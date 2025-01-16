public class MinimizeXOR_2429 {
    public int minimizeXor(int num1, int num2) {
        int a = Integer.bitCount(num1);  //method to give the no of set bits
        int b = Integer.bitCount(num2);

        int ans = num1;
        for(int i=0;i<32;i++){
            if((a<b) && (((1<<i)& num1) == 0)){
                // add , find lsd 0
                ans = ans ^ (1<<i);
                a++;
            }
            else if(a>b && (((1<<i) & num1) > 0)){
                // reduce , find lsd 1
                ans = ans ^ (1<<i);
                a--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        MinimizeXOR_2429 obj = new MinimizeXOR_2429();
        System.out.println("Ans: "+ obj.minimizeXor(num1,num2));

    }
}
