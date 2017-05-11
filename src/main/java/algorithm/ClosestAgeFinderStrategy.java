package algorithm;

public class ClosestAgeFinderStrategy extends AbstractAgeFinder {

	@Override
	protected boolean compareDiff(PersonAgeDiff answer, PersonAgeDiff result) {
		return result.ageDiff < answer.ageDiff;
	}

}
