package algorithm;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAgeFinder implements IAgeFinderStrategy {

	@Override
	public final PersonAgeDiff find(List<Person> persons) {
		List<PersonAgeDiff> ageDiffList = new ArrayList<PersonAgeDiff>();

		for (int i = 0; i < persons.size() - 1; i++) {
			for (int j = i + 1; j < persons.size(); j++) {
				PersonAgeDiff ageDiff = new PersonAgeDiff();
				if (persons.get(i).ageDiffWith(persons.get(j)) < 0) {
					ageDiff.person1 = persons.get(i);
					ageDiff.person2 = persons.get(j);
				} else {
					ageDiff.person1 = persons.get(j);
					ageDiff.person2 = persons.get(i);
				}
				ageDiff.calcAgeDiff();
				ageDiffList.add(ageDiff);
			}
		}

		if (ageDiffList.size() < 1) {
			return new PersonAgeDiff();
		}

		PersonAgeDiff answer = ageDiffList.get(0);
		for (PersonAgeDiff result : ageDiffList) {
			if (compareDiff(answer, result)) {
				answer = result;
			}
		}

		return answer;
	}

	protected abstract boolean compareDiff(PersonAgeDiff answer, PersonAgeDiff result);

}
