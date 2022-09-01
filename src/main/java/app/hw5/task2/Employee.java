package app.hw5.task2;

import java.util.ArrayList;

public class Employee {
    public static void main(String[] args) {
        int givenEmpId = 3;
        ArrayList<emp> empList = new ArrayList<emp>();
        empList.add(new emp(1, "hussain1"));
        empList.add(new emp(2, "hussain2"));
        empList.add(new emp(3, "hussain3"));
        for (emp currEmp : empList) {
            if (currEmp.id == givenEmpId) {
                System.out.println("emp name is===>>" + currEmp.name);
            }
        }
    }
}
