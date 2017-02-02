package com.suppliers.model;

public class ToughJetFlightResponse
{
    private String carrier; // airline

    private double basePrice; // price

    private double tax;

    private double discount;

    private String departureAirportName; //departureAirportCode

    private String arrivalAirportName; //destinationAirportCode

    private int departureDay;

    private int departureMonth;

    private int departureYear;

    private int returnDay;

    private int returnMonth;

    private int returnYear;

    public ToughJetFlightResponse()
    {
    }

    public ToughJetFlightResponse(final String carrier, final double basePrice, final double tax, final double discount, final String departureAirportName,
        final String arrivalAirportName, final int departureDay, final int departureMonth, final int departureYear, final int returnDay, final int returnMonth,
        final int returnYear)
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
}