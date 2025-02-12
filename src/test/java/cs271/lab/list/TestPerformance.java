package cs271.lab.list;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPerformance {
  private final int SIZE = 10000;

  private final int REPS = 1000000;

  private List<Integer> arrayList;

  private List<Integer> linkedList;

  private long startTime;
  private long endTime;

  @Before
  public void setUp() throws Exception {
    arrayList = new ArrayList<Integer>(SIZE);
    linkedList = new LinkedList<Integer>();
    for (var i = 0; i < SIZE; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }
  }

  public void calcTime(String methodName) {
    long timeTaken = this.endTime - this.startTime;
    System.out.print("Time taken for " + methodName + ": ");
    System.out.println(timeTaken);
  }

  @After
  public void tearDown() throws Exception {
    arrayList = null;
    linkedList = null;
  }

  @Test
  public void testLinkedListAddRemove() {
    this.startTime = System.currentTimeMillis();
    for (var r = 0; r < REPS; r++) {
      linkedList.add(0, 77);
      linkedList.remove(0);
    }
    this.endTime = System.currentTimeMillis();
    calcTime("testLinkedListAddRemove");
  }

  @Test
  public void testArrayListAddRemove() {
    this.startTime = System.currentTimeMillis();
    for (var r = 0; r < REPS; r++) {
      arrayList.add(0, 77);
      arrayList.remove(0);
    }
    this.endTime = System.currentTimeMillis();
    calcTime("testArrayListAddRemove");
  }

  @Test
  public void testLinkedListAccess() {
    this.startTime = System.currentTimeMillis();
    var sum = 0L;
    for (var r = 0; r < REPS; r++) {
      sum += linkedList.get(r % SIZE);
    }
    this.endTime = System.currentTimeMillis();
    calcTime("testLinkedListAccess");
  }

  @Test
  public void testArrayListAccess() {
    this.startTime = System.currentTimeMillis();
    var sum = 0L;
    for (var r = 0; r < REPS; r++) {
      sum += arrayList.get(r % SIZE);
    }
    this.endTime = System.currentTimeMillis();
    calcTime("testArrayListAccess");
  }
}
