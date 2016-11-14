package org.c3s.edgo.event.impl;
	
import org.c3s.edgo.event.AbstractJournalEvent;
import org.c3s.edgo.event.impl.beans.CrewFireBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrewFire extends AbstractJournalEvent<CrewFireBean> {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(LoadGame.class);
	
	{
		beanClass = CrewFireBean.class;
	}
	
	protected void processBean(CrewFireBean bean) {
	}

}
	