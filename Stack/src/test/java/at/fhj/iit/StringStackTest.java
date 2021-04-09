package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringStackTest {
  public IStack sut;
  public StringStack myObject;

  @BeforeEach
  void setup() {
    sut = new StringStack(5); // keep size of 5 !!
    myObject = new StringStack(3);
  }

  /**
   * tests if stack is empty after initialization
   * use assert
   * - assertTrue to check it's empty
   * TODO: add useful DisplayName
   */
  @Test
  @DisplayName("testIsEmpty")
  public void testIsEmpty() {
    assertTrue(sut.isEmpty());
  }

  /**
   * tests if stack is empty after pushing
   * use assert
   * - assertFalse to check it's not empty
   * TODO: add useful DisplayName
   */
  @Test
  public void testIsNotEmpty() {
    myObject.push("Hello World!");
    assertFalse(myObject.isEmpty());

   // fail("please implement me...");
  }

  /**
   * tests push and pop method
   * do following test
   * - use push, 1 or x times
   * - use pop, as often as you use push
   * - use isEmpty to check that's empty again
   * - assert every content of the stack in the correct ordering
   *
   * TODO: add useful DisplayName
   */
  @Test
  public void testPushPop() throws Exception {
     sut.push("geleert!");
     sut.push("wird");
     sut.push("Stack");
     sut.push("Der");
    assertEquals("Der", sut.pop());
    assertEquals( "Stack", sut.pop());
    assertEquals( "wird", sut.pop());
    assertEquals( "geleert!", sut.pop());
    assertTrue(sut.isEmpty());

    // fail("please implement me...");
  }

  /**
   * tests push throwing exception
   * do following test
   * - use push, as many times that it should throw an exception
   * - assert thrown exception
   *
   * TODO: add useful DisplayName
   */
  @Test
  public void testPushException() {
    sut.push("Stack1");
    sut.push("Stack2");
    sut.push("Stack3");
    sut.push("Stack4");
    sut.push("Stack5");

    assertThrows( IllegalStateException.class, () -> sut.push("Exception"));
    //fail("please implement me...");
  }

  /**
   * tests pop throwing exception
   * do following test
   * - use pop, as many times that it should throw an exception
   * - assert thrown exception
   *
   * TODO: add useful DisplayName
   */
  @Test
  public void testPopException() throws Exception {
    sut.push("1");
    sut.push("Sun");
    sut.push("Moon");
    assertEquals("Moon", sut.pop());
    assertEquals("Sun", sut.pop());
    assertEquals("1", sut.pop());

    assertThrows( IllegalStateException.class, () ->  sut.pop());
    //    fail("please implement me...");
  }

  // TODO: Feel Free to insert other test cases for the String Stack Implementation !!!

  /**
   * Tests if stack has reached full capacity
   */

  @Test
  public void testIsFull(){
    myObject.push("bla");
    myObject.push("foo");
    myObject.push("bar");
    assertTrue(myObject.isFull());
}
}
