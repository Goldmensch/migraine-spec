package io.github.goldmensch.migraine.spec.exceptions;

public class InitializationFailed extends RuntimeException{

  public InitializationFailed() {
    super("Migraine database initialization failed");
  }
}
