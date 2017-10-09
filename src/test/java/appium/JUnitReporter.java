package test.java.appium;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class JUnitReporter {
	@Rule
	public TestRule junitWatcher = new TestWatcher() {

		@Override
		public Statement apply(Statement base, Description description) {
			return super.apply(base, description);
		}

		@Override
		protected void succeeded(Description description) {
			System.out.println(description.getDisplayName() + " "
					+ "Test Passed!");
		}

		@Override
		protected void failed(Throwable e, Description description) {
			System.out.println(description.getDisplayName() + " "
					+ e.getClass().getSimpleName());
		}
	};

}
