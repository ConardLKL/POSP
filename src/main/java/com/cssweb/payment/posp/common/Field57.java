package com.cssweb.payment.posp.common;

/**
 * Created by chenhf on 2014/10/15.
 */
public class Field57 extends Field {

    /*

     */

    private Field57_AB fieldAB;
    private Field57_IP fieldIP;

    public Field57()
    {
        fieldName = "附加交易信息";
        fieldNo = "57";

        fieldType = FIELD_TYPE_ANS;

        fieldValueType = FIELD_VALUE_TYPE_LLLV;
        maxFieldLength = 100;



    }
}
