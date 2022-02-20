package com.thinkground.aroundhub.data.service;

import com.thinkground.aroundhub.data.entity.ListenerEntity;

public interface ListenerService {
    ListenerEntity getEntity(Long id);

    void saveEntity(ListenerEntity listenerEntity);

    void updateEntity(ListenerEntity listenerEntity);

    void removeEntity(ListenerEntity listenerEntity);

}
