package lesson_10_01;

import lesson_10.ChildSamePackage;
import lesson_10.ParentClass;

public class NormalUnrelatedClass {

    public void doSth() {
        ChildSamePackage childSamePackage = new ChildSamePackage();
        childSamePackage.fromParent();
    }
}
