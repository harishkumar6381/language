package org.lang;

public class LanguageInfo {
	public void tamilLanguage() {
		System.out.println("tamil");
	}
	public void englishLanguage() {
		System.out.println("english");
	}
	public void hindiLanguage() {
		System.out.println("hindi");
	}
	public static void main(String[] args) {
		LanguageInfo li = new LanguageInfo();
		li.englishLanguage();
		li.hindiLanguage();
		li.tamilLanguage();
	}
}
