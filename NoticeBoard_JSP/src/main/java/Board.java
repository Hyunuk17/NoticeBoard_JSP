import java.util.Date;

// Board 데이터를 담을 객체 생성
public class Board {
	private int id;
	private String title;
	private String writer;
	private Date regDate;
	private int views;
	private String content;

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int id, String title, String writer, Date regDate, int views, String content) {

		this.id = id;
		this.title = title;
		this.writer = writer;
		this.regDate = regDate;
		this.views = views;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", writer=" + writer + ", regDate=" + regDate + ", views=" + views + ", content=" + content + "]";
	}

}
