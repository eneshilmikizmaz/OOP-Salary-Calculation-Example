public class Employee {
    public String name;
    public int salary;
    public int workHours;
    public int hireYear;


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    private double tax() {
        if (this.salary > 1000) {
            return (this.salary * 0.03);
        } else {
            return 0;
        }

    }

    private int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    private double raiseSalary() {
        int now = 2021;
        if (now - this.hireYear < 10) {
            return (this.salary * 0.05);
        } else if (now - this.hireYear > 9 && now - this.hireYear < 20) {
            return (this.salary * 0.1);
        } else {
            return (this.salary * 0.15);
        }
    }

    private double netSalary() {
        return (this.salary + bonus() + raiseSalary() - tax());
    }

    private double totalSalary(){
        return (this.salary + bonus() + raiseSalary());
    }
    public void toStrings() {
        System.out.println("===================================================");
        System.out.println("Adı                                 : " + this.name);
        System.out.println("Maaşı                               : " + this.salary);
        System.out.println("Çalışma Saati                       : " + this.workHours);
        System.out.println("Başlangıç Yılı                      : " + this.hireYear);
        System.out.println("Vergi                               : " + tax());
        System.out.println("Bonus                               : " + bonus());
        System.out.println("Maaş Artışı                         : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + netSalary());
        System.out.println("Toplam Maaş                         : " + totalSalary());
        System.out.println("===================================================");

    }
}
