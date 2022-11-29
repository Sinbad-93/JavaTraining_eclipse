package jv.training;

public class JavaTraining {
	
	public static void main(String[] args) {
	        
	        Book book = new Book("thelivre","theauthor",52);
	        System.out.println(book.numberOfPages);
	      
	    }
	

}

class Book {
    
    String title;
  
    String author;
  
    int numberOfPages;
  
    String publisher;
  
    //Constructeur secondaire de la classe Book
    Book(String title, String author, int numberOfPages) {
          
          //Utilise le constructeur principal avec des valeur prédéfinies
          this(title, author, numberOfPages, "OC");
    }        
    
    //Constructeur principal de la classe Book
    Book(String title, String author, int numberOfPages, String publisher) {
          
          this.title = title;
          
          this.author = author;
          
          this.numberOfPages = numberOfPages;
          
          this.publisher = publisher;
    }
}
