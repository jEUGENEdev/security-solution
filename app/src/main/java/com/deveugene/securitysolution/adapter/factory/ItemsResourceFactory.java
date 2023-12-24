package com.deveugene.securitysolution.adapter.factory;

import com.deveugene.securitysolution.R;
import com.deveugene.securitysolution.entity.ItemEntity;
import com.deveugene.securitysolution.entity.notification.Notification;
import com.deveugene.securitysolution.entity.organization.Organization;

public interface ItemsResourceFactory {
    static <T extends ItemEntity> int getResource(T entity) {
        if (entity instanceof Notification) {
            return R.layout.notification_card;
        } else if (entity instanceof Organization) {
            return R.layout.organization_card;
        } else {
            return -1;
        }
    }
}
