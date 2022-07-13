package lesson_lab_13;


import java.io.IOException;
import java.util.*;

public class BookManagementProgram {

    /*
        ======= Book Management Program (CRUD)============
        1. New book
        2. Find a book(ISBN)
        3. Update a book
        4. Delete a book
        5. Print the book list
        0. Exit
     */

    public static int iSBN;
    public static String title;
    public static String author;
    public static int year;

    public static void main(String[] args) {

        boolean isContinuing = true;

        while (isContinuing) {

            printSimpleMenu();

            int option = getUserOption();

            switch (option) {
                case 0:
                    isContinuing = false;
                    System.out.println("Exit Program!");
                    break;

                case 1:
                    addNewBook();
                    break;

                case 2:
                    findABookByISBN(iSBN, title, author, year);
                    break;

                case 3:
                    updateABook();
                    break;

                case 4:
                    deleteABook();
                    break;

                case 5:
                    printTheBookList();
                    break;

                default:
                    System.out.println("[ERR] Please input the correct option!");
                    break;
            }
        }
    }

    private static Book inputInfoBook(int iSBN, String title, String author, int year) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input ISBN: ");
        iSBN = Integer.parseInt(scanner.nextLine());

        System.out.print("Please input title: ");
        title = scanner.nextLine();

        System.out.print("Please input author: ");
        author = scanner.nextLine();

        System.out.print("Please input year: ");
        year = Integer.parseInt(scanner.nextLine());

        Book book = new Book(iSBN, title, author, year);

        return book;
    }

    private static Book getInfoBookFromDB(int iSBN, String title, String author, int year) {

        // READING
        String relativeFilePath = "\\src\\lesson_lab_13\\BookDB.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);

        List<Book> bookList = DataFactory.getListBookFromFile(absoluteFilePath);

        for (Book book : bookList) {
            iSBN = book.getISBN();
            title = book.getTitle();
            author = book.getAuthor();
            year = book.getYear();
        }

        return new Book(iSBN, title, author, year);
    }

    private static void saveBookInDB(Book book) {

        // WRITING
        List<Book> bookListToSave = new ArrayList<>();
        bookListToSave.add(book);

        String bookDataFile = System.getProperty("user.dir").concat("\\src\\lesson_lab_13\\BookDB.txt");
        DataFactory.saveBookList(bookListToSave, bookDataFile);

        System.out.println("The book is saved into BookDB: " + book);
    }

    private static void addNewBook() {
        Book book = inputInfoBook(iSBN, title, author, year);
        saveBookInDB(book);
    }

    private static Book findABookByISBN(int fISBN, String fTitle, String fAuthor, int fYear) {
        Scanner scanner02 = new Scanner(System.in);
        System.out.print("Please input ISBN: ");
        fISBN = scanner02.nextInt();
//        fISBN = Integer.parseInt(scanner02.nextLine());

        Book bookInDB = getInfoBookFromDB(iSBN, title, author, year);

        if (fISBN == iSBN) {
            System.out.println("The Book is found: " + bookInDB);
        } else {
            System.out.printf("Book with ISBN %d is not found\n", fISBN);
        }
        return bookInDB;
    }

    private static void updateABook() {
        Book oldBook = BookManagementProgram.findABookByISBN(iSBN, title, author, year);

        Scanner scanner03 = new Scanner(System.in);
        System.out.print("Please input updated ISBN: ");
        int inputUpdatedISBN = Integer.parseInt(scanner03.nextLine());
        int newISBN = oldBook.setISBN(inputUpdatedISBN);

        System.out.print("Please input updated title: ");
        String inputUpdatedTitle = scanner03.nextLine();
        String newTitle = oldBook.setTitle(inputUpdatedTitle);

        System.out.print("Please input updated author: ");
        String inputUpdatedAuthor = scanner03.nextLine();
        String newAuthor = oldBook.setAuthor(inputUpdatedAuthor);

        System.out.print("Please input updated year: ");
        int inputUpdatedYear = Integer.parseInt(scanner03.nextLine());
        int newYear = oldBook.setYear(inputUpdatedYear);

        Book newBook = new Book(newISBN, newTitle, newAuthor, newYear);
        saveBookInDB(newBook);
    }

    private static void deleteABook() {
        Book deletedBook = BookManagementProgram.findABookByISBN(iSBN, title, author, year);
        String bookDataFile = System.getProperty("user.dir").concat("\\src\\lesson_lab_13\\BookDB.txt");
        List<Book> bookList = DataFactory.getListBookFromFile(bookDataFile);

        for (Book book : bookList) {
            if (book == deletedBook) {
                bookList.remove(book);
                saveBookInDB(book);
            }
        }

        System.out.println("The book is deleted:" + deletedBook);
        System.out.println("Check the deleted book is not existed in DB : " + bookList);
    }

    private static void printTheBookList() {
        String bookDataFile = System.getProperty("user.dir").concat("\\src\\lesson_lab_13\\BookDB.txt");
        List<Book> bookList = DataFactory.getListBookFromFile(bookDataFile);
        System.out.println("Print the booklist: " + bookList);
    }

    private static void printSimpleMenu() {
        System.out.println("======MENU======");
        System.out.println("0. Exit Program");
        System.out.println("1. Add a new book");
        System.out.println("2. Find a book(ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
    }

    private static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an option: ");
        return scanner.nextInt();
    }
}
