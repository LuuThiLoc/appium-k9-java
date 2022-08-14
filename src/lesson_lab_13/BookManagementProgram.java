package lesson_lab_13;

import java.util.*;

import static lesson_lab_13.DataFactory.saveBookListOverwrite;
import static lesson_lab_13.DataFactory.saveBookListWithoutOverwrite;

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

    static List<Book> bookList = new ArrayList<>();

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
                    findBookByISBN();
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

    private static Book inputInfoBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input ISBN: ");
        int iSBN = Integer.parseInt(scanner.nextLine());

        System.out.print("Please input title: ");
        String title = scanner.nextLine();

        System.out.print("Please input author: ");
        String author = scanner.nextLine();

        System.out.print("Please input year: ");
        int year = Integer.parseInt(scanner.nextLine());

        Book book = new Book(iSBN, title, author, year);

        return book;
    }

    private static void addNewBook() {
        Book book = inputInfoBook();
        String filePath = System.getProperty("user.dir").concat("\\src\\lesson_lab_13\\BookDB.txt");
        bookList = getBookList(bookList);
        bookList.add(book);
        saveBookListWithoutOverwrite(bookList, filePath);
    }

    private static Book findBookByISBN() {

        Scanner scanner02 = new Scanner(System.in);
        System.out.print("Please input ISBN: ");
        int fISBN = scanner02.nextInt();

        Book bookDB = new Book(iSBN, title, author, year);

        bookList = getBookList(bookList);

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getISBN() == fISBN) {
                bookDB = bookList.get(i);
                System.out.println("The Book is found: " + bookDB);
                break;
            }
        }

        if (!bookList.contains(bookDB)) {
            System.out.printf("Book with ISBN %d is not found\n", fISBN);
        }

        return bookDB;
    }

    private static void updateABook() {
        bookList = getBookList(bookList);

        Book oldBook = BookManagementProgram.findBookByISBN();

        if (!bookList.contains(oldBook)) {
            throw new IllegalArgumentException("[ERR] Invalid input!");
        }

        Scanner scanner03 = new Scanner(System.in);
        System.out.print("Please input updated ISBN: ");
        int newISBN = Integer.parseInt(scanner03.nextLine());

        System.out.print("Please input updated title: ");
        String newTitle = scanner03.nextLine();

        System.out.print("Please input updated author: ");
        String newAuthor = scanner03.nextLine();

        System.out.print("Please input updated year: ");
        int newYear = Integer.parseInt(scanner03.nextLine());

        Book newBook = new Book(newISBN, newTitle, newAuthor, newYear);

        String filePath = System.getProperty("user.dir").concat("\\src\\lesson_lab_13\\BookDB.txt");
        saveBookListOverwrite(filePath, oldBook, newBook);
    }

    private static void deleteABook() {
        Book deletedBook = BookManagementProgram.findBookByISBN();
        bookList = getBookList(bookList);

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getISBN() == deletedBook.getISBN()) {
                bookList.remove(bookList.get(i));
                String filePath = System.getProperty("user.dir").concat("\\src\\lesson_lab_13\\BookDB.txt");
                saveBookListOverwrite(filePath, deletedBook, null);
            }
        }

        System.out.println("The book is deleted:" + deletedBook);
        System.out.println("Check the deleted book is not existed in DB : " + bookList);
    }

    private static List<Book> getBookList(List<Book> bookList) {
        String bookDataFile = System.getProperty("user.dir").concat("\\src\\lesson_lab_13\\BookDB.txt");
        bookList = DataFactory.getListBookFromFile(bookDataFile);
        return bookList;
    }

    private static void printTheBookList() {
        System.out.println("Print the booklist: " + getBookList(bookList));
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

