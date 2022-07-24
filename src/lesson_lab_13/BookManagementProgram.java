package lesson_lab_13;


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
                    findBookByISBN(iSBN, title, author, year);
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

    private static void saveBookInDBWithOverwrite(Book oldBook, Book newBook) {

        String bookDataFile = System.getProperty("user.dir").concat("\\src\\lesson_lab_13\\BookDB.txt");
        DataFactory.saveBookListOverwrite(bookDataFile, oldBook, newBook);

        System.out.println("The book is saved into BookDB: " + newBook);
    }

    private static void saveBookInDBWithoutOverwrite(Book book) {

        // WRITING
        List<Book> bookListToSave = new ArrayList<>();
        bookListToSave.add(book);

        String bookDataFile = System.getProperty("user.dir").concat("\\src\\lesson_lab_13\\BookDB.txt");
        DataFactory.saveBookListWithoutOverwrite(bookListToSave, bookDataFile);

        System.out.println("The book is saved into BookDB: " + book);
    }

    private static void addNewBook() {
        Book book = inputInfoBook(iSBN, title, author, year);
        saveBookInDBWithoutOverwrite(book);
    }

    private static Book findBookByISBN(int fISBN, String fTitle, String fAuthor, int fYear) {

        Scanner scanner02 = new Scanner(System.in);
        System.out.print("Please input ISBN: ");
        fISBN = scanner02.nextInt();

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

        Book oldBook = BookManagementProgram.findBookByISBN(iSBN, title, author, year);

        if (!bookList.contains(oldBook)){
            throw new IllegalArgumentException("[ERR] Invalid input!");
        }

        Scanner scanner03 = new Scanner(System.in);
        System.out.print("Please input updated ISBN: ");
        int inputUpdatedISBN = Integer.parseInt(scanner03.nextLine());
        int newISBN = inputUpdatedISBN;
//        int newISBN = oldBook.setISBN(inputUpdatedISBN);

        System.out.print("Please input updated title: ");
        String inputUpdatedTitle = scanner03.nextLine();
        String newTitle = inputUpdatedTitle;
//        String newTitle = oldBook.setTitle(inputUpdatedTitle);

        System.out.print("Please input updated author: ");
        String inputUpdatedAuthor = scanner03.nextLine();
        String newAuthor = inputUpdatedAuthor;
//        String newAuthor = oldBook.setAuthor(inputUpdatedAuthor);

        System.out.print("Please input updated year: ");
        int inputUpdatedYear = Integer.parseInt(scanner03.nextLine());
        int newYear = inputUpdatedYear;
//        int newYear = oldBook.setYear(inputUpdatedYear);

        Book newBook = new Book(newISBN, newTitle, newAuthor, newYear);

        saveBookInDBWithOverwrite(oldBook, newBook);
    }

    private static void deleteABook() {
        Book deletedBook = BookManagementProgram.findBookByISBN(iSBN, title, author, year);
        bookList = getBookList(bookList);

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getISBN() == deletedBook.getISBN()) {
                bookList.remove(bookList.get(i));
//                saveBookInDBWithOverwrite(deletedBook, bookList.get(i));
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
        getBookList(bookList);
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

