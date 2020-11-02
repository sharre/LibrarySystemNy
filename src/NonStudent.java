/**
 * This is a non-academic person that uses the library service
 */
public class NonStudent {
    String personNumber;
    String firstName;
    String lastName;
    int bookBorrowed;

    /**
     * Constructor for NonStudent
     * @param personNumber PersonNumber är ett identifering för icke studenter
     * @param firstName The person's first name
     * @param lastName The person's last name
     */
    public NonStudent(String personNumber, String firstName, String lastName) {
        this.personNumber = personNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookBorrowed = 0;
    }
    /**
     * This takes a Librarian object and borrows a Book from the librarian
     * @param librarian The librarian given to the NonStudent by the Library
     * @param numberOfBooks The number of books the person wants to borrow
     */
    public void borrowBook(Librarian librarian, int numberOfBooks){
    //anropar bibliotekarie metoden lendingRequestForBook(Student, int)
    librarian.lendingRequestForBook(this, numberOfBooks);
    }

    /**
     * This takes a Librarian object and returns a Book to the librarian
     * @param librarian The librarian given to the person by the Library
     * @param numberOfBooks The number of books the person wants to return
     */
    public void returnBook(Librarian librarian, int numberOfBooks){
        //anropar bibliotekarie metoden returnRequestForBook(Student, int)
        librarian.returnRequestForBook(this, numberOfBooks);

    }
}