import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		GameMechanics game = new GameMechanics();
		game.gameStartScreen;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
class GameMechanics {
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	private String[] things = {"absurd","frizzled","luxury","dog","gazebo","queue","lantern","table","round"};
	private String[] characters;
	private int attemptnumber;
	
	public GameMechanics() {
	}
	
	public String[] getCharacters() {
		String s = things[random.nextInt(things.length)];
		characters = new String[s.length()];
		for(int i = 0;i<s.length();i++) {
			characters[i] = s.substring(i,i+1);
		}
		return characters;
	}
	
	public void setAttemptNumber(int attemptnumber) {
		this.attemptnumber = attemptnumber;
	}
	public int getAttemptNumber() {
		return attemptnumber;
	}
	
	public void gameStartScreen() {
		while(true) {
			try {
				System.out.println("Welcome to the Hang-Man Game!");
				System.out.println("Please choose a difficulty level!");
				System.out.println("-- Press 1 for easy mode (8 fails allowed)");
				System.out.println("-- Press 2 for medium mode (6 fails allowed)");
				System.out.println("-- Press 3 for hard mode (4 fails allowed)");
				int a = scanner.nextInt();
				if(a == 1) {
					attemptnumber = 8;
					break;
				}
				else if (a == 2) {
					attemptnumber = 6;
					break;
				}
				else if (a == 3) {
					attemptnumber = 4;
					break;
				}
				else {
					System.out.println("Please enter either 1 2 or 3!");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter either 1 2 or 3!");
				scanner.nextLine();
			}
		}
	}
}
					
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		