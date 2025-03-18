package com.qrcode.QrGeneration.controller;

import org.springframework.web.bind.annotation.*;
import com.qrcode.QrGeneration.service.QRCodeService;
import com.qrcode.QrGeneration.model.QRCodeEntity;

@RestController
@RequestMapping("/api/qrcode")
public class QRCodeController {
    private final QRCodeService qrCodeService;

    public QRCodeController(QRCodeService qrCodeService) {
        this.qrCodeService = qrCodeService;
    }

    @PostMapping("/generate")
    public String generateQRCode(@RequestBody QRCodeEntity qrCodeEntity) {
        if (qrCodeEntity.getData() == null || qrCodeEntity.getData().isEmpty()) {
            return "Invalid request: 'data' field is required";
        }
        return qrCodeService.generateQRCode(qrCodeEntity.getData()); 
    }
}
