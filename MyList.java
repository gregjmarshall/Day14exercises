/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gmarsh03
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class MyList {
    
    private List<Integer> list = new ArrayList<Integer>();
    
    public void add(Integer a) {
        list.add(a);
    }
    public boolean contains(Integer element){
        
        List<Integer> testList = list;
        Collections.sort(testList);
        if (testList.size() == 0){
            return false;
        }
        if (element == testList.get(testList.size()/2)) {
            return true;
        }
        else if (element > testList.get(testList.size()/2)) {
            testList = testList.subList(testList.size()/2, testList.size());
            return testList.contains(element); 
        }
        else {
            testList = testList.subList(0, testList.size()/2);
            return testList.contains(element);
        }
        
        
    }
    
    public List<Integer> mergeSort() {
        
        List<Integer> resultList = new ArrayList<Integer>();
        List<Integer> testList = list;
        if (list.isEmpty() || list.size() == 1){
            System.out.println("List is only " + list.size() + " element(s) long and doesn't need sorting.");
        }
        else {
            List<Integer> listHalf1 = testList.subList(0,testList.size()/2);
            List<Integer> listHalf2 = testList.subList((testList.size() / 2), testList.size());
            Collections.sort(listHalf1);
            Collections.sort(listHalf2);
            int half1 = 0, half2 = 0;
            System.out.println(listHalf1);
            System.out.println(listHalf2);
            while(half1 < listHalf1.size() || half2 < listHalf2.size()) {
                if (half1 < listHalf1.size() && half2 == listHalf2.size()) {
                    resultList.add(listHalf1.get(half1));
                    half1++;
                }
                else if(half2< listHalf2.size() && half1 == listHalf1.size()) {
                    resultList.add(listHalf2.get(half2));
                    half2++;
                }
                else if(listHalf1.get(half1) > listHalf2.get(half2)) {
                    resultList.add(listHalf2.get(half2));
                    half2++;
                }
                else {
                    resultList.add(listHalf1.get(half1));
                    half1++;
                }
            }
        }
        return resultList;
    }
    public static void main(String[] args) {
        MyList testList = new MyList();
         testList.add(5);
         testList.add(7);
         testList.add(8);
         testList.add(3);
         testList.add(2);
         testList.add(1);
         testList.add(4);
         testList.add(6);
         List<Integer> resultList = testList.mergeSort();
         String result = resultList.toString();
         System.out.println(result);
    }
    
}
