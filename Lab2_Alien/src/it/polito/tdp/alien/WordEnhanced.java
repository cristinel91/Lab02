package it.polito.tdp.alien;
import java.util.*;

public class WordEnhanced {
	
	private String alienWord;
	private List<String>translation;
	
	public WordEnhanced(String parola){
		this.alienWord=parola;
		this.translation=new LinkedList<String>();
	}
	
	public boolean cercaTraduzione(String s){
		for(String stemp:translation){
			if(stemp.compareTo(s)==0)
				return true;
		}
	return false;
	}
	
	public void addTranslation(String trad){
		if(!cercaTraduzione(trad))
			translation.add(trad);
	}
	
	public String getAlienWord(){
		return alienWord;
	}
	
	public Collection<String> getTranslation(){
		return translation;
	}
	
	public boolean compare(String alienWord){
		if(this.alienWord.compareTo(alienWord)==0)
			return true;
		return false;
	}
}
