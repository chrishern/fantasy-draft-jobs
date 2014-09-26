package net.blackcat.fantasy.draft.job.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider implements ApplicationContextAware {
	
	private static ApplicationContext context;

	@SuppressWarnings("static-access")
	@Override
	public void setApplicationContext(final ApplicationContext context) throws BeansException {
		this.context = context;
	}

	public static ApplicationContext getApplicationContext() {
		return context;
	}
}