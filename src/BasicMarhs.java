import java.util.Scanner;
class BasicMarhs {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of rows ");
        int n = obj.nextInt();
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

        //palindrom checher
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
        int count =0;
        for (int i=1; i*i<=n; i++){
            if(n%i == 0){
                count++;
                if(n/i != i){
                    count++;
                }
            }
        }
        if(count == 2){
            System.out.println("yes prime");
        }else{
            System.out.println("Not a prime");
        }


        //sum of all divisors
//        int sum =0;
//        for(int i = 1; i<=n; i++){
//            if(n%i==0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);;
    }
}

