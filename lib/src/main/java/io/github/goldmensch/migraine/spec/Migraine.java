package io.github.goldmensch.migraine.spec;

import io.github.goldmensch.migraine.spec.event.EventSubscribable;
import io.github.goldmensch.migraine.spec.logging.MigrationLogger;
import io.github.goldmensch.migraine.spec.unit.MigrationUnit;

/**
 * The main interface to interact with Migraine
 */
public interface Migraine {

  /**
   * Same as {@link MigrationRegistry#register(MigrationUnit)} but with some sort of builder function
   */
  Migraine registerUnit(MigrationUnit unit);

  /**
   * @return the underlying {@link MigrationRegistry}
   */
  MigrationRegistry registry();

  /**
   * @return the {@link MigrationInitializer} that is used for this migration
   */
  MigrationInitializer initializer();

  EventSubscribable events();

  MigrationLogger logger();

  /**
   * Runs the migrations stored in the underlying {@link MigrationRegistry} synchronous
   */
  void runMigrations();
}
