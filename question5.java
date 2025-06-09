import java.util.Scanner;
public class question5 {
    public static void main(String[] args){
        System.out.println("welcome to calculator");
        Scanner que = new Scanner(System.in);
        System.out.println("Enter no 1");
        int no1 = que.nextInt();
        System.out.println("Enter no 2");
        int no2 = que.nextInt();
        System.out.println("nos are" + " " + no1 + " " + no2);
        System.out.println("for + : 1 , - : 2 , * : 3 , / : 4");
        int oper = que.nextInt();

        if(oper == 1){
            int sum = no1 + no2;
            System.out.println(no1 + " + " + no2 + "is" + sum);
        }

        else if(oper == 2){
            int sub = no1 - no2;
            System.out.println(no1 + " - " + no2 + "is" + sub);
        }
        else if(oper == 3){
            int mul = no1*no2;
            System.out.println(no1 + " * " + no2 + "is" + mul);
        }
        else if(oper == 4){
            if (no2 == 0){
                no2 = que.nextInt();
            }
            else{
                int div= no1/no2;
                System.out.println(no1 + " / " + no2 + "is" + div);
            }
            
        }
        else{
            System.out.println("Enter valid operator no");
        }

    }
}
