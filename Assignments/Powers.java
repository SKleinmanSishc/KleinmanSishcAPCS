class Powers {
    public static final int n = 32;
    public static int base = 2;
    public static int i = 0;

    public static void main(String[] args) {
        for(i = 0; i <= n; i++) {
            System.out.println(power(base)); 
        }
    }

    public static int power(int base) {
       return (int) Math.pow(base , i);
    }
}