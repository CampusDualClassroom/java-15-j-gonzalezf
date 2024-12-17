package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    protected Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, Date expirationDate) {
        super(name, uniqueId, responsibleId);
        this.expirationDate = expirationDate;
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getSpecificData() {
        StringBuilder sd = new StringBuilder("Localización: ");
        sd.append(getLocation());
        sd.append(", Caducidad: ");
        sd.append(getFormattedDate(getExpirationDate()));
        return sd.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

}
