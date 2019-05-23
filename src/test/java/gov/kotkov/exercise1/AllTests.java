package test.java.gov.kotkov.exercise1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.java.gov.kotkov.exercise1.part1.Part1Test;
import test.java.gov.kotkov.exercise1.part2.Part2Test;
import test.java.gov.kotkov.exercise1.part3.Part3Test;

@RunWith(Suite.class)
@SuiteClasses({Part1Test.class, Part2Test.class, Part3Test.class})
public class AllTests {

}
