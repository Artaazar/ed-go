/**
 *  Autogenerated class
 */
package org.c3s.edgo.common.beans;

import java.io.Serializable;
import java.util.*;
import org.c3s.db.beans.DbBean;
import org.c3s.data.annotations.DataSource;
import org.c3s.data.annotations.DataTarget;
import org.c3s.reflection.annotation.*;


public class DBLastPilotInfoBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"loan", "loan"})
	@DataTarget("loan")
	@XMLSimple("loan")
	private java.math.BigInteger loan;
	
	public java.math.BigInteger getLoan() {
		return loan;
	}
	
	public DBLastPilotInfoBean setLoan(java.math.BigInteger value) {
		loan = value;
		return this;
	}
	
	
	@DataSource({"pilot_game_mode_id", "pilotGameModeId"})
	@DataTarget("pilot_game_mode_id")
	@XMLSimple("pilotGameModeId")
	private java.math.BigInteger pilotGameModeId;
	
	public java.math.BigInteger getPilotGameModeId() {
		return pilotGameModeId;
	}
	
	public DBLastPilotInfoBean setPilotGameModeId(java.math.BigInteger value) {
		pilotGameModeId = value;
		return this;
	}
	
	
	@DataSource({"credits", "credits"})
	@DataTarget("credits")
	@XMLSimple("credits")
	private java.math.BigInteger credits;
	
	public java.math.BigInteger getCredits() {
		return credits;
	}
	
	public DBLastPilotInfoBean setCredits(java.math.BigInteger value) {
		credits = value;
		return this;
	}
	
	
	@DataSource({"mode_start", "modeStart"})
	@DataTarget("mode_start")
	@XMLSimple("modeStart")
	private java.sql.Timestamp modeStart;
	
	public java.sql.Timestamp getModeStart() {
		return modeStart;
	}
	
	public DBLastPilotInfoBean setModeStart(java.sql.Timestamp value) {
		modeStart = value;
		return this;
	}
	
	
	@DataSource({"game_mode", "gameMode"})
	@DataTarget("game_mode")
	@XMLSimple("gameMode")
	private java.lang.String gameMode;
	
	public java.lang.String getGameMode() {
		return gameMode;
	}
	
	public DBLastPilotInfoBean setGameMode(java.lang.String value) {
		gameMode = value;
		return this;
	}
	
	
	@DataSource({"mode_end", "modeEnd"})
	@DataTarget("mode_end")
	@XMLSimple("modeEnd")
	private java.sql.Timestamp modeEnd;
	
	public java.sql.Timestamp getModeEnd() {
		return modeEnd;
	}
	
	public DBLastPilotInfoBean setModeEnd(java.sql.Timestamp value) {
		modeEnd = value;
		return this;
	}
	
	
	@DataSource({"pilot_id", "pilotId"})
	@DataTarget("pilot_id")
	@XMLSimple("pilotId")
	private java.lang.Long pilotId;
	
	public java.lang.Long getPilotId() {
		return pilotId;
	}
	
	public DBLastPilotInfoBean setPilotId(java.lang.Long value) {
		pilotId = value;
		return this;
	}
	
	
	@DataSource({"game_mode_id", "gameModeId"})
	@DataTarget("game_mode_id")
	@XMLSimple("gameModeId")
	private java.lang.Long gameModeId;
	
	public java.lang.Long getGameModeId() {
		return gameModeId;
	}
	
	public DBLastPilotInfoBean setGameModeId(java.lang.Long value) {
		gameModeId = value;
		return this;
	}
	
	
	@DataSource({"game_group", "gameGroup"})
	@DataTarget("game_group")
	@XMLSimple("gameGroup")
	private java.lang.String gameGroup;
	
	public java.lang.String getGameGroup() {
		return gameGroup;
	}
	
	public DBLastPilotInfoBean setGameGroup(java.lang.String value) {
		gameGroup = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
		setPilotGameModeId(new java.math.BigInteger(value.toString()));
		
	}	
	
}