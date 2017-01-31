package com.crazyair.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crazyair.model.CrazyAirFlightResponse;
import com.crazyair.model.CrazyAirFlightRequest;
import com.crazyair.model.ToughJetFlightResponse;
import com.crazyair.model.ToughJetFlightRequest;

@RestController
public class APIService
{
    private final List<CrazyAirFlightResponse> crazyAirFlights;

    private final List<ToughJetFlightResponse> toughJetFlights;

    public APIService()
    {
        this.crazyAirFlights = new ArrayList<>();
        this.toughJetFlights = new ArrayList<>();

        this.fillCrazyAirFlights();
        this.fillToughJetFlights();
    }

    private void fillCrazyAirFlights()
    {
        final CrazyAirFlightResponse flight1 = new CrazyAirFlightResponse("craztair", 100.10, 'E', "LHR", "LHR", "01-15-2010", "01-15-2012");
        final CrazyAirFlightResponse flight2 = new CrazyAirFlightResponse("craztair", 100.10, 'B', "LHR", "LHR", "01-15-2010", "01-15-2012");

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

    @RequestMapping(value = "/crazyair", method = RequestMethod.GET)
    public ResponseEntity<List<CrazyAirFlightResponse>> list(@RequestBody
    final CrazyAirFlightRequest request)
    {
        return new ResponseEntity<List<CrazyAirFlightResponse>>(this.crazyAirFlights, HttpStatus.OK);
    }

    @RequestMapping(value = "/toughjet", method = RequestMethod.GET)
    public ResponseEntity<List<ToughJetFlightResponse>> list(@RequestBody
        final ToughJetFlightRequest request)
    {
        return new ResponseEntity<List<ToughJetFlightResponse>>(this.toughJetFlights, HttpStatus.OK);
    }
}