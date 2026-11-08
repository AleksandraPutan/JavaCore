package lesson8;

import lesson8.Body.BodyChoice;
import lesson8.Head.HeadChoice;
import lesson9.Body.BodyChoice1;

public class Robot {
    public static int count = 0;

    private String name;
    private Head robotHead;
    private Body robotBody;

    public static class Head {
        private HeadChoice type;

        public Head(HeadChoice type) {
            this.type = type;
        }

        public HeadChoice getType() {
            return type;
        }

        public void setType(HeadChoice type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "type=" + type.getName() +
                    '}';
        }
    }

    public static class Body {
        private BodyChoice type;

        public Body(BodyChoice type) {
            this.type = type;
        }

        public Body(BodyChoice1 bodyChoice) {
        }

        public BodyChoice getType() {
            return type;
        }

        public void setType(BodyChoice type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Body{" +
                    "type=" + type.getName() +
                    '}';
        }
    }

    public Robot(String name, Head robotHead, Body robotBody) {
        this.name = name;
        this.robotHead = robotHead;
        this.robotBody = robotBody;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getRobotHead() {
        return robotHead;
    }

    public void setRobotHead(Head robotHead) {
        this.robotHead = robotHead;
    }

    public Body getRobotBody() {
        return robotBody;
    }

    public void setRobotBody(Body robotBody) {
        this.robotBody = robotBody;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", robotHead=" + robotHead +
                ", robotBody=" + robotBody +
                '}';
    }
}
