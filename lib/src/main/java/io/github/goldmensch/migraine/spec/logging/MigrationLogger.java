package io.github.goldmensch.migraine.spec.logging;

public interface MigrationLogger extends LogProvider {
  void log(LoggedTask task);
}
