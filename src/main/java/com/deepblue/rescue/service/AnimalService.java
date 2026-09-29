package com.deepblue.rescue.service;

import com.deepblue.rescue.dto.response.AnimalResponse;

import java.util.List;

public interface AnimalService {

    AnimalResponse findByCode(String animalCode);

    List<AnimalResponse> findAnimalsInRehabilitation();

    /**
     * Un animal puede recibir tratamiento cuando su caso está en
     * UNDER_EVALUATION o IN_REHABILITATION.
     */
    boolean canReceiveTreatment(String animalCode);
}
