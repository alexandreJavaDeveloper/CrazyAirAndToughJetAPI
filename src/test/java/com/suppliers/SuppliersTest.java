package com.suppliers;

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
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.suppliers.model.CrazyAirFlightRequest;
import com.suppliers.model.CrazyAirFlightResponse;
import com.suppliers.model.ToughJetFlightRequest;
import com.suppliers.model.ToughJetFlightResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SuppliersTest
{
    private static final String BASE_URL = "http://localhost:8090/";

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
        final String url = SuppliersTest.BASE_URL + "crazyair";

        final CrazyAirFlightRequest requestObject = new CrazyAirFlightRequest("LHR", "LHR", "10-10-2010 10:15:30", "11-10-2013 11:15:30", 4);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("file.json"), requestObject);

        final String requestJson = mapper.writeValueAsString(requestObject);

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        final HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
        final List<Map<String, String>> responseJson = this.restTemplate.postForObject(url, entity, List.class);

        final String listAsJson = mapper.writeValueAsString(responseJson);

        // convert from json to List
        final List<CrazyAirFlightResponse> crazyAirFlightResponse = mapper.readValue(listAsJson, new TypeReference<List<CrazyAirFlightResponse>>()
        {
        });

        Assert.assertEquals(2, crazyAirFlightResponse.size());

        Assert.assertEquals("CrazyAir", crazyAirFlightResponse.get(0).getAirline());
        Assert.assertEquals("11-15-2012 15:13:15", crazyAirFlightResponse.get(0).getArrivalDate());
        Assert.assertEquals(new Double(100.101010), new Double(crazyAirFlightResponse.get(0).getPrice()));

        Assert.assertEquals("CrazyAir", crazyAirFlightResponse.get(1).getAirline());
        Assert.assertEquals("11-16-2012 05:30:30", crazyAirFlightResponse.get(1).getArrivalDate());
        Assert.assertEquals(new Double(90.101010), new Double(crazyAirFlightResponse.get(1).getPrice()));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testValidSearchSolutionToughJet() throws JsonGenerationException, JsonMappingException, IOException
    {
        final String url = SuppliersTest.BASE_URL + "toughjet";

        final ToughJetFlightRequest requestObject = new ToughJetFlightRequest("LRS", "AMS", 11, 12, 2010, 2, 11, 2011, 4);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("file.json"), requestObject);

        final String requestJson = mapper.writeValueAsString(requestObject);

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        final HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
        final List<Map<String, String>> responseJson = this.restTemplate.postForObject(url, entity, List.class);

        final String listAsJson = mapper.writeValueAsString(responseJson);

        // convert from json to List
        final List<ToughJetFlightResponse> toughJetFlightResponse = mapper.readValue(listAsJson, new TypeReference<List<ToughJetFlightResponse>>()
        {
        });

        Assert.assertEquals(2, toughJetFlightResponse.size());

        Assert.assertEquals("ToughJet", toughJetFlightResponse.get(0).getCarrier());
        Assert.assertEquals(10, toughJetFlightResponse.get(0).getDepartureMonth());
        Assert.assertEquals(new Double(1000.0010), new Double(toughJetFlightResponse.get(0).getBasePrice()));

        Assert.assertEquals("ToughJet", toughJetFlightResponse.get(1).getCarrier());
        Assert.assertEquals(11, toughJetFlightResponse.get(1).getDepartureMonth());
        Assert.assertEquals(new Double(2000.00), new Double(toughJetFlightResponse.get(1).getBasePrice()));
    }
}