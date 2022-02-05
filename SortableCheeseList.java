/**
 * 
 */
package edu.ics211.h04;

import edu.ics211.h02.Cheese;

/**
 * @author Isaac Segawa
 *
 */
public class SortableCheeseList implements IList211<Cheese> {

  private SortableList<Cheese> theCheeses;
  private Comparator<Cheese> comp;
  
  /**
   * 
   */
  public SortableCheeseList() {
    //initialize the variables
  }

  @Override
  public Cheese get(int index) {
    //return theCheeses.get(index);
    return null;
  }

  @Override
  public Cheese set(int index, Cheese element) {
    /*
     * remember the cheese return
     * sort the list (any sort method) prof doesn't like selection sort
     * return remembered cheese
     */
    return null;
  }

  @Override
  public int indexOf(Object obj) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean add(Cheese e) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void add(int index, Cheese element) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Cheese remove(int index) {
    // TODO Auto-generated method stub
    return null;
  }

}
