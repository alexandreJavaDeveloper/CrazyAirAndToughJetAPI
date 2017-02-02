package com.suppliers.mock;

import java.util.ArrayList;
import java.util.List;

import com.suppliers.model.CrazyAirFlightRequest;
import com.suppliers.model.CrazyAirFlightResponse;
import com.suppliers.model.ToughJetFlightRequest;
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
        final CrazyAirFlightResponse flight1 = new CrazyAirFlightResponse("CrazyAir", 100.101010, 'E', "LHR", "LHR", "10-15-2010 10:15:30",
            "11-15-2012 15:13:15");
        final CrazyAirFlightResponse flight2 = new CrazyAirFlightResponse("CrazyAir", 90.101010, 'B', "LHR", "LHR", "10-15-2010 20:30:30",
            "11-16-2012 05:30:30");

        this.crazyAirFlights.add(flight1);
        this.crazyAirFlights.add(flight2);
    }

    private void fillToughJetFlights()
    {
        final ToughJetFlightResponse flight1 = new ToughJetFlightResponse("ToughJet", 1000.0010, 6.00, 7.00, "LHR", "LHR", 1, 10, 2010, 5, 5, 2010);
        final ToughJetFlightResponse flight2 = new ToughJetFlightResponse("ToughJet", 2000.00, 5.00, 4.00, "LHR", "LHR", 2, 11, 2011, 4, 5, 2011);

        this.toughJetFlights.add(flight1);
        this.toughJetFlights.add(flight2);
    }

    @SuppressWarnings("unused")
    public List<CrazyAirFlightResponse> getCrazyAirFlights(final CrazyAirFlightRequest requestJson)
    {
        // do something as filter to return the appropriate result
        return this.crazyAirFlights;
    }

    @SuppressWarnings("unused")
    public List<ToughJetFlightResponse> getToughJetFlights(final ToughJetFlightRequest requestJson)
    {
        // do something as filter to return the appropriate result
        return this.toughJetFlights;
    }
}