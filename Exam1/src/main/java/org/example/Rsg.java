package org.example;

import java.text.ParseException;
import java.util.Date;

public class Rsg {
    private String identificationCode;
    private String countryCode;

    private Date date;
    private String strDate = date.toString();

    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());


    private Rsg(String identificationCode, String date, String time) throws ParseException {
        if (identificationCode.length() != 23) {
            //logger.error("Unable to read rsg: {}-{}-{}",identificationCode,date,time);
            throw new ParseException("We currently read only ISO EIC format",0);
        }

        this.identificationCode = identificationCode.substring(11,23);
        this.countryCode = identificationCode.substring(7,11);
    }

}
