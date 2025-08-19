public class PenDistribution {
    public static void main(String[] args) {
        // Initialize variables for total pens and number of students
        int totalPens = 14;
        int students = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / students;    
        int remainingPens = totalPens % students;         
        // Print the distribution results
        System.out.printf("Each student will receive %d pens, with %d pen(s) remaining undistributed%n", 
                         pensPerStudent, remainingPens);
    }
}
