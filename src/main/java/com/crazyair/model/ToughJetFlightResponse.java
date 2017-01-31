package com.crazyair.model;

public class ToughJetFlightResponse
{
    private String carrier; // airline

    private double basePrice; // price

    private double tax;

    private double discount;

    private String departureAirportName; //departureAirportCode

    private String arrivalAirportName; //destinationAirportCode

    private String departureDay;

    private Integer departureMonth;

    private String departureYear;

    private String returnDay;

    private Integer returnMonth;

    private String returnYear;

    public ToughJetFlightResponse()
    {
    }

    public ToughJetFlightResponse(final String carrier, final double basePrice, final double tax, final double discount, final String departureAirportName,
        final String arrivalAirportName, final String departureDay, final Integer departureMonth, final String departureYear, final String returnDay,
        final Integer returnMonth, final String returnYear)
    {
        super();
        this.carrier = carrier;
        this.basePrice = basePrice;
        this.tax = tax;
        this.discount = discount;
        this.departureAirportName = departureAirportName;
        this.arrivalAirportName = arrivalAirportName;
        this.departureDay = departureDay;
        this.departureMonth = departureMonth;
        this.departureYear = departureYear;
        this.returnDay = returnDay;
        this.returnMonth = returnMonth;
        this.returnYear = returnYear;
    }

    public String getCarrier()
    {
        return this.carrier;
    }

    public void setCarrier(final String carrier)
    {
        this.carrier = carrier;
    }

    public double getBasePrice()
    {
        return this.basePrice;
    }

    public void setBasePrice(final double basePrice)
    {
        this.basePrice = basePrice;
    }

    public double getTax()
    {
        return this.tax;
    }

    public void setTax(final double tax)
    {
        this.tax = tax;
    }

    public double getDiscount()
    {
        return this.discount;
    }

    public void setDiscount(final double discount)
    {
        this.discount = discount;
    }

    public String getDepartureAirportName()
    {
        return this.departureAirportName;
    }

    public void setDepartureAirportName(final String departureAirportName)
    {
        this.departureAirportName = departureAirportName;
    }

    public String getArrivalAirportName()
    {
        return this.arrivalAirportName;
    }

    public void setArrivalAirportName(final String arrivalAirportName)
    {
        this.arrivalAirportName = arrivalAirportName;
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
}