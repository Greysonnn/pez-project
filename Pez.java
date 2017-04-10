public class PEZ {
 
  public static void main(String[] args) {
    // Your amazing code goes here...
    System.out.println("We are making a new pez dispenser");
    System.out.printf("FUN FACT: There are %d allowed in every dispenser",
                      PezDispenser.MAX_PEZ);
    PezDispenser dispenser = new PezDispenser("yoda");
    System.out.printf("The dispenser is %s %n",
                      dispenser.getCharacterName()
                     );
    if (dispenser.isEmpty()) {
     System.out.println("Dispenser is empty."); 
    }
    System.out.println("Filling the stupid PEZ....");
    dispenser.fill();
    if (!dispenser.isEmpty()) {
      System.out.println("Dispenser is full");
    }
    while (dispenser.dispense()) {
     System.out.println("EAT PEZ"); 
    }
    if (dispenser.isEmpty()) {
      System.out.println("Ate all the pez");
    }
    dispenser.fill(4);
    dispenser.fill(2);
    while (dispenser.dispense()) {
     System.out.println("EatPEZ!"); 
    }
    try{
    dispenser.fill(100);
    System.out.println("This will never happen");
    } catch (IllegalArgumentException iae) {
      System.out.println("Woah There");
      System.out.printf("The error was %s",
                        iae.getMessage());
    }
    
    }

}