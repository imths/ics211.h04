package edu.ics211.h04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SortableListTest {

  @Test
  void testSortableList() {
    SortableList<String> list = new SortableList<String>();
    assertNotNull(list);
    assertEquals(0, list.size());
  }


  @Test
  void testInsertionSort() {
    SortableList<String> list = new SortableList<String>();
    list.add("foo");
    list.add("bad");
    list.add("baz");
    list.insertionSort(new StringComparator());
    assertEquals("bar", list.get(0));
    assertEquals("baz", list.get(1));
    assertEquals("foo", list.get(2));
  }


  @Test
  void testBubbleSort() {
    fail("Not yet implemented");
  }


  @Test
  void testSelectionSort() {
    fail("Not yet implemented");
  }


  @Test
  void testGetNumberOfSwaps() {
    fail("Not yet implemented");
  }


  @Test
  void testGetNumberOfComparisons() {
    fail("Not yet implemented");
  }


  @Test
  void testGetSortTime() {
    fail("Not yet implemented");
  }


  @Test
  void testGet() {
    SortableList<String> list = new SortableList<String>();
    list.add("foo");
    list.add("bad");
    list.add("baz");
    assertEquals("foo", list.get(0));
    assertEquals("baz", list.get(list.size() - 1));
    try {
      list.get(-1);
      fail("Not yet implemented");
    } catch(IndexOutOfBoundsException ioe) {
    }
    try {
      list.get(list.size());
      fail("Not yet implemented");
    } catch(IndexOutOfBoundsException ioe) {
    }
  }


  @Test
  void testSet() {
    fail("Not yet implemented");
  }


  @Test
  void testIndexOf() {
    fail("Not yet implemented");
  }


  @Test
  void testSize() {
    fail("Not yet implemented");
  }


  @Test
  void testAddE() {
    fail("Not yet implemented");
  }


  @Test
  void testAddIntE() {
    fail("Not yet implemented");
  }


  @Test
  void testRemove() {
    fail("Not yet implemented");
  }

}
