import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.*;

/*
 * @author Evan Tone
 * @verson 2.0
 *
 */
public class HangmanFx extends Application {
	private TextField input; //the place to input a word
	private Label instruct = new Label("Enter any English word:"); //instructions for entry
	private Label guessedWord = new Label("_ _ _"); //the word as guessed so far
	private Label correctWord = new Label(""); //the word entered. only for testing purposes
	private Label letters = new Label("a b c d e f g h i j k l m n o p q r s t u v w x y z"); //all possible guesses. Previously guessed letters are capitalized
	private Button submit; //button to start the guessing
	private Button go; //button to move on the the next guess
	private Game hangmanGame;
	private String word;

	public void start(Stage stage) throws Exception {
		//create input and begin fields
		input = new TextField();
		input.setText("");
		submit = new Button("Submit");
		go = new Button("Continue");

		//create a new grid pane
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setMinSize(300, 300);
		pane.setVgap(10);
		pane.setHgap(10);

		//set an action on the button using method reference
		submit.setOnAction(this::doSubmit);
		go.setOnAction(this::doStep);

		//add the fields into the pane
		pane.add(input, 0, 0);
		pane.add(submit, 0, 1);
		pane.add(instruct, 1, 0);
		pane.add(correctWord, 0, 2);
		pane.add(guessedWord, 0, 3);
		pane.add(letters, 0, 4);

		//JavaFX musgt have a Scene (window content) inside a Stage (window)
		Scene scene = new Scene(pane, 300, 150);
		stage.setTitle("Hangman Game");
		stage.setScene(scene);

		//show the stage (window)
		stage.show();
	}

	private void doSubmit(ActionEvent event){
		//grab input text from input field
		this.word = this.input.getText();

		//create instance of Game and pass in input word
		this.hangmanGame = new Game(this.word);

		//todo: add code to update display
	}

	private void doStep(ActionEvent event){
		//continue on to next guess
		this.hangmanGame.doStep();//shouldn't do this, Game class should keep game running and just send update date to FX class

		//todo: add code to update display
	}
}