package Day4;

public class Constructors {
    
    public static void main(String[] args) {

//         char[] ch = {'j','a','v','a'};
//         String s1 = new String(ch);
// 
//         byte[] b = {97,98,99};
//         String s2 = new String(b);
// 
//         System.out.println(s1 + " " + s2);
// 
//         String s = "javaprogramme";
// 
//         s = s.replace('j','l' );
// 
//         System.out.println(s);
// 
//         System.out.println(s.substring(4));
//         System.out.println(s.substring(4,7));
// 

        // String s1 = new String("vivek");
        // String s2 = s1.toUpperCase();
        // String s3 = s1.toLowerCase();
        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);

        // String s1 = "java";
        // String s2 = s1.toString();
        // String s3 = s1.toLowerCase();
        // String s4 = s1.toUpperCase();
        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);
        // System.out.println(s1 == s4);



        String s = new String("java");
        s = s.concat("trainer");
        System.out.println(s);

        // final StringBuffer sb = new StringBuffer("java");
        // sb = new StringBuffer("trainer");

        StringBuffer sb = new StringBuffer();

        sb.append("12345678912345673");

        System.out.println(sb.capacity() + " " + sb.length());




    }
}