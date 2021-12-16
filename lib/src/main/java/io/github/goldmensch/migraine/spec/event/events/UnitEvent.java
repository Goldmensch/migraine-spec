package io.github.goldmensch.migraine.spec.event.events;

import io.github.goldmensch.migraine.spec.unit.MigrationUnit;
import io.github.goldmensch.migraine.spec.unit.TaskType;

public interface UnitEvent {
  MigrationUnit unit();
  TaskType taskType();
}
