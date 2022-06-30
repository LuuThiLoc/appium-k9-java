package lesson_12;

import java.io.IOException;
import java.net.ConnectException;
import java.sql.SQLDataException;

public class Calculator {

    /**
    * @param a :first number
    * @param b : second number
    * @Exception
    * */

    public int divide(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("[ERR] b can not be 0!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(new Calculator().divide(4, 2));
            System.out.println(new Calculator().divide(4, 0));
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("No input invalid value!");
        }
//        catch (Exception | ConnectException | SQLDataException e) { //multiple try...catch
//            e.printStackTrace();
//            System.out.println("[ERR] ko nhap so 0!");}
         finally {
            System.out.println("See you again!");
        }
    }
}
