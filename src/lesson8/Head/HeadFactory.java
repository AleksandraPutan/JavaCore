package lesson8.Head;

import lesson8.Robot;

public interface HeadFactory {
    Robot.Head makeHead(int headChoice);
}
