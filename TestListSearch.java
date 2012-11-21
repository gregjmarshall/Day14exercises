/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gmarsh03
 */
import java.util.List;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Collections;
public class TestListSearch {
    
    @Test
    public void searchTest() {
        
        MyList testList = new MyList();
        for(int i = 0; i < 200 ; i += 5) {
        testList.add(i);  
        }
        boolean output = testList.contains(100);
        boolean expected = true;
        assertEquals(expected, output); 
    }
    
    @Test
    public void sortTest() {
         MyList testList = new MyList();
         testList.add(2);
         testList.add(1);
         testList.add(6);
         testList.add(5);
         testList.add(8);
         testList.add(9);
         testList.add(12);
         testList.add(11);
         List<Integer> resultList = testList.mergeSort();
         String result = resultList.toString();
         String expected = "1,2,5,6,8,9,11,12";
         assertEquals(expected, result);
         
         
        
    }
    
}
