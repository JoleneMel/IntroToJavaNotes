package week4VidsCurriculum;

import java.util.ArrayList;

public class example {
	   public static void main(String[] args) {
		      ArrayList<String> list = new ArrayList<String>();
		      list.add("firstName");
		      list.add("middleName");
		      list.add("lastName");

		      StringBuffer sb = new StringBuffer();

		      for (String s : list) {
		         sb.append(s);
		         sb.append("\t");
		      }

		      System.out.println(sb.toString());
		   }
		}