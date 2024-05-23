package task_10P.task10;


public class Viewinbox {
	private ontrackinfo oinfo;
	
	public String feedbackstatus() {
		return oinfo.feedback();
	}
	
	public String messages() {
		return oinfo.msg();
	}
	public void setontrackinfo(ontrackinfo oinfo) {
		this.oinfo = oinfo;
	}
	
}
