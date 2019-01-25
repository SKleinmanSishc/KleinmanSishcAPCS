class WhileLoops{
    public static void main(String[] args) {
        // oneTo100();
        // //mult3();
        letter();
    }
    public static void oneTo100(){
        int n = 100;
        while(n >= -100){
            System.out.println(n);
            n--;
        }
    }
    public static void mult3(){
        int n = 3;
        while(n  <= 120){
            System.out.println(n);
            n = n+3;
        }
    }
    public static void letter(){
        char alpha = 'a';
        int n = 1;
        while(n <= 26){
            System.out.println(alpha);
            alpha++;
            n++;
        }
    }

}