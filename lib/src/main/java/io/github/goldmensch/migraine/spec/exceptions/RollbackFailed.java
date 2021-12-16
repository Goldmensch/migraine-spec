package io.github.goldmensch.migraine.spec.exceptions;

import io.github.goldmensch.migraine.spec.unit.MigrationUnit;

public class RollbackFailed extends RuntimeException{

  public RollbackFailed(MigrationUnit unit, String reason) {
    super("Rollback provided by %s failed: %s".formatted(unit.getClass().getName(), reason));
  }
}
