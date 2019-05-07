import java.util.*;
import java.io.*;

public class Game{

	private String targetWord;
	private int targetWordLength;
	private String currentState;

	public Game(String target){
		//store entered word
		this.targetWord = target;
		//run game setup
		this.setUp();
	}

	private void setUp(){
		//find length of target word
		this.targetWordLength = targetWord.length();
		System.out.println(targetWord);
		System.out.println(targetWordLength);

		//build indicator of current state (underscores for unknown letters, letters for correct guesses)
		String placeholder = "_";
		currentState = placeholder;
		for(int i = 1; i < targetWordLength; i++){
			currentState += placeholder;
		}
		System.out.println(currentState);
	}

	public void doStep(){
		Guesser ai = new Guesser();
		//todo: send the guesser the word length, currect state, and previously guessed letters
	}
}