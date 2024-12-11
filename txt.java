class Solution {
    public int reverse(int x) {
        
        BigInteger N = 0;
        while (x != 0) {
            {
                if (x > 0) {
                    N = (N * 10) + x % 10;
                    x = x / 10;

                } else {
                    N = (N * 10) + x % -10;
                    x = x / 10;
                }
            }
            System.out.println(N);
        
        }
        public static void main(String args[])   
        {  
        int a;  
        //calling static method of the Math class  
        a=Math.min(23,98);  
        System.out.println();  
        }  
        }  
}
        }
    }
