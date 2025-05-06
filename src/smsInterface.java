public interface smsInterface {
    void Addstudent(StudMSys studmsys);
    StudMSys viewStudent(int s_id);
    void updateStudent(int s_id, StudMSys updatedStudent);
    void removeStudent(int s_id);
    void searchStudent(int s_id);
    void DisplayAllStudents();

}
