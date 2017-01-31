package com.crazyair.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crazyair.model.CrazyAirFlightReponse;
import com.crazyair.model.CrazyAirFlightRequest;
import com.crazyair.model.ToughJetFlightReponse;
import com.crazyair.model.ToughJetFlightRequest;

@RestController
public class APIService
{
    private final Map<Integer, CrazyAirFlightReponse> crazyAirFlights;

    private final Map<Integer, ToughJetFlightReponse> toughJetFlights;

    public APIService()
    {
        this.crazyAirFlights = new HashMap<>();
        this.toughJetFlights = new HashMap<>();

        this.fillCrazyAirFlights();
        this.fillToughJetFlights();
    }

    private void fillCrazyAirFlights()
    {
        final CrazyAirFlightReponse flight1 = new CrazyAirFlightReponse("craztair", 100.10, 'E', "LHR", "LHR", "01-15-2010", "01-15-2012");
        final CrazyAirFlightReponse flight2 = new CrazyAirFlightReponse("craztair", 100.10, 'B', "LHR", "LHR", "01-15-2010", "01-15-2012");

        this.crazyAirFlights.put(new Integer(1), flight1);
        this.crazyAirFlights.put(new Integer(2), flight2);
    }

    private void fillToughJetFlights()
    {
        final ToughJetFlightReponse flight1 = new ToughJetFlightReponse("ToughJet", 1000.00, 5.00, 4.00, "LHR", "LHR", "1", new Integer(10), "2010", "5",
            new Integer(5), "2010");
        final ToughJetFlightReponse flight2 = new ToughJetFlightReponse("ToughJet", 2000.00, 5.00, 4.00, "LHR", "LHR", "2", new Integer(11), "2011", "4",
            new Integer(5), "2011");

        this.toughJetFlights.put(new Integer(1), flight1);
        this.toughJetFlights.put(new Integer(2), flight2);
    }

    /**
     * e.g: curl --data '{"origin":"LHR", "destination":"LHR", "departureDate":"05-10-2010", "returnDate":"06-10-2013", "numberOfPassengers":200}' -v -X GET -H 'Content-Type:application/json' http://localhost:8090/crazyair
     */
    @RequestMapping(value = "/crazyair", method = RequestMethod.GET)
    public ResponseEntity<List<CrazyAirFlightReponse>> list(@RequestBody
    final CrazyAirFlightRequest request)
    {
        return new ResponseEntity<List<CrazyAirFlightReponse>>(new ArrayList<CrazyAirFlightReponse>(this.crazyAirFlights.values()), HttpStatus.OK);
    }

    /**
     * e.g: curl --data '{"from":"LHR", "to":"AMS", "departureDay":"25", "departureMonth":10, "departureYear":"2010", "returnDay":"1", "returnMonth":12, "returnYear":"2010", "numberOfAdults":200}' -v -X GET -H 'Content-Type:application/json' http://localhost:8090/toughjet
     */
    @RequestMapping(value = "/toughjet", method = RequestMethod.GET)
    public ResponseEntity<List<ToughJetFlightReponse>> list(@RequestBody
        final ToughJetFlightRequest request)
    {
        return new ResponseEntity<List<ToughJetFlightReponse>>(new ArrayList<ToughJetFlightReponse>(this.toughJetFlights.values()), HttpStatus.OK);
    }
}