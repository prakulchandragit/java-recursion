public class armnum {
    int n, len;

    armnum(int nn) {
        n = nn;
        len = (n + "").length();

    }

    int sum_pow(int i) {
        if (i == 0)
            return 0;
        int d = (int) Math.pow(i % 10, len);
        return (d + sum_pow(i / 10));
    }

    void isarmstrong() {
        if (n == sum_pow(n))
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");

    }

    public static void main(String args[]) {
        armnum ob = new armnum(1634);
        ob.isarmstrong();
    }
}
