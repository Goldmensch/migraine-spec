package io.github.goldmensch.migraine.spec.exceptions;

import io.github.goldmensch.migraine.spec.unit.MigrationUnit;

public class MigrationUnitExists extends RuntimeException {

  public MigrationUnitExists(MigrationUnit unit, MigrationUnit foundUnit) {
    super("MigrationUnit %s cannot be registered because %s is already registered with version %s"
        .formatted(unit.getClass().getName(), foundUnit.getClass().getName(), unit.version())
    );
  }
}
