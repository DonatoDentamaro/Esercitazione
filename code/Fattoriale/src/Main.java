import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    int number=12;
    int result = func(number);
    System.out.println(result);
}

static int func(int n){

    if(n  % 2 ==1) {
        return 0;
    } else {
        return 1 + func(n /2);
    }
    }
}