package it.polito.tdp.alien;
import java.util.*;

public class AlienDictionary {

	private Map<String,Word>dizionario=new TreeMap<String,Word>();
	private Map<String,WordEnhanced>dizionarioList=new TreeMap<String,WordEnhanced>();
	
	public void addWord(String alienWord, String translation){
		alienWord=alienWord.toLowerCase();
		if(dizionario.containsKey(alienWord))
			dizionario.get(alienWord).setTranslate(translation);
		dizionario.put(alienWord,new Word(alienWord,translation));
	}
	
	public void addWordList(String alienWord,String translation){
		alienWord=alienWord.toLowerCase();
		if(!dizionarioList.containsKey(alienWord)){
			dizionarioList.put(alienWord,new WordEnhanced(alienWord));
			dizionarioList.get(alienWord).addTranslation(translation);
		}
		dizionarioList.get(alienWord).addTranslation(translation);
	}
	
	public String translateWord(String alienWord){
		alienWord=alienWord.toLowerCase();
		if(dizionario.containsKey(alienWord))
			return dizionario.get(alienWord).getTranslate();
		return "Non è presente nessuna traduzione per la parola "+"'"+alienWord+"'";
	}
	
	public Collection translateList(String alienWord){
		alienWord=alienWord.toLowerCase();
		if(!dizionarioList.containsKey(alienWord))
			return null;
		return dizionarioList.get(alienWord).getTranslation();
	}
}
