package com.mps.QResent.service;

import com.mps.QResent.model.QRCode;
import com.mps.QResent.model.Schedule;
import com.mps.QResent.repository.QRCodeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class QRCodeService {
    QRCodeRepository qrCodeRepository;

    public QRCodeService(QRCodeRepository qrCodeRepository) {
        this.qrCodeRepository = qrCodeRepository;
    }

    public List<QRCode> findAllBySchedule(Schedule schedule){
        return qrCodeRepository.findAllBySchedule(schedule);
    }

    public QRCode findById(Long id) {
        Optional<QRCode> qrCode = this.qrCodeRepository.findById(id);
        return qrCode.orElse(null);
    }


    public boolean areValidCredentials(Map<String, Object> request) {
        return ((request.get("schedule") != null)
                && (request.get("reps") != null)
                && (request.get("offset") != null)
                && (request.get("subject") != null)
                && (request.get("key") != null));
    }

    public void save(QRCode qrCode) {
        this.qrCodeRepository.save(qrCode);
    }
}