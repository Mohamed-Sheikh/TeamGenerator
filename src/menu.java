import java.util.Scanner;
public class menu {
public static int players;
public static int menu;
private static Scanner selector = new Scanner(System.in);


public static void choice() {
	
	
	
	
	do {
	System.out.println("How many players do you have");
	players = selector.nextInt();
	
	
	
	System.out.println("Please choose from the menu");
	options.option();
	menu = selector.nextInt();
	

	if(players / (menu + 4) > 0.9 && players % (menu + 4) != 0) {
		System.out.println("ERROR - Not enough players for this game. Need");
	}
	if(players / (menu + 4) < 0.9 && players % (menu + 4) != 0) {
		System.out.println("Invalid choice - This game is not possible");
	}
	
	
	}while(players % (menu + 4) != 0);
	
	System.out.print("\033[H\033[2J");

}

public static void chosen() {
	

	switch(menu) {
	
	case 1: 
		FiveASide.footballers();
		FiveASide.teams();
	break;
	
	case 2:
		SixASide.footballers();
		SixASide.teams();
	break;
	
	case 3:
		SevenASide.footballers();
		SevenASide.teams();
	break;
	
	case 4:
		EightASide.footballers();
		EightASide.teams();
	break;
		
	case 5:
		NineASide.footballers();
		NineASide.teams();
	break;
	
	case 6:
		TenASide.footballers();
		TenASide.teams();
	break;
	
	case 7:
		ElevenASide.footballers();
		ElevenASide.teams();
	break;
	}
}
}

