import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {
	public static void main(String[]args) {
		while(true) {
			try {
			System.out.println("Welcome to the Hangman Game!");
			System.out.println("----------------------------");
			System.out.println("Please choose the games difficulty");
			System.out.println("-- Press 1 for easy mode (Maximum 8 attempts to fail)");
			System.out.println("-- Press 2 for medium mode (Maximum 6 attempts to fail)");
			System.out.println("-- Press 3 for hard mode (Maximum 4 attempts to fail)");
			
		
			
		
		
		
		
		
		
		
		
class Player {
	










class Game {
	private String[] words = {"apple","banana","garden","blanket","astronaut","festival","labyrinth","dog","pineapple","lantern"};
	int attemptNumber;
	int difficultyNumber;
	
	public Game() {
	}
	
	
	
	public String getRandomWord() {
		Random random = new Random();
		return words[random.nextInt(words.length)];
	}
	
	public void setdifficultyNumber(int difficultyNumber) {
		this.difficultyNumber = difficultyNumber;
	}
	
	public int getdifficultyNumber() {
		return difficultyNumber;
	}
	public int getattemptNumber() {
		return attemptNumber;
	}
	public void setattemptNumber(int attemptNumber) {
		this.attemptNumber = attemptNumber;
	}
	
		
	
	
	
		
		
		
		
		
		
		
		
		
		
		