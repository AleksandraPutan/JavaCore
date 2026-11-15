package lesson9.Head;

import lesson9.Robot1;
import lesson9.RobotPartFactoty1;

public class HeadFactoryClass1 implements RobotPartFactoty1<Robot1.Head1> {

    @Override
    public Robot1.Head1 makePartRobot(int choice) {
        switch (choice) {
            case 0:
                return new Robot1.Head1(HeadChoice1.IRON);
            case 1:
                return new Robot1.Head1(HeadChoice1.BRONZE);
            case 2:
                return new Robot1.Head1(HeadChoice1.GOLD);
        }
        return null;
    }
}
