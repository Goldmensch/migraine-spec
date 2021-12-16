package io.github.goldmensch.migraine.spec.event.events.init;

import io.github.goldmensch.migraine.spec.event.Event;

public interface MigrationInitEvent extends Event<MigrationInitEvent> {

  boolean exists();
  InitType initType();

  @Override
  default String name() {
    return "MigrationInitEvent";
  }

  @Override
  default Class<MigrationInitEvent> type() {
    return MigrationInitEvent.class;
  }

}
