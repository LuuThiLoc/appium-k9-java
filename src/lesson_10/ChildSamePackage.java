package lesson_10;

public class ChildSamePackage extends ParentClass {

    @Override
    public void fromParent() {
        // muốn override thì level access của class con phải >= protected
        // class con khi override có quyền thay đổi level access: protected -> public thì khác package có thể truy cập dc
        super.fromParent();
    }

    public void doSth() {
        fromParent();
    }
}
