package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	private AlienDictionary dizionario=new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInsertText;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtArea;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    	txtArea.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	String testo=txtInsertText.getText();
    	String testoSplitato[]=testo.split(" ");
    	if(testoSplitato.length==2){
    		dizionario.addWord(testoSplitato[0],testoSplitato[1]);
    		// implementare per escludere i numeri
    		txtArea.appendText("Aggiunta parola "+"'"+testoSplitato[0]+"'"+" al dizionario\n");
    	}
    	else if(testoSplitato.length==1){
    		txtArea.appendText("Traduzione: "+dizionario.translateWord(testoSplitato[0])+"\n");
    	}
    }

    @FXML
    void initialize() {
        assert txtInsertText != null : "fx:id=\"txtInsertText\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}
