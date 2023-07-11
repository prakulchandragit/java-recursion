public class sumeven {
    void even(int n) {
        if (n < 1)
            return;
        even(n - 1);
        System.out.println((n * 2) + " ");
    }

    public static void main(String args[]) {
        sumeven ob = new sumeven();
        ob.even(5);
    }
}
