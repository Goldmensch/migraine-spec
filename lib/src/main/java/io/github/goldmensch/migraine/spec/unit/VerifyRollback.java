package io.github.goldmensch.migraine.spec.unit;

/**
 * Does almost the same as {@link Verify} but for the {@link Rollback}
 */
public interface VerifyRollback {

  /**
   * Same as {@link Verify#verify()} but for {@link Rollback#rollback()}
   * @return if the data was successfully verified
   */
  boolean verifyRollback();

}
