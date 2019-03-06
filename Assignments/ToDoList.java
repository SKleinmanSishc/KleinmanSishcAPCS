import java.util.Scanner;
import java.util.ArrayList;

class ToDoList {
	public static final int ADD_ITEM = 1;
	public static final int REMOVE_ITEM = 2;
    public static final int MOVE_ITEM = 3;
	public static final int TERMINATE = 4;
    public static ArrayList<String> todoList = new ArrayList <String>();
    public static void main(String[] args) {    
        Scanner scan;
    
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            printList();
            if(scan.hasNextInt()) {
                int mode = scan.nextInt();
                if(mode == ADD_ITEM) {
					addItem();
                }
                else if(mode == REMOVE_ITEM) {
					removeItem();
                }
                else if (mode == MOVE_ITEM) {
                    moveItem();
                }
                else if(mode == TERMINATE) {
                    System.out.println("TERMINATED");
                    break;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
	}

	public static void addItem() {
        Scanner scan;
        scan = new Scanner(System.in);
        String add = scan.nextLine();
        todoList.add(add);
	}

	public static void removeItem() {
		Scanner scan;
        scan = new Scanner(System.in);
        int rem = scan.nextInt();
        todoList.remove(rem);
	}

	public static void moveItem() {
        Scanner scan = new Scanner(System.in);
        int start = -1;
        int dest = -1;
        while(true) {
            System.out.print("Enter the index of the item you'd like to move: ");
            if(scan.hasNextInt()) { //is it a valid integer?
                start = scan.nextInt();
                if(start >= 0 && start < todos.size()) { //is it a valid start index?
                    break;
                }
            }
        }

        while(true) {
            System.out.print("Enter the index of the desired destination: ");
            if(scan.hasNextInt()) {
                dest = scan.nextInt();
                if(dest >= 0 && dest <= todos.size()) { //is it a valid destination index?
                    break;
                }
            }
        }
        todoList.get(start);
        String movedValue = todoList.get(start);
        todoList.add(dest, movedValue);
            if(start <= dest){
                todoList.remove(start);
            }
            else{
                todoList.remove(start + 1);
            }

        //Move item from start index to (before) the destination index
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Enter Item\n"
            + "\t(2) Remove Item\n"
            + "\t(3) Move\n"
            + "\t(4) Quit\n"
        );
    }
    public static void printList(){
        System.out.println("");
        for (int i = 0; i < todoList.size(); i++){
        System.out.print(todoList.get(i));
        System.out.println("[" + i + "]");
        }
        System.out.println("");
    }
}