package mygreatproject;

import com.google.common.base.Strings;

public class MyGreatClass
{
	public static void main(String[] args) 
	{
		System.out.println(Strings.isNullOrEmpty("nonVide"));
		System.out.println(Strings.isNullOrEmpty(""));
		System.out.println(Strings.isNullOrEmpty(null));
	}
}
