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


public class DBBodiesBean implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;


	
	@DataSource({"ring_class", "ringClass"})
	@DataTarget("ring_class")
	@XMLSimple("ringClass")
	private java.lang.String ringClass;
	
	public java.lang.String getRingClass() {
		return ringClass;
	}
	
	public DBBodiesBean setRingClass(java.lang.String value) {
		this.ringClass = value;
		return this;
	}
	
	
	@DataSource({"surface_pressure", "surfacePressure"})
	@DataTarget("surface_pressure")
	@XMLSimple("surfacePressure")
	private java.lang.Float surfacePressure;
	
	public java.lang.Float getSurfacePressure() {
		return surfacePressure;
	}
	
	public DBBodiesBean setSurfacePressure(java.lang.Float value) {
		this.surfacePressure = value;
		return this;
	}
	
	
	@DataSource({"mass_em", "massEm"})
	@DataTarget("mass_em")
	@XMLSimple("massEm")
	private java.lang.Float massEm;
	
	public java.lang.Float getMassEm() {
		return massEm;
	}
	
	public DBBodiesBean setMassEm(java.lang.Float value) {
		this.massEm = value;
		return this;
	}
	
	
	@DataSource({"orbital_inclination", "orbitalInclination"})
	@DataTarget("orbital_inclination")
	@XMLSimple("orbitalInclination")
	private java.lang.Float orbitalInclination;
	
	public java.lang.Float getOrbitalInclination() {
		return orbitalInclination;
	}
	
	public DBBodiesBean setOrbitalInclination(java.lang.Float value) {
		this.orbitalInclination = value;
		return this;
	}
	
	
	@DataSource({"mass_mt", "massMt"})
	@DataTarget("mass_mt")
	@XMLSimple("massMt")
	private java.lang.Float massMt;
	
	public java.lang.Float getMassMt() {
		return massMt;
	}
	
	public DBBodiesBean setMassMt(java.lang.Float value) {
		this.massMt = value;
		return this;
	}
	
	
	@DataSource({"volc_class_id", "volcClassId"})
	@DataTarget("volc_class_id")
	@XMLSimple("volcClassId")
	private java.lang.Long volcClassId;
	
	public java.lang.Long getVolcClassId() {
		return volcClassId;
	}
	
	public DBBodiesBean setVolcClassId(java.lang.Long value) {
		this.volcClassId = value;
		return this;
	}
	
	
	@DataSource({"terraform_state", "terraformState"})
	@DataTarget("terraform_state")
	@XMLSimple("terraformState")
	private java.lang.String terraformState;
	
	public java.lang.String getTerraformState() {
		return terraformState;
	}
	
	public DBBodiesBean setTerraformState(java.lang.String value) {
		this.terraformState = value;
		return this;
	}
	
	
	@DataSource({"body_type_id", "bodyTypeId"})
	@DataTarget("body_type_id")
	@XMLSimple("bodyTypeId")
	private java.lang.Long bodyTypeId;
	
	public java.lang.Long getBodyTypeId() {
		return bodyTypeId;
	}
	
	public DBBodiesBean setBodyTypeId(java.lang.Long value) {
		this.bodyTypeId = value;
		return this;
	}
	
	
	@DataSource({"age_my", "ageMy"})
	@DataTarget("age_my")
	@XMLSimple("ageMy")
	private java.lang.Long ageMy;
	
	public java.lang.Long getAgeMy() {
		return ageMy;
	}
	
	public DBBodiesBean setAgeMy(java.lang.Long value) {
		this.ageMy = value;
		return this;
	}
	
	
	@DataSource({"surface_temperature", "surfaceTemperature"})
	@DataTarget("surface_temperature")
	@XMLSimple("surfaceTemperature")
	private java.lang.Float surfaceTemperature;
	
	public java.lang.Float getSurfaceTemperature() {
		return surfaceTemperature;
	}
	
	public DBBodiesBean setSurfaceTemperature(java.lang.Float value) {
		this.surfaceTemperature = value;
		return this;
	}
	
	
	@DataSource({"body_uniq", "bodyUniq"})
	@DataTarget("body_uniq")
	@XMLSimple("bodyUniq")
	private java.lang.String bodyUniq;
	
	public java.lang.String getBodyUniq() {
		return bodyUniq;
	}
	
	public DBBodiesBean setBodyUniq(java.lang.String value) {
		this.bodyUniq = value;
		return this;
	}
	
	
	@DataSource({"eddb_body_id", "eddbBodyId"})
	@DataTarget("eddb_body_id")
	@XMLSimple("eddbBodyId")
	private java.math.BigInteger eddbBodyId;
	
	public java.math.BigInteger getEddbBodyId() {
		return eddbBodyId;
	}
	
	public DBBodiesBean setEddbBodyId(java.math.BigInteger value) {
		this.eddbBodyId = value;
		return this;
	}
	
	
	@DataSource({"semi_major_axis", "semiMajorAxis"})
	@DataTarget("semi_major_axis")
	@XMLSimple("semiMajorAxis")
	private java.lang.Float semiMajorAxis;
	
	public java.lang.Float getSemiMajorAxis() {
		return semiMajorAxis;
	}
	
	public DBBodiesBean setSemiMajorAxis(java.lang.Float value) {
		this.semiMajorAxis = value;
		return this;
	}
	
	
	@DataSource({"orbital_period", "orbitalPeriod"})
	@DataTarget("orbital_period")
	@XMLSimple("orbitalPeriod")
	private java.lang.Float orbitalPeriod;
	
	public java.lang.Float getOrbitalPeriod() {
		return orbitalPeriod;
	}
	
	public DBBodiesBean setOrbitalPeriod(java.lang.Float value) {
		this.orbitalPeriod = value;
		return this;
	}
	
	
	@DataSource({"tidal_lock", "tidalLock"})
	@DataTarget("tidal_lock")
	@XMLSimple("tidalLock")
	private java.lang.Integer tidalLock;
	
	public java.lang.Integer getTidalLock() {
		return tidalLock;
	}
	
	public DBBodiesBean setTidalLock(java.lang.Integer value) {
		this.tidalLock = value;
		return this;
	}
	
	
	@DataSource({"surface_gravity", "surfaceGravity"})
	@DataTarget("surface_gravity")
	@XMLSimple("surfaceGravity")
	private java.lang.Float surfaceGravity;
	
	public java.lang.Float getSurfaceGravity() {
		return surfaceGravity;
	}
	
	public DBBodiesBean setSurfaceGravity(java.lang.Float value) {
		this.surfaceGravity = value;
		return this;
	}
	
	
	@DataSource({"landable", "landable"})
	@DataTarget("landable")
	@XMLSimple("landable")
	private java.lang.Integer landable;
	
	public java.lang.Integer getLandable() {
		return landable;
	}
	
	public DBBodiesBean setLandable(java.lang.Integer value) {
		this.landable = value;
		return this;
	}
	
	
	@DataSource({"radius", "radius"})
	@DataTarget("radius")
	@XMLSimple("radius")
	private java.lang.Float radius;
	
	public java.lang.Float getRadius() {
		return radius;
	}
	
	public DBBodiesBean setRadius(java.lang.Float value) {
		this.radius = value;
		return this;
	}
	
	
	@DataSource({"body_id", "bodyId"})
	@DataTarget("body_id")
	@XMLSimple("bodyId")
	private java.math.BigInteger bodyId;
	
	public java.math.BigInteger getBodyId() {
		return bodyId;
	}
	
	public DBBodiesBean setBodyId(java.math.BigInteger value) {
		this.bodyId = value;
		return this;
	}
	
	
	@DataSource({"inner_rad", "innerRad"})
	@DataTarget("inner_rad")
	@XMLSimple("innerRad")
	private java.lang.Float innerRad;
	
	public java.lang.Float getInnerRad() {
		return innerRad;
	}
	
	public DBBodiesBean setInnerRad(java.lang.Float value) {
		this.innerRad = value;
		return this;
	}
	
	
	@DataSource({"periapsis", "periapsis"})
	@DataTarget("periapsis")
	@XMLSimple("periapsis")
	private java.lang.Float periapsis;
	
	public java.lang.Float getPeriapsis() {
		return periapsis;
	}
	
	public DBBodiesBean setPeriapsis(java.lang.Float value) {
		this.periapsis = value;
		return this;
	}
	
	
	@DataSource({"body_name", "bodyName"})
	@DataTarget("body_name")
	@XMLSimple("bodyName")
	private java.lang.String bodyName;
	
	public java.lang.String getBodyName() {
		return bodyName;
	}
	
	public DBBodiesBean setBodyName(java.lang.String value) {
		this.bodyName = value;
		return this;
	}
	
	
	@DataSource({"outer_rad", "outerRad"})
	@DataTarget("outer_rad")
	@XMLSimple("outerRad")
	private java.lang.Float outerRad;
	
	public java.lang.Float getOuterRad() {
		return outerRad;
	}
	
	public DBBodiesBean setOuterRad(java.lang.Float value) {
		this.outerRad = value;
		return this;
	}
	
	
	@DataSource({"system_id", "systemId"})
	@DataTarget("system_id")
	@XMLSimple("systemId")
	private java.math.BigInteger systemId;
	
	public java.math.BigInteger getSystemId() {
		return systemId;
	}
	
	public DBBodiesBean setSystemId(java.math.BigInteger value) {
		this.systemId = value;
		return this;
	}
	
	
	@DataSource({"stellar_mass", "stellarMass"})
	@DataTarget("stellar_mass")
	@XMLSimple("stellarMass")
	private java.lang.Float stellarMass;
	
	public java.lang.Float getStellarMass() {
		return stellarMass;
	}
	
	public DBBodiesBean setStellarMass(java.lang.Float value) {
		this.stellarMass = value;
		return this;
	}
	
	
	@DataSource({"absolute_magnitude", "absoluteMagnitude"})
	@DataTarget("absolute_magnitude")
	@XMLSimple("absoluteMagnitude")
	private java.lang.Float absoluteMagnitude;
	
	public java.lang.Float getAbsoluteMagnitude() {
		return absoluteMagnitude;
	}
	
	public DBBodiesBean setAbsoluteMagnitude(java.lang.Float value) {
		this.absoluteMagnitude = value;
		return this;
	}
	
	
	@DataSource({"atm_class_id", "atmClassId"})
	@DataTarget("atm_class_id")
	@XMLSimple("atmClassId")
	private java.lang.Long atmClassId;
	
	public java.lang.Long getAtmClassId() {
		return atmClassId;
	}
	
	public DBBodiesBean setAtmClassId(java.lang.Long value) {
		this.atmClassId = value;
		return this;
	}
	
	
	@DataSource({"eccentricity", "eccentricity"})
	@DataTarget("eccentricity")
	@XMLSimple("eccentricity")
	private java.lang.Float eccentricity;
	
	public java.lang.Float getEccentricity() {
		return eccentricity;
	}
	
	public DBBodiesBean setEccentricity(java.lang.Float value) {
		this.eccentricity = value;
		return this;
	}
	
	
	@DataSource({"parent_body_id", "parentBodyId"})
	@DataTarget("parent_body_id")
	@XMLSimple("parentBodyId")
	private java.math.BigInteger parentBodyId;
	
	public java.math.BigInteger getParentBodyId() {
		return parentBodyId;
	}
	
	public DBBodiesBean setParentBodyId(java.math.BigInteger value) {
		this.parentBodyId = value;
		return this;
	}
	
	
	@DataSource({"rotation_period", "rotationPeriod"})
	@DataTarget("rotation_period")
	@XMLSimple("rotationPeriod")
	private java.lang.Float rotationPeriod;
	
	public java.lang.Float getRotationPeriod() {
		return rotationPeriod;
	}
	
	public DBBodiesBean setRotationPeriod(java.lang.Float value) {
		this.rotationPeriod = value;
		return this;
	}
	
	
	@DataSource({"distance_from_arrival_ls", "distanceFromArrivalLs"})
	@DataTarget("distance_from_arrival_ls")
	@XMLSimple("distanceFromArrivalLs")
	private java.lang.Float distanceFromArrivalLs;
	
	public java.lang.Float getDistanceFromArrivalLs() {
		return distanceFromArrivalLs;
	}
	
	public DBBodiesBean setDistanceFromArrivalLs(java.lang.Float value) {
		this.distanceFromArrivalLs = value;
		return this;
	}
	
	
	@DataSource({"star_type", "starType"})
	@DataTarget("star_type")
	@XMLSimple("starType")
	private java.lang.String starType;
	
	public java.lang.String getStarType() {
		return starType;
	}
	
	public DBBodiesBean setStarType(java.lang.String value) {
		this.starType = value;
		return this;
	}
	
	
	@DataSource({"planet_class_id", "planetClassId"})
	@DataTarget("planet_class_id")
	@XMLSimple("planetClassId")
	private java.lang.Long planetClassId;
	
	public java.lang.Long getPlanetClassId() {
		return planetClassId;
	}
	
	public DBBodiesBean setPlanetClassId(java.lang.Long value) {
		this.planetClassId = value;
		return this;
	}
	
	@Override
	public void setAutoincrementField(Object value) {
		
	}	
	
}