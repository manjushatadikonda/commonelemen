package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class commonelementsinarray {
public List<Integer> check(Integer[] a, Integer[] b)
{
	List<Integer> list=new ArrayList<Integer>();
	List<Integer> alist=new ArrayList<Integer>();
	List<Integer> blist=new ArrayList<Integer>();
	Collections.addAll(alist, a);
	Collections.addAll(blist, b);
	if(a.length>b.length)
	{
		for(int i=0;i<alist.size();i++)
		{
			for(int j=0;j<blist.size();j++)
			{
				if(alist.get(i)==blist.get(j))
				{
					Integer k=alist.get(i);
					list.add(k);
					alist.remove(k);
					blist.remove(k);
					i=i-1;
					break;
				}
		
			}
			
		}
	}
	else
	{
		for(int i=0;i<blist.size();i++)
		{
			for(int j=0;j<alist.size();j++)
			{
				if(blist.get(i)==alist.get(j))
				{
					Integer k=blist.get(i);
					list.add(k);
					alist.remove(k);
					blist.remove(k);
					i=i-1;
					break;
				}
		
			}
			
		}
	}
	
	return list;
}
@Test
public void test1()
{
	Integer[] a= {1,2,2,3,3,4};
	Integer[] b= {2,2,3,3,4};
	Assert.assertEquals(check(a,b).size(),5);
}
}
