package io.github.goldmensch.migraine.spec.unit;

/**
 * An interface that contains the migration method of a {@link MigrationUnit}
 */
public interface Migration {

  /**
   * This method is automatically called from Migraine if a migration is necessary
   * @return if the migration was successfully
   */
  boolean migrate();
}
