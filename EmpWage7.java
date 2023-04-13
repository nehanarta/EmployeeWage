package EmpWagw2;

public class EmpWage7 {
    static int fullTimeHrs=8;
    static int partTimeHrs=4;
    static final int empPerHrsWage=20;
    static final int totalWorkingDays=5;
    static int totalEmpWage=0;
    static void m1(int empHrs){
        int empWage=0;
        empWage=empHrs * empPerHrsWage;
        totalEmpWage+=empWage;
        System.out.println("Empwage:"+empWage);
       System.out.println("totalEmpwage:"+ totalEmpWage);
    }
    public static void main(String[] args){
        for (int day=0; day<totalWorkingDays; day++) {
            int empHrs=0;
            int empCheck=(int)(Math.random()*10%3);
            switch (empCheck){
                case 1:
                    empHrs=8;
                    m1(empHrs);
                    break;
                case 2:
                    empHrs=4;
                    m1(empHrs);
                    break;
                case 0:
                    System.out.println("absent");
                    break;
                default:
                    break;
            }
        }
    }
}
