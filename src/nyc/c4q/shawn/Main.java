package nyc.c4q.shawn;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student stud1 = new Student ("Shawn", "Speaks", 3332, "ICECREAM");
        Student stud2 = new Student ("Shannon", "Alexander", 1, "ICECREAM");

        //  stud2.checkFavFood(stud1,stud2);
        System.out.println(Student.checkFavFood(stud2, stud1));


    }
}
