package org.c3s.edgo.event.impl;
	
import org.c3s.edgo.event.AbstractJournalEvent;
import org.c3s.edgo.event.impl.beans.DockedBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Docked extends AbstractJournalEvent<DockedBean> {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(LoadGame.class);
	
	{
		beanClass = DockedBean.class;
	}
	
	protected void processBean(DockedBean bean) {
	}

}
	