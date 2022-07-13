package lesson_lab_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static void saveBookList(List<Book> bookList, String filePath) {
//        System.out.println("[INFO] Writing book data to ".concat(filePath));

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath,true);
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

    public static List<Book> getListBookFromFile(String filePath) {
//        System.out.println("[INFO] Reading file from ".concat(filePath));

        List<Book> bookList = new ArrayList<>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                System.out.println(dataLine);
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

