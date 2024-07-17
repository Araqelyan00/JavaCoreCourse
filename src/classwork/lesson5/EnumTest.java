package classwork.lesson5;

public class EnumTest {
    public static void main(String[] args) {
        String genderStr = "female";
        try{
            Gender gender = Gender.valueOf(genderStr.toUpperCase());
            System.out.println(gender);
        }catch(IllegalArgumentException e){
            System.out.println("Please input correct gender");
        }
    }
}
