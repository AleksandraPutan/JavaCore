package lesson8.Body;

import lesson8.Robot;

public class BodyFactoryClass implements BodyFactory {
    @Override
    public Robot.Body makeBody(int bodyChoice) {
        switch (bodyChoice) {
            case 0:
                return new Robot.Body(BodyChoice.ROBOT_DOG);
            case 1:
                return new Robot.Body(BodyChoice.HUMANOID);
            case 2:
                return new Robot.Body(BodyChoice.ROBOT_ARM);
        }
        return null;
    }
}
