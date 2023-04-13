package EmpWagw2;

public class EmpWage {
    public static final int IS_PART_Time=1;
    public static final int Is_FULL_Time=2;
    public static int m1(String Company, int empPerHrsWage,  int noOfWorkingDays, int maxHoursPerMonth) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 10 % 3);
            switch (empCheck) {
                case 1:
                    empHrs = 8;
                    break;
                case 2:
                    empHrs = 4;
                    break;
                default:
            }
            totalEmpHrs += empHrs;
            System.out.println("Day==>" + totalWorkingDays);
            System.out.println("empHrs==>" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empPerHrsWage;
        System.out.println("totalEmpWage for company==>" + totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args){
        m1("TCS",20,5,40);
        m1("NTT DATA",22,5,50);
    }

}
