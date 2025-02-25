package EX_practice25022025.String;

public class Lab02_Palindrome {
    public static void main(String[] args) {
        String name = "nithu";
        StringBuilder sb = new StringBuilder(name);
        String rev = String.valueOf(sb.reverse());
        if(rev.equalsIgnoreCase(name)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

    }
}
