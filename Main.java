import java.util.Random;


public class Main {
    private static long generateRandomID() {
        Random random = new Random();

        long min = 100_000_000L;
        long max = 999_999_999L;
        return min + (long) (random.nextDouble() * (max - min + 1));
    }

    public static void main(String[] args) {
        student student1 = new student();
        student1.setName("John Doe");
        student1.setID(generateRandomID());
        student1.setPointGrade(3.5);
        student1.setYear(2);
        
        student student2 = new student("Bob Invalid Year", generateRandomID(), 3.8, 6);
    
        long cameronRandomID = generateRandomID();
        student student3 = new student("Cameron", cameronRandomID, -0.5, 3);

        long specificID = 123456789L;
        student student4 = new student("Alice", specificID, 4.0, 1);

        student[] students = {student1, student2, student3, student4};

        System.out.println("Students created: ");
        for (student s : students) {
            System.out.println(s);
        }

        System.out.println(student1.getName() + " has a point grade of " + student1.getPointGrade());
        System.out.println(student2.getName() + " has a point grade of " + student2.getPointGrade());
        System.out.println(student3.getName() + " has a point grade of " + student3.getPointGrade());
        System.out.println(student4.getName() + " has a point grade of " + student4.getPointGrade());
    
        System.out.println("\n--- 3. Creating School Object ---");
        
        School mySchool = new School("Tech College Prep", "53213", allStudents);
        
        System.out.println("School created: " + mySchool.getSchoolName() + " (Zip: " + mySchool.getAreaCode() + ")");


        // --- 4. Test School Methods: searchStudent ---
        System.out.println("\n--- 4. Testing School Methods (searchStudent) ---");
        
        // Test A: Run searchStudent(123456789) - ID not in list
        long searchID_A = 123456789L;
        student resultA = mySchool.searchStudent(searchID_A);
        
        System.out.println("Searching for ID: " + searchID_A);
        if (resultA == null) {
            System.out.println("Student was not found.");
        } else {
            System.out.println("Student found!");
            System.out.println(resultA);
        }

        // Test B: Run searchStudent(-1) - Invalid/Non-existent ID
        long searchID_B = -1L;
        student resultB = mySchool.searchStudent(searchID_B);
        
        System.out.println("\nSearching for ID: " + searchID_B);
        if (resultB == null) {
            System.out.println("Student was not found.");
        } else {
            System.out.println("Student found!");
            System.out.println(resultB);
        }

        // Optional: Test C: Search for a student that IS in the list (student4's ID)
        long searchID_C = 826130494L;
        student resultC = mySchool.searchStudent(searchID_C);
        
        System.out.println("\nSearching for ID: " + searchID_C + " (Student should be found)");
        if (resultC == null) {
            System.out.println("Student was not found.");
        } else {
            System.out.println("Student found!");
            System.out.println(resultC);
        }
    }
}
