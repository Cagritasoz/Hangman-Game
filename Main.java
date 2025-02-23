import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
class GameMechanics {
	Random random = new Random();
	private String[] things = {"absurd","frizzled","luxury","dog","gazebo","queue","lantern","table","round"};
	private String[] characters;
	private int attemptnumber;
	
	public Game() {
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
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		