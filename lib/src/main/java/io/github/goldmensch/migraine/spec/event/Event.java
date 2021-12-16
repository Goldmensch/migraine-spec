package io.github.goldmensch.migraine.spec.event;

import java.time.LocalDateTime;

public interface Event<T> {
  LocalDateTime publishedTime();
  String name();
  Class<T> type();
}
