class disarium {
    int num, size;

    disarium(int nn) {
        num = nn;
        size = 0;

    }

    void countdigit() {
        int a;
        for (a = num; a > 0; a = a / 10) {
            size++;
        }
    }

    int sumdigits(int n, int p) {
        int x = 0;
        if (n == 0)
            return 0;
        x = (int) Math.pow(n % 10, p);
        return (x + sumdigits(n / 10, p - 1));

    }

    void check() {
        int s = sumdigits(num, size);
        if (s == num)
            System.out.println("disarium");
        else
            System.out.println("not disarium");

    }

    public static void main(String args[]) {
        disarium obj = new disarium(135);
        obj.countdigit();
        obj.check();
    }
}
