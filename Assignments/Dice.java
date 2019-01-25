class Dice{
    public static void main(String[] args) {
    for (i = 0, i < 500, i++;) {
        System.out.println("You rolled a " + getD30());
        n++;
    }

    }
    
    public static int getD4(){
        return (int)(Math.random()*4)+1;
    }
    public static int getD6(){
    return (int)(Math.random()*6)+1;
    }
    public static int getD20(){
    return (int)(Math.random()*20)+1;
    }
    public static int getD30(){
        return getD4() + getD6() + getD20();
    }
}