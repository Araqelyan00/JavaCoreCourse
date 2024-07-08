package homework.lesson2;

public class ForTests {
    public static void main(String[] args) {
        Worker worker = new Worker(21,"Sam", "Sargsyan", true, 12);
//        worker.speak();
//        worker.walk();
//        worker.power();
//        worker.logic();
//
//
//        Worker applicant = new Worker(16,"Maya", "Margaryan", false);
//        applicant.speak();
//        applicant.walk();
//        applicant.power();
//        applicant.logic();

        Human human = new Human("Name", "Surname", true, 18, 1) {
            @Override
            public void speak() {
                System.out.println("I am Human.");
            }

            @Override
            public void walk() {

            }

            @Override
            public void logic() {

            }

            @Override
            public void power() {

            }
        };

        Customer customer = new Customer("Smbo");

        Human human1;

        human1 = human;
        human1.speak();
        System.out.println();
        human1 = customer;
        human1.speak();
        System.out.println();
        human1 = worker;
        human1.speak();
    }
}
