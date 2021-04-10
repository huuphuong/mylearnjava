package JavaString;

public class AboutString {
    public static void main(String[] args) {
        String myName = "Phuong Huu";
        System.out.println(myName);

        String mySecondName = new String("Nguyen Van An");
        System.out.println(mySecondName);

        char[] myListChar = {'n', 'g','u','y','e', 'n'};
        String myThirdName = new String(myListChar);
        System.out.println(myThirdName);

        int myNumber = 6699536;
        String myStringNumber = String.valueOf(myNumber);
        System.out.println(myStringNumber);


    }
}
