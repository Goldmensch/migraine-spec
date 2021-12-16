package io.github.goldmensch.migraine.spec.event;

import java.util.Set;

public interface SubscriberRegistry extends Iterable<Subscriber<?>> {
  <T> void register(Subscriber<T> subscriber, Class<T> eventType);
  <T> void unregister(Subscriber<T> subscriber);
  <T> void unregisterAll(Class<T> eventType);
  <T> boolean subscribed(Subscriber<T> subscriber);
  <T> Set<Subscriber<T>> subscriberFor(Class<T> evenType);
}
