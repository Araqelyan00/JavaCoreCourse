package classwork.lesson4_1;

public class EnumTest {
    public static void main(String[] args) {
        String genderStr = "male";

        try{
            Gender gender = Gender.valueOf(genderStr.toUpperCase());
            System.out.println(gender);
        }catch (IllegalArgumentException e){
            System.out.println("Please Input correct gender.");
        }

    }
}
