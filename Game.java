import java.util.*;
import java.io.*;

public class Game{

	private String targetWord;
	private int targetWordLength;
	private String currentState;

	public Game(String target){
		this.targetWord = target;
		this.setUp();
	}

	private void setUp(){
		this.targetWordLength = targetWord.length();
		System.out.println(targetWord);
		System.out.println(targetWordLength);

		String placeholder = "_";
		this.currentState = placeholder.repeat(targetWordLength);
		System.out.println(currentState);
	}

	public void doStep(){

	}
}