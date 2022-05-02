package com.zpdu.test01;


import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("all")

public class Test001 {
    public static void main(String[] args) {

    }
}

class Test1 {
    @Test

    public void test() {
        Employee emp1 = new Employee("小明", 1000, 10000.2);
        Employee emp2 = new Employee("小明1", 10, 1004244.42);
        Employee emp3 = new Employee("小明2", 1030, 10044.42);
        Employee emp4 = new Employee("小明3", 1060, 1020.14);
        ArrayList<Employee> objects = new ArrayList<>();
        Collections.addAll(objects, emp1, emp2, emp3, emp4);
        Stream<Employee> stream = objects.stream();

        Employee emp11 = new Employee("小1", 100, 1000.2);
        Employee emp22 = new Employee("小2", 108, 10044.42);
        Employee emp33 = new Employee("小3", 100, 1000.22);
        Employee emp44 = new Employee("小4", 1060, 100.14);
        Employee emp55 = new Employee("小5", 100, 120.14);
        ArrayList<Employee> objects1 = new ArrayList<>();
        Collections.addAll(objects1, emp11, emp22, emp33, emp44);
        Stream<Employee> stream1 = objects1.stream();
        // Optional<Topperformer> topperformer = stream.max((e1, e2) -> (e1.bonus + e1.salary) - (e2.bonus + e2.salary) > 0 ? 1 : -1).
        //map(s -> new Topperformer(s.name, s.salary + s.bonus));
        // System.out.println(topperformer);

        Stream<Employee> concat = Stream.concat(stream, stream1);
        Stream<Employee> sorted = concat.sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.bonus + o1.salary) - (o2.bonus + o2.salary) > 0 ? 1 : -1;
            }
        });
//        List<Employee> collect = sorted.collect(Collectors.toList());

//        System.out.println(collect.getClass());
//        Set<Employee> collect = sorted.collect(Collectors.toSet());
//        System.out.println(collect.getClass());
        Object[] objects2 = sorted.toArray();




    }
}

class Employee {
    String name;
    double salary;
    double bonus;

    public Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + ", bonus=" + bonus + '}';
    }
}

