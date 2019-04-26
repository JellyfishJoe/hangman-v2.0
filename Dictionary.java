import java.util.*;
import java.io.*;

public class Dictionary{
	//Responsible for storing possible word list and modifying it based on commands

	private List<String> words;

	private void converter(String url){
		try{
			File file = new File(url);
			Scanner fileScanner = new Scanner(file);

			while(fileScanner.hasNext()){
				words.add(fileScanner.next().toLowerCase());
			}
			fileScanner.close();
		} catch(Exception e){

		}
	}

	public void removeLength(int length){
		for(String word : words){
			if(word.length() != length){
				words.remove(word);
			}
		}
	}
}