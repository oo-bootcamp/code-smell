package org.oobootcamp.code_smell.$17_message_chains;

import java.util.List;

public class DiseaseControlCenter {
    public boolean hasPatient(List<Community> communities) {
        return communities.stream()
                .flatMap(community -> community.getBuildings().stream())
                .flatMap(building -> building.getRooms().stream())
                .flatMap(room -> room.getPersons().stream())
                .anyMatch(Person::isInfected);
    }
}
