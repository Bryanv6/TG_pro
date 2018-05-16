package com.gator.seq;

public class SequenceService {
	
	private static TemplateDao dao = new SequenceDaoImp();
	
	private SequenceService() {}
	
	public static Boolean insert(String str) {
		
		return dao.insert(str);

	}
	
	public static Integer getLast() {
		
		return dao.getLast();
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(getLast());
		System.out.println(insert("testinmain"));
		System.out.println(getLast());
		
	}
	

}
