package org.example._08_shotgun_surgery._29_inline_class;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShipmentTest {

    @Test
    void trackingInfo() {
        Shipment shipment = new Shipment(new TrackingInformation("UPS", "12345"));
        assertEquals("UPS: 12345", shipment.getTrackingInfo());
    }

}