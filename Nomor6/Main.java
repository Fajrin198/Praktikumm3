package Nomor6;

import java.util.Scanner;

public class Main {
    
    public int fibonacci(int n){
        if(n <= 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    
    public static void main(String[] args) {
        Main a = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(a.fibonacci(n));
    }
}
