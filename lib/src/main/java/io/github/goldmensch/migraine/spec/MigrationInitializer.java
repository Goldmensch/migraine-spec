package io.github.goldmensch.migraine.spec;

/**
 * Represents a class which is used to initialize some required meta storage in the database,
 * primarily used for versioning and logs
 */
public interface MigrationInitializer {

  /**
   * Setups the database, only executed if {@link this#initialized()} returns false
   * otherwise {@link this#update()} is called
   */
  void init();

  /**
   * Checks if the database is already initialised
   * @return if the database is initialised
   */
  boolean initialized();

  /**
   * Runs if {@link this#initialized()} returns false
   */
  void update();
}
