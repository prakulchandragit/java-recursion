import java.util.Scanner;

public class palin {
    int num;
    int revnum;

    palin() {
        num = 0;
        revnum = 0;
    }

    void accept() {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter number");
        num = sn.nextInt();
    }

    int reverse(int y) {
        if (y == 0)
            return revnum;
        revnum = revnum * 10 + y % 10;
        return reverse(y / 10);
    }

    void check() {

        if (num == reverse(num)) {
            System.out.println("palindrome");
        } else
            System.out.println("not palindrome");
    }

    public static void main(String args[]) {
        palin ob = new palin();
        ob.accept();
        ob.check();
    }
}
