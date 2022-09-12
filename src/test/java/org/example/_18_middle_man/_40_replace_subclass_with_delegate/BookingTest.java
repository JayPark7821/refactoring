package org.example._18_middle_man._40_replace_subclass_with_delegate;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Book;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

class BookingTest {

    @Test
    void talkback() {
        Show lionKing = new Show(List.of(), 120);
        Show talkBack = new Show(List.of("talkback"), 120);
        LocalDateTime nonPeekDay = LocalDateTime.of(2022, 1, 20, 19, 0);
        LocalDateTime peekDay = LocalDateTime.of(2022, 1, 15, 19, 0);

        assertFalse(Booking.createBooking(lionKing, nonPeekDay).hasTalkback());
        assertTrue(Booking.createBooking(talkBack, nonPeekDay).hasTalkback());
        assertFalse(Booking.createBooking(talkBack, peekDay).hasTalkback());

        PremiumExtra premiumExtra = new PremiumExtra(List.of(), 50);
        assertTrue(Booking.createPremiumBooking(talkBack, peekDay, premiumExtra).hasTalkback());
        assertFalse(Booking.createPremiumBooking(lionKing, peekDay, premiumExtra).hasTalkback());
    }

    @Test
    void basePrice() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekday = LocalDateTime.of(2022, 1, 20, 19, 0);

        Booking booking =  Booking.createBooking(lionKing, weekday);
        assertEquals(120, booking.basePrice());

        Booking premium = Booking.createPremiumBooking(lionKing, weekday, new PremiumExtra(List.of(), 50));
        assertEquals(170, premium.basePrice());
    }

    @Test
    void basePrice_on_peakDay() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekend = LocalDateTime.of(2022, 1, 15, 19, 0);

        Booking booking = Booking.createBooking(lionKing, weekend);
        assertEquals(138, booking.basePrice());

        Booking premium = Booking.createPremiumBooking(lionKing, weekend, new PremiumExtra(List.of(), 50));
        assertEquals(188, premium.basePrice());
    }

    @Test
    void hasDinner() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekday = LocalDateTime.of(2022, 1, 20, 19, 0);
        LocalDateTime weekend = LocalDateTime.of(2022, 1, 15, 19, 0);
        PremiumExtra premiumExtra = new PremiumExtra(List.of("dinner"), 50);

        assertTrue(Booking.createPremiumBooking(lionKing, weekday, premiumExtra).hasDinner());
        assertFalse(Booking.createPremiumBooking(lionKing, weekend, premiumExtra).hasDinner());
    }

}