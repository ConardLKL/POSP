package com.cssweb.payment.posp.business;

/**
 * Created by chenhf on 2014/10/20.
 */
public class Field61_2 extends Field{

    public static final String SUCCESS = "1";
    public static final String FAIL = "2";
    public static final String UNKNOWN = "3"; // 未校验

    public Field61_2()
    {
        fieldName = "CVV校验结果";

        fieldType = FIELD_TYPE_ANS;

        fieldLengthType = FIELD_LENGTH_TYPE_FIXED;
        fieldLength = 1;

        isSubField = true;
    }
}
