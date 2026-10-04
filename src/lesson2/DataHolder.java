package lesson2;

public class DataHolder {

    private Byte byteValue = 127;
    private byte bValue = 126;
    private Short shortValue = 32_767;
    private short sValue = 32_766;
    private Integer integerValue = 123_456_789;
    private int iValue = 123_456_788;
    private Long longValue = 100_987_654_321L;
    private long lValue = 100_987_654_320L;
    private Float floatValue = 34.234234234f;
    private float fValue = 34.234234233f;
    private Double doubleValue = 0.2333;
    private double dValue = 0.233;
    private Character characterValue = 24;
    private char cValue = 232;
    private Boolean boolValue= false;
    private boolean booValue= true;

    @Override
    public String toString(){
        return "DataHolder.byteValue = "+ byteValue+"\nDataHolder.bValue = "+ bValue+"\nDataHolder.shortValue = "+shortValue+"\nDataHolder.sValue = "+ sValue+
                "\nDataHolder.integerValue = "+ integerValue+"\nDataHolder.iValue = "+ iValue+ "\nDataHolder.longValue = "+ longValue+
                "\nDataHolder.lValue = "+ lValue+"\nDataHolder.floatValue = "+ floatValue+"\nDataHolder.fValue = "+ fValue+"\nDataHolder.doubleValue = "+ doubleValue+
                "\nDataHolder.dValue = "+ dValue+"\nDataHolder.characterValue = "+ characterValue+ "\nDataHolder.boolValue = "+ boolValue+
                "\nDataHolder.booValue = "+ booValue;
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
        this.boolValue = boolValue;
        this.booValue = booValue;
    }

    public Byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(Byte byteValue) {
        this.byteValue = byteValue;
    }

    public byte getbValue() {
        return bValue;
    }

    public void setbValue(byte bValue) {
        this.bValue = bValue;
    }

    public Short getShortValue() {
        return shortValue;
    }

    public void setShortValue(Short shortValue) {
        this.shortValue = shortValue;
    }

    public short getsValue() {
        return sValue;
    }

    public void setsValue(short sValue) {
        this.sValue = sValue;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    public int getiValue() {
        return iValue;
    }

    public void setiValue(int iValue) {
        this.iValue = iValue;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    public long getlValue() {
        return lValue;
    }

    public void setlValue(long lValue) {
        this.lValue = lValue;
    }

    public Float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Float floatValue) {
        this.floatValue = floatValue;
    }

    public float getfValue() {
        return fValue;
    }

    public void setfValue(float fValue) {
        this.fValue = fValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public double getdValue() {
        return dValue;
    }

    public void setdValue(double dValue) {
        this.dValue = dValue;
    }

    public Character getCharacterValue() {
        return characterValue;
    }

    public void setCharacterValue(Character charValue) {
        this.characterValue = charValue;
    }

    public char getcValue() {
        return cValue;
    }

    public void setcValue(char cValue) {
        this.cValue = cValue;
    }

    public Boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    public boolean getBooValue() {
        return booValue;
    }

    public void setBooValue(boolean booValue) {
        this.booValue = booValue;
    }
}
