class ForLoops{
    public static void main(String[] args) {
        //wrong();
        //mult3();
        pow2();
    }
    public static void wrong(){
        for(int i = 0; i > -100; i--) {
            System.out.println(i);
        }
        for(int i = 1; i < 20; i *= 2) {
            System.out.println(i);
        }
    }
    public static void mult3(){
        for(int i = 0; i <= 99; i+=3){
            System.out.println(i);
        }
    }
    public static void pow2(){
        for(int i = 1; i <= 1024; i= i*2){
            System.out.println(i);
        }
    }
}