import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class FiveASide {
	private static int gameChoice = menu.menu + 4;
	
	
	
	public static Scanner selector = new Scanner(System.in);
	public static ArrayList <String> squad = new ArrayList<String>();
	
	
	
	
	public static void footballers() {
	
	
		for(int i = 0; i < menu.players; i++) {
			System.out.println("enter player " + (i + 1)) ;
			 String player = selector.nextLine();
			 squad.add(i, player);
				
		}

	}
	
	public static void teams() {
		
		
		int numberOfTeams = menu.players / gameChoice;
		
		String[][] teamas  = new String [numberOfTeams][gameChoice];
		
		Collections.shuffle(squad);
		int i = 0;

			for(int j = 0; j < numberOfTeams; j++) {
				for(int k = 0; k < gameChoice; k++) {
					teamas[j][k] = squad.get(i++);
				
		}
		
		}
		
			for(int l = 0; l < numberOfTeams; l++) {
				
				System.out.println("team " + (l + 1)  + Arrays.deepToString(teamas[l]));
			}
		
		

			
	}
	
}
