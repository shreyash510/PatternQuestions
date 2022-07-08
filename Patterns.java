public class Patterns {
    public static void main(String arg[]){
        int n = 5;
//        first(n);
//        second(n);
//        forth(n);
        pelindrom("nitin");
    }

/*
    15  14  13  12  11
    10  9  8  7
    6  5  4
    3  2
    1
*/

    public static void first(int n){
        int a = 15;
        for(int i = 0; i< n; i++){
            for(int j =1; j<=n-i; j++){
                a = a-1;
                System.out.print(a+1+" ");
            }
            System.out.println();
        }
    }
/*
    5
    4 5
    3 4 5
    2 3 4 5
    1 2 3 4 5
*/

    public static void second(int n){
        for(int i=0; i<5; i++ ){
            for(int j =n-i; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
/*
    *
    * *
    *   *
    *     *
    * * * * *

 */

    public static void third(int n){
        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=i; j++){
                if(j==1|| i==j || i==n ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
        }
            System.out.println();
        }
    }
/*
    * * * * * *
    * 3 4 5 6 *
    * 4 5 6 7 *
    * 5 6 7 8 *
    * 6 7 8 9 *
    * * * * * *
*/
    public static void forth(int n){
        for(int i= 1; i<=n+1; i++){
            for(int j = i; j<=n+i; j++){
                if(i == 1 || i == n+1 || j == i || j ==n +i){
                    System.out.print("* ");
                }else {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }


//    check String is pelindrome or not

    function fifth(str) {
        const len = str.length;
        for (let i = 0; i < len / 2; i++) {
            if (str[i] !== str[len - 1 - i]) {
                return 'It is not a palindrome';
            }
        }
        return 'It is a palindrome';
    }

const n = "nitin";
const result = fifth(n);
console.log(result);
}


