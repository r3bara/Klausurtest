class Main {
    public static void main(String[] args) {
        double a = 7.3f;
        int b = 13;
        int i = 7;
        while (i > 5) {
            a += 1;
            if (i == 10) {
                i = 5;
                continue;
            }
            b++;
            i++;
        }
        System.out.printf("%d%n%.1f%n-%d%n", i, a, b);
    }
}