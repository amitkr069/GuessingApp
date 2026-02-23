/**
@author amit
@version 1.0

This is Use Case1.
In this just the basic implementation of Guessing App has been implemented.
*/

import java.util.Random;
import java.util.Scanner;
public class Guessing {
	public static void main(String[] args){
		System.out.println("Welcome to guessing app");
		GameConfig game = new GameConfig(); // Creating object of GameConfig
		game.showRules(); // calling the function of GameConfig class to show the Rules.
		
		
	}
}
