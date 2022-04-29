package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ordersandwords {
	public String wordscheck(String st,char character)
	{
		String[] words=st.split("\\s");
		String ORDER;
		StringBuilder s=new StringBuilder();
		char[] ch=new char[26];
		char c=character;
		for(int i=0;i<26;i++)
		{
			if(c=='z')
			{
			ch[i]=c;
			c='a';
			}
			else
			{
			ch[i]=c;
			++c;
			}
			s.append(ch[i]);
		}
		ORDER=s.toString();
		
		Arrays.sort(words, new Comparator<String>() {

		    @Override
		    public int compare(String o1, String o2) {
		       return ORDER.indexOf(o1.charAt(0)) -  ORDER.indexOf(o2.charAt(0)) ;
		    }
		});
		StringBuilder st1=new StringBuilder();
		for(int i=0;i<words.length;i++)
		{
			st1.append(words[i]);
			st1.append(" ");
		}
		
		return st1.toString().trim();
	}
	
	@Test
	public void test2()
	{
		String s="please accept my offer";
		char c='h';
		Assert.assertEquals(wordscheck(s,c),"my offer please accept");
	}
}
