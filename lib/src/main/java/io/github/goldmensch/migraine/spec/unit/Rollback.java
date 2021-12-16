package io.github.goldmensch.migraine.spec.unit;

/**
 * An interface which provides a rollback method to roll back the changes made by {@link Migration#migrate()}
 */
public interface Rollback {

  /**
   * Reverses the changes made by {@link Migration#migrate()}
   * @return if the rollback was successfully
   */
  boolean rollback();
}
