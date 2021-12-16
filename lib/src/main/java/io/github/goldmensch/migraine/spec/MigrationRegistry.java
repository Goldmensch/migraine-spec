package io.github.goldmensch.migraine.spec;

import io.github.goldmensch.migraine.spec.exceptions.MigrationUnitExists;
import io.github.goldmensch.migraine.spec.unit.MigrationUnit;
import java.util.Set;

/**
 * A registry which stores the actual {@link MigrationUnit} instances
 */
public interface MigrationRegistry extends Iterable<MigrationUnit>{

  /**
   * Registers a {@link MigrationUnit}.
   * If a {@link MigrationUnit} with the same version exists it will throw an error //TODO: insert error
   * @param unit The {@link MigrationUnit} that should be registered
   * @throws MigrationUnitExists if a unit with the same version already is registered
   */
  void register(MigrationUnit unit);

  /**
   * Checks if a {@link MigrationUnit} that belongs to the same {@link MigrationVersion}
   * is stored in this registry
   * @param version the {@link MigrationVersion}
   * @return if a {@link MigrationUnit} with the same {@link MigrationVersion} is stored
   */
  boolean registered(MigrationVersion version);

  /**
   * Unregisters a {@link MigrationUnit} for the given {@link MigrationVersion}
   * @param unit the {@link MigrationVersion}
   * @return if a {@link MigrationUnit} was found and unregistered
   */
  boolean unregister(MigrationVersion unit);

  /**
   * Returns an immutable {@link java.util.TreeSet<MigrationUnit>} that
   * sorted by the versions in ascending order
   * @return an immutable {@link java.util.TreeSet}
   */
  Set<MigrationUnit> ordered();
}
