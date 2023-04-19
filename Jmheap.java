import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Iterator;

import part1.MyClass;

import java.io.IOException;


public class Jmheap<T extends MyClass> implements JMQueue<Song> {
 
    private Song[] heap;
    private int size;
 
    public Jmheap() {
        heap = new Song[20];
        size = 0;
    }
 
    public void addSong(Song song) {
        if (size >= heap.length) {
            heap = Arrays.copyOf(heap, 2 * heap.length);
        }
        heap[size] = song;
        size++;
        int index = size - 1;
 
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap[parent].compareTo(heap[index]) < 0) {
            	Song temp = heap[parent];
                heap[parent] = heap[index];
                heap[index] = temp;
                index = parent;
            } else {
                return;
            }
        }
    }
 
    public void deleteAll() {
        for (int i = 0; i < size; i++) {
            heap[i] = null;
        }
        size = 0;
    }
 
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
 
    public Song peekSong() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return heap[0];
    }
 
    public void pushSong(Song song) {
        if (size >= heap.length) {
            heap = Arrays.copyOf(heap, 2 * heap.length);
        }
        heap[size] = song;
        size++;
        int index = size - 1;
 
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap[parent].compareTo(heap[index]) < 0) {
            	Song temp = heap[parent];
                heap[parent] = heap[index];
                heap[index] = temp;
                index = parent;
            } else {
                return;
            }
        }
    }
 
    public Song removeSong() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        Song ret = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return ret;
    }
 
    public int size() {
        return size;
    }
 
    public void heapify(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;
        if (left < size && heap[left].compareTo(heap[largest]) > 0) {
            largest = left;
        }
        if (right < size && heap[right].compareTo(heap[largest]) > 0) {
            largest = right;
        }
        if (largest != index) {
            Song temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;
            heapify(largest);
        }
        
    }
    public String toString() {
        StringBuilder x = new StringBuilder();
        x.append("[");
        for (int i = 0; i < size; i++) {
            x.append(heap[i].toString());
            if (i != size - 1) {
                x.append(", ");
            }
        }
        x.append("]");
        return x.toString();
        
    }
    public Iterator<Song> iterator() {
        return new JmheapIterator();
    }

    private class JmheapIterator implements Iterator<Song> {
        private int current = 0;

        public boolean hasNext() {
            return current < size;
        }

        public Song next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return heap[current++];
        }
}
}