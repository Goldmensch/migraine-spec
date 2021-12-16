package io.github.goldmensch.migraine.spec.event;

public interface Subscriber<T> {
  void onCall(Event<T> event);
  default boolean supported(Event<T> event) {
    return true;
  }
}
