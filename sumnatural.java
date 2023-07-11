//to print sum of n natural numbers
class sumnatural {
    int sumnat(int n) {
        if (n == 0)
            return 0;
        return (n + sumnat(n - 1));
    }

    public static void main(String args[]) {
        sumnatural ob = new sumnatural();
        System.out.println(ob.sumnat(5));
    }
}