package collection_1;
import java.util.*;
public class collection_class{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
      ArrayList<String> al = new ArrayList<String>(Arrays.asList("A","B","p","c","d","c","D","Z","E","F","G"));
     Implentation obj=new Implentation();
     while(true){
         System.out.println("enter choice 1.add 2.search,3.remove,4.print,5.exit");
         int a=s.nextInt();
         if(a==1){
          System.out.println("please enter element to be added");
          String s1=s.next();
          obj.append(s1,al);
         }
         else if(a==2){
            System.out.println("please enter element to be searched");
            String s2=s.next();
            obj.search(s2,al);
         }
        else if(a==3){
            System.out.println(al);
          System.out.println("please enter index of element to be removed from above list"); 
          int s3=s.nextInt();
          obj.remov(s3,al);
        }
        else if(a==4){
            obj.printing(al);
        }
        else{
            System.out.println("exited");
        break;
        }
     }
    }
}
    class Implentation{
        void append(String a,ArrayList al){
            al.add(a);
            System.out.println("after adding element list is"+al);
        }
        void search(String a,ArrayList al){
           boolean t=al.contains(a);
             System.out.println("element found "+t);
        }
        void remov(int index,ArrayList al){
           al.remove(index); 
           System.out.println("after removing element list is"+al);
        }
        void printing(ArrayList al){
            System.out.println("elements in list are"+al);
        }
    }
