package com.crazyair.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crazyair.controller.factory.FactoryMock;
import com.crazyair.model.CrazyAirFlightResponse;
import com.crazyair.model.ToughJetFlightResponse;

@RestController
public class APIService
{
    private final FactoryMock factoryMock;

    public APIService()
    {
        this.factoryMock = new FactoryMock();
    }

    @RequestMapping(value = "/crazyair/{request}", method = RequestMethod.GET)
    public List<CrazyAirFlightResponse> listCrazyAir(@PathVariable(value = "request")
    final String requestJson)
    {
        System.out.println(requestJson);
        return this.factoryMock.getCrazyAirFlights();
    }

    @RequestMapping(value = "/toughjet/{request}", method = RequestMethod.GET)
    public List<ToughJetFlightResponse> listToughJet(@PathVariable(value = "request")
    final String requestJson)
    {
        System.out.println(requestJson);
        return this.factoryMock.getToughJetFlights();
    }
}