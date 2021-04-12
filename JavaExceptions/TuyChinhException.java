package JavaExceptions;

public class TuyChinhException {
    public static void main(String[] args) {
        try {
            validate(13);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e);
        }finally {
            System.out.println("system enter here");
        }

        System.out.println("Code done");
    }

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Bạn chưa đủ tuổi");
        }else {
            System.out.println("Bạn đã đủ tuỏi");
        }
    }
}
