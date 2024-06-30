import java.math.BigInteger;
import java.util.Scanner;
class BasicMarhs {
    public static void main(String[] args) {
//        int n =5;
//        int arr1[]={1,2,3,4,5};
//        resarr(arr1, n);
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number ");
        long n = obj.nextLong();
        System.out.println(fact(n));;

    }

    //finding factors, reversing
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int n = obj.nextInt();
//        int counter = 0;
////        while(n>0){
////            long lastdigit = n % 10;
////            System.out.print(lastdigit);
////            n /= 10;
//        int num = (int) (Math.log10(n) + 1);
//
////        }
//        System.out.println();
//        System.out.println(num);

    //reverse the given number

//        int reverse =0;
//        while(n>0){
//            int ld = n % 10;
//            reverse = (reverse * 10) + ld;
//            n /= 10;
//        }
//        System.out.println(reverse);

        //palindrom checker
//        int originalValue = n;
//        int reverse =0;
//        while(n>0){
//            int ld = n % 10;
//            reverse = (reverse * 10) + ld;
//            n /= 10;
//        }
//        if(reverse == originalValue){
//            System.out.println("Yes a Paindrom number");
//        }else{
//            System.out.println("Not a palindrom");
//        }

        //Armstrong number
//        int temp2 = n;
//        int original = n;
//        int counter = 0;
//        int rem=0;
//        int arm= 0;
//        int mul =1;
//        while(n>0){
//            n /= 10;
//            counter++;
//        }
//        while(temp2 !=0){
//            mul =1;
//            rem = temp2 % 10;
//            for(int i = 1; i<=counter; i++){
//                mul = mul*rem;
//            }
//            temp2 /= 10;
//            arm += mul;
//        }
//        if(arm == original){
////            System.out.println(arm);
//            System.out.println("Yes an armstrong number");
//        }else{
////            System.out.println(arm);
//            System.out.println("Not an Armstrong");
//        }

        //divisors
//        for(int i = 1; i<=n; i++){
//            if(n%i==0){
//                System.out.print(i+" ");
//            }
//        }
       // optimized
//        for(int i =1; i*i<=n; i++){
//            if(n%i == 0){
//                System.out.println(i);
//                if(n/i != i){
//                    System.out.println(n/i);
//                }
//            }
//        }

        // CHECK PRIME NUMBER
//        int count =0;
//        for (int i=1; i*i<=n; i++){
//            if(n%i == 0){
//                count++;
//                if(n/i != i){
//                    count++;
//                }
//            }
//        }
//        if(count == 2){
//            System.out.println("yes prime");
//        }else{
//            System.out.println("Not a prime");
//        }


        //sum of all divisors
//        int sum =0;
//        for(int i = 1; i<=n; i++){
//            if(n%i==0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        //HCF GCD
//        System.out.println("Give second number ");
//        int b = obj.nextInt();
//
//        while (n > 0 && b > 0){
//            if(n>b){
//               n = n%b;
//                System.out.println(n);
//            }else{
//                b = b%n;
//                System.out.println(b);
//            }
//        }
//        if(n==0){
//            System.out.println(b);
//        }else{
//            System.out.println(n);
//        }
//        System.out.println(10%2);

    //reverse an array
//    static void printarray(int array2[], int n){
//        for(int i =0; i<n; i++){
//            System.out.print(array2[i]+" ");
//        }
//    }
//    static void resarr(int array[], int n){
//        int[] resarry= new int[n];
//        for(int i =1; i<=n; i++){
//            resarry[i-1]=array[n-i];
//        }
//        printarray(resarry, n);
//    }
    //Sum of n numbers
//    static long sum =0;
//    static void sum(long k){
//        if(k < 1){
//            System.out.println(sum);
//            //return;
//            //dont works for number greater than 5 digits
//        }else{
//            sum += k;
//            k--;
//            sum(k);
//        }
//    }
    //another approach
//    static long sum(long k){
//        if(k == 0){
//            return 0;
//        }else{
//            //stackoverflows due very large number of calls caused due to very large number
//            return k + sum(k-1);
//        }
//    }

    //summation with loop
//    static void sum(long k){
//        long sum =0;
//        for(long i=1; i<=k; i++){
//            sum += i;
//        }
//        System.out.println(sum);
//    }

    //factorial of number by recursion , dont return 0 if base case becomes true otherwise it will make everything 0 and in output we will get 0
    // it will be like if n = 4, then factorial 4 x 3 x 2 x 1. but if we return 0 then at second place we'll get 0 eveytime

//    static long fact(long k){
//        if(k == 0){
//            return 1;
//        }else{
//            //stackoverflows due very large number of calls caused due to very large number
//            return k * fact(k-1);
//        }
//    }

    public static BigInteger fact(long k) {
        BigInteger result = BigInteger.ONE;
        for (long i = 1; i <= k; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

