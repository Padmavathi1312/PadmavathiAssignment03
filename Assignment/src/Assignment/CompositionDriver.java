package Assignment;

import java.util.ArrayList;
import java.util.List;

public class CompositionDriver {
	


		// Main driver method
		public static void main(String[] args)
		{

			// Creating the objects of class 1 (Book class)
			// inside main() method
			Composition b1
				= new Composition("EffectiveJ Java", "Joshua Bloch");
			Composition b2
				= new Composition("Thinking in Java", "Bruce Eckel");
			Composition b3 = new Composition("Java: The Complete Reference",
							"Herbert Schildt");

			// Creating the list which contains the
			// no. of books.
			List<Composition> book = new ArrayList<Composition>();

			// Adding books to List object
			// using standard add() method
			book.add(b1);
			book.add(b2);
			book.add(b3);

			// Creating an object of class 2
			Library library = new Library(book);

			// Calling method of class 2 and storing list of
			// books in List Here List is declared of type
			// Books(user-defined)
			List<Composition> books
				= library.getListOfBooksInLibrary();

			// Iterating over for each loop
			for (Composition bk : books) {

				// Print and display the title and author of
				// books inside List object
				System.out.println("Title : " + bk.title
								+ " and "
								+ " Author : " + bk.author);
			}
		}
	}

