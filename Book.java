
package librarycatalogue;


public class Book {
    
    // Properties, Fields, Globabl Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; //whether the book is checked out or not
    int dayCheckedOut = -1;
    
    // Constuctor for book: constructor is a block of code that initializes the
    // newly created object. Constructor resembles an instance method in java
    // but it's not a method as it doesn't have a return type.
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
        
    }
    
    // Getters --> Instance methods ( giving you the values of certain
    // properties of any instance).
    public String getTitle() {
        return this.title;
    }
    
     public int getPageCount() {
         return this.pageCount;
    }
     
      public int getISBN() {
          return this.ISBN;
    }
      
       public boolean getIsCheckedOut() {
           return this.isCheckedOut;
    }
       
        public int getDayCheckedOut() {
            return this.dayCheckedOut;
    }
        
    // Setters
        public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
            this.isCheckedOut = newIsCheckedOut;
            setDayCheckedOut(currentDayCheckedOut);
        }
        
        private void setDayCheckedOut(int day) {
            this.dayCheckedOut = day;
        }
}
