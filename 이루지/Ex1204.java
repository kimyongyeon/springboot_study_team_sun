import java.util.Scanner;


public class Ex1204 {
    public static void main(String[] args) {
       //1. System.out.println("hello world");

//        //2. 1-10 sum
//        Sum sum1 = new Sum();
//        sum1.calculate();
//
//        //3. cal_ex01
//        Cal01 cal1 = new Cal01();
//        cal1.cal01(6,2,"+");
//        cal1.cal01(6,2,"-");
//        cal1.cal01(6,2,"*");
//        cal1.cal01(6,2,"/");
//        cal1.cal01(6,2,"$");
//
          //4.cal_ex02
          Cal02 cal02 = new Cal02();
          cal02.cal02();

    }
}

class Sum{

    int sum=0;

    void calculate(){
        for(int i=0; i<10; i++)
        {
            sum +=i;
        }

        System.out.println("sum: "+sum);
    }

}

class Cal01{

    int result =0;
    String errcode="n";

    void cal01(int a, int b, String c){
        switch(c){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                result=a/b;
                break;
            default :
                errcode="y";
                System.out.println("error");
                break;
        }

        if(errcode=="n"){
            System.out.println("result :"+result);
        }
    }

}


class Cal02{

    int result=0;
    String errcode="n";

    void cal02(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input data +,-,*,/");

        String operator = sc.nextLine(); //operator
        System.out.println("첫번째 숫자를 입력하세요 ");
        int first = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요 ");
        int second = sc.nextInt();

        switch (operator){
            case "+" :
                result=first+second;
                break;
            case "-" :
                result=first-second;
                break;
            case "*":
                result=first*second;
                break;
            case "/":
                result=first/second;
                break;
            default:
                errcode="y";
                break;
        }
        if(errcode=="n"){
            System.out.println("result: "+result);
        }

    }

}