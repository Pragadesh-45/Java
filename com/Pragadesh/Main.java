// public class Main {
// 	public static void main (String[] args) {

// 		int x = 123; //initialization
// 		float y = 3.14f;
// 		boolean z = true;
// 		char symbol = '@';
// 		String name = "Pragadesh";

// 		// System.out.println("My number is"+symbol);
// 		System.out.println("Hello " + name);
// 		}
// } 

// public class Main {
// 	public static void main (String[] args) {

// 		String x = "water";
// 		String y = "Kool-Aid";
// 		String temp;

// 		temp  = x;
// 		x = y;
// 		y = temp;

// 		// System.out.println("My number is"+symbol);
// 		System.out.println("x: "+x);
// 		System.out.println("y: "+y);
// 		}
// } 


// import java.util.Scanner;

// public class Main {
// 	public static void main (String[] args) {

// 		Scanner scanner = new Scanner(System.in);

// 		System.out.println("What is ur name? ");
// 		String name	= scanner.nextLine();

		
// 		int age = scanner.nextInt();
// 		scanner.nextLine(); // empty nextline since java thinks \n in enter in the input of the upcoming nextline 

// 		String food = scanner.nextLine();

// 		System.out.println("Hello "+ name);
// 		System.out.println("You age is "+age);
// 		System.out.println("Your fav food is "+food);
		
// 		// System.out.println("x: "+x);
// 		// System.out.println("y: "+y);
// 		}
// }


// import java.util.Scanner;

// public class Main {
// 	public static void main (String[] args) {

// 		double friends = 10;
// 		friends = (double) friends / 3;

// 		System.out.println(friends);

// 		}
// }

// import javax.swing.JoptionPane;



import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello, " + name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
		JOptionPane.showMessageDialog(null, "You are " + age + "years old");

    }
}










