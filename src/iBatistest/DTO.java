package iBatistest;

public class DTO {
	private String ename;
	private String job;
	private String sal;

	public DTO() {
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public DTO(String ename, String job, String sal) {
		super();
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
}
