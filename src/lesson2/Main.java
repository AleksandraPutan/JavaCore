package lesson2;

public class Main {

    public static short shortValue2 = -127;
    public static Integer iValue2 = 123_456;
    public static Character cValue2 = 123;
    public static boolean booleanValue2 = true;
    public static Float fValue2 = 123_123.123f;

    public static void main(String[] args) {

        int intValue3 = 145;
        char charValue3 = 23;
        Long lValue3 = 345_234_234L;
        Double dValue3 = 345.123;
        byte byteValue3 = 12;

        DataHolder holder = new DataHolder();
        System.out.println("Переменные класса DataHolder до изменения: ");
        System.out.println(holder.toString());
        double doubleGet = holder.getDoubleValue();
        System.out.println("\nЗначение до изменения Double: " + doubleGet);
        holder.setDoubleValue(23.23); // изменение значения Double
        double doubleGet2 = holder.getDoubleValue();
        System.out.println("Значения после изменения Double: " + doubleGet2);

        double dGet = holder.getDValue();
        System.out.println("\nЗначение до изменения double: " + dGet);
        holder.setDValue(23.24); // изменение значения double
        double dGet2 = holder.getDValue(); //надо примитивный double или Double и почему
        System.out.println("Значения после изменения double через переменную: " + dGet2); //не изменилось
        System.out.println("Значения после изменения double напрямую: " + holder.getDValue()); //не изменилось

        Character characterGet = holder.getCharacterValue();
        System.out.println("\nЗначение до изменения Character: " + characterGet);
        holder.setCharacterValue((char) 245);// без приведения ошибка
        System.out.println("Значения после изменения Character напрямую: " + holder.getCharacterValue());

        char cGet = holder.getCValue();
        System.out.println("\nЗначение до изменения char: " + cGet);
        holder.setCValue('с');// без приведения ошибка
        System.out.println("Значения после изменения char напрямую: " + holder.getCValue());

        int integerGet = holder.getIntegerValue();
        System.out.println("\nЗначение до изменения Integer: " + integerGet);
        holder.setIntegerValue(245123);
        System.out.println("Значения после изменения Integer напрямую: " + holder.getIntegerValue());

        int iGet = holder.getIValue();
        System.out.println("\nЗначение до изменения int: " + iGet);
        holder.setIValue(245123);
        System.out.println("Значения после изменения int напрямую: " + holder.getIValue());

        System.out.println("\nПриведение типов");
        //Расширение(неявное)
        int i = byteValue3; // byte -> int
        long l = i; // int -> long
        double d = l; // long -> double
        System.out.println("Значения после приведения: " + byteValue3 + "; " + i + "; " + l + "; " + d + ";"); //все работает

       //Сужающие приведение(явное)
        //int i2 = (int) dValue2; //java: incompatible types: java.lang.Double cannot be converted to int
        double d2 = 9.99;
        int int2 = (int) d2;
        System.out.println("До приведения : "+ d2 + ", после приведения: " + int2);

        long big = 303L;
        byte small = (byte) big;
        System.out.println("До приведения : "+ big + ", после приведения: " + small);

        Integer boxed = 100;
        int unboxed = boxed;
        System.out.println("До приведения : "+ boxed + ", после приведения: " + unboxed);

        int boxed1 = 101;
        Integer unboxed1 = boxed1;
        System.out.println("До приведения : "+ boxed1 + ", после приведения: " + unboxed1);

        Integer nullable = null;
        //int x = nullable;//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "nullable" is null
        System.out.println("Integer может быть "+ nullable);

        Integer a = 1000;
        Integer b = 1000;
        System.out.println("Сравнение через == "+ (a==b));
        System.out.println("Сравнение через equals: "+a.equals(b));


        System.out.println("\nВывод всех переменных");
        System.out.println("\nПеременные класса DataHolder:");
        System.out.println("DataHolder.byteValue = "+ holder.getByteValue());
        System.out.println("DataHolder.bValue = "+ holder.getBValue());
        System.out.println("DataHolder.shortValue = "+ holder.getShortValue());
        System.out.println("DataHolder.sValue = "+ holder.getSValue());
        System.out.println("DataHolder.integerValue = "+ holder.getIntegerValue());
        System.out.println("DataHolder.iValue = "+ holder.getIValue());
        System.out.println("DataHolder.longValue = "+ holder.getLongValue());
        System.out.println("DataHolder.lValue = "+ holder.getLValue());
        System.out.println("DataHolder.floatValue = "+ holder.getFloatValue());
        System.out.println("DataHolder.fValue = "+ holder.getFValue());
        System.out.println("DataHolder.doubleValue = "+ holder.getDoubleValue());
        System.out.println("DataHolder.dValue = "+ holder.getDValue());
        System.out.println("DataHolder.characterValue = "+ holder.getCharacterValue());
        System.out.println("DataHolder.boolValue = "+ holder.getBooleanValue());
        System.out.println("DataHolder.booValue = "+ holder.isBoolValue()); //is вместо get

        System.out.println("\nПеременные класса Main:");
        //Глобальные
        System.out.println("shortValue2 = "+shortValue2);
        System.out.println("iValue2 = "+ iValue2);
        System.out.println("cValue2 = "+ cValue2);
        System.out.println("booleanValue2 = "+ booleanValue2);
        System.out.println("fValue2 = "+ fValue2);
        //Локальные
        System.out.println("intValue3 = "+ intValue3);
        System.out.println("charValue3 = "+ charValue3);
        System.out.println("lValue3 = "+ lValue3);
        System.out.println("dValue3 = "+ dValue3);
        System.out.println("byteValue3 = "+ byteValue3);

    }
}
