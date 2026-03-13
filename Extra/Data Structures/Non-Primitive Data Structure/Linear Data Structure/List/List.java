package List;
public interface List{
  // get, add, remove, isEmpty, size, indexOf, outpuList
  public Object get(int index);
  public void add(int index, Object obj);
  public Object remove(int index);
  public boolean isEmpty();
  public int size();
  public int indexOf(Object obj);
  public String outputList();
}
