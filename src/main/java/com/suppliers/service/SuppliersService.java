package com.suppliers.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suppliers.mock.FactoryMock;
import com.suppliers.model.CrazyAirFlightRequest;
import com.suppliers.model.CrazyAirFlightResponse;
import com.suppliers.model.ToughJetFlightRequest;
import com.suppliers.model.ToughJetFlightResponse;

@RestController
public class SuppliersService
{
    private final FactoryMock factoryMock;

    public SuppliersService()
    {
        this.factoryMock = new FactoryMock();
    }

    /**
     * The request comes via JSON (default), but the Spring transforms in the java object declared.
     * This works because in the model (e.g: CrazyAirFlightRequest) we use the same attributes
     * and Jackson API can easily convert it.
     *
     * @param requestJson
     * @return
     */
    @RequestMapping(value = "/crazyair", method = RequestMethod.POST)
    public List<CrazyAirFlightResponse> listCrazyAir(@RequestBody
    final CrazyAirFlightRequest requestJson)
    {
        return this.factoryMock.getCrazyAirFlights(requestJson);
    }

    /**
     * The request comes via JSON, but the Spring transforms in the java object declared.
     * This works because in the model (e.g: ToughJetFlightRequest) we use the same attributes
     * and Jackson API can easily convert it.
     *
     * @param requestJson
     * @return
     */
    @RequestMapping(value = "/toughjet", method = RequestMethod.POST)
    public List<ToughJetFlightResponse> listToughJet(@RequestBody
    final ToughJetFlightRequest requestJson)
    {
        return this.factoryMock.getToughJetFlights(requestJson);
    }
}