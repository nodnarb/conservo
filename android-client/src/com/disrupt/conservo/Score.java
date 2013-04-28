package com.disrupt.conservo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Orbotix Inc.
 * User: brandon
 * Date: 4/27/13
 * Time: 5:56 PM
 */
public class Score implements Parcelable {

    double waterConsumptionScore;
    double waterAuditScore;
    double waterProjectsScore;
    double faucetsAndFixturesScore;
    double landscapeScore;
    double goalsScore;
    double sewerCreditsScore;
    double reUseScore;
    double rebatesScore;
    double innovationScore;
    double coolingTowerEffortsScore;

    public Score() {
        super();

    }

    public void setWaterConsumptionScore(double waterConsumptionScore) {
        this.waterConsumptionScore = waterConsumptionScore;
    }

    public void setWaterAuditScore(double waterAuditScore) {
        this.waterAuditScore = waterAuditScore;
    }

    public void setWaterProjectsScore(double waterProjectsScore) {
        this.waterProjectsScore = waterProjectsScore;
    }

    public void setFaucetsAndFixturesScore(double faucetsAndFixturesScore) {
        this.faucetsAndFixturesScore = faucetsAndFixturesScore;
    }

    public void setLandscapeScore(double landscapeScore) {
        this.landscapeScore = landscapeScore;
    }

    public void setGoalsScore(double goalsScore) {
        this.goalsScore = goalsScore;
    }

    public void setSewerCreditsScore(double sewerCreditsScore) {
        this.sewerCreditsScore = sewerCreditsScore;
    }

    public void setReUseScore(double reUseScore) {
        this.reUseScore = reUseScore;
    }

    public void setRebatesScore(double rebatesScore) {
        this.rebatesScore = rebatesScore;
    }

    public void setInnovationScore(double innovationScore) {
        this.innovationScore = innovationScore;
    }

    public void setCoolingTowerEffortsScore(double coolingTowerEffortsScore) {
        this.coolingTowerEffortsScore = coolingTowerEffortsScore;
    }

    public double getWaterConsumptionScore() {
        return waterConsumptionScore;
    }

    public double getWaterAuditScore() {
        return waterAuditScore;
    }

    public double getWaterProjectsScore() {
        return waterProjectsScore;
    }

    public double getFaucetsAndFixturesScore() {
        return faucetsAndFixturesScore;
    }

    public double getLandscapeScore() {
        return landscapeScore;
    }

    public double getGoalsScore() {
        return goalsScore;
    }

    public double getSewerCreditsScore() {
        return sewerCreditsScore;
    }

    public double getReUseScore() {
        return reUseScore;
    }

    public double getRebatesScore() {
        return rebatesScore;
    }

    public double getInnovationScore() {
        return innovationScore;
    }

    public double getCoolingTowerEffortsScore() {
        return coolingTowerEffortsScore;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {

    }
}
