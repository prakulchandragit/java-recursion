import java.util.*;

public class calseries {
    int x, n, sum;

    calseries() {
        x = 0;
        n = 0;
        sum = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x and n");
        x = sc.nextInt();
        n = sc.nextInt();

    }

    int power(int p, int q) {
        if (q == 0)
            return 1;
        return (p * power(p, q - 1));

    }

    void cal() {
        int i;
        for (i = 0; i <= n; i++) {
            sum = sum + power(x, i);
        }
        System.out.println("sum=" + sum);
    }

    public static void main(String args[]) {
        calseries ob = new calseries();
        ob.input();
        ob.cal();
    }
}
