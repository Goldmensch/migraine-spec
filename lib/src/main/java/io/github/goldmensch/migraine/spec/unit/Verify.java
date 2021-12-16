package io.github.goldmensch.migraine.spec.unit;

/**
 * An interface that provides a method which is used to verify the changes made by {@link Migration#migrate()}
 */
public interface Verify {

  /**
   * Verifies the migration done by {@link Migration#migrate()}
   * @return if the data was successfully verified
   */
  boolean verify();
}
