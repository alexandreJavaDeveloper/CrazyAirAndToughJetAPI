package com.suppliers.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suppliers.mock.FactoryMock;
import com.suppliers.model.CrazyAirFlightResponse;
import com.suppliers.model.ToughJetFlightResponse;

@RestController
public class SuppliersService
{
	private final FactoryMock factoryMock;

	public SuppliersService()
	{
		this.factoryMock = new FactoryMock();
	}

	@RequestMapping(value = "/crazyair/{request}", method = RequestMethod.GET)
	public List<CrazyAirFlightResponse> listCrazyAir(@PathVariable(value = "request")
	final String requestJson)
	{
		System.out.println("->"+requestJson);
		return this.factoryMock.getCrazyAirFlights();
	}

	@RequestMapping(value = "/toughjet/{request}", method = RequestMethod.GET)
	public List<ToughJetFlightResponse> listToughJet(@PathVariable(value = "request")
	final String requestJson)
	{
		System.out.println("->"+requestJson);
		return this.factoryMock.getToughJetFlights();
	}
}