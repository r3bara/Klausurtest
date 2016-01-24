class B {
    final int b = 21;
    void print() {
        for (int i = 0; i < b ; i+=5) {
            if (b%7>4)
                System.out.print(i);
            System.out.println(b);
        }
    }
}