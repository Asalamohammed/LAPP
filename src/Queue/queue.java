package Queue;

public interface queue <E> {
    public boolean isempty();

    public int size();
    public void enqueue(E data);
    public E dequeue();
    public E front();
}
