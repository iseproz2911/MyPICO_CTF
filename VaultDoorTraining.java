import java.util.*;

class VaultDoorTraining {
    public static void main(String args[]) 
    {
        VaultDoorTraining vaultDoor = new VaultDoorTraining();
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter vault password: ");
        String userInput = scanner.next();
	String input = userInput.substring("picoCTF{".length(),userInput.length()-1);
	if (vaultDoor.checkPassword(input))
    {
	    System.out.println("Access granted.");
	} else 
    {
	    System.out.println("Access denied!");
	}
   }
    public boolean checkPassword(String password) {
        return password.equals("w4rm1ng_Up_w1tH_jAv4_be8d9806f18");
    }
}
