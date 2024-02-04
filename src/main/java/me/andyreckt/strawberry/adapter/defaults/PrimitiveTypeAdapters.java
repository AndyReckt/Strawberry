package me.andyreckt.strawberry.adapter.defaults;

import lombok.experimental.UtilityClass;
import me.andyreckt.strawberry.adapter.StrawberryStringTypeAdapter;
import me.andyreckt.strawberry.adapter.StrawberryTypeAdapter;

@UtilityClass
public class PrimitiveTypeAdapters {
    public StrawberryStringTypeAdapter<String> STRING = new StrawberryStringTypeAdapter<String>() {
        @Override
        public String deserialize(String input) {
            return input;
        }

        @Override
        public String serialize(String value) {
            return value;
        }
    };

    public StrawberryTypeAdapter<Integer, Integer> INTEGER = new StrawberryTypeAdapter<Integer, Integer>() {
        @Override
        public Integer deserialize(Integer input) {
            return input;
        }

        @Override
        public Integer serialize(Integer value) {
            return value;
        }
    };

    public StrawberryTypeAdapter<Long, Long> LONG = new StrawberryTypeAdapter<Long, Long>() {
        @Override
        public Long deserialize(Long input) {
            return input;
        }

        @Override
        public Long serialize(Long value) {
            return value;
        }
    };

    public StrawberryTypeAdapter<Double, Double> DOUBLE = new StrawberryTypeAdapter<Double, Double>() {
        @Override
        public Double deserialize(Double input) {
            return input;
        }

        @Override
        public Double serialize(Double value) {
            return value;
        }
    };

    public StrawberryTypeAdapter<Float, Float> FLOAT = new StrawberryTypeAdapter<Float, Float>() {
        @Override
        public Float deserialize(Float input) {
            return input;
        }

        @Override
        public Float serialize(Float value) {
            return value;
        }
    };

    public StrawberryTypeAdapter<Boolean, Boolean> BOOLEAN = new StrawberryTypeAdapter<Boolean, Boolean>() {
        @Override
        public Boolean deserialize(Boolean input) {
            return input;
        }

        @Override
        public Boolean serialize(Boolean value) {
            return value;
        }
    };
}
