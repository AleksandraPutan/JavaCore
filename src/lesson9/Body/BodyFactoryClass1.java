package lesson9.Body;
import lesson9.RobotPartFactoty1;

import lesson9.Robot1;

public class BodyFactoryClass1 implements RobotPartFactoty1<Robot1.Body1> {
    @Override
    public Robot1.Body1 makePartRobot(int choice) {
        switch (choice) {
            case 0:
                return new Robot1.Body1(BodyChoice1.ROBOT_DOG);
            case 1:
                return new Robot1.Body1(BodyChoice1.HUMANOID);
            case 2:
                return new Robot1.Body1(BodyChoice1.ROBOT_ARM);

        }
        return null;
    }

}
