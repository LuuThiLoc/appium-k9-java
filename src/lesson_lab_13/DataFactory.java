package lesson_lab_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public static void saveBookListOverwrite(List<Book> oldBookList, String filePath, Book newBook) {

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {

            for (Book oldBook : oldBookList) {

//                String bookListIndex0 = String.valueOf(oldBookList.get(0));
//                String bookListIndex1 = String.valueOf(oldBookList.get(1));
//                String bookListIndex2 = String.valueOf(oldBookList.get(2));
//                String bookListIndex3 = String.valueOf(oldBookList.get(3));
//
//                String replacedISBN = bookListIndex0.replaceAll(String.valueOf(oldBook.getISBN()), String.valueOf(newBook.getISBN()));
//                String replacedTitle = bookListIndex1.replaceAll(oldBook.getTitle(), newBook.getTitle());
//                String replacedAuthor = bookListIndex2.replaceAll(oldBook.getAuthor(), newBook.getAuthor());
//                String replacedYear = bookListIndex3.replaceAll(String.valueOf(oldBook.getYear()), String.valueOf(newBook.getYear()));
//                String newDataLine = replacedISBN + ";" + replacedTitle + ";" + replacedAuthor + ";" + replacedYear +"\n";

                String oldDataLine = oldBook.getISBN() + ";" + oldBook.getTitle() + ";" + oldBook.getAuthor() + ";" + oldBook.getYear();
                String newDataLine = newBook.getISBN() + ";" + newBook.getTitle() + ";" + newBook.getAuthor() + ";" + newBook.getYear();
                String replace = oldDataLine.replaceAll(oldDataLine, newDataLine);
                bufferedWriter.write(replace);
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
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

