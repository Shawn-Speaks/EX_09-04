package nyc.c4q.shawn;


public class Student {

    private String firstName;

    private String lastName;

    private int idNum;

    private String favFood;



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNum() {
        return idNum;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }



    public Student (String firstName, String lastName, int idNum, String favFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.favFood = favFood;
    }


    public static boolean checkFavFood (Student student1, Student student2){
        if(student1.getFavFood().equals(student2.getFavFood())){
            return true;
        }else
            return false;
    }

}


