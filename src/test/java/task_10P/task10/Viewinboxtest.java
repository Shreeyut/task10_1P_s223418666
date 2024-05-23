package task_10P.task10;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;



public class Viewinboxtest {
	@Test
	public void testfeedbackstatus() {
		Assert.assertEquals("completed", Viewinbox.feedbackstatus());
	}
}
