package org.oobootcamp.code_smell.$09_feature_envy;


public class InsuranceQuote {
    private Motorist motorist;

    public InsuranceQuote(Motorist motorist) {
        this.motorist = motorist;
    }

    public RiskFactor calculateMotoristRisk() {
        if (motorist.getPointsOnLicense() < 6 || motorist.getAge() < 25) {
            return RiskFactor.HIGH_RISK;
        } else if (motorist.getPointsOnLicense() < 9) {
            return RiskFactor.MODERATE_RISK;
        }
        return RiskFactor.LOW_RISK;
    }
}