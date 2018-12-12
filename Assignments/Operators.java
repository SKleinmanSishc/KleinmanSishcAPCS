class Operators {
    public static void main(String args[]) {
        
        String firstName = "Sean";
        String lastName = "K-S";
        String fullName = firstName + " " + lastName;
        int gradYear = 2021;
        int curYear = 2019;
    

        System.out.println (firstName);
        System.out.println ("Kleinman-Sishc");
        System.out.println (fullName);
        System.out.println (fullName + " graduates in " + (gradYear - curYear) + " years" );

        int target = 1500;
        int income = 5;
        int NeededTotal = 100;
        double Savings = 95; 
        String Neither = "Oh, oh no";
        String One = "At least there's something";
        String Both = "Success, maybe. It's still hard to tell";
        System.out.println ("It will take " + (target/income) + " months to reach your goal");

        Boolean Girlfriend = false;

        if(Girlfriend == false && (income < (NeededIncome + Savings)){
            System.out.println (Neither);
        }
        else if ((Girlfriend == false) || (income < (NeededIncome + Savings))){
            System.out.println (One);
        }
        else{
            System.out.println(Both);
        }

        
    }
}
