class CruiseControl {
	static Boolean cruiseControlSet = false;
	static int speed = 0;
	static final int MAX_SPEED = 45;
	static int warningSpeed = 30;
    static int accSpeed = randomAcc();
    static int decSpeed = randomAcc();

	public static void main(String[] args) {
        
        accelerate(accSpeed);
        decelerate(decSpeed);
        toggleCruiseControl();
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        accelerate(accSpeed);
        decelerate(decSpeed);
        decelerate(decSpeed);
        decelerate(decSpeed);
        decelerate(decSpeed);
        toggleCruiseControl();
                 
        


	}

	public static void toggleCruiseControl() {
        cruiseControlSet = !cruiseControlSet;
        if(cruiseControlSet){
            System.out.println("Cruise Control Enabled");
        }
        else{
            System.out.println("Cruise Control Disabled");
            speed = 0;
            reportSpeed(speed);
        }
        
	}

	public static void accelerate(int accSpeed) {
        int onlyAcc = MAX_SPEED - speed;
        if(cruiseControlSet && (speed < MAX_SPEED)){
            if (speed + accSpeed <= MAX_SPEED){
                speed = speed + accSpeed;
            }
            else{
                speed = 45;
                System.out.println ("Only accelerated by " + onlyAcc +"mph");
            }
            reportSpeed(speed);
            if(exceedsWarningThreshold(speed)){
                alert(false);
            }
        }
	}

	public static void decelerate(int decSpeed) {
         int onlyDecc = decSpeed;
         if(cruiseControlSet && (speed > 0)){
            if (speed - decSpeed >= 0){
                speed = speed - decSpeed;
            }
            else{
                System.out.println("Only Deccelerated by " + speed +"mph");
                speed = 0;
            }
            reportSpeed(speed);
            if(exceedsWarningThreshold(speed)){
                alert(true);
            }
        }
	}

	public static void reportSpeed(int speed) {
        System.out.println("Current Speed is \t " + speed + "mph");

	}

	public static void alert(Boolean isDecelerating) {
        if(isDecelerating){
            System.out.println("Speed is still \t\t" + speed +"mph/30");
	    }
        else{
            System.out.println("Speed is \t\t" + speed + "mph/30");
        }
    }

	public static Boolean exceedsWarningThreshold(int speed) {
        return speed > warningSpeed;

	}
    
    public static int randomAcc(){
        int random =(int)(Math.random()*45)+1;
        return random;
    }
}