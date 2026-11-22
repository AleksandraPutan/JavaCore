package lesson9;

import lesson9.Body.BodyChoice1;
import lesson9.Head.HeadChoice1;

public class Robot1 {
    public static int count = 0;

    private String name;
    private Head1 robotHead;
    private Body1 robotBody;

    public static class Head1 {
        private HeadChoice1 type;

        public Head1(HeadChoice1 type) {
            this.type = type;
        }

        public HeadChoice1 getType() {
            return type;
        }

        public void setType(HeadChoice1 type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "type=" + type.getName() +
                    '}';
        }
    }

    public static class Body1 {
        private BodyChoice1 type;

        public Body1(BodyChoice1 type) {
            this.type = type;
        }

        public BodyChoice1 getType() {
            return type;
        }

        public void setType(BodyChoice1 type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Body{" +
                    "type=" + type.getName() +
                    '}';
        }
    }

    public Robot1(String name, Head1 robotHead, Body1 robotBody) {
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

    public Head1 getRobotHead() {
        return robotHead;
    }

    public void setRobotHead(Head1 robotHead) {
        this.robotHead = robotHead;
    }

    public Body1 getRobotBody() {
        return robotBody;
    }

    public void setRobotBody(Body1 robotBody) {
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
