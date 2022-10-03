import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee ("Furkan Küçükoğlu", 5500, 50,2018);

        System.out.println(employee);
        System.out.println("Vergi: " + employee.tax()) ;
        System.out.println("Bonus: " + employee.bonus()) ;
        System.out.println("Maaş Artışı: " + employee.riseSalary()) ;
        System.out.println("Bonus ve Vergilerle olan maaş: " + (employee.salary + employee.riseSalary())) ;

    }

}