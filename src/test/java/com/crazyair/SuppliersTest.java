package com.crazyair;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.crazyair.model.CrazyAirFlightRequest;
import com.crazyair.model.ToughJetFlightRequest;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SuppliersTest
{
    private RestTemplate restTemplate;

    @Before
    public void setup()
    {
        this.restTemplate = new RestTemplate();
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testValidSearchSolutionCrazyAir() throws JsonGenerationException, JsonMappingException, IOException
    {
        final String url = "http://localhost:8090/crazyair/{request}";

        final CrazyAirFlightRequest requestObject = new CrazyAirFlightRequest("LHR", "LHR", "05-10-2010", "06-10-2013", 4);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("file.json"), requestObject);

        final String requestJson = mapper.writeValueAsString(requestObject);

        final List<Map<String, String>> responseJson = this.restTemplate.getForObject(url, List.class, requestJson);

        Assert
            .assertEquals(
                "{airline=crazytair, price=100.1, cabinclass=E, departureAirportCode=LHR, destinationAirportCode=LHR, departureDate=01-15-2010, arrivalDate=01-15-2012}",
                responseJson.get(0).toString());
        Assert
            .assertEquals(
                "{airline=crazytair, price=100.1, cabinclass=B, departureAirportCode=LHR, destinationAirportCode=LHR, departureDate=01-15-2010, arrivalDate=01-15-2012}",
                responseJson.get(1).toString());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testValidSearchSolutionToughJet() throws JsonGenerationException, JsonMappingException, IOException
    {
        final String url = "http://localhost:8090/toughjet/{request}";

        final ToughJetFlightRequest requestObject = new ToughJetFlightRequest("LRS", "AMS", "11", new Integer(12), "2010", "2", new Integer(11), "2011", 4);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("file.json"), requestObject);

        final String requestJson = mapper.writeValueAsString(requestObject);

        final List<Map<String, String>> responseJson = this.restTemplate.getForObject(url, List.class, requestJson);

        System.out.println(responseJson.get(0).toString());
        System.out.println(responseJson.get(1).toString());

        Assert
            .assertEquals(
                "{carrier=ToughJet, basePrice=1000.0, tax=5.0, discount=4.0, departureAirportName=LHR, arrivalAirportName=LHR, departureDay=1, departureMonth=10, departureYear=2010, returnDay=5, returnMonth=5, returnYear=2010}",
                responseJson.get(0).toString());
        Assert
            .assertEquals(
                "{carrier=ToughJet, basePrice=2000.0, tax=5.0, discount=4.0, departureAirportName=LHR, arrivalAirportName=LHR, departureDay=2, departureMonth=11, departureYear=2011, returnDay=4, returnMonth=5, returnYear=2011}",
                responseJson.get(1).toString());
    }
}