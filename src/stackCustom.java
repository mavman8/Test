import java.util.*;

public class stackCustom {
    public List<Integer> arr;

    public stackCustom() {
        arr = new ArrayList<>();
    }

    public void push(int data){
        arr.add(data);
    }

    public boolean isEmpty(){

        return arr.isEmpty();
    }

    public int top(){
        return arr.get(arr.size() -1);
    }

    public int pop(){
        /*if(isEmpty()){
            return false;
        }*/

        System.out.println("test");
        int last = top();
        arr.remove(arr.size() - 1);
        return last;
    }

    public int size(){
        return arr.size();
    }
}
