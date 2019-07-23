/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import data.ObjetoCeleste;
import java.util.ArrayList;

/**
 *
 * @author Gaia F. Braccia
 */
public class MaxHeap{

    private ArrayList<ObjetoCeleste> list;
    private boolean tipo;

    public MaxHeap(boolean tipo) {

        this.list = new ArrayList<ObjetoCeleste>();
        this.tipo=tipo;
    }

    public MaxHeap(ArrayList<ObjetoCeleste> items) {

        this.list = items;
        buildHeap();
    }

    public void insert(ObjetoCeleste item) {

        list.add(item);
        int i = list.size() - 1;
        int parent = parent(i);

        if(this.tipo){
           while (parent != i && Double.parseDouble(list.get(i).getMagnitud()) > Double.parseDouble( list.get(parent).getMagnitud())) {

            swap(i, parent);
            i = parent;
            parent = parent(i);
            } 
        } else {
            while (parent != i && Double.parseDouble(list.get(i).getDistancia()) > Double.parseDouble( list.get(parent).getDistancia())) {

            swap(i, parent);
            i = parent;
            parent = parent(i);
            } 
        }
        
        
    }

    public void buildHeap() {

        for (int i = list.size() / 2; i >= 0; i--) {
            minHeapify(i);
        }
    }

    public ObjetoCeleste remove() {

        if (list.size() == 0) {

            throw new IllegalStateException("MinHeap is EMPTY");
        } else if (list.size() == 1) {

            ObjetoCeleste min = list.remove(0);
            return min;
        }

        // remove the last item ,and set it as new root
        ObjetoCeleste min = list.get(0);
        ObjetoCeleste lastItem = list.remove(list.size() - 1);
        list.set(0, lastItem);

        // bubble-down until heap property is maintained
        minHeapify(0);

        // return min key
        return min;
    }

//    public void decreaseKey(int i, ObjetoCeleste key) {
//
//        if (list.get(i) < key) {
//
//            throw new IllegalArgumentException("Key is larger than the original key");
//        }
//
//        list.set(i, key);
//        int parent = parent(i);
//
//        // bubble-up until heap property is maintained
//        while (i > 0 && list.get(parent) < list.get(i)) {
//
//            swap(i, parent);
//            i = parent;
//            parent = parent(parent);
//        }
//    }

    private void minHeapify(int i) {

        int left = left(i);
        int right = right(i);
        int smallest = -1;
        if(this.tipo){
            // find the smallest key between current node and its children.
            if (left <= list.size() - 1 && Double.parseDouble(list.get(left).getMagnitud()) > Double.parseDouble(list.get(i).getMagnitud())) {
                smallest = left;
            } else {
                smallest = i;
            }

            if (right <= list.size() - 1 && Double.parseDouble(list.get(right).getMagnitud()) > Double.parseDouble(list.get(smallest).getMagnitud())) {
                smallest = right;
            }

            // if the smallest key is not the current key then bubble-down it.
            if (smallest != i) {

                swap(i, smallest);
                minHeapify(smallest);
            }
        }else{
            // find the smallest key between current node and its children.
            if (left <= list.size() - 1 && Double.parseDouble(list.get(left).getDistancia()) > Double.parseDouble(list.get(i).getDistancia())) {
                smallest = left;
            } else {
                smallest = i;
            }

            if (right <= list.size() - 1 && Double.parseDouble(list.get(right).getDistancia()) > Double.parseDouble(list.get(smallest).getDistancia())) {
                smallest = right;
            }

            // if the smallest key is not the current key then bubble-down it.
            if (smallest != i) {

                swap(i, smallest);
                minHeapify(smallest);
            }
        }
        
    }

    public ObjetoCeleste getMin() {

        return list.get(0);
    }

    public boolean isEmpty() {

        return list.size() == 0;
    }

    private int right(int i) {

        return 2 * i + 2;
    }

    private int left(int i) {

        return 2 * i + 1;
    }

    private int parent(int i) {

        if (i % 2 == 1) {
            return i / 2;
        }

        return (i - 1) / 2;
    }

    

    private void swap(int i, int parent) {

        ObjetoCeleste temp = list.get(parent);
        list.set(parent, list.get(i));
        list.set(i, temp);
    }

    private ObjetoCeleste peek(){
        return list.get(0);
    }

    public int getSize(){
        return list.size();
    }
}
