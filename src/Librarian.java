/**
 * A librarian that works in a Libary and service borrow and return requests from Students and Non-Students
 */
public class Librarian {

    /**
     * This is a borrowing service offered by the librarian to Students
     * @param student A registered student of the learning institution
     * @param numberOfBooks The number of books student wants to borrow
     */
    public void lendingRequestForBook(Student student, int numberOfBooks){
        //kontrollera att studenten har ett giltigt ID
        if(student.studentID.isEmpty()) {
            // om han inte har en, avslå begäran
            System.out.println("Lending request denied. No valid Student ID");
            return;
        }

        //check the number of books the Student has borrowed and not returned
        int numBookBorrowedANdNotReturned = student.booksBorrowed;

        // if the number of books borrowed and not return is equal to 3
        if(numBookBorrowedANdNotReturned >= 3){
            //decline borrow request
            System.out.println("Lending request denied. You have 3 unreturned books.");
        }
        else{
            //else get the number of books he can borrow by subtracting 3 from his booksBorrowed variable
            int numBooksYouCanBorrow = 3 - numBookBorrowedANdNotReturned;
            //if the number of books he can borrow is less than the number of books requested
            if(numBooksYouCanBorrow < numberOfBooks){
                //decline the borrow request
                System.out.println(" The number of books you want to borrow is more than what you can borrow");
                return;
            }
            else{
                // else get the booksBorrowed value and add numberOfBooks to it
                student.booksBorrowed = student.booksBorrowed + numberOfBooks;
                System.out.println("Lending request successful, you have been lended " + numberOfBooks + "books.");

            }
        }
    }



    /**
     * This is a book return service offered by the librarian to students
     * @param student This is a registered student of the learning institution
     * @param numberOfBooks Number of books the student wants to return
     */
    public void returnRequestForBook(Student student, int numberOfBooks) {

        //kontrollera att studenten har ett giltigt ID
        if (student.studentID.isEmpty()) {
            // om han inte har en, avslå begäran
            System.out.println("Lending request denied. No valid Student ID");
            return;
        } else {
            //kontrollera om booksBorrowed är större än eller lika med
            //antalet böcker han vill returnera
            if(student.booksBorrowed >= numberOfBooks) {
                // få booksBorrowed värde och dra av numberOfBooks från det
                student.booksBorrowed = student.booksBorrowed - numberOfBooks;
                System.out.println("Return request successful, you have returned " + numberOfBooks + " book(s).");
                System.out.println("You have " + student.booksBorrowed + " book(s) left to return");
            }
            else {
                System.out.println("Return request failed. You cannot return what you do not have ");

            }
        }
    }


}