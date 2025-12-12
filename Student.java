public class Student {
    private String name;
    private long ID;
    private double pointGrade;
    private int year;

    public Student() {
        
    }

    public Student(String name, long ID, double pointGrade, int year) {
        this.name = name;
        this.ID = ID;
        this.pointGrade = pointGrade;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public long getID() {
        return ID;
    }
    public double getPointGrade() {
        return pointGrade;
    }
    public int getYear() {
        return year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setID(long ID) {
        this.ID = ID;
    }
    public void setPointGrade(double pointGrade) {
        this.pointGrade = pointGrade;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public boolean isValid() {
        return (name != null && !name.isEmpty()) &&
        ID > 0 && 
        pointGrade >= 0.0 && pointGrade <= 4.0 && 
        year >= 1 && year <= 5;
    }
    public String getYearInString() {
        String yearString;
        switch (year) {
            case 1: 
                yearString = "Freshman";
                break;
            case 2: 
                yearString = "Sophomore";
                break;
            case 3: 
                yearString = "Junior";
                break;
            case 4: 
                yearString = "Senior";
                break;
            case 5: 
                yearString = "Graduate";
                break;
            default: 
                yearString = "Unknown";
                break;
        }
        return yearString;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', ID=" + ID + ", pointGrade=" + pointGrade + ", year='" + year + "'}";
    }
}
