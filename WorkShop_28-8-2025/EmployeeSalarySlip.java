public class EmployeeSalarySlip {
    public static void main(String[] args) {
        System.out.println("------Employee Salary Slip------");

        String [] string_arr = {"Rahul" , "Mohan" , "Manjeet" , "Karan" , "Lovely"};
        double [] int_arr = {20000 , 21000 , 35000 , 50000 , 25000};

        for(int i=0;i<int_arr.length ; i++){
            double HRA = 0 ;
             double DA = 0 ;
             double NetSalary = 0;
             HRA = int_arr[i] * 0.2;
             DA = int_arr[i] * 0.1;
             NetSalary = int_arr[i] + HRA + DA;
             if(NetSalary > 50000){
                NetSalary = NetSalary - (NetSalary*0.1);
             }
             System.out.println(i+1 +" Employee name = "+string_arr[i]);
             System.out.println("Your HRA = "+HRA);
             System.out.println("Your DA = "+DA);
             System.out.println("Your Totl Salary = "+NetSalary);
             System.out.println();

        }
    }
}
