package com.suppliers.model;

public class ToughJetFlightRequest
{
    private String from; // origin

    private String to; // destination

    private int departureDay;

    private int departureMonth;

    private int departureYear;

    private int returnDay;

    private int returnMonth;

    private int returnYear;

    private int numberOfAdults;

    public ToughJetFlightRequest()
    {

    }

    public ToughJetFlightRequest(final String from, final String to, final int departureDay, final int departureMonth, final int departureYear,
        final int returnDay, final int returnMonth, final int returnYear, final int numberOfAdults)
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

    public int getDepartureDay()
    {
        return this.departureDay;
    }

    public void setDepartureDay(final int departureDay)
    {
        this.departureDay = departureDay;
    }

    public int getDepartureMonth()
    {
        return this.departureMonth;
    }

    public void setDepartureMonth(final int departureMonth)
    {
        this.departureMonth = departureMonth;
    }

    public int getDepartureYear()
    {
        return this.departureYear;
    }

    public void setDepartureYear(final int departureYear)
    {
        this.departureYear = departureYear;
    }

    public int getReturnDay()
    {
        return this.returnDay;
    }

    public void setReturnDay(final int returnDay)
    {
        this.returnDay = returnDay;
    }

    public int getReturnMonth()
    {
        return this.returnMonth;
    }

    public void setReturnMonth(final int returnMonth)
    {
        this.returnMonth = returnMonth;
    }

    public int getReturnYear()
    {
        return this.returnYear;
    }

    public void setReturnYear(final int returnYear)
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