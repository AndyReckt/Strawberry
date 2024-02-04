package me.andyreckt.strawberry;

import lombok.Getter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.reload();
        } catch (IllegalAccessException | IOException e) {
            e.printStackTrace();
        }
    }

    @Getter
    public static class Test extends Strawberry {
        public Test() {
            super("test.yml");
        }

        @Config(path = "tests")
        String test = "test";

        @Config(path = "test2", comment = "This is a test comment")
        int test2 = 1;

        @Config(path = "test3.test", comment = "This is another test comment")
        boolean test3 = true;

        @Config(path = "test3.test4")
        double test4 = 1.0;

        @Config(path = "test3.test5")
        String test5 = "test5's value";

        @Override
        public String footer() {
            return "This is a test footer";
        }
    }
}
