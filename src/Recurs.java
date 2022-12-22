import java.util.Scanner;

public class Recurs {
//Даны числа a и b. Определите, сколько существует последовательностей
//из a нулей и b единиц, в которых никакие два нуля не стоят рядом
    public static int recursion_9(int a, int b) {
        if(a>b+1) return 0;
        if(a==0 || b==0) return 1;
        return recursion_9(a,b-1)+recursion_9(a-1,b-1);
    }
    //дано число n, десятичная запись которого не содержит нулей. Получите
    //число, записанное теми же цифрами, но в противоположном порядке
    public static int recursion_10(int n, int a) {
        if (n==0){
            return a;
        }
        else
            return recursion_10(n/10,10*a+n%10);
    }
    //Дана последовательность натуральных чисел (одно число в строке),
    //завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой
    //последовательности встречается число 1. Числа, идущие после двух нулей,
    //необходимо игнорировать
    public static int recursion_11() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        if (num1 !=0) {
            int num2 = in.nextInt();
            if (num2 == 1)
            {
                if (num1 == 1) {
                    return recursion_11() + 2;
                }
                else
                    return recursion_11() + 1;
            }
            else if (num2==0){
                int num3 = in.nextInt();
                if (num3 == 1) {
                    if (num1 == 1) {
                        return recursion_11() + 2;
                    }
                    else
                        return recursion_11() + 1;
                } else if (num3==0){
                    if (num1 == 1) {
                        return 1;
                    }
                    else
                        return 0;
                }else
                if (num1 == 1) {
                    return recursion_11()+1;
                }
                else
                    return recursion_11();
            }
            else{
                if (num1 == 1) {
                    return recursion_11()+1;
                }
                else
                    return recursion_11();
            }
        } else {
            int num2 = in.nextInt();
            if (num2 == 1) {
                return recursion_11() + 1;
            } else if (num2 == 0) {
                return 0;
            }
            else
                return recursion_11();
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите значения a и b для номера 9");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print("Ответ: ");
        System.out.println(recursion_9(a,b));
        System.out.println("Введите значения числа n, которое требуется развернуть");
        int n = in.nextInt();
        System.out.print("Ответ: ");
        System.out.println(recursion_10(n,0));
        System.out.print("Введите последовательность чисел, оканчивающуюся двумя нулями: ");
        b=recursion_11();
        System.out.print("Ответ: ");
        System.out.println(b);
    }
}