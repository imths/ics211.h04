/**
 * 
 */
package edu.ics211.h04;

import java.util.Comparator;

/**
 * @author Isaac Segawa
 * @param <E>
 *
 */
public class SortableList<E> implements IList211<E>, ISortableList<E> {
  private E[] data;
  private int size;
  private int swaps;
  private int compares;
  private double sortTime;
  
  @SuppressWarnings("unchecked")
  public SortableList() {
    //initialize the member variables
    this.data = (E[]) new Object[10];
    this.size = 0;
    this.swaps = 0;
  }
  
  @Override
  public void insertionSort(Comparator<E> compare) {
    //ctrl c + ctrl v but change data.length to size
    
  }

  @Override
  public void bubbleSort(Comparator<E> compare) {
    //ctrl c + ctrl v but change data.length to size
    
  }

  @Override
  public void selectionSort(Comparator<E> compare) {
    //ctrl c + ctrl v but change data.length to size
    
  }

  @Override
  public int getNumberOfSwaps() {
    return this.swaps;
  }

  @Override
  public int getNumberOfComparisons() {
    return this.compares;
  }

  @Override
  public double getSortTime() {
    return this.sortTime;
  }

  @Override
  public E get(int index) {
    /*
     * checkIndex
     * return data[index];
     */
    return null;
  }

  @Override
  public E set(int index, E element) {
    /*
     * checkIndex
     * remember item at index
     * set data[index] = element;
     * return old item
     */
    return null;
  }

  @Override
  public int indexOf(Object obj) {
    /*
     * loop through array
     *   if (data[i].equals(obj)
     *     return i;
     * return -1
     */
    return 0;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public boolean add(E e) {
    /*
     * add(size, e);
     */
    return true;
  }

  @Override
  public void add(int index, E element) {
    /*
     * checkIndex (size is ok)
     * if (index < 0 || index > size) {
     * check if data is full
     *   reallocate(); make new bigger array
     * shift the items from size-1 to index to the right/+1
     * insert element at index
     * increment size
     */
    
  }

  @Override
  public E remove(int index) {
    /*
     * checkIndex
     * remember old value at index
     * shift items from index to size-1 to the left/-1
     * decrement size
     * return old value;
     */
    return null;
  }
  
  private void checkIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
  }

}
