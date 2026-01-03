package Linked_List_Examples;



import java.util.LinkedList;
import java.util.Scanner;

class Pnode
{
    int power;
    float co;
    Pnode(float co,int power)
    {
        this.co=co;
        this.power=power;
    }
}

public class Polynomial_Addition {

	

	
	    public static void main(String[] args) {
	        LinkedList<Pnode> list1= new LinkedList<>();
	        Scanner in=new Scanner(System.in);
	        System.out.print("\nEnter highest power:");
	        int hp=in.nextInt();
	        for(int i=hp;i>=0;i--)
	        {
	            System.out.print("\nEnter coefficient for power:"+i+":");
	            float co=in.nextFloat();
	            if(co!=0)
	            {
	                list1.add(new Pnode(co,i));
	            }
	        }
	        for(Pnode item:list1)
	        {
	            System.out.print(item.co+"X ^"+item.power+" + ");
	        }

	        LinkedList<Pnode> list2= new LinkedList<>();
	        System.out.print("\nEnter highest power:");
	        hp=in.nextInt();
	        for(int i=hp;i>=0;i--)
	        {
	            System.out.print("\nEnter coefficient for power:"+i+":");
	            float co=in.nextFloat();
	            if(co!=0)
	            {
	                list2.add(new Pnode(co,i));
	            }
	        }
	        for(Pnode item:list2)
	        {
	            System.out.print(item.co+"X ^"+item.power+" + ");
	        }

	        //addition
	        LinkedList<Pnode> ans=new LinkedList<>();
	        for(int i1=0,i2=0;i1<list1.size() && i2< list2.size();) {
	            Pnode e1 = list1.get(i1);
	            Pnode e2 = list2.get(i2);
	            if (e1.power == e2.power) {
	                ans.add(new Pnode(e1.co + e2.co, e1.power));
	                i1++;
	                i2++;
	            }
	            else if (e1.power > e2.power) {
	                ans.add(e1);
	                i1++;
	            } else {
	                ans.add(e2);
	                i2++;
	            }
	        }

	        for(Pnode item:ans)
	        {
	            System.out.print(item.co+"X ^"+item.power+" + ");
	        }
	    }
	}

	

