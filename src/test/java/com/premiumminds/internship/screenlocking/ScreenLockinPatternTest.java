package com.premiumminds.internship.screenlocking;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by aamado on 05-05-2022.
 */
@RunWith(JUnit4.class)
public class ScreenLockinPatternTest {

  /**
   * The corresponding implementations to test.
   *
   * If you want, you can make others :)
   *
   */
  public ScreenLockinPatternTest() {
  };

  @Test
  public void ScreenLockinPatternTestFirst1Length1Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(1, 1);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 1);
  }

  @Test
  public void ScreenLockinPatternTestFirst2Length1Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(2, 1);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 1);
  }

  @Test
  public void ScreenLockinPatternTestFirst3Length1Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(3, 1);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 1);
  }

  @Test
  public void ScreenLockinPatternTestFirst4Length1Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(4, 1);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 1);
  }

  @Test
  public void ScreenLockinPatternTestFirst5Length1Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(5, 1);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 1);
  }

  @Test
  public void ScreenLockinPatternTestFirst6Length1Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(6, 1);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 1);
  }

  @Test
  public void ScreenLockinPatternTestFirst7Length1Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(7, 1);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 1);
  }

  @Test
  public void ScreenLockinPatternTestFirst8Length1Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(8, 1);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 1);
  }

  @Test
  public void ScreenLockinPatternTestFirst9Length1Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(9, 1);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 1);
  }

  @Test
  public void ScreenLockinPatternTestFirst1Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(1, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 5);
  }

  @Test
  public void ScreenLockinPatternTestFirst2Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(3, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 5);
  }

  @Test
  public void ScreenLockinPatternTestFirst3Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(3, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 5);
  }

  @Test
  public void ScreenLockinPatternTestFirst4Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(4, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 7);
  }

  @Test
  public void ScreenLockinPatternTestFirst5Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(5, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 8);
  }

  @Test
  public void ScreenLockinPatternTestFirst3Length3Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(3, 3);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 31);
  }

  @Test
  public void ScreenLockinPatternTestFirst3Length4Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(3, 4);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 154);
  }
}