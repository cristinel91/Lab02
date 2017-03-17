package it.polito.tdp.alien;
import java.util.*;

public class AlienDictionary {

	Map<String,Word>dizionario=new TreeMap<String,Word>();
	
	public void addWord(String alienWord, String translation){
		alienWord=alienWord.toLowerCase();
		if(dizionario.containsKey(alienWord))
			dizionario.get(alienWord).setTranslate(translation);
		dizionario.put(alienWord,new Word(alienWord,translation));
	}
	
	public String translateWord(String alienWord){
		alienWord=alienWord.toLowerCase();
		if(dizionario.containsKey(alienWord))
			return dizionario.get(alienWord).getTranslate();
		return "Non è presente nessuna traduzione per la parola "+"'"+alienWord+"'";
	}
}
