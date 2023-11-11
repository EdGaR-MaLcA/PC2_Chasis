package com.pc2.chasis.pc2_chasis.Controller;

import com.pc2.chasis.pc2_chasis.Domain.Model.ChasisInfo;
import com.pc2.chasis.pc2_chasis.Service.ChasisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chasis")
public class ChasisController {

    private final ChasisService chasisService;

    @Autowired
    public ChasisController(ChasisService chasisService) {
        this.chasisService = chasisService;
    }

    @GetMapping("/available")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void checkAvailability() {
        // Solo muestra si esta disponible. Como se solicita en el examen
    }

    @GetMapping("/jvm-info")
    public ResponseEntity<ChasisInfo> getJvmInfo() {
        ChasisInfo chasisInfo = chasisService.getChasisInfo();
        return new ResponseEntity<>(chasisInfo, HttpStatus.OK);
    }
}
