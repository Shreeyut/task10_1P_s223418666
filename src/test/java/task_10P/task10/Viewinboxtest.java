package task_10P.task10;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;




public class Viewinboxtest {
	@Test
	public void testfeedbackstatus() {
		ontrackinfo oninfo = Mockito.mock(ontrackinfo.class);
		Mockito.when(oninfo.feedback()).thenReturn("completed");
		
		Viewinbox views= new Viewinbox();
		views.setontrackinfo(oninfo);
		String tutorfeedback = views.feedbackstatus();
		Assert.assertEquals("completed", tutorfeedback);
	}
	
	@Test
	public void testviewmessages() {
		ontrackinfo oninfo = Mockito.mock(ontrackinfo.class);
		Mockito.when(oninfo.msg()).thenReturn("Well done");
		
		Viewinbox views= new Viewinbox();
		views.setontrackinfo(oninfo);
		String tutormessages = views.messages();
		Assert.assertEquals("Well done", tutormessages);
	}
}
