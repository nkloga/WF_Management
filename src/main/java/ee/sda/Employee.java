package ee.sda;


import java.util.Objects;

class Employee implements Comparable<Employee>{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName());
    }

    private String name;
    private Double averageHours;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Employee setAverageHours(Double averageHours) {
        this.averageHours = averageHours;
        return this;
    }

    public Double getAverageHours() {
        return averageHours;
    }

    public int compareTo(Employee o) {
        return o.getAverageHours().compareTo(this.averageHours);
    }
}

