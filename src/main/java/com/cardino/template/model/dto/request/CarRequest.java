package com.cardino.template.model.dto.request;

import java.sql.Date;
import java.util.ArrayList;

public record CarRequest (
        String brand,
        String model,
        Date firstRegistration,
        Long customerId,
        ArrayList<EquipmentRequest> equipment,
        Float sellingPrice){
}
