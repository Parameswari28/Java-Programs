import java.util.*;
//EVENODD
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
//ReverseNUM
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234, rev=0;
        while(n != 0){
            rev = rev*10 + (n%10);
            n /= 10;
        }
        System.out.println("Reverse = " + rev);
    }
}
//Factorial
public class Factorial {
    public static void main(String[] args){
        int n=5, fact=1;
        for(int i=1;i<=n;i++) fact*=i;
        System.out.println("Factorial = "+fact);
    }
}

//SumOfDigits
public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123, sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum = " + sum);
    }
}


//Palindrome

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121, temp=n, rev=0;
        while(n > 0){
            rev = rev*10 + (n%10);
            n/=10;
        }
        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }
}
//ArmStroong
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153, temp=n, sum=0;
        while(n > 0){
            int d = n % 10;
            sum += d*d*d;  
            n/=10;
        }
        System.out.println(temp==sum?"Armstrong":"Not Armstrong");
    }
}

//PrimeNum

public class PrimeCheck {
    public static void main(String[] args) {
        int n=29;
        boolean prime=true;

        for(int i=2;i<=n/2;i++)
            if(n%i==0){ prime=false; break; }

        System.out.println(prime?"Prime":"Not Prime");
    }
}

//CountDigits
public class CountDigits {
    public static void main(String[] args) {
        int n=2025, count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.println("Digits = " + count);
    }
}
//GCD
public class GCD {
    public static void main(String[] args) {
        int a=12, b=18;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD = " + a);
    }
}
//LCM
public class LCM {
    public static void main(String[] args) {
        int a=4,b=6;
        int lcm = (a*b)/gcd(a,b);
        System.out.println("LCM = " + lcm);
    }
    static int gcd(int a,int b){
        while(b!=0){ int t=b; b=a%b; a=t; }
        return a;
    }
}

//Perfect

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        int sum = 0;

        for(int i=1; i<=n/2; i++){
            if(n % i == 0)
                sum += i;
        }

        System.out.println(n == sum ? "Perfect Number" : "Not Perfect Number");
    }
}
//StrongNUM

public class StrongNumber {
    public static void main(String[] args) {
        int n = 145, temp=n, sum=0;

        while(n > 0){
            int d = n % 10, fact = 1;
            for(int i=1;i<=d;i++) fact *= i;
            sum += fact;
            n /= 10;
        }

        System.out.println(sum == temp ? "Strong Number" : "Not Strong");
    }
}
//Automorphic
public class Automorphic {
    public static void main(String[] args) {
        int n=25;
        System.out.println((n*n+"").endsWith(n+"") ? "Automorphic" : "Not");
    }
}
