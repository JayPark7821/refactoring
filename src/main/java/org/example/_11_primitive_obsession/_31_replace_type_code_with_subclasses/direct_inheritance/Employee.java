package org.example._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import java.util.List;

public abstract class Employee {

    private String name;


    protected Employee(String name ) {
        // this.validate(type);
        this.name = name;
    }

    public static Employee createEmployee(String name, String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name);
            case "manager" -> new Manager(name);
            case "salesman" -> new Salesman(name);
            default -> throw new IllegalArgumentException(type);
        };
    }

    // private void validate(String type) {
    //     List<String> legalTypes = List.of("engineer", "manager", "salesman");
    //     if (!legalTypes.contains(type)) {
    //         throw new IllegalArgumentException(type);
    //     }
    // }

    protected abstract String getType();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
