package lesson_10_01;

import lesson_10.ParentClass;

public class ChildSamePackage extends ParentClass {

    @Override
    protected void fromParent() {
        super.fromParent();
    }

    public void doSth() {
        fromParent();
    }
}
