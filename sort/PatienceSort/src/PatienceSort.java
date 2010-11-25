import java.util.*;
public class PatienceSort
{
	
	
	public static void main(String[] args) {
		int[] arr = {5, 1, 100, 63, 23, 2, 56, 32, 7, 100, 3, 45};
		//sort(arr);
	}
	
    public static <E extends Comparable<? super E>> void sort (E[] n)
    {
        List<Pile<E>> piles = new ArrayList<Pile<E>>();
        // sort into piles
        for (E x : n)
        {
            Pile<E> newPile = new Pile<E>();
            newPile.push(x);
            int i = Collections.binarySearch(piles, newPile);
            if (i < 0) i = ~i;
            if (i != piles.size())
                piles.get(i).push(x);
            else
                piles.add(newPile);
        }
        System.out.println("longest increasing subsequence has length = " + piles.size());
 
        // priority queue allows us to retrieve least pile efficiently
        PriorityQueue<Pile<E>> heap = new PriorityQueue<Pile<E>>(piles);
        for (int c = 0; c < n.length; c++)
        {
            Pile<E> smallPile = heap.poll();
            n[c] = smallPile.pop();
            if (!smallPile.isEmpty())
                heap.offer(smallPile);
        }
        assert(heap.isEmpty());
    }
 
    private static class Pile<E extends Comparable<? super E>> extends Stack<E> implements Comparable<Pile<E>>
    {
        public int compareTo(Pile<E> y) { return peek().compareTo(y.peek()); }
    }
}
