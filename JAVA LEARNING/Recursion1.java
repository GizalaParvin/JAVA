public class Recursion1 {

    //sum of n nataural number
    // public static void printSum(int i,int n, int sum){
    //     if(i==n){
    //         sum+=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum+= i;
    //     printSum( i+ 1, n, sum);
    // }
    // public static void main(String[] args) {
    //     printSum(1,5,0);
        
    // }

    // to find factorial
    // public static int calcfactorial(int n) {
    //     if(n ==1 || n ==0){
    //         return 1;
    //     }
    //     int fact_nm1 = calcfactorial(n-1);
    //     int fact_n = n* fact_nm1;
    //     return fact_n;
    // }
    // public static void main(String[] args) {
    //     int n =5;
    //     int ans = calcfactorial(n);
    //     System.out.println(ans);
    // }

    public static void printFib(int a, int b , int n) {
        if (n== 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b,c ,n-1);
    }
    public static void main(String[] args) {
        int a =0 ; b =1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n-2);
    }
}
