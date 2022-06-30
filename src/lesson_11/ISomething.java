package lesson_11;

import java.util.Comparator;

public interface ISomething extends Comparable, Comparator {

    //all methods: public
    void doSth(); //public abstract

    //default: cho phép child class dùng lại mà ko cần override
    //khi thêm 1 method vào interfaces thì tránh t/h all child class implements nó phải override lại.
    default void doAnotherSth(){ //public

    }

    static void doAnything(){ //public

    }


}
