package org.c3s.edgo.event.impl.beans;

import java.util.Date;

import org.c3s.edgo.event.AbstractEventBean;

public class PowerplayCollectBean extends AbstractEventBean {

	private Date timestamp;
	private String event;
	/**
	 * name of power
	 */
	private String Power;
	/**
	 * type of commodity
	 */
	private String Type;
	/**
	 * number of units
	 */
	private String Count;

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
	public String getPower() {
		return Power;
	}

	/**
	 * @param power
	 */
	public void setPower(String power) {
		this.Power = power;
	}

	/**
	 * @return
	 */
	public String getType() {
		return Type;
	}

	/**
	 * @param type
	 */
	public void setType(String type) {
		this.Type = type;
	}

	/**
	 * @return
	 */
	public String getCount() {
		return Count;
	}

	/**
	 * @param count
	 */
	public void setCount(String count) {
		this.Count = count;
	}

}
