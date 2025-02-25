package EX_practice25022025.String;

public class Lab01 {
    public static void main(String[] args) {
        String s1= "Navaneeth";
        String s2 = "Navaneeth";
        String s5 = "navaneeth";
        String s3= new String("Navaneeth");
        String s4 = new String("Navaneeth");
        String s6 = new String("navaneeth");


        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s4==s6);
        System.out.println(s1==s3);
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s5));
        System.out.println(s1.concat(" H K"));
        System.out.println(s1.charAt(5));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.contains("van"));
    }
}
