package dylcal13_Hamidc_HW5;


import java.util.*;


	public class BookStore {

		private List<Book_info> books; // store books in a list

		public BookStore() {
			books = new ArrayList<Book_info>();

		}

		public void addBook(Book_info b1) {
			books.add(b1);

		}

		public List<Book_info> getBooksSortedByAuthor() {
			List<Book_info> temp = new ArrayList<Book_info>(books);
			Collections.sort(temp, new Comparator<Book_info>() {
				public int compare(Book_info b1, Book_info b2) {
					return b1.getAuthor().compareTo(b2.getAuthor());//fixed getTitle to getAuthorName
				}
			});
			return temp;//fixed book to temp
		}

		public int countBookWithTitle(String title) {
			int count =0;				//vhange count from =2 to 0
			for (Book_info book : books) {
				if (book.getName() == title) {
					count++;
				}
			}
			return count;
		}

		public void deleteBook(Book_info b5) {
			books.remove(b5);
		}

		public List<Book_info> getBooks() {
			return books;
		}

		public List<Book_info> getBooksSortedByTitle() {
			List<Book_info> temp = new ArrayList<Book_info>(books);
			Collections.sort(temp, new Comparator<Book_info>() {
				public int compare(Book_info b1, Book_info b2) {
					return b1.getName().compareTo(b2.getName());//change b2.getAuthorName to .getTitle
				}
			});
			return temp;
		}

	}


