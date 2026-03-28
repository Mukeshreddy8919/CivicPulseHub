package com.civic.smartcity.controller;

import com.civic.smartcity.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping
    public String getReport() {
        return reportService.generateReport();
    }
}
