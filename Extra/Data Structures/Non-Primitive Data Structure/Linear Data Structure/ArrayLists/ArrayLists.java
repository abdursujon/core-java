package ArrayLists;

import List.List;

public class ArrayLists implements List {
  protected Object[] arrayListElements;
  protected int size;

  public ArrayLists(int initialCapacity) {
    if (initialCapacity < 1) {
      throw new IllegalArgumentException("ArrayList capacity must be >= 1");
    }
    arrayListElements = new Object[initialCapacity];
  }
  
  public ArrayLists() { this(10); }

  @Override
  public Object get(int index) {
    return null;
  }

  @Override
  public void add(int index, Object obj) {

  }

  @Override
  public Object remove(int index) {
    return null;
  }

  public boolean isEmpty(){ return size == 0;} // size == 0 (true of false) boolean expression
  
  public int size() { return size;}

  @Override
  public int indexOf(Object obj) {
    return 0;
  }

  @Override
  public String outputList() {
    return "";
  }

    public void checkIndex(int index) {

    }
}
