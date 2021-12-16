package io.github.goldmensch.migraine.spec;

public interface MigrationVersion {
  int major();
  int minor();
  int patch();

  default boolean higherThan(MigrationVersion version) {
    if(major() > version.major()) {
      return true;
    }
    if(major() < version.major()) {
      return false;
    }
    if(minor() > version.minor()) {
      return true;
    }
    if(minor() < version.minor()) {
      return false;
    }
    return patch() > version.patch();
  }

  default boolean lowerThan(MigrationVersion version) {
    return !higherThan(version) && !this.equals(version);
  }

  default boolean equals(MigrationVersion version) {
    return major() == version.major()
        && minor() == version.minor()
        && patch() == version.patch();
  }
}
