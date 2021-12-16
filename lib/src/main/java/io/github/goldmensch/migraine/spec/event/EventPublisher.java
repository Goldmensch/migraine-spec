package io.github.goldmensch.migraine.spec.event;

public interface EventPublisher extends EventSubscribable {
  <T> void publish(Event<T> event);
  SubscriberRegistry registry();
}
