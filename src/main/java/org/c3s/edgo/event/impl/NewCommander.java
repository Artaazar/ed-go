package org.c3s.edgo.event.impl;
	
import org.c3s.edgo.event.AbstractJournalEvent;
import org.c3s.edgo.event.impl.beans.NewCommanderBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewCommander extends AbstractJournalEvent<NewCommanderBean> {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(LoadGame.class);
	
	{
		beanClass = NewCommanderBean.class;
	}
	
	protected void processBean(NewCommanderBean bean) {
	}

}
	