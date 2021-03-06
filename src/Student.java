/**
 * This is a registered student of the learning institution to which this library belongs to
 */
public class Student {
    String studentID;
    String firstName;
    String lastName;
    int booksBorrowed;


    /**
     * The constructor for Student
     * @param studentID The student ID used to identify the student
     * @param firstName The student's first name
     * @param lastName The student's last name
     */
    public Student(String studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.booksBorrowed = 0;
    }

    /**
     * This takes a Librarian object and borrows a Book from the librarian
     * @param librarian The librarian given to the Student by the Library
     * @param numberOfBooks The number of books student wants to borrow
     */
    public void borrowBook(Librarian librarian, int numberOfBooks){

        //anropar bibliotekarie metoden lendingRequestForBook(Student, int)
        librarian.lendingRequestForBook(this, numberOfBooks);

    }

    /**
     * This takes a Librarian object and returns a Book to the librarian
     * @param librarian The librarian given to the Student by the Library
     * @param numberOfBooks The number of books student wants to return
     */
    public void returnBook(Librarian librarian, int numberOfBooks){
        //anropar bibliotekarie metoden returnRequestForBook(Student, int)
        librarian.returnRequestForBook(this, numberOfBooks);
    }
    /**
     * this will update first name to the new student
     * @param newFirstName Update new lastname
     */
    public void updateFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    /**
     * this will update last name to the new student
     * @param newLastName Update new lastName
     */
    public void updateLastName(String newLastName) {
        this.lastName = newLastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", booksBorrowed=" + booksBorrowed +
                '}';

    }
}