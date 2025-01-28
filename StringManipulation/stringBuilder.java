package StringManipulation;

public class stringBuilder {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("Ross is a man");
        String word = "Men are Brave";
        int countE = 0;
        char[] c = word.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'e'){
                countE++;
            }
        }
        System.out.println(countE);
    }

}
