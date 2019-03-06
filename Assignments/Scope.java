class Scope {
        // public static String message = "Hello";
        // public static Boolean shouldLoop = false;

        public static void main(String args[]) {
            // int i = 0;
            // while(i <= 10) {
            //     int n = i * 2;
            //     System.out.println(n);
            //     i++;
            // }
            // int n = 0;
            // if(n > 10) {
            //     String message = "Hello World";
            //     System.out.println(message);
            // }

            // Boolean shouldLoop = true;
            // int x = 0;
            // while(shouldLoop) {
            //     if(x < 10) {
            //         System.out.println(message);                    
            //     } else {
            //         shouldLoop = false;
            //     }
            //     x++;
            // }
            int i;
            String message = "Hello World";
                for(i = 0; i < message.length(); i++) {
                    if(message.charAt(i) == 'W') {
                    break;
                    }
                }
            System.out.println("W found at index " + i);
        }
    }