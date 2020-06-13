package com.uma.builderdesignpattern;

public class Test {
	
	public static void main(String[] args) {
        Task task = new TaskBuilder(3l).setSummary("Test").build();
        System.out.println(task.toString());
    }

}
