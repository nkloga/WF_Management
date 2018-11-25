package ee.sda;

import java.text.DecimalFormat;
import java.util.*;

public class EmployeeSort {

    private static TreeMap<Employee, ArrayList<Double>> map = new TreeMap<>();

    public static void main(String[] args) {
        populateMap();
        printMap();

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static Double getRandomHours(int num) {
        Random rnd = new Random();
        Double numb;
        int f = rnd.nextInt(num);
        if (f != 0) {
            numb = f - 0.5 * (rnd.nextInt(2));
        } else numb = f * 1.0;
        return numb;
    }

    static ArrayList<Double> getHoursPerEmployee(Employee name) {
        ArrayList<Double> list = new ArrayList<Double>();
        Double average = 0.0;
        for (int i = 0; i < 7; i++) {
            double value = getRandomHours(8);
            list.add(value);
            average += value;
        }
        name.setAverageHours(average/7);
        return list;
    }

    static void populateMap() {
        Employee Serg = new Employee("Serg");
        Employee Oleg = new Employee("Oleg");
        Employee Tolj = new Employee("Tolj");
        Employee Kolj = new Employee("Kolj");
        Employee Mash = new Employee("Mash");
        Employee Bogg = new Employee("Bogg");
        Employee Reng = new Employee("Reng");
        Employee Gohh = new Employee("Gohh");

        map.put(Serg, getHoursPerEmployee(Serg));
        map.put(Oleg, getHoursPerEmployee(Oleg));
        map.put(Tolj, getHoursPerEmployee(Tolj));
        map.put(Kolj, getHoursPerEmployee(Kolj));
        map.put(Mash, getHoursPerEmployee(Mash));
        map.put(Bogg, getHoursPerEmployee(Bogg));
        map.put(Reng, getHoursPerEmployee(Reng));
        map.put(Gohh, getHoursPerEmployee(Gohh));
    }

    static void printMap() {
        DecimalFormat df = new DecimalFormat("#.##");
        for (Employee e : map.keySet()) {
            System.out.println(e.getName() + " " + df.format(e.getAverageHours()));
        }
    }
}
