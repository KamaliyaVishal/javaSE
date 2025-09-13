package com.miiniprojects.onlinequizsystem;

public interface Quiz
{
	void start();

	void submitAnswer(int questionIndex, String answer);

	void showResults();
}