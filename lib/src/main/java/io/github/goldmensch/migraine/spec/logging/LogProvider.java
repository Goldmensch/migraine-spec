package io.github.goldmensch.migraine.spec.logging;

import java.time.LocalDateTime;
import java.util.Optional;

public interface LogProvider {
  boolean logged(LocalDateTime time);
  Optional<LoggedTask> searchTask(LocalDateTime time);
}
