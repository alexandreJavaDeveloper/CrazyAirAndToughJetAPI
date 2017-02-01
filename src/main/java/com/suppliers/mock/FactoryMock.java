package com.suppliers.mock;

import java.util.ArrayList;
import java.util.List;

import com.suppliers.model.CrazyAirFlightResponse;
import com.suppliers.model.ToughJetFlightResponse;

public class FactoryMock
{
    private final List<CrazyAirFlightResponse> crazyAirFlights;

    private final List<ToughJetFlightResponse> toughJetFlights;

    public FactoryMock()
    {
        this.crazyAirFlights = new ArrayList<>();
        this.toughJetFlights = new ArrayList<>();

        this.fillCrazyAirFlights();
        this.fillToughJetFlights();
    }

    private void fillCrazyAirFlights()
    {
        final CrazyAirFlightResponse flight1 = new CrazyAirFlightResponse("crazytair", 100.10, 'E', "LHR", "LHR", "01-15-2010", "01-15-2012");
        final CrazyAirFlightResponse flight2 = new CrazyAirFlightResponse("crazytair", 100.10, 'B', "LHR", "LHR", "01-15-2010", "01-15-2012");

        this.crazyAirFlights.add(flight1);
        this.crazyAirFlights.add(flight2);
    }

    private void fillToughJetFlights()
    {
        final ToughJetFlightResponse flight1 = new ToughJetFlightResponse("ToughJet", 1000.00, 5.00, 4.00, "LHR", "LHR", "1", new Integer(10), "2010", "5",
            new Integer(5), "2010");
        final ToughJetFlightResponse flight2 = new ToughJetFlightResponse("ToughJet", 2000.00, 5.00, 4.00, "LHR", "LHR", "2", new Integer(11), "2011", "4",
            new Integer(5), "2011");

        this.toughJetFlights.add(flight1);
        this.toughJetFlights.add(flight2);
    }

    public List<CrazyAirFlightResponse> getCrazyAirFlights()
    {
        return this.crazyAirFlights;
    }

    public List<ToughJetFlightResponse> getToughJetFlights()
    {
        return this.toughJetFlights;
    }
}