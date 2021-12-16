package io.github.goldmensch.migraine.spec.event.events;

import io.github.goldmensch.migraine.spec.event.Event;

public interface RollbackEvent extends Event<RollbackEvent>, UnitEvent{

  @Override
  default String name() {
    return "RollbackEvent";
  }

  @Override
  default Class<RollbackEvent> type() {
    return RollbackEvent.class;
  }

}
