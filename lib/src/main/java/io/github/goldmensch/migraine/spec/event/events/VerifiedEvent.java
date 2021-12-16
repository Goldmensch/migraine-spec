package io.github.goldmensch.migraine.spec.event.events;

import io.github.goldmensch.migraine.spec.event.Event;

public interface VerifiedEvent extends Event<VerifiedEvent>, UnitEvent {

  @Override
  default String name() {
    return "VerifiedEvent";
  }

  @Override
  default Class<VerifiedEvent> type() {
    return VerifiedEvent.class;
  }

}
