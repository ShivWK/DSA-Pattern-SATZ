import java.util.Scanner;
//square
//class HelloWorld {
//    public static void main(String[] args) {
//        for (int i=0; i<5; i++){
//            for (int j=0; j<=4; j++){
//                System.out.print("*"+' ');
//            }
//            System.out.println();
//        }
//    }
//}

//triangular with stars
//class HelloWorld {
//    public static void main(String[] args) {
//        for (int i=0; i<5; i++){
//            for (int j=0; j<=i; j++){
//                System.out.print("*"+' ');
//            }
//            System.out.println();
//        }
//    }
//}

//triangular but numbers not stars
//class HelloWorld {
//    public static void main(String[] args) {
//        for (int i=0; i<5; i++){
//            for (int j=0; j<=i; j++){
//                System.out.print((j+1)+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//printing the same but without increasing it
//only printing the row number
//class HelloWorld {
//    public static void main(String[] args) {
//        for (int i=1; i<=5; i++){
//            for (int j=0; j<i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//inverted triangle
//class HelloWorld {
//    public static void main(String[] args) {
//
//        //one approach
//        for (int i=1; i<=5; i++){
//            for (int j=5; j>=i; j--){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//pyramidal structure
//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//Pyramid of different type

//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//inverted pyramid
//class HelloWorld {
//    public static void main(String[] args) {
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
//class HelloWorld {
//    public static void main(String[] args) {
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
//         for(int i=0; i<5; i++){
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
//         }
//      }
//}

//triangle up and down without a comman  line

//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//1 0 1 0 triangle

//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//numbers having M shape

//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//printring abcd as a triangle

//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//printing same alphabetical triangle but up side down

//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//printing alphabets in triangle but w/o increasing

//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//pyramidal structure
//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//E
//D E
//C D E
//B C D E
//A B C D E
//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//dynamic logic
//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//square shape stars and a barfi inide it
//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//x shape starts in side regions
//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//Square through stars
//class HelloWorld {
//    public static void main(String[] args) {
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
//    }
//}

//complex n on outer border n-1 in inner square border n-2 in inner dusra border till end
class HelloWorld {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of rows ");
        int n = obj.nextInt();
        int counter =0;
//        while(n>0){
//            long lastdigit = n % 10;
//            System.out.print(lastdigit);
//            n /= 10;
            int num = (int)(Math.log10(n)+1);

//        }
        System.out.println();
        System.out.println(num);
    }
}
//git remote add origin https://github.com/ShivWK/DSA-Pattern-SATZ.git
//git branch -M main
//git push -u origin main