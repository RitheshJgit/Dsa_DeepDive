package StringManipulation;

public class BasicCalculator {
    public static void main(String[] args) {
        String s = "7*5/2   ";
        int num  = calculate(s);
        System.out.println(num);
    }

    public static int calculate(String s) {
        if(s == null || s.length() == 0) return 0;
        int curr = 0;
        int sum  = 0;
        int last = 0;
        char op = '+';
        char[] ch = s.toCharArray();
        for(int i  = 0; i < ch.length; i++){
            if(Character.isDigit(ch[i]))
                curr = curr * 10 + ch[i] - '0';
            if(!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length - 1){
                if(op == '+'){
                    sum += last;
                    last = curr;
                } else if(op == '-'){
                    sum += last;
                    last = -curr;
                } else if(op == '*')
                    last = last * curr;
                else if(op == '/')
                    last = last / curr;
                op = ch[i];
                curr = 0;
            }
        }
        sum += last;
        return sum;
    }
    public static int calculateq(String s) {
        int ans= 0;
        int sum = 0;
        String word = s.trim();
        char[] c = word.toCharArray();

        for (int i = c.length-1; i > 0; i--) {
            if(c[i] == ' '){
                continue;
            }                                                                                                   //3+2*2
            if(c[i] == '*' || c[i] == '-' || c[i] == '+' || c[i] == '/' ){

                int num1 = c[i + 1] - '0';
                int num2 = c[i - 1] - '0';
                if(i < c.length-1){
                    num1 = sum;
                }
                else {
                    sum = num1;
                }
                switch (c[i]){
                    case '+':
                        sum = sum + num2;
                    case '-':
                        sum += sum - num2;
                    case '*':
                        sum += sum * num2;
                    case '/':
                        if(num1 != 0)
                        {
                        sum += num2 / sum;
                        }
                }

                if(c[i] == '+'){
                    sum = sum + num2;
                }
                if(c[i] == '-'){
                    sum = sum - num2;
                }
                if(c[i] == '*'){
                    sum = sum * num2;
                }
                if(c[i] == '+'){
                    sum = sum + num2;
                }
            }
            System.out.println(sum);
        }
            return sum;
    }
}
