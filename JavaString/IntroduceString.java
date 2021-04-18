package JavaString;

public class IntroduceString {
    public static void main(String[] args) {
       
        String myString = "   ";
        System.out.println(myString);

        System.out.println("Do dai cu String: " + myString.length());
        System.out.println("Ký tự đầu tiên là: " + myString.charAt(1));
        System.out.println("String có chứa Huu không? " + myString.contains("Huu1"));
        System.out.println("String có empty không? " + myString.trim().isEmpty());
        
        
    }
}
