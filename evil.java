import java.util.*;

//to check whther the num is evil , even num of 1s in bin equivaleent , for ex 10 
public class evil {
    int num;

    evil() {
        num = 0;
    }

    void getnum() {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter number");
        num = sn.nextInt();
    }

    int bin_convert(int n) {
        if (n == 0)
            return 0;
        return (bin_convert(n / 2) * 10 + n % 2);
    }

    void isevil() {
        int x = bin_convert(num);
        int a, c = 0;
        for (a = x; a > 0; a = a / 10)
            c++;
        if (c % 2 == 0)
            System.out.println("evil");
        else
            System.out.println("not evil");
    }

    public static void main(String args[]) {
        evil obj = new evil();
        obj.getnum();
        obj.isevil();
    }
}
