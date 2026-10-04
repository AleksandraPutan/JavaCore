package lesson2;

import lombok.Getter;
import lombok.Setter;

public class DataHolder {
    @Getter @Setter
    private Byte byteValue = 127;
    @Getter @Setter
    private byte bValue = 126;
    @Getter @Setter
    private Short shortValue = 32_767;
    @Getter @Setter
    private short sValue = 32_766;
    @Getter @Setter
    private Integer integerValue = 123_456_789;
    @Getter @Setter
    private int iValue = 123_456_788;
    @Getter @Setter
    private Long longValue = 100_987_654_321L;
    @Getter @Setter
    private long lValue = 100_987_654_320L;
    @Getter @Setter
    private Float floatValue = 34.234234234f;
    @Getter @Setter
    private float fValue = 34.234234233f;
    @Getter @Setter
    private Double doubleValue = 0.2333;
    @Getter @Setter
    private double dValue = 0.233;
    @Getter @Setter
    private Character characterValue = 24;
    @Getter @Setter
    private char cValue = 232;
    @Getter @Setter
    private Boolean booleanValue= false;

    @Getter @Setter
    private boolean boolValue= true;

    @Override
    public String toString(){
        return "DataHolder.byteValue = "+ byteValue+"\nDataHolder.bValue = "+ bValue+"\nDataHolder.shortValue = "+shortValue+"\nDataHolder.sValue = "+ sValue+
                "\nDataHolder.integerValue = "+ integerValue+"\nDataHolder.iValue = "+ iValue+ "\nDataHolder.longValue = "+ longValue+
                "\nDataHolder.lValue = "+ lValue+"\nDataHolder.floatValue = "+ floatValue+"\nDataHolder.fValue = "+ fValue+"\nDataHolder.doubleValue = "+ doubleValue+
                "\nDataHolder.dValue = "+ dValue+"\nDataHolder.characterValue = "+ characterValue+ "\nDataHolder.boolValue = "+ booleanValue+
                "\nDataHolder.booValue = "+ boolValue;
    }

    public DataHolder() {
        this.byteValue = byteValue;
        this.bValue = bValue;
        this.shortValue = shortValue;
        this.sValue = sValue;
        this.integerValue = integerValue;
        this.iValue = iValue;
        this.longValue = longValue;
        this.lValue = lValue;
        this.floatValue = floatValue;
        this.fValue = fValue;
        this.doubleValue = doubleValue;
        this.dValue = dValue;
        this.characterValue = characterValue;
        this.cValue = cValue;
        this.booleanValue = booleanValue;
        this.boolValue = boolValue;
    }

}
