package algorithm;

import java.util.List;

public class Finder {
	private final List<Person> persons;
	private IAgeFinderStrategy ageFinderStrategy;

	public Finder(List<Person> persons, IAgeFinderStrategy ageFinderStrategy) {
		this.persons = persons;
		this.ageFinderStrategy = ageFinderStrategy;
	}

	public PersonAgeDiff Find() {
		return ageFinderStrategy.find(persons);
	}
}
