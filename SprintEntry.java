package stir.ae;

public class SprintEntry extends Entry{
	int repetitions;
	int recovery;
	//"Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2
	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist,
			int repetitions, int recovery) {
		super(n, d, m, y, h, min, s, dist);
		this.repetitions = repetitions;
		this.recovery = recovery;
	}
	
	/**
	 * @return the repetitions
	 */
	public int getRepetitions() {
		return repetitions;
	}

	/**
	 * @param repetitions the repetitions to set
	 */
	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}

	/**
	 * @return the recovery
	 */
	public int getRecovery() {
		return recovery;
	}

	/**
	 * @param recovery the recovery to set
	 */
	public void setRecovery(int recovery) {
		this.recovery = recovery;
	}
	
	//	"Alice sprinted 4x300m in 0:16:7 with 2 minutes recovery on 1/2/2003\n"
	
	public String getEntry () {
		   String result = getName()+" sprinted " + getRepetitions()
		   			 + "x" +getDistance() + "m in " +
		             +getHour()+":"+getMin()+":"+ getSec() + " with " + getRecovery() + 
		             " minutes recovery on " +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
		   return result;
		  } //getEntry
}
