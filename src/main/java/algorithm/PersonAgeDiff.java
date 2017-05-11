package algorithm;
public class PersonAgeDiff {
	public Person person1;
	public Person person2;
	public long ageDiff;
	
	public void calcAgeDiff(){
		ageDiff = person2.ageDiffWith(person1);
	}
}
