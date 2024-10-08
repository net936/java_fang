package com.gk.study.service;


import com.gk.study.entity.Thing;

import java.util.List;

public interface ThingService {
    List<Thing> getThingList(String keyword, String sort, String c, String cc, String ccc);
    void createThing(Thing thing);
    void deleteThing(String id);

    void updateThing(Thing thing);

    Thing getThingById(String id);

    void addWishCount(String thingId);

    void addCollectCount(String thingId);

    List<Thing> getUserThing(String userId);

    List<Thing> getThingListByThingIds(List<Long> thingIdList);

    List<Thing> getDefaultThingList();
}
