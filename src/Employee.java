import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    public int salary;             //Çalışanın maaşı
    private String name;           //Çalışanın adı ve soyadı
    private int workHours;         //Haftalık çalışma saati
    private int hireYear;          //İşe başlangıç yılı

    public Employee(String name, double salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = (int) salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {                  //bonus eklenmemiş vergi hesabı

        if (this.salary > 1000) {
            double newTax = (this.salary * 3) / 100 ;
            return newTax;
        } else {
            return 0;
        }
    }

    public int bonus() {
        int Bonus = 0;
        if (this.workHours < 40) {                  //40 saatten az çalışmış ise
            Bonus = 0;
        }
        if (this.workHours >= 40) {
            Bonus = (this.workHours - 40) * 30 * 54 / 12;         // 1 maaştaki bonus miktarı
        }
        return Bonus;

    }


    public int riseSalary() {
        int riseSalary = 0;
        if (2021 - this.hireYear < 10) {
            if (this.salary + bonus() > 1000) {
                riseSalary = (int) ((this.salary + bonus()) * 105 / 100 * 97 / 100 - this.salary);

                // Vergi maaş ve bonusun toplamından hesaplandı
                // Maaşın vergilendirilmiş hali

            } else {
                riseSalary = (int) ((this.salary + bonus()) * 105 / 100 - this.salary);
            }
        }
        if (9 < 2021 - this.hireYear && 2021 - this.hireYear < 20) {
            if (this.salary + bonus() > 1000) {
                riseSalary = (int) ((this.salary + bonus()) * 110 / 100 * 97 / 100 - this.salary);
            } else {
                riseSalary = (this.salary + bonus()) * 110 / 100 - this.salary;
            }
        }
        if (2021 - this.hireYear > 19) {
            if (this.salary + bonus() > 1000) {
                riseSalary = (this.salary + bonus()) * 115 / 100 * 97 / 100 - this.salary;
            } else {
                riseSalary = (this.salary + bonus()) * 115 / 100 - this.salary;
            }
        }
        return riseSalary;

    }

    @Override                         //override işlemimizi yaparak metodumuzu oluşturduk.
    public String toString() {
        return "Çalışanın Adı ve Soyadı: " + this.name + " , " + "Çalışanın Maaşı: " + this.salary + " , " + "Çalışma Saati: "
                + this.workHours + " , " + "Başlama Yılı: " + this.hireYear;
    }

}









