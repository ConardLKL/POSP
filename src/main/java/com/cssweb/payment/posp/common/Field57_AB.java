package com.cssweb.payment.posp.common;

/**
 * Created by chenhf on 2014/10/24.
 */
// field57
public class Field57_AB extends Field {

    private String swinfo; //预付卡发卡机构附加交易信息
    private String isinfo; //发卡方附加交易信息
    private String reserved;

    public Field57_AB()
    {
        fieldName = "公共支付信息";
        fieldNo = "57.AB";

        fieldType = FIELD_TYPE_ANSB;

        fieldValueType = FIELD_VALUE_TYPE_TV;
        dataLen = 20 + 20 + 58;
    }
}
