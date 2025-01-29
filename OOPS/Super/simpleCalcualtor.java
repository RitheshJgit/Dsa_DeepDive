package OOPS.Super;

public class simpleCalcualtor {

  int num1;
  int num2;

    simpleCalcualtor(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2 ;
        System.out.println("Num1 : "+this.num1+"\nNum2 : "+this.num2);
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add(){
        return this.num1 + this.num2;
    }
    public int add(int num3){
        return this.num1 + this.num2 + num3;    }
    public int multiple(){
        return this.num1 * this.num2;
    }

    public int subtract(){
        return this.num1 - this.num2;
    }

    public void divide(){
        if(num2 == 0){
            System.out.println("Can't assign Zero to num2");
        }
       else {
            System.out.println(this.num1 / this.num2);
        }
    }


    public static void main(String[] args) {
        simpleCalcualtor cal = new simpleCalcualtor(40, 20);
        System.out.println(cal.add());
        System.out.println(cal.add(50));
    }
}
