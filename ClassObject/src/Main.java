public class Main {
    public static void main(String[] args) {
        //String id, String fullName, String address, String email, String phoneNumber
//        Student man = new Student("11595", "Tran Thanh An", "1014 CMT8, P5, Tan Binh, HCM",
//                "thanhan311@gmail.com", "0906844284");

//        man.gotoSchool();
//        man.doHomework("Math");
//        man.payFee("Math", 3500000);
//        System.out.println(man);
//
//        man.setEmail("0906844284@yahoo.com");
//        System.out.println("Email: " + man.getEmail());


        Subject math = new Subject("M001", "Thanh An", "Mon Toan", 45, 5, 4);
        System.out.println("So tin chi: " +math.getAmountOfInfo());
        System.out.println(math);
    }
}
