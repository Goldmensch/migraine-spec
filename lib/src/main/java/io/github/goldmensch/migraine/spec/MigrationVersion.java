package io.github.goldmensch.migraine.spec;

/**
 * A simple version according to the scheme of SemVer
 */
public interface MigrationVersion {
  int major();
  int minor();
  int patch();

  /**
   * Checks if this version is higher than {@param version}
   * @param version The {@link MigrationVersion} that should be compared
   * @return if this version is higher
   */
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

  /**
   * Checks if this version is lower than {@param version}
   * @param version The {@link MigrationVersion} that should be compared
   * @return if this version is lower
   */
  default boolean lowerThan(MigrationVersion version) {
    return !higherThan(version) && !this.equalTo(version);
  }

  /**
   * Checks if this version is equal to {@param version}
   * @param version The {@link MigrationVersion} that should be compared
   * @return if this version is equal
   */
  default boolean equalTo(MigrationVersion version) {
    return major() == version.major()
        && minor() == version.minor()
        && patch() == version.patch();
  }
}
