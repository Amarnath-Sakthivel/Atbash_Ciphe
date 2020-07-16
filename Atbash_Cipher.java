package com.wipro.javapractice;

public class Atbash_Cipher {

	static String secretCode(String str) {

		String decrypt = "";

		for (String split : str.split(" ")) {
			for (int i = 0; i < split.length(); i++) {
				char c = split.charAt(i);
				char getChar = (char) ((boolean) Character.isLowerCase(c) ? (char) 122 - (c - 'a')
						: Character.isUpperCase(c) ? (char) 90 - (c - 'A') : c);
				decrypt += getChar;
			}
			decrypt += " ";
		}
		System.out.println(decrypt.trim());
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secretCode("Apple");
		secretCode("Hello world!");
		secretCode("Christmas is the 25th of December");
		secretCode("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		secretCode("The word 'atbash' derives from the the first and last 2 letters of the Hebrew alphabet.");
		secretCode("Vmxibkgrlm zmw wvxibkgrlm ziv rwvmgrxzo uli gsv Zgyzhs xrksvi.");
	}
}
