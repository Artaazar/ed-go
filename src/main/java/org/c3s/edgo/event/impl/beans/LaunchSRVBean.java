package org.c3s.edgo.event.impl.beans;

import java.util.Date;

import org.c3s.edgo.event.AbstractEventBean;

public class LaunchSRVBean extends AbstractEventBean {

	private Date timestamp;
	private String event;
	/**
	 * 
	 */
	private String Loadout;

	/**
	 * @return
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * @param event
	 */
	public void setEvent(String event) {
		this.event = event;
	}

	/**
	 * @return
	 */
	public String getLoadout() {
		return Loadout;
	}

	/**
	 * @param loadout
	 */
	public void setLoadout(String loadout) {
		this.Loadout = loadout;
	}

}
