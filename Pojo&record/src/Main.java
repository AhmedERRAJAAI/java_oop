public class Main {

    public static void main(String[] args) {
            Point pt = new Point();
            System.out.println(pt.distance(1, -1));

//        for (int i = 1; i <= 5; i++) {
//            Student s = new Student("S92300" + i,
//                    switch (i) {
//                        case 1 -> "Mary";
//                        case 2 -> "Carol";
//                        case 3 -> "Tim";
//                        case 4 -> "Harry";
//                        case 5 -> "Lisa";
//                        default -> "Anonymous";
//                    },
//                    "05/11/1985",
//                    "Java Masterclass");
//            System.out.println(s);
//        }
        Student pojoStudent = new  Student("everve", "Ahmed", "23/12/1999", "java course");
        LPAStudent recordStudent = new LPAStudent("everve", "Ahmed", "23/12/1999", "java course");

        pojoStudent.setClassList(pojoStudent.getClassList()+" JAVA OCP COURSE");
//        System.out.println(pojoStudent.getClassList());
//        System.out.println(recordStudent.classList());


    }
}
