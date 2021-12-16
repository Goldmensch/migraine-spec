package io.github.goldmensch.migraine;

import java.util.function.Function;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MigrationVersionTest {

  private final TestMigrationVersionImpl base = new TestMigrationVersionImpl(1, 1, 1);

  void compare(boolean expected, Function<TestMigrationVersionImpl, Boolean> fun, TestMigrationVersionImpl... versions) {
    for(var v : versions) {
      Assertions.assertEquals(expected, fun.apply(v));
    }
  }

  void test(boolean higher, boolean lower, boolean equals, TestMigrationVersionImpl... obj) {
    compare(higher, base::higherThan, obj);
    compare(lower, base::lowerThan, obj);
    compare(equals, base::equalTo, obj);
  }
  @Test
  void testHigher() {
    test(true, false, false,
        new TestMigrationVersionImpl(0, 1, 1),
        new TestMigrationVersionImpl(0, 1, 1),
        new TestMigrationVersionImpl(0, 1, 1));
  }

  @Test
  void testLower() {
    test(false, true, false,
        new TestMigrationVersionImpl(2, 1, 1),
        new TestMigrationVersionImpl(1, 2, 1),
        new TestMigrationVersionImpl(1, 1, 2));
  }

  @Test
  void testEqual() {
    test(false, false, true,
        base);
  }
}
