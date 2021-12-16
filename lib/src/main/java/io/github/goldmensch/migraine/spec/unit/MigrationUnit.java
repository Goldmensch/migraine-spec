package io.github.goldmensch.migraine.spec.unit;

/**
 * An interface that is used to identify a class as a "MigrationUnit"
 * A "MigrationUnit" is a class which represents one migration identified by a
 * version beside some other metadata. {@link MigrationUnitMeta}
 * It can also provide a {@link Rollback} and a {@link Verify} method
 */
public interface MigrationUnit extends MigrationUnitMeta, Migration {
}
