package source;

public class Score {
	public Score(int id, int quizID, String result) {
		super();
		this.id = id;
		this.quizID = quizID;
		this.result = result;
	}
	private int id, quizID;
	/*Array strings voor resultaten ?*/
	private String result;
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
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
