public class Simple {
    public static void main(String arg[]){
//        System.out.println("simple Java");
//        first(5);
//        second(5);
//        third(5);
//        four(5);
//        five(5);
//        six(5);
//        seven(5);
//        eight(5);
//        nine(5);
//        ten(5);
//        eleven(5);
//        twelve(5);
        thirty(5);
    }


    public static void first(int n){
        for(int i = 0; i<= n; i++){
            for(int j = 0; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//* * * * *
//*       *
//*       *
//*       *
//* * * * *

    public  static void second(int n ){
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=n; j++){
                if(i == 1 || i == n || j == 0 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


//*
//* *
//* * *
//* * * *
//* * * * *

    public static void third(int n ){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*4th pattern
     * * * * *
     * * * *
     * * *
     * *
     *
*/

    public static void four(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*
        *
      * *
    * * *
  * * * *
* * * * *
*/

    public static void five(int n ){
        for(int i = 0; i<n; i++){
            for(int j = 0; j< n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 0; j<= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
 */
    public static void six(int n ){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


/*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
 */

    public static void seven(int n ){
        for(int i = 0; i<=5; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

/*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
*/
   public static void eight(int n ){
       int temp = 1;
    for(int i = 1; i<=5; i++){
        for(int j = 1; j<= i; j++){
            System.out.print(temp++ +" ");
        }
        System.out.println();
    }
}

/*
        0
        1 0
        0 1 0
        1 0 1 0
        0 1 0 1 0
*/

    public static void nine(int n){
        for(int i = 0; i< 5; i++){
            for(int j = 0; j<= i ; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print(1+" ");
                    sum++;
                }else{
                    System.out.print(0+" ");
                    sum++;
                }
            }
            System.out.println();
        }
    }

/*
     *                 *
     * *             * *
     * * *         * * *
     * * * *     * * * *
     * * * * * * * * * *
     * * * * * * * * * *
     * * * *     * * * *
     * * *         * * *
     * *             * *
     *                 *
*/
    public static void ten(int n){
        for(int i =0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            for (int j=0; j<(n-i-1)*2; j++){
                System.out.print("  ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print("* ");
            }
            for(int j = i; j<i*2+i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*
             * * * * *
           * * * * *
         * * * * *
       * * * * *
     * * * * *
*/

    public static void eleven(int n){
        for(int i = 0; i<n; i++){
            for(int j= 0; j<n-i; j++ ){
                System.out.print("  ");
            }
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*
    - - - - 1
    - - - 2 2
    - - 3 3 3
    - 4 4 4 4
    5 5 5 5 5
*/
public static void twelve(int n){
    for(int i = 0; i<=n; i++){
        for(int j = 0; j<n-i; j++ ){
            System.out.print("  ");
        }
        for(int j=1; j<=i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    }

/*
                1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5
*/

    public static void thirty(int n){
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=n-i; j++ ){
                System.out.print("  ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
