import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Limit = input.nextInt();

        int F1 = 0;
        int F2 = 1;

        while(F2 < Limit){
            int Fn = F1 + F2;
            if (Fn > Limit)
                break;
            System.out.println(Fn);
            F1 = F2;
            F2 = Fn;
        }
    }
}
