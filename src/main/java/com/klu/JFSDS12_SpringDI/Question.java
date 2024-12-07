package com.klu.JFSDS12_SpringDI;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int qid;
	private String qname;
	List<String> answers;
	
	public Question(int qid, String qname,List<String> answers) {
		this.qid=qid;
		this.qname=qname;
		this.answers=answers;
	}

	public int getQid() {
		return qid;
	}

	public String getQname() {
		return qname;
	}

	public List<String> getAnswers() {
		return answers;
	}
	
	
	void display() {
		System.out.println("The answers are");
		Iterator i = answers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
	

}
