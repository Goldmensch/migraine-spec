package io.github.goldmensch.migraine.spec.unit;

import io.github.goldmensch.migraine.spec.MigrationVersion;

/**
 * Some required metadata of a {@link MigrationUnit}
 */
public interface MigrationUnitMeta {
  /**
   * The version that belongs to the underlying {@link MigrationUnit}
   * @return the version
   */
  MigrationVersion version();

  /**
   * A brief description of what the underlying {@link MigrationUnit} does
   * @return a short description
   */
  String description();

  /**
   * The author of the underlying {@link MigrationUnit}
   * @return tha author
   */
  String author();
}
