import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void testSCompareToMin() {
        Ticket ticket1 = new Ticket("Новосибирск", "Москва", 1500, 20, 01);
        Ticket ticket2 = new Ticket("Владивосток", "Москва", 5000, 16, 01);
        Ticket ticket3 = new Ticket("Новосибирск", "Томск", 1000, 7, 9);
        Ticket ticket4 = new Ticket("Новосибирск", "Москва", 1200, 1, 3);
        Ticket ticket5 = new Ticket("Новосибирск", "Москва", 5000, 16, 01);
        Ticket ticket6 = new Ticket("Новосибирск", "Иркутск", 900, 13, 14);

        int expected = -1;
        int actual = ticket3.compareTo(ticket1);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSCompareToMax() {
        Ticket ticket1 = new Ticket("Новосибирск", "Москва", 1500, 20, 01);
        Ticket ticket2 = new Ticket("Владивосток", "Москва", 5000, 16, 01);
        Ticket ticket3 = new Ticket("Новосибирск", "Томск", 1000, 7, 9);
        Ticket ticket4 = new Ticket("Новосибирск", "Москва", 1200, 1, 3);
        Ticket ticket5 = new Ticket("Новосибирск", "Москва", 5000, 16, 01);
        Ticket ticket6 = new Ticket("Новосибирск", "Иркутск", 900, 13, 14);

        int expected = 1;
        int actual = ticket3.compareTo(ticket6);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSCompareToEqually() {
        Ticket ticket1 = new Ticket("Новосибирск", "Москва", 1500, 20, 01);
        Ticket ticket2 = new Ticket("Владивосток", "Москва", 5000, 16, 01);
        Ticket ticket3 = new Ticket("Новосибирск", "Томск", 1000, 7, 9);
        Ticket ticket4 = new Ticket("Новосибирск", "Москва", 1200, 1, 3);
        Ticket ticket5 = new Ticket("Новосибирск", "Москва", 5000, 16, 01);
        Ticket ticket6 = new Ticket("Новосибирск", "Иркутск", 1500, 13, 14);

        int expected = 0;
        int actual = ticket1.compareTo(ticket6);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSortedAllTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Новосибирск", "Москва", 1500, 20, 01);
        Ticket ticket2 = new Ticket("Владивосток", "Москва", 5000, 16, 01);
        Ticket ticket3 = new Ticket("Новосибирск", "Томск", 1000, 7, 9);
        Ticket ticket4 = new Ticket("Новосибирск", "Москва", 1200, 1, 3);
        Ticket ticket5 = new Ticket("Новосибирск", "Москва", 5000, 16, 01);
        Ticket ticket6 = new Ticket("Новосибирск", "Иркутск", 900, 13, 14);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);

        Ticket[] expected = {ticket4, ticket1, ticket5};
        Ticket[] actual = aviaSouls.search("Новосибирск", "Москва");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortedZeroTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Новосибирск", "Москва", 1500, 20, 01);
        Ticket ticket2 = new Ticket("Владивосток", "Москва", 5000, 16, 01);
        Ticket ticket3 = new Ticket("Новосибирск", "Томск", 1000, 7, 9);
        Ticket ticket4 = new Ticket("Новосибирск", "Москва", 1200, 1, 3);
        Ticket ticket5 = new Ticket("Новосибирск", "Москва", 5000, 16, 01);
        Ticket ticket6 = new Ticket("Новосибирск", "Иркутск", 900, 13, 14);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);

        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.search("Новосибирск", "Чита");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortedOneTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Новосибирск", "Москва", 1500, 20, 01);
        Ticket ticket2 = new Ticket("Владивосток", "Москва", 5000, 16, 01);
        Ticket ticket3 = new Ticket("Новосибирск", "Томск", 1000, 7, 9);
        Ticket ticket4 = new Ticket("Новосибирск", "Москва", 1200, 1, 3);
        Ticket ticket5 = new Ticket("Новосибирск", "Москва", 5000, 16, 01);
        Ticket ticket6 = new Ticket("Новосибирск", "Иркутск", 900, 13, 14);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);

        Ticket[] expected = {ticket6};
        Ticket[] actual = aviaSouls.search("Новосибирск", "Иркутск");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortedOneTicketWithComparate() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Новосибирск", "Москва", 1500, 20, 01);
        Ticket ticket2 = new Ticket("Владивосток", "Москва", 5000, 16, 01);
        Ticket ticket3 = new Ticket("Новосибирск", "Томск", 1000, 7, 9);
        Ticket ticket4 = new Ticket("Новосибирск", "Москва", 1200, 1, 3);
        Ticket ticket5 = new Ticket("Новосибирск", "Москва", 5000, 16, 01);
        Ticket ticket6 = new Ticket("Новосибирск", "Иркутск", 900, 13, 14);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket6};
        Ticket[] actual = aviaSouls.search("Новосибирск", "Иркутск", comparator);
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortedAllTicketWithComparate() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Новосибирск", "Москва", 1500, 16, 23); //7
        Ticket ticket2 = new Ticket("Владивосток", "Москва", 5000, 16, 1);
        Ticket ticket3 = new Ticket("Новосибирск", "Томск", 1000, 7, 9);
        Ticket ticket4 = new Ticket("Новосибирск", "Москва", 1200, 7, 10);//3
        Ticket ticket5 = new Ticket("Новосибирск", "Москва", 5000, 16, 20);//4
        Ticket ticket6 = new Ticket("Новосибирск", "Иркутск", 900, 13, 14);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket4, ticket5, ticket1};
        Ticket[] actual = aviaSouls.search("Новосибирск", "Москва", comparator);
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortedZeroTicketWithComparate() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Новосибирск", "Москва", 1500, 16, 23); //7
        Ticket ticket2 = new Ticket("Владивосток", "Москва", 5000, 16, 1);
        Ticket ticket3 = new Ticket("Новосибирск", "Томск", 1000, 7, 9);
        Ticket ticket4 = new Ticket("Новосибирск", "Москва", 1200, 7, 10);//3
        Ticket ticket5 = new Ticket("Новосибирск", "Москва", 5000, 16, 20);//4
        Ticket ticket6 = new Ticket("Новосибирск", "Иркутск", 900, 13, 14);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.search("Новосибирск", "Тыва", comparator);
        Assertions.assertArrayEquals(expected, actual);

    }
}
