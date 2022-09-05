package org.example._06_mutable_data._19_separate_query_from_modifier;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class BillingTest {

    @Test
    void totalOutstanding() {
        Billing billing = new Billing(new Customer("keesun", List.of(new Invoice(20), new Invoice(30))),
                new EmailGateway());
        assertEquals(50d, billing.getTotalOutstanding());
    }

}