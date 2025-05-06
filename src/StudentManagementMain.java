import java.util.Scanner;
public class StudentManagementMain {
    public static void main(String[] args) {
        smsInterface sms = new SmsImplementation();
        Scanner sc = new Scanner(System.in);
        int Choice;
        do {
            System.out.println("welcome !");
            System.out.println("1.Add Student ");
            System.out.println("2.view Student ");
            System.out.println("3.update student ");
            System.out.println("4.Remove Student");
            System.out.println("5.Display All student");
            System.out.println("Exit !");
            System.out.println("Enter your Choice :");
            Choice = sc.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println("enter id: ");
                    int id = sc.nextInt();
                    sc.nextLine();                         //for next line
                    System.out.println("enter your name:");
                    String name = sc.nextLine();
                    System.out.println("enter your age: ");
                    int age = sc.nextInt();
                    System.out.println("enter course name: ");
                    String course = sc.nextLine();
                    sms.Addstudent((new StudMSys(id, name, age, course)));
                    break;
                case 2:
                    System.out.println(("enter student id: "));
                    id = sc.nextInt();
                    StudMSys studMSys = sms.viewStudent(id);
                    if (studMSys != null) {
                        System.out.println(studMSys);
                    } else {
                        System.out.println("Student not found. ");
                    }
                    break;

                case 3:
                    System.out.println("enter student id to update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter new name:");
                    name = sc.nextLine();
                    System.out.println("enter new age:");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter new course:");
                    course = sc.nextLine();
                    sc.nextLine();
                    sms.updateStudent(id, new StudMSys(id, name, age, course));
                    break;

                case 4:
                    System.out.println("enter Is to delete student:");
                    id = sc.nextInt();
                    sms.removeStudent(id);
                    break;
                case 5:
                    System.out.println("list of students: ");
                    sms.DisplayAllStudents();
                    break;
                case 6:
                    System.out.println("Thank You !");
                    break;
                default:
                    System.out.println("Invalid choice !!");
            }
        } while (Choice != 6);
    }
}





