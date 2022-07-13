package lesson_lab_13;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagementProgram2 {

    /*
        ======= Book Management Program (CRUD)============
        1. New book
        2. Find a book(ISBN)
        3. Update a book
        4. Delete a book
        5. Print the book list
        0. Exit
     */

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
                    int searchISBN = 0;
                    String searchTitle = null;
                    String searchAuthor = null;
                    int searchYear = 0;
                    findABookByISBN(searchISBN, searchTitle, searchAuthor, searchYear);
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

    private static Book inputInfoBook(int addISBN, String addTitle, String addAuthor, int addYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input ISBN: ");
        addISBN = Integer.parseInt(scanner.nextLine());

        System.out.print("Please input title: ");
        addTitle = scanner.nextLine();

        System.out.print("Please input author: ");
        addAuthor = scanner.nextLine();

        System.out.print("Please input year: ");
        addYear = Integer.parseInt(scanner.nextLine());

        Book book = new Book(addISBN, addTitle, addAuthor, addYear);

        return book;
    }

    private static void saveBookInDB(Book book) {

        // WRITING
        List<Book> bookListToSave = new ArrayList<>();
        bookListToSave.add(book);

        String bookDataFile = System.getProperty("user.dir").concat("\\src\\lesson_lab_13\\BookDB.txt");
        DataFactory.saveBookList(bookListToSave, bookDataFile);

        System.out.println("The book is saved into BookDB: " + book);
//        System.out.println("Check the book exist in DB: " + bookListToSave);

    }

    private static void addNewBook() {

        int addISBN = 0;
        String addTitle = null;
        String addAuthor = null;
        int addYear = 0;

        Book book = inputInfoBook(addISBN, addTitle, addAuthor, addYear);
        saveBookInDB(book);
    }

    private static Book findABookByISBN(int searchISBN, String searchTitle, String searchAuthor, int searchYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input ISBN: ");
        searchISBN = Integer.parseInt(scanner.nextLine());
//        searchISBN = scanner.nextInt();

        // READING
        String relativeFilePath = "\\src\\lesson_lab_13\\BookDB.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);

        List<Book> bookList = DataFactory.getListBookFromFile(absoluteFilePath);

        int fISBN = 0;
        String fTitle = null;
        String fAuthor = null;
        int fYear = 0;

        for (Book book : bookList) {
            fISBN = book.getISBN();
            fTitle = book.getTitle();
            fAuthor = book.getAuthor();
            fYear = book.getYear();
        }

        Book book = new Book(fISBN, fTitle, fAuthor, fYear);

        if (searchISBN == fISBN) {
            System.out.println("The Book is found: " + book);
        } else {
            System.out.printf("Book with ISBN %d is not found\n", searchISBN);
        }
        return book;
    }

    private static void updateABook() {
        // Book: 1234, "Tren Duong Bang", "TonyBuoiSang", 2005

        int searchISBN = 0;
        String searchTitle = null;
        String searchAuthor = null;
        int searchYear = 0;

        Book oldBook = BookManagementProgram2.findABookByISBN(searchISBN, searchTitle, searchAuthor, searchYear);

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
        //  Book: 5678, "Cafe Cung Tony", "TonyBuoiSang", 2009

        int deletedISBN = 0;
        String deletedTitle = null;
        String deletedAuthor = null;
        int deletedYear = 0;

        Book deletedBook = BookManagementProgram2.findABookByISBN(deletedISBN, deletedTitle, deletedAuthor, deletedYear);
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
