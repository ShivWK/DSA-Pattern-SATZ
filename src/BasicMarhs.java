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
        int originalValue = n;
        int reverse =0;
        while(n>0){
            int ld = n % 10;
            reverse = (reverse * 10) + ld;
            n /= 10;
        }
        if(reverse == originalValue){
            System.out.println("Yes a Paindrom number");
        }else{
            System.out.println("Not a palindrom");
        }
//        System.out.println(reverse);
    }
}

