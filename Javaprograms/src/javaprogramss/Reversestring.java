package javaprogramss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reversestring {
public static void main (String args[]){
		
		//using StringBuffer/builder
	/*String given="Madhavi";
StringBuffer s=new StringBuffer();
  s.append(given);
  System.out.println(s.reverse());
}
}*/
//using own logic

/*String given="Madhavi";
char[] arr=given.toCharArray();
String reversed="";
System.out.println(arr.length);
for(int i=arr.length-1;i>=0;i--) {
reversed=reversed+arr[i];
}
System.out.println(reversed); 
}
}
*/
//using collections
	
String given="Madhavi";
char[] arr=given.toCharArray();
List<Character> list=new ArrayList<Character> ();
for (Character character : arr) {
list.add(character);
}
Collections.reverse(list);
ListIterator ll=list.listIterator();
while(ll.hasNext()){
System.out.println(ll.next());
}
}
}