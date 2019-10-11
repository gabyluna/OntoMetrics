package metrics.qualitymetrics;

public enum QualityMetricEnum {
    RROnto (1),
    INROnto(2),
    ANNOnto (3),
    CROnto (4),
    NOMOnto (5),
    RFCOnto (6),
    CBBOnto (7),
    LCOMOnto(8),
    RCOnto (9);
    private final int type;

    QualityMetricEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }
}
