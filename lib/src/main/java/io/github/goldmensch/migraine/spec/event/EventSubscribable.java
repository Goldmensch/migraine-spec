package io.github.goldmensch.migraine.spec.event;

public interface EventSubscribable {
  <T> void subscribe(Class<T> eventType, Subscriber<T> subscriber);
}
