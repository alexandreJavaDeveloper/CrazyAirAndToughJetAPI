package com.suppliers.model;

public class ToughJetFlightRequest
{
    private String from; // origin

    private String to; // destination

    private String departureDay;

    private Integer departureMonth;

    private String departureYear;

    private String returnDay;

    private Integer returnMonth;

    private String returnYear;

    private int numberOfAdults;

    public ToughJetFlightRequest()
    {

    }

    public ToughJetFlightRequest(final String from, final String to, final String departureDay, final Integer departureMonth, final String departureYear,
        final String returnDay, final Integer returnMonth, final String returnYear, final int numberOfAdults)
    {
        super();
        this.from = from;
        this.to = to;
        this.departureDay = departureDay;
        this.departureMonth = departureMonth;
        this.departureYear = departureYear;
        this.returnDay = returnDay;
        this.returnMonth = returnMonth;
        this.returnYear = returnYear;
        this.numberOfAdults = numberOfAdults;
    }

    public String getFrom()
    {
        return this.from;
    }

    public void setFrom(final String from)
    {
        this.from = from;
    }

    public String getTo()
    {
        return this.to;
    }

    public void setTo(final String to)
    {
        this.to = to;
    }

    public String getDepartureDay()
    {
        return this.departureDay;
    }

    public void setDepartureDay(final String departureDay)
    {
        this.departureDay = departureDay;
    }

    public Integer getDepartureMonth()
    {
        return this.departureMonth;
    }

    public void setDepartureMonth(final Integer departureMonth)
    {
        this.departureMonth = departureMonth;
    }

    public String getDepartureYear()
    {
        return this.departureYear;
    }

    public void setDepartureYear(final String departureYear)
    {
        this.departureYear = departureYear;
    }

    public String getReturnDay()
    {
        return this.returnDay;
    }

    public void setReturnDay(final String returnDay)
    {
        this.returnDay = returnDay;
    }

    public Integer getReturnMonth()
    {
        return this.returnMonth;
    }

    public void setReturnMonth(final Integer returnMonth)
    {
        this.returnMonth = returnMonth;
    }

    public String getReturnYear()
    {
        return this.returnYear;
    }

    public void setReturnYear(final String returnYear)
    {
        this.returnYear = returnYear;
    }

    public int getNumberOfAdults()
    {
        return this.numberOfAdults;
    }

    public void setNumberOfAdults(final int numberOfAdults)
    {
        this.numberOfAdults = numberOfAdults;
    }
}