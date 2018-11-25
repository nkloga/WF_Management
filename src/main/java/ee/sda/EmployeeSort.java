package ee.sda;

import java.text.DecimalFormat;
import java.util.*;

public class EmployeeSort {

    private static TreeMap<Employee, ArrayList<Double>> map = new TreeMap<Employee, ArrayList<Double>>();

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

    static Double getRandomHours() {
        Random rnd = new Random();
        Double numb;
        int f = rnd.nextInt(8);
        if (f != 0) {
            numb = f - 0.5 * (rnd.nextInt(2));
        } else numb = f * 1.0;
        return numb;
    }

    static ArrayList<Double> getHoursPerEmployee(Employee name) {
        ArrayList<Double> list = new ArrayList<Double>();
        Double average = 0.0;
        for (int i = 0; i < 7; i++) {
            double value = getRandomHours();
            list.add(value);
            average += value;
        }
        name.setAverageHours(average/7);
        return list;
    }

    static void populateMap() {
        Employee Serg = new Employee("Serg");
        Employee Oleg = new Employee("Oleg");
        Employee Tolja = new Employee("Tolja");
        Employee Kolja = new Employee("Kolja");
        Employee Masha = new Employee("Masha");
        Employee Bo = new Employee("Bo");
        Employee Ren = new Employee("Ren");
        Employee Go = new Employee("Go");

        map.put(Serg, getHoursPerEmployee(Serg));
        map.put(Oleg, getHoursPerEmployee(Oleg));
        map.put(Tolja, getHoursPerEmployee(Tolja));
        map.put(Kolja, getHoursPerEmployee(Kolja));
        map.put(Masha, getHoursPerEmployee(Masha));
        map.put(Bo, getHoursPerEmployee(Bo));
        map.put(Ren, getHoursPerEmployee(Ren));
        map.put(Go, getHoursPerEmployee(Go));
    }

    static void printMap() {
        DecimalFormat df = new DecimalFormat("#.##");
        for (Employee e : map.keySet()) {
            System.out.println(e.getName() + " " + df.format(e.getAverageHours()));
        }
    }
}
