package lesson3.rainbow;

public class Rainbow {


    public static final int RED = 1; //красный
    public static final double RED_ORANGE = 1.5; //красно-оранжевый
    public static final int ORANGE = 2; //оранжевый
    public static final double ORANGE_YELLOW = 2.5; //оранжево-жёлтый
    public static final int YELLOW = 3; //жёлтый
    public static final double YELLOW_GREEN = 3.5; //жёлто-зелёный
    public static final int GREEN = 4; //зелёный
    public static final double GREEN_LIGHT_BLUE = 4.5; //зелёно-голубой
    public static final int LIGHT_BLUE = 5; //голубой
    public static final double LIGHT_BLUE_BLUE = 5.5; //голубо-синий
    public static final int BLUE = 6; //синий
    public static final double BLUE_PURPLE = 6.5; //сине-фиолетовый
    public static final int PURPLE = 7; //фиолетовый


    public void printColor(double color) {

        if(color%1==0){
            printPrimaryColor((int)color);
        } else if (color%1==0.5) {
            printMixedColor((int)color);
        }
        else{
            System.out.println("Цвет под номером "+ color+ " не найден.");
        }

    }

    public void printPrimaryColor(int color){
        switch (color) {
            case RED: {
                System.out.println("Красный");
                break;
            }
            case ORANGE: {
                System.out.println("Оранжевый");
                break;
            }
            case YELLOW: {
                System.out.println("Жёлтый");
                break;
            }
            case GREEN: {
                System.out.println("Зелёный");
                break;
            }
            case LIGHT_BLUE: {
                System.out.println("Голубой");
                break;
            }
            case BLUE: {
                System.out.println("Синий");
                break;
            }
            case PURPLE: {
                System.out.println("Фиолетовый");
                break;
            }

            default :{
                System.out.println("Цвета под номером " + color + " нет или он находится в разработке.");
            }
        }

    }

    public void printMixedColor(int color){
        switch (color) {
            case RED: {
                System.out.println("Красно-оранжевый");
                break;
            }
            case ORANGE: {
                System.out.println("Оранжево-жёлтый");
                break;
            }
            case YELLOW: {
                System.out.println("Жёлто-зелёный");
                break;
            }
            case GREEN: {
                System.out.println("Зелёно-голубой");
                break;
            }
            case LIGHT_BLUE: {
                System.out.println("Голубо-синий");
                break;
            }
            case BLUE: {
                System.out.println("Сине-фиолетовый");
                break;
            }

            default :{
                System.out.println("Смешанного цвета под номером " + color + " нет или он находится в разработке ");
            }
        }
    }

    public void printAllColors(){
        System.out.println("Все цвета радуги по порядку");
        System.out.println("Номер "+ RED + " - красный цвет\n"+
         "Номер "+ RED_ORANGE + " - красно-оранжевый цвет\n"+
                "Номер "+ ORANGE + " - оранжевый цвет\n"+
                "Номер "+ ORANGE_YELLOW + " - оранжево-жёлтый цвет\n"+
                "Номер "+ YELLOW + " - жёлтый цвет\n"+
                "Номер "+ YELLOW_GREEN + " - жёлто-зелёный цвет\n"+
                "Номер "+ GREEN + " - зелёный цвет\n"+
                "Номер "+ GREEN_LIGHT_BLUE + " - зелёно-голубой цвет\n"+
                "Номер "+ LIGHT_BLUE + " - голубой цвет\n"+
                "Номер "+ LIGHT_BLUE_BLUE + " - голубо-синий цвет\n"+
                "Номер "+ BLUE + " - синий цвет\n"+
                "Номер "+ BLUE_PURPLE + " - сине-фиолетовый цвет\n"+
                "Номер "+ PURPLE + " - фиолетовый цвет\n");

    }
}
