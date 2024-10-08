package interfaces;

public class MenuInterface {

    //! PRINT DIVIDER
    private void printDivider(int length){
        System.out.println("\n"+"=".repeat(length)+"\n");
    }

    public void introduction(){ //! INTRODUCTION
        printDivider(40);
        System.out.println("¡¡¡ WELCOME TO PERSON ENTRY !!!");
        printDivider(40);
    }
    
    public void endput(){ //! ENDPUT
        System.out.println("\n"+"=".repeat(10)+" THANK YOU FOR COMING TO US "+"=".repeat(10));
        System.out.println("¡¡¡ WE'RE WAITING FOR YOU THE NEXT TIME, SEE'YA !!!");
        printDivider(50);
    }

    //? BIG SECTION
    public void mainMenu(){ //! MAIN MENU
        System.out.println("\n"+"=".repeat(20)+" MAIN MENU "+"=".repeat(20));
        System.out.println("1. INPUT.");
        System.out.println("2. ADMIN.");
        System.out.println("3. EXIT.");
        printDivider(50);
    }
    
    public void inputMenu(){ //! INPUT MENU
        System.out.println("\n"+"=".repeat(20)+" INPUT MENU "+"=".repeat(20));
        System.out.println("1. SIGN IN");
        System.out.println("2. SIGN UP.");
        System.out.println("3. DELETE YOUR REGISTRATION.");
        System.out.println("4. GO BACK.");
        printDivider(50);
        
    }
    
    public void adminMenu(){ //! ADMIN MENU
        System.out.println("\n"+"=".repeat(20)+" ADMIN MENU "+"=".repeat(20));
        System.out.println("1. CHANGE SECTION.");
        System.out.println("2. DELETE SECTION.");
        System.out.println("3. VISUALIZATION SECTION.");
        System.out.println("4. GO BACK.");
        printDivider(50);
        
    }
    
    //? SMALL SECTION
    // ADMIN
    public void changeMenu(){ //! CHANGE MENU
        System.out.println("\n"+"=".repeat(20)+" CHANGE SECTION "+"=".repeat(20));
        System.out.println("1. ADD A PERSON.");
        System.out.println("2. ADD AN ADMIN.");
        System.out.println("3. EDIT A PERSON BY SEARCH.");
        System.out.println("4. GO BACK.");
        printDivider(50);
    } 
    
    // ADMIN
    public void deleteMenu(){ //! DELETE MENU
        System.out.println("\n"+"=".repeat(20)+" DELETE SECTION "+"=".repeat(20));
        System.out.println("1. DELETE A PERSON BY SEARCH.");
        System.out.println("2. DELETE YOUR ADMIN REGISTRATION.");
        System.out.println("3. CLEAN LIST.");
        System.out.println("4. GO BACK.");
        printDivider(50);
    } 
    
    // ADMIN
    public void visualizationMenu(){ //! VISUALIZATION MENU
        System.out.println("\n"+"=".repeat(20)+" VISUALIZATION SECTION "+"=".repeat(20));
        System.out.println("1. VIEW LIST.");
        System.out.println("2. VIEW PERSON'S NAMES AND LASTNAMES.");
        System.out.println("3. VIEW PERSON'S EMAILS.");
        System.out.println("4. VIEW PERSON'S IC.");
        System.out.println("5. GO BACK.");
        printDivider(50);
    }
    
    // INPUT
    public void signInMenu(){ //! SIGN IN MENU
        System.out.println("\n"+"=".repeat(20)+" SIGN IN SECTION "+"=".repeat(20));
        System.out.println("1. ADD A COMMENTARY.");
        System.out.println("2. CAR STORE");
        System.out.println("3. BOOK STORE");
        System.out.println("4. GO BACK.");
        printDivider(50);
    }

    // INPUT
    public void commentaryMenu(){ //! COMMENTARY BOX
        System.out.println("\n"+"=".repeat(20)+" COMMENTARY BOX "+"=".repeat(20));
        System.out.println("→ EDDY MERCURY: THIS IS AN INCREDIBLE COMPANY, I JUST WANT TO BUY ANYTHING! - 18/09/2024 - 17:58");
        System.out.println("→ MARIA WHITE: MY DREAMS HAVE BEEN COMPLETE, NOW I'M SO HAPPY!!! - 19/09/2024 - 07:22");
        System.out.println("→ EDUARDO SANTOS: DUDE NOW I HAVE A NEW CAR, I'M SO LUCKY... - 22/09/2024 - 18:00");
        System.out.println("→ ELVERGAS2009: DO REALLY PEOPLE KNOW THAT THIS BUY SYSTEM IT'S A STEALING? - 28/09/2024 - 11:19");
        System.out.println("x. GO BACK");
        printDivider(50);
    }
}
