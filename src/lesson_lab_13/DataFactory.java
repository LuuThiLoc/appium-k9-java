package lesson_lab_13;

import lesson_13.Employee;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataFactory {

    public static void saveBookListWithoutOverwrite(List<Book> bookList, String filePath) {

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Book book : bookList) {
                String dataLine = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthor() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] readFile(Path path) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(path);
             Stream<String> stream = br.lines()) {
            return stream.peek(System.out::println)
                    .collect(Collectors.toList())
                    .toArray(String[]::new);
        }
    }

    public static void saveBookListOverwrite(String filePath, Book oldBook, Book newBook) {

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Book book : getListBookFromFile(filePath)) {
                String oldDataLine = oldBook.getISBN() + ";" + oldBook.getTitle() + ";" + oldBook.getAuthor() + ";" + oldBook.getYear();
                String newDataLine = newBook.getISBN() + ";" + newBook.getTitle() + ";" + newBook.getAuthor() + ";" + newBook.getYear();

                if (book.getISBN() == oldBook.getISBN()){
                    oldDataLine = oldDataLine.replace(oldDataLine, newDataLine);
                    bufferedWriter.write(oldDataLine);
                    bufferedWriter.newLine();
                    break;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Book> getListBookFromFile(String filePath) {

        List<Book> bookList = new ArrayList<>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(";");
                int bookISBN = Integer.parseInt(bookData[0]);
                String bookTitle = bookData[1];
                String bookAuthor = bookData[2];
                int bookYear = Integer.parseInt(bookData[3]);

                Book book = new Book(bookISBN, bookTitle, bookAuthor, bookYear);
                bookList.add(book);

                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}

