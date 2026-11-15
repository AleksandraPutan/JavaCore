package lesson8.Head;

import lesson8.Robot;

public class HeadFactoryClass implements HeadFactory {

    @Override
    public Robot.Head makeHead(int headChoice) {
        switch (headChoice) {
            case 0:
                return new Robot.Head(HeadChoice.IRON);
            case 1:
                return new Robot.Head(HeadChoice.BRONZE);
            case 2:
                return new Robot.Head(HeadChoice.GOLD);
        }
        return null;
    }
}
