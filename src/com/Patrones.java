package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patrones {
	private static final Pattern urlPattern = Pattern.compile("^(https?)://[-a-zA-Z0-9+&@#/%?=~_|!:,\\.;]*[-a-zA-Z0-9+&@#/%=~_|]$");
	private static final Pattern emailPattern = Pattern.compile("^(.+)@(.+)\\.(.+)$");
	private static final Pattern subfieldEndPunctuationMarksPattern = Pattern.compile("([\\(/\\[\\,;:=])$");
	private static final Pattern letterNumersPattern = Pattern.compile("^[a-zA-Z0-9]*$");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isUrl(String str) {
		
		return isPattern(str, urlPattern);
	}
	
	public static boolean isEmail(String str) {
		
		return isPattern(str, emailPattern);
	}
	
	
	private static boolean isPattern(String str, Pattern pattern) {
		if (str == null) return false;
		
		Matcher matcher = pattern.matcher(str);
		
		return matcher.matches();
	}
	
}
