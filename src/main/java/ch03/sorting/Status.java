package ch03.sorting;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Status {
    PENDING(1), PRE_ASSESMENT_PENDING(2), PRE_ASSESSMENT_APPROVED(3),
    TRANSACTION_PENDING(4), TRANSACTION_APPROVED(5), PAYOUTS_PENDING(6),
    PAYOUTS_APPROVED(7);
    int order;
}
