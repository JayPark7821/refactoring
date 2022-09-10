package org.example._16_temporary_field._36_introduce_special_case;

public class CustomerService {

    public String customerName(Site site) {
        return site.getCustomer().getName();

        // Customer customer = site.getCustomer();
        //
        // String customerName;
        // if (customer.isUnknown()) {
        //     customerName = "occupant";
        // } else {
        //     customerName = customer.getName();
        // }
        //
        // return customerName;
    }

    public BillingPlan billingPlan(Site site) {
        return site.getCustomer().getBillingPlan();
    }

    public int weeksDelinquent(Site site) {
        return site.getCustomer().getPaymentHistory().getWeeksDelinquentInLastYear();
        // return customer.isUnknown() ? 0 : customer.getPaymentHistory().getWeeksDelinquentInLastYear();
    }

}
