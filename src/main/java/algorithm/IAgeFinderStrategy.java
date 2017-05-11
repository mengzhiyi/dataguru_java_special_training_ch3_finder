package algorithm;

import java.util.List;

public interface IAgeFinderStrategy {
	public PersonAgeDiff find(List<Person> persons);
}
