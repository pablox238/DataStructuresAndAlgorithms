package data_strucutres.arrays;

import java.util.Arrays;

public class MyArray{
    private int length;
    private Object[] data;

    MyArray(){
        this.length=0;
        this.data= new Object[1];
    }

    public Object get(int index){
        return this.data[index];
    }

    public void push(Object element){
        if(data.length == length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        this.data[length]=element;
        this.length++;
    }

    public Object pop(){
        Object lastItem = this.data[length-1];
        this.data[length-1]=null;
        this.length--;
        return lastItem;
    }

    public Object delete(int index){
        Object itemDeleted = this.data[index];
        shiftItems(index);
        return itemDeleted;

    }
    private void shiftItems(int index){
        for (int i = index; i < this.length-1; i++) {
            data[i]= data[i+1];
        }
        data[length-1] = null;
        length--;
    }


    public static void main(String[] args) {
        MyArray m = new MyArray();
        m.push("Hello");
        m.push("World");
        m.pop();
        m.push("World1");
        m.push("World2");
        m.push("World3");
        m.delete(2);
        for (int i = 0; i < m.length; i++) {
          System.out.println(m.get(i));
        }
      }

}