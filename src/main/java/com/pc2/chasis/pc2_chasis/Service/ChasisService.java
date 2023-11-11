package com.pc2.chasis.pc2_chasis.Service;

import com.pc2.chasis.pc2_chasis.Domain.Model.ChasisInfo;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class ChasisService {

    public ChasisInfo getChasisInfo() {

        int cpus = Runtime.getRuntime().availableProcessors();
        long mmax = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        long mtotal = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long mfree = Runtime.getRuntime().freeMemory() / 1024 / 1024;
        File cDrive = new File("C:");

        long start = System.nanoTime();


        double elapseTime = (System.nanoTime() - start) / 1_000_000_000;

        double totalSpaceC = (double) cDrive.getTotalSpace() / 1073741824;
        double freeSpaceC = (double) cDrive.getFreeSpace() / 1073741824;


        ChasisInfo chasisInfo = new ChasisInfo(cpus, mtotal, mmax, mfree, elapseTime, totalSpaceC, freeSpaceC);

        return chasisInfo;
    }
}
