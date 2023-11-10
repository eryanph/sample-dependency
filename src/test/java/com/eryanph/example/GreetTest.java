package com.eryanph.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreetTest {

  Greet greet = new Greet();

  @Test
  public void shouldSayHello() {
    assertEquals("Hello!", greet.sayHello());
  }

  @Test
  public void shouldSayHi() {
    assertEquals("Hi!", greet.sayHi());
  }

}
