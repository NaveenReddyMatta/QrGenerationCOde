package com.qrcode.QrGeneration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qrcode.QrGeneration.model.QRCodeEntity;

public interface QRCodeRepository extends JpaRepository<QRCodeEntity, Long> {
}
