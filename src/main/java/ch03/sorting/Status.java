package ch03.sorting;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;


public enum Status {
    PENDING(1), PRE_ASSESMENT_PENDING(2), PRE_ASSESSMENT_APPROVED(3),
    TRANSACTION_PENDING(4), TRANSACTION_APPROVED(5), PAYOUTS_PENDING(6),
    PAYOUTS_APPROVED(7);
    int order;

    Status(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
