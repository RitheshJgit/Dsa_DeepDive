package Recursion;

public class GCD {
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
//        int ans = findGcd(num1, num2);
//        int greater = (num1 > num2) ?  num1 :  num2;
        int ans = recursiveGCD(num1, num2);
        System.out.println(ans);
    }
    static int findGcd(int num1, int num2){
        // find the greater number among two number
        int greater = (num1 > num2) ?  num1 :  num2;

        for (int i = greater; i > 1; i--) {
            if(num1 % i == 0 && num2 % i == 0){
                return i;
            }
        }
        return 1;
    }
    static int recursiveGCD(int num1, int num2) {
      if(num2 == 0){
          return num1;
      }
      return recursiveGCD(num2, num1 % num2);
    }
}


