package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String translate;
	
	public Word(String alienWord, String translate){
		this.alienWord = alienWord;
		this.translate = translate;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslate() {
		return translate;
	}

	public void setTranslate(String translate) {
		this.translate = translate;
	}
}
