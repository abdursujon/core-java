package ArrayList;

import List.List;

public class ArrayList implements List {
  protected Object[] arrayListElements;
  protected int size;

  public ArrayList(int initialCapacity) {
    if (initialCapacity < 1) {
      throw new IllegalArgumentException("ArrayList capacity must be >= 1");
    }
    arrayListElements = new Object[initialCapacity];
  }
  
  public ArrayList() { this(10); }
  
  public boolean isEmpty(){ return size == 0;} // size == 0 (true of false) boolean expression
  
  public int size() { return size;}
  
  public void checkIndex(int index) 
}
