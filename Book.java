/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Darnell Stovall)
 * @version (9/16/2019)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }

    // Add the methods here ...
    
    /**
     * Accessor to get author
     */
    public String getAuthor()
    {
        return author;
    }
    
    
    /**
     * Accessor to get title
     */
    public String getTitle()
    {
        return title;
    }
    
   
    /**
     * Accessor to get pages
     */
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void printDetails()
    {
        System.out.println("The author is " + author);
        System.out.println("The Title is " + title);
        System.out.println("The number of pages are " + pages);
        System.out.println("The reference number is " + refNumber);
    }
}
