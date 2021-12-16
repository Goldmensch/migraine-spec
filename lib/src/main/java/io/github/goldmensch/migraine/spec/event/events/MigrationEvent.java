package io.github.goldmensch.migraine.spec.event.events;

import io.github.goldmensch.migraine.spec.event.Event;

public interface MigrationEvent extends Event<MigrationEvent>, UnitEvent {

  @Override
  default String name() {
    return "MigrationEvent";
  }

  @Override
  default Class<MigrationEvent> type() {
    return MigrationEvent.class;
  }
}
