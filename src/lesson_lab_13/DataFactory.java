package lesson_lab_13;

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
                FileOutputStream fileOutputStream = new FileOutputStream(filePath, false);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)
        ) {
            for (Book book : bookList) {
                String dataLine = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthor() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveBookListOverwrite(String filePath, Book oldBook, Book newBook) {

        List<Book> bookList = getListBookFromFile(filePath);

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)
        ) {

            for (int i = 0; i < bookList.size(); i++) {
                String oldDataLine = bookList.get(i).getISBN() + ";" + bookList.get(i).getTitle() + ";" + bookList.get(i).getAuthor() + ";" + bookList.get(i).getYear();

                if (bookList.get(i).getISBN() == oldBook.getISBN()) {

                    if (newBook != null) {
                        oldDataLine = newBook.getISBN() + ";" + newBook.getTitle() + ";" + newBook.getAuthor() + ";" + newBook.getYear();

                    } else {
                        oldDataLine = bookList.get(i).getISBN() + ";" + bookList.get(i).getTitle() + ";" + bookList.get(i).getAuthor() + ";" + bookList.get(i).getYear();
                        oldDataLine = oldDataLine.replaceAll(oldDataLine, "").trim();
                        bufferedWriter.append(oldDataLine);
                    }
                }
                bufferedWriter.write(oldDataLine);
                bufferedWriter.newLine();
                }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);

        } catch (Exception e) {
            e.printStackTrace();
        }

        getListBookFromFile(filePath);

    }

    public static List<Book> getListBookFromFile(String filePath) {

        List<Book> bookList = new ArrayList<>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                if (dataLine.trim().length()>0){
                String[] bookData = dataLine.split(";");
                int bookISBN = Integer.parseInt(bookData[0]);
                String bookTitle = bookData[1];
                String bookAuthor = bookData[2];
                int bookYear = Integer.parseInt(bookData[3]);

                Book book = new Book(bookISBN, bookTitle, bookAuthor, bookYear);
                bookList.add(book);
                }

                dataLine = bufferedReader.readLine();

            } ;

        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}

