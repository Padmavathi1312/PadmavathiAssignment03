package Assignment;

import java.io.*;
import java.util.*;

public class Composition {
	
	// Java program to Illustrate Concept of Composition

	// Importing required classes



		// Member variables of this class
		public String title;
		public String author;

		// Constructor of this class
		Composition(String title, String author)
		{

			// This keyword refers top current instance
			this.title = title;
			this.author = author;
		}
	}

	// Class 2
	// Helper class
	// Library class contains list of books.
	class Library {

		// Reference to refer to list of books.
		private final List<Composition> books;

		// Constructor of this class
		Library(List<Composition> books)
		{

			// This keyword refers to current instance itself
			this.books = books;
		}

		// Method of this class
		// Getting the list of books
		public List<Composition> getListOfBooksInLibrary()
		{
			return books;
		}
	}

	



