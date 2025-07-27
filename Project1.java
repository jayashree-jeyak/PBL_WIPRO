import java.util.*;

class Project1 {
    static class Employee {
        int empNo;
        String name, joinDate, desgCode, department;
        int basic, hra, it;

        Employee(int empNo, String name, String joinDate, String desgCode, String department, int basic, int hra, int it) {
            this.empNo = empNo;
            this.name = name;
            this.joinDate = joinDate;
            this.desgCode = desgCode;
            this.department = department;
            this.basic = basic;
            this.hra = hra;
            this.it = it;
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1001, "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000),
            new Employee(1003, "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000),
            new Employee(1004, "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000),
            new Employee(1006, "Suman", "1/1/2000", "e", "Manufacturing", 23000, 9000, 4400),
            new Employee(1007, "Tanmay", "12/06/2006", "c", "PM", 29000, 12000, 10000)
        };

        // Maps for designation code to title and DA
        Map<String, String> designationMap = new HashMap<>();
        designationMap.put("e", "Engineer");
        designationMap.put("c", "Consultant");
        designationMap.put("k", "Clerk");
        designationMap.put("r", "Receptionist");
        designationMap.put("m", "Manager");

        Map<String, Integer> daMap = new HashMap<>();
        daMap.put("e", 20000);
        daMap.put("c", 32000);
        daMap.put("k", 12000);
        daMap.put("r", 15000);
        daMap.put("m", 40000);

        if (args.length == 0) {
            System.out.println("Please provide employee ID as argument.");
            return;
        }

        int id = Integer.parseInt(args[0]);
        boolean found = false;

        for (Employee emp : employees) {
            if (emp.empNo == id) {
                found = true;
                String desg = designationMap.get(emp.desgCode);
                int da = daMap.get(emp.desgCode);
                int salary = emp.basic + emp.hra + da - emp.it;

                System.out.printf("Emp No. Emp Name Department Designation Salary\n");
                System.out.printf("%d %7s %10s %11s %6d\n", emp.empNo, emp.name, emp.department, desg, salary);
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + id);
        }
    }
}
