import java.util.Arrays;

public class School {
    private String schoolName;
    private String areaCode;
    private student[] students;

    public School (String schoolName, String areaCode, student[] students) {
        this.schoolName = schoolName;
        this.areaCode = areaCode;
        this.students = students;
    }
    public School() {
    }
    public String getSchoolName() {
        return schoolName;
    }
    public String getAreaCode() {
        return areaCode;
    }
    public student[] getStudents() {
        return students;
    }
    public double gradeAverage() {
        if (students == null || students.length == 0) {
            return 0.0;
        }
        double total = 0.0;
        int validStudentCount = 0;

        for (student student : students) {
            if (student != null) {
                total += student.getPointGrade();
                validStudentCount++;
            }
        }
        return (validStudentCount > 0) ? total / validStudentCount : 0.0;
    }
    public student bestInClass(int year) {
        student bestStudent = null;
        double highestGrade = -1.0;

        if (students == null) {
            return null;
        }
        for (student student : students) {
            if (student != null && student.getYear()== year) {
                if (student.getPointGrade() > highestGrade) {
                    highestGrade = student.getPointGrade();
                    bestStudent = student;
                }
            }
        }
        return bestStudent;
    }
    public student searchStudent(long ID) {
        if (students == null) {
            return null;
        }
        for (student student : students) {
            if (student != null && student.getID() == ID) {
                return student;
            }
        }
        return null;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    public void setStudents(student[] students) {
        this.students = students;
    }
    @Override
    public String toString() {
        return "School{schoolName='" + schoolName +
                "', areaCode='" + areaCode + 
                "', students=" + Arrays.toString(students) + 
                "}";
    }
}
