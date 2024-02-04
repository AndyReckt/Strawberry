package me.andyreckt.strawberry.adapter;

public interface StrawberryTypeAdapter<T, U> {
    T deserialize(U input);
    U serialize(T value);
}
