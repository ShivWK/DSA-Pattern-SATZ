//import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        //square
//        for (int i=0; i<5; i++){
//            for (int j=0; j<=4; j++){
//                System.out.print("*"+' ');
//            }
//            System.out.println();
//        }

//triangular with stars

//        for (int i=0; i<5; i++){
//            for (int j=0; j<=i; j++){
//                System.out.print("*"+' ');
//            }
//            System.out.println();
//        }

//triangular but numbers not stars

//        for (int i=0; i<5; i++){
//            for (int j=0; j<=i; j++){
//                System.out.print((j+1)+" ");
//            }
//            System.out.println();
//        }


//printing the same but without increasing it
//only printing the row number

//        for (int i=1; i<=5; i++){
//            for (int j=0; j<i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


//inverted triangle
//
//        //one approach
//        for (int i=1; i<=5; i++){
//            for (int j=5; j>=i; j--){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//


//Write which pattern
//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//
//        //another approach
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=(n-i+1); j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//        //first approach dynamic best approach
//        for (int i=1; i<=n; i++){
//            for (int j=n; j>=i; j--){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//

//pyramidal structure

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < (5 - i - 1); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < (2 * i + 1); j++) {
//                System.out.print("*");
//            }
//            for (int l = 0; l < (5 - i - 1); l++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//

//Pyramid of different type
//
//        for (int i=1; i<=5; i++){
//            for(int s=5; s>i; s--){
//                System.out.print(" ");
//            }
//            for (int j=0; j<i; j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//

//inverted pyramid

//        for(int i=0; i<5; i++){
//            for(int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//            for(int j=0; j<2*5 - (2*i+1); j++){
//                System.out.print("*");
//            }
//            for(int l=0; l<i; l++){
//                System.out.print(" ");
//            }
//            System.out.println();
//            }
//    }
//}

//pyramidal structure up and down
//        for(int i=0; i<5; i++){
//            for(int j=0; j<(5-i-1); j++){
//                System.out.print(" ");
//            }
//            for(int j=0; j<(2*i+1); j++){
//                System.out.print("*");
//            }
//            for(int l=0; l<(5-i-1); l++){
//                System.out.print(" ");
//            }
//            System.out.println();
//            }
//
//         for(int i=0; i<5; i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < 2 * 5 - (2 * i + 1); j++) {
//                 System.out.print("*");
//             }
//             for (int l = 0; l < i; l++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }

//triangle up and down without a comman  line

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//        for(int i=1; i<=(2*n-1); i++){
//            int stars = i;
//            if(i>n) stars = 2*n-i;
//            for(int j=0; j<stars; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//1 0 1 0 triangle

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//        for(int i=0; i<n; i++){
//            int start;
//            if(i%2==0)start=1;
//            else start=0;
//            for(int j=0; j<=i; j++){
//                System.out.print(start);
//                start = 1 - start;
//            }
//            System.out.println();
//        }

//numbers having M shape

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//        int count = 1;
//        for(int i=1; i<=n; i++){
//            //numbers
//            for(int j=1; j<=i; j++){
//                System.out.print(count+" ");
//                count++;
//            }
//
//            System.out.println();
//        }

//printring abcd as a triangle

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//        char ch = 'A';
//        for(int i=0; i<n; i++){
//            //numbers
//            for(char j='A'; j<='A'+i; j++){
//                System.out.print(j+" ");
//            }
//
//            System.out.println();
//        }

//printing same alphabetical triangle but up side down

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//        char ch = 'A';
//        for(int i=0; i<n; i++){
//            //numbers
//            for(char j='A'; j<='A'+(n-1-i); j++){
//                System.out.print(j+" ");
//            }
//
//            System.out.println();
//        }

//printing alphabets in triangle but w/o increasing

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//        char ch = 'A';
//        for(int i=0; i<n; i++){
//            //numbers
//            for(char j='A'; j<='A'+i; j++){
//                System.out.print(ch+" ");
//            }
//            ch++;
//            System.out.println();
//        }

//pyramidal structure

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//
//
//        for(int i=0; i<n; i++){
//            char ch = 'A'; //reinitialize it at each iteration otherwise it will go  beyoud abcd to spaicl chars
//            int breakpoint = (2*i +1) / 2;
//            for(int j=0; j<=(n-i-1); j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=(2*i +1); j++){
//                System.out.print(ch);
//                if(j<=breakpoint) {
//                    ch++;
//                } else {
//                    ch--;
//                }
//            }
//            System.out.println();
//            }

//E
//D E
//C D E
//B C D E
//A B C D E

////        Scanner obj = new Scanner(System.in);
////        System.out.print("Enter the number of rows ");
////        int n = obj.nextInt();
//
//        //char chr= 'E';
//        for(int i=0; i<5; i++){
//            for(char j =(char)('E'-i); j<='E'; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


//dynamic logic

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//        char chr;
//        for(int i=0; i<n; i++){
//            chr = (char)('A'+n-1-i);
//            for(int j = 0; j<=i; j++){
//                System.out.print(chr+" ");
//                chr++;
//            }
////            chr=(char)(chr-i);
//            System.out.println();
//        }

//square shape stars and a barfi inide it
//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//        for(int i=0; i<n; i++){
//            for(int j = 0; j<n-i; j++){
//                System.out.print("*");
//            }
//            for(int j=0; j<2*i; j++){
//                System.out.print(" ");
//            }
//            for(int j=0; j<n-i; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//        for(int i =1; i<=n; i++){
//            for(int j = 0; j<i; j++){
//                System.out.print("*");
//            }
//            for(int j=0; j<2*n-2*i; j++){
//                System.out.print(" ");
//            }
//            for(int j=0; j<i; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

//x shape starts in side regions
//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//
//        for(int i=0; i<=2*n-1; i++){
//            int stars = i;
//            int space = 2*n -2*i;
//            if(i>n) {
//                stars=2*n-i;
//                space=2*i-2*n;
//            }
//             //stars
//            for(int j=0; j<stars; j++){
//                System.out.print("*");
//            }
//            for(int j = 1; j<=space; j++){
//                System.out.print(" ");
//            }
//            //stars
//            for(int j=0; j<stars; j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//Square through stars

//        Scanner obj = new Scanner(System.in);
//        System.out.print("Enter the number of rows ");
//        int n = obj.nextInt();
//        for(int i= 0; i<n; i++){
//            for(int j = 0; j < n; j++){
//                if(i==0 || i== n-1 || j==0 || j==n-1){
//                    System.out.print("*"+" ");
//                }else{
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }

//
////complex n on outer border n-1 in inner square border n-2 in inner dusra border till end not done

    }
}