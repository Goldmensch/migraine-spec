package io.github.goldmensch.migraine.spec.logging;

import io.github.goldmensch.migraine.spec.unit.MigrationUnit;
import io.github.goldmensch.migraine.spec.unit.TaskType;
import java.time.LocalDateTime;
import java.util.logging.Level;

public interface LoggedTask {
  LocalDateTime executionTime();
  MigrationUnit executedUnit();
  Level loggingLevel();
  TaskType taskType();
}
