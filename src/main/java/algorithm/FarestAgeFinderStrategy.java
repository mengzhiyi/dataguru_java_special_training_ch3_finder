package algorithm;

public class FarestAgeFinderStrategy extends AbstractAgeFinder {

	@Override
	protected boolean compareDiff(PersonAgeDiff answer, PersonAgeDiff result) {
		return result.ageDiff > answer.ageDiff;
	}

}
