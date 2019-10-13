class ArrayMax{
public static void main(String args[])
{
int a[]={10,2, 3, 4, 5};
int max=a[0],min=a[0];
for(int i=1;i<a.length;i++)
{ if(a[i]>max)
  max=a[i];
 if(a[i]<min)
   min=a[i];
}
class Simple{  
    public static void main(String args[]){  
     System.out.println("result of max and min calculated");  
    }  
}    
System.out.println("Max is"+max);
System.out.println("Min is"+min);
}
}


import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
  
public class GFG { 
  
    // function to find minimum value in an unsorted 
    // list in Java using Collection 
    public static Integer findMin(List<Integer> list) 
    { 
  
        // check list is empty or not 
        if (list == null || list.size() == 0) { 
            return Integer.MAX_VALUE; 
        } 
  
        // create a new list to avoid modification  
        // in the original list 
        List<Integer> sortedlist = new ArrayList<>(list); 
  
        // sort list in natural order 
        Collections.sort(sortedlist); 
  
        // first element in the sorted list 
        // would be minimum 
        return sortedlist.get(0); 
    } 
  
    
