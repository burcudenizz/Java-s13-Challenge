package employeeApp;

import enums.Plan;
import model.Company;
import model.Employee;
import model.Healthplan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {

        Healthplan healthplan1 = new Healthplan(1, "X sigorta", Plan.ADVANCED);
        Healthplan healthplan2 = new Healthplan(2, "Y sigorta", Plan.SIMPLE);

        System.out.println(healthplan2.getPlan().getName());

        String[] healthplans = new String[2];
        healthplans[0] = healthplan1.getName();
        healthplans[1] = healthplan2.getName();
        Employee developer = new Employee(1, "burcu", "burcu@mail.com", "123456", healthplans);
        developer.addHealthplan(1, "z Sigorta");


        System.out.println(developer);

        System.out.println("*************");

        String[] developerNames = new String[5];
        developerNames[0] = developer.getFullName();


        Company company = new Company(1, "X company", 15000, developerNames);
        System.out.println(company);

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.
     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args) {
        workWithData();
    }
}
