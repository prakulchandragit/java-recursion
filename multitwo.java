public class multitwo {
    int multiply(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        return (a + multiply(a, b - 1));
    }

    public static void main(String args[]) {
        multitwo ob = new multitwo();
        System.out.println(ob.multiply(5, 2));
    }
}
