import java.util.*;
import java.io.*;

public class Guesser{
	Dictionary dict = new Dictionary();

	List<String> newWords = new ArrayList<String>;
	//filter the list by word length
	private void lengthCut(int targetLength){
		dict.converter("C:\\Users\\etone\\Desktop\\javaProjects\\hangman v2.0\\lib\\words.txt");

		for(String word : dict.words){
			if(word.length() == targetLength){
				newWords.add(word);
			}
		}
	}
}