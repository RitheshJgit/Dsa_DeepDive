import java.util.ArrayList;
import java.util.Scanner;

public class findingCase {
    public static void main(String[] args) {
        int extraCandies = 3;
        int[] candies = {2,3,5,1,3};
        ArrayList<Boolean> list= new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            list.add(true);
        }
        for(int i = 0 ; i < candies.length; i++){
            int isGreater = candies[i] + extraCandies;
            for(int j =0; j <  candies.length; j++){
                if(isGreater < candies[j]){
                    list.set(i, false);
                }
            }
        }
        System.out.println(list);
    }
}

