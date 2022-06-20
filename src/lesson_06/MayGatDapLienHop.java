package lesson_06;

//class: Template | Blueprint
public class MayGatDapLienHop {

    // Từ mẫu thiết kế: MayGatDapLienHop --> tạo ra 1 cái máy thật (object) + thử sử dụng các chức năng gatLua, xayLua...?
    // Tạo ra object thông qua từ khóa: new keyword

    // what to solve - logic?

    public void gatLua(String cayLua) {
        System.out.println("Dang gat: " + cayLua);
    }

    public void xayLua(String hatLua) {
        System.out.println("Dang xay: " + hatLua);
    }

    public static void main(String[] args) {
        MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop();
        // mayGatDapLienHop: object | instance
        // new MayGatDapLienHop(): default constructor
        // new keyword -> constructor -> object

        // . : dot notation --> để gọi function bên trong
        // gọi method = dot notation
        mayGatDapLienHop.gatLua("cay lua");
        mayGatDapLienHop.xayLua("hat lua");

    }
}
