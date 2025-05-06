import java.util.HashMap;

public class SmsImplementation  implements smsInterface {
    private static HashMap<Integer, StudMSys> studDetails = new HashMap<>();

    @Override
    public void Addstudent(StudMSys studmsys) {
        studDetails.put(studmsys.getS_id(), studmsys);
        System.out.println("Student Added successfully !!");
    }

    @Override
    public StudMSys viewStudent(int s_id) {
        return studDetails.get(s_id);

    }

    @Override
    public void updateStudent(int s_id, StudMSys updatedStudent) {
        if (studDetails.containsKey(s_id)) {
            studDetails.put(s_id, updatedStudent);
            System.out.println("Student updated Successfully !!");
        } else {
            System.out.println("Student not found !!");
        }
    }

    @Override
    public void removeStudent(int s_id) {
        if (studDetails.remove(s_id) != null) {
            System.out.println("Student removed successfully !");
        } else {
            System.out.println("Student not found !");
        }
    }

    @Override
    public void searchStudent(int s_id) {
        if (studDetails.containsKey(s_id)) {
            System.out.println("student found:" + studDetails.get(s_id));
        } else {
            System.out.println("Student not found !");
        }
    }

    @Override
    public void DisplayAllStudents() {
        if (studDetails.isEmpty()) {
            System.out.println("No student found !");
        } else {
            System.out.println("Students List :- ");
            for (StudMSys studMsys : studDetails.values()) {
                System.out.println(studMsys);
            }
        }
    }

}