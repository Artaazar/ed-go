package org.c3s.edgo.event.impl;
	
import org.c3s.edgo.event.AbstractJournalEvent;
import org.c3s.edgo.event.impl.beans.LiftoffBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Liftoff extends AbstractJournalEvent<LiftoffBean> {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(LoadGame.class);
	
	{
		beanClass = LiftoffBean.class;
	}
	
	protected void processBean(LiftoffBean bean) {
	}

}
	