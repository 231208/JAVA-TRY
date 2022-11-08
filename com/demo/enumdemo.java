package com.demo;

public class enumdemo
{
	public enum days {MONDAY(0),TUESDAY(1),WEDNESDAY(2),THURSDAY(3),FRIDAY(4),SATURDAY(5),SUNDAY(6);
		int dayindex;
		days(int name)
		{
			this.dayindex=name;
		}
		public int getdayindex()
		{
			return dayindex;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(days.MONDAY.getdayindex());
		System.out.println(days.TUESDAY);
		

	}

}
