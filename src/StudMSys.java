public class StudMSys {
    private int s_id;
    private String s_name;
    private int s_age;
    private String course_nm;

    public StudMSys(int s_id, String s_name, int s_age, String course_nm) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_age = s_age;
        this.course_nm = course_nm;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public String getCourse_nm() {
        return course_nm;
    }

    public void setCourse_nm(String course_nm) {
        this.course_nm = course_nm;
    }
@Override
    public String toString() {
        return "s_id: " + s_id + ", s_name: " + s_name + ", s_age: " + s_age + ", course_nm: " + course_nm;
    }
}


