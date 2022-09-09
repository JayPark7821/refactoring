package org.example._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {

    private Priority priority;

    public Order(Priority priority) {
        this.priority = priority;
    }

    public Order(String priority) {
        this.priority = new Priority(priority);
    }



    public Priority getPriority() {
        return priority;
    }
}
