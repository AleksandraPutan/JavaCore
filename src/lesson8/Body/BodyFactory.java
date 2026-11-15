package lesson8.Body;

import lesson8.Robot;

public interface BodyFactory {
    Robot.Body makeBody(int bodyChoice);
}
