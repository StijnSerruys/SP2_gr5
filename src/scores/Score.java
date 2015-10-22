package scores;

public class Score {
	public Score(int id, int quizID, String resultaat) {
		super();
		this.id = id;
		this.quizID = quizID;
		this.resultaat = resultaat;
	}
	private int id, quizID;
	/*Array strings voor resultaten ?*/
	private String resultaat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuizID() {
		return quizID;
	}
	public void setQuizID(int quizID) {
		this.quizID = quizID;
	}
	public String getResultaat() {
		return resultaat;
	}
	public void setResultaat(String resultaat) {
		this.resultaat = resultaat;
	}
}
