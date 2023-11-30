package DSA.algos.Strings;

import java.util.Arrays;

//1108. Defanging an IP Address
public class DefangingIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
        StringBuilder st= new StringBuilder();
        char[] array= address.toCharArray();
        for (int i = 0; i < address.length(); i++) {
            char ch= array[i];
            if (ch == '.'){
                st.append("[.]");
            }else{
                st.append(ch);
            }
        }
        return st.toString();
    }
}
