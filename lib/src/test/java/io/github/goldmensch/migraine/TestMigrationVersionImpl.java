package io.github.goldmensch.migraine;

import io.github.goldmensch.migraine.spec.MigrationVersion;

public record TestMigrationVersionImpl(
    int major,
    int minor,
    int patch
) implements MigrationVersion {
}