package Util;

import Entity.Account;
import Entity.User;

public class Auth {
    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static Account user = null;
    public static User vt=null;
    /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void clear() {
        Auth.user = null;
    }
    /**
     * Kiểm tra xem đăng nhập hay chưa
     */
    public static boolean isLogin() {
        return Auth.user != null;
    }
     /**
     * Kiểm tra xem có phải là chủ hay không
     */
    public static boolean isManager() {
        return Auth.isLogin() && vt.isVaiTro();
    }
}
