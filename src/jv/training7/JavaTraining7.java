package jv.training7;
import java.util.ArrayList;

public class JavaTraining7 {
	
	

	 public static Categories categories;

	// Définissez une fonction récursive
	 // fonction qui s'appelle à l'intérieur d'elle même
	    public static int countBooks(Categories categories) {
	        int c = 0;
	        for (Category category : categories) {
	            c += category.numberOfBooks;
	            c += countBooks(category.subCategories);
	            }
	        return c;
	    }

	    public static void main(String[] args) {
	    	
	// Appelez cette fonction récursive
	        Category c1 = new Category();
	        c1.numberOfBooks = 3;
	        Category c2 = new Category();
	        c2.numberOfBooks = 2;
	        Category c3 = new Category();
	        c3.numberOfBooks = 10;
	        Categories subc1 = new Categories();
	        subc1.add(c3);
	        c1.subCategories = subc1;
	        
	        System.out.println(c1);

	        categories = new Categories();
	        categories.add(c1);
	        categories.add(c2);
	        

	        int numberOfBooks = countBooks(JavaTraining7.categories);
	        System.out.println("The bookstore has " + numberOfBooks + " books");
	    }


}

class Category {

    int numberOfBooks;

    Categories subCategories = new Categories();
    
    @Override
	public String toString() {
	  return getClass().getSimpleName() + "[numberOfBooks = " + numberOfBooks + 
			   "; Subcategories = " +  subCategories + "]";
	}

}



class Categories extends ArrayList<Category> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

