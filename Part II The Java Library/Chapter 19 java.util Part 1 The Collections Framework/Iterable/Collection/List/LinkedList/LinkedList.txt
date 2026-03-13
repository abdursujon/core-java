1. Doubly linked — each node has a pointer to both next and previous
2. No random access — get(5) has to walk through 5 nodes, unlike ArrayList which jumps directly
3. Fast insert/remove at head and tail — O(1)
4. Slow insert/remove in the middle — still O(n) because you have to find the position first
5. Uses more memory — each element stores two extra pointers (next + previous)
6. Implements Deque — so you can use it as a stack or queue
7. Not synchronized — not thread-safe
8. Almost never the right choice — ArrayList is faster in practice due to CPU cache locality. Only consider LinkedList if you're constantly adding/removing from the front.
