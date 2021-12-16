package io.github.goldmensch.migraine.spec.event;

public interface Subscribable {
  <T> void subscribe(Class<T> eventType, Subscriber<T> subscriber);
}
