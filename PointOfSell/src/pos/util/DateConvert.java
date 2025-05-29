/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.util;

import java.sql.Date;

/**
 *
 * @author USER
 */
public class DateConvert {

    public Date utilDateToSqlDate(java.util.Date date) {

        if (date == null) {

            return null;

        }

        return new java.sql.Date(date.getTime());
    }

}
