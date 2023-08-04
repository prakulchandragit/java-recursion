public class happy {
    int n;

    happy() {
        n = 0;
    }

    void getnum(int nn) {
        n = nn;
    }

    int sqrsum(int x) {

        if (x == 0)
            return 0;
        int d = x % 10;
        return (d * d + sqrsum(x / 10));

    }

    void ishappy() {
        int a = n;
        do {
            a = sqrsum(a);

        } while (a > 9);
        if (a == 1)
            System.out.println("happy");
        else
            System.out.println("not happy");

    }

    public static void main(String args[]) {
        happy ob = new happy();
        ob.getnum(28);

        ob.ishappy();
    }

}
