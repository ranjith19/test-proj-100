package com.setu.serializer.SetuSerializer;


enum BillExactness {
    EXACT, EXACT_UP, EXACT_DOWN, ANY
}

enum Recurrence {
    ONE_TIME, DAILY, WEEKLY, FORTNIGHTLY, MONTHLY, QUATERLY, HALF_YEARLY, YEARLY, AS_PRESENTED
}

enum ComputationMethod{
    FLAT, PERCENTAGE
}


enum MeasurementUnit{
    WEIGHT, VOLUME, NUMBER
}

enum BillFetchStatus{
    NOT_SUPPORTED, NO_OUTSTANDING, AVAILABLE
}