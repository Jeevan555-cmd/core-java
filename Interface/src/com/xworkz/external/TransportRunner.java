package com.xworkz.external;

import com.xworkz.implement.Transport;
import com.xworkz.internal.Flight;
import com.xworkz.internal.Train;

public class TransportRunner {
    public static void main(String[] args) {

        Train train = new Transport();
        train.bookTicket();

        Flight flight = new Transport();
        flight.checkIn();
    }
}
