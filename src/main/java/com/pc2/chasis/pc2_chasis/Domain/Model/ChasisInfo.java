package com.pc2.chasis.pc2_chasis.Domain.Model;

public class ChasisInfo {
    private int cpus;
    private long mtotal;
    private long mmax;
    private long mfree;
    private double elapseTime;
    private double totalSpaceC;
    private double freeSpaceC;

    public ChasisInfo() {
    }

    public ChasisInfo(int cpus, long mtotal, long mmax, long mfree, double elapseTime, double totalSpaceC, double freeSpaceC) {
        this.cpus = cpus;
        this.mtotal = mtotal;
        this.mmax = mmax;
        this.mfree = mfree;
        this.elapseTime = elapseTime;
        this.totalSpaceC = totalSpaceC;
        this.freeSpaceC = freeSpaceC;
    }

    public int getCpus() {
        return cpus;
    }

    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    public long getMtotal() {
        return mtotal;
    }

    public void setMtotal(long mtotal) {
        this.mtotal = mtotal;
    }

    public long getMmax() {
        return mmax;
    }

    public void setMmax(long mmax) {
        this.mmax = mmax;
    }

    public long getMfree() {
        return mfree;
    }

    public void setMfree(long mfree) {
        this.mfree = mfree;
    }

    public double getElapseTime() {
        return elapseTime;
    }

    public void setElapseTime(double elapseTime) {
        this.elapseTime = elapseTime;
    }

    public double getTotalSpaceC() {
        return totalSpaceC;
    }

    public void setTotalSpaceC(double totalSpaceC) {
        this.totalSpaceC = totalSpaceC;
    }

    public double getFreeSpaceC() {
        return freeSpaceC;
    }

    public void setFreeSpaceC(double freeSpaceC) {
        this.freeSpaceC = freeSpaceC;
    }
}
