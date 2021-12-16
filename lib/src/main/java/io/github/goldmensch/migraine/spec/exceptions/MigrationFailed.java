package io.github.goldmensch.migraine.spec.exceptions;

import io.github.goldmensch.migraine.spec.unit.MigrationUnit;

public class MigrationFailed extends RuntimeException{

  public MigrationFailed(MigrationUnit unit, String reason) {
    super("Migration provided by %s failed: %s".formatted(unit.getClass().getName(), reason));
  }

}
