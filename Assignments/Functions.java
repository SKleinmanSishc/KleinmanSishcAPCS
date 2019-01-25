class Functions {
    public static int testNum1 = 6;
    public static int  testNum2 = 13;
    

    public static void main(String[] args){
        boolean Result = bothEven(testNum1, testNum2);
        if(Result){
            evenPrint(testNum1, testNum2);
        }
        else{
            oddPrint(testNum1, testNum2);
        }
    }
    public static boolean bothEven(int x, int i){
       return ((x % 2 == 0) && (i % 2 == 0));
    }
    public static void evenPrint(int x, int i){
        System.out.println(x + " and " + i + " are even");
    }
     public static void oddPrint(int x, int i){
        System.out.println(x + " and " + i + " are not even");
    }
}
