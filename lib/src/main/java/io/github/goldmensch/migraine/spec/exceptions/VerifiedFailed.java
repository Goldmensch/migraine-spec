package io.github.goldmensch.migraine.spec.exceptions;

import io.github.goldmensch.migraine.spec.unit.MigrationUnit;

public class VerifiedFailed extends RuntimeException{

  public VerifiedFailed(MigrationUnit unit, String reason) {
    super("Verify provided by %s failed: %s".formatted(unit.getClass().getName(), reason));
  }
}
